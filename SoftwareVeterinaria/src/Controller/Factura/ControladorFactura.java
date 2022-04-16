package Controller.Factura;

import Controller.Login.ControllerLogin;
import Controller.Revision.ImagenTabla;
import Model.Clientes.Clientes;
import Model.ConectionPg;
import Model.CrudServicios.Servicios;
import Model.Productos.Productos;
import Model.Veterinario.Veterinario;
import Model.facturación.*;
import View.Facturacion.VistaFacturacion;
import com.toedter.calendar.JDateChooser;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Usuario
 */
public class ControladorFactura {

    private ModelFactura modelFactura;
    protected VistaFacturacion view;

    DefaultTableModel modelTa = new DefaultTableModel();
    ModelDetalleProducto detalleP = new ModelDetalleProducto();
    ModelDetalleServicio detalleS = new ModelDetalleServicio();

    String idp;
    double tpagar;
    int cant;
    double pree;
    DecimalFormat deci = new DecimalFormat("0.00");

    public ControladorFactura(ModelFactura modelFactura, VistaFacturacion view) {

        this.modelFactura = modelFactura;
        this.view = view;
        view.setVisible(true);
        cargarOrden();
        CargarCliente();
        cargarProducto();
        cargarServicio();
        CargarVeterinario();
        view.getTxtIva().setText("12");
        view.getTxt_Fecha().setText(fechaActual());
        view.getTxt_Fecha().setEditable(false);
        view.getTxt_IDFactura().setEditable(false);
        view.getTxtIva().setEditable(false);
        
        ((JSpinner.DefaultEditor) view.getSpinTotal().getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor) view.getSpinCambio().getEditor()).getTextField().setEditable(false);
    }

    public void iniciaControl() {
//        Estar  la escucha de todos los eventos de la vista
        view.getBttBuscarIdMedico().addActionListener(l -> abrirDialogo(1));
        view.getBttBuscarClie().addActionListener(l -> abrirDialogo(2));
        view.getBttañadirp().addActionListener(l -> abrirDlg(1));
        view.getBttañadirs().addActionListener(l -> abrirDlg(2));
        view.getBttAgregar().addActionListener(l -> agregarVeterinario());
        view.getBttAgregarC().addActionListener(l -> agregarCliente());
        view.getBttAgregarP().addActionListener(l -> agregarProducto());
        view.getBttAceptarAñadirProduct().addActionListener(l -> llenarTabla_Pro());
        view.getBttAcepatarAñadirS().addActionListener(l -> llenarTabla_Ser());
        view.getBtnAceptar().addActionListener(l -> guardarFactura());
        view.getBtnCalcular().addActionListener(l -> CalcularVuelto());
        view.getBtnBorrar_deta().addActionListener(l -> eliminar_datoProduc());
        view.getBtnBorrar_deta().addActionListener(l -> eliminar_datoSer());
//        view.getBtnImprimir().addActionListener(l -> ImprimirFactura());
        view.getBtnNuevaFact().addActionListener(l -> NuevaFactura());
        setEventoKeytyped(view.getBuscarProducto());
        setEventKeytyped(view.getTxtBuscarServicios());
        setEventKeytypedV(view.getTxtbuscarVeterinario());
        setEventKeytypedC(view.getTxtBuscarClie());

        //---------FILTROS---------
    }

    public void NuevaFactura() {
        LimpiarFactura();
        LimpiarTablaP();
        LimpiarTablaS();
        cargarOrden();
        view.getTxt_Fecha().setText(fechaActual());
    }

    public void guardarFactura() {

        String id = (view.getTxt_IDFactura().getText());
        String fechafac = view.getTxt_Fecha().getText();
        Date fechaactu = java.sql.Date.valueOf(fechafac);
        String cliente = view.getTxt_IDCliente().getText();
        String medico = view.getTxt_IDMedico().getText();
        Double total = TotalFactura();
        ModelFactura fac = new ModelFactura();
        fac.setCodigo_factura(id);
        fac.setFecha((java.sql.Date) fechaactu);
        fac.setCodigo_cliente(cliente);
        fac.setCodigo_medico(medico);
        fac.setTotal_factura(Math.round(total*100.0)/100.0);
        if (fac.CrearFactura()) {
            JOptionPane.showMessageDialog(view, "Factura Guardada satisfactoriamente");
            CrearDetalleProducto();
            CrearDetalleServicio();
            ActualizarStock();
            ImprimirFactura();
        } else {
            JOptionPane.showMessageDialog(view, "No se pudo crear la factura");
        }
    }

    public void ActualizarStock() {
        for (int i = 0; i < view.getTblProducto().getRowCount(); i++) {
            Productos prod = new Productos();
            String idproducto = view.getTblProducto().getValueAt(i, 0).toString();
            int cantidad = Integer.valueOf(view.getTblProducto().getValueAt(i, 3).toString());
            prod = modelFactura.CodigosProducto(idproducto);
            int stockActual = prod.getStock() - cantidad;
            if (modelFactura.ActualizarStock(stockActual, idproducto)) {
                System.out.println("Stock actualizado");
            } else {
                System.out.println("No se actualizo el stock");
            }
        }
    }
    //Metodo para la creacion de detalle de producto

    public void CrearDetalleProducto() {
        ModelDetalleProducto modelo = new ModelDetalleProducto();
        for (int i = 0; i < view.getTblProducto().getRowCount(); i++) {
            String codDetProd = modelo.codigoDetalle();
            String idProducto = view.getTblProducto().getValueAt(i, 0).toString();
            String idFactura = view.getTxt_IDFactura().getText();
            int cantidad = Integer.valueOf(view.getTblProducto().getValueAt(i, 3).toString());
            double total = Double.valueOf(view.getTblProducto().getValueAt(i, 4).toString());

            //Guardar los datos
            modelo.setCodigo_detalle(codDetProd);
            modelo.setCodigo_producto(idProducto);
            modelo.setCodigo_factura(idFactura);
            modelo.setCantidad(cantidad);
            modelo.setTotal(total);
            if (modelo.CrearDetalleProd()) {
                System.out.println("Detalle de productos creado");
            } else {
                System.out.println("No se creo el detalle de producto");
            }
        }
    }

    //Metodo para calcular el total de la factura
    private double totalizarProductos() {
        double total = 0;
        double precio = 0;
        double Total_iva = 0;
        if (view.getTblProducto().getRowCount() > 0) {
            for (int i = 0; i < view.getTblProducto().getRowCount(); i++) {
                precio = Double.parseDouble(view.getTblProducto().getValueAt(i, 4).toString());
                total += precio;
            }
            Total_iva = total * 12 / 100 + total;
        } else {
            view.getSpinTotal().setValue(0);
        }
        return Total_iva;
    }

    protected double TotalFactura() {
        double TotalProductos = totalizarProductos();
        double TotalServicios = totalizarServicio();
        double SubProd = totalizarP();
        double SubServ = totalizarS();
        double PrecioFinal = 0;
        double Subt = 0;
        if (view.getTblProducto().getRowCount() > 0 && view.getTblServicio().getRowCount() > 0) {
            PrecioFinal = TotalProductos + TotalServicios;
            view.getSpinTotal().setValue(PrecioFinal);
            Subt = SubProd + SubServ;
            view.getTxtSubtotal().setText(String.valueOf(Subt));
        } else if (view.getTblProducto().getRowCount() > 0 && view.getTblServicio().getRowCount() < 1) {
            PrecioFinal = TotalProductos;
            view.getSpinTotal().setValue(PrecioFinal);
            Subt = SubProd;
            view.getTxtSubtotal().setText(String.valueOf(Subt));
        } else if (view.getTblServicio().getRowCount() > 0 && view.getTblProducto().getRowCount() < 1) {
            PrecioFinal = TotalServicios;
            view.getSpinTotal().setValue(PrecioFinal);
            Subt = SubServ;
            view.getTxtSubtotal().setText(String.valueOf(Subt));
        } else {
            PrecioFinal = 0;
            view.getSpinTotal().setValue(PrecioFinal);
            Subt = 0;
            view.getTxtSubtotal().setText(String.valueOf(Subt));;
        }
        return PrecioFinal;
    }

    private double totalizarP() {
        double total = 0;
        double precio = 0;
        double Total_iva = 0;
        if (view.getTblProducto().getRowCount() > 0) {
            for (int i = 0; i < view.getTblProducto().getRowCount(); i++) {
                precio = Double.parseDouble(view.getTblProducto().getValueAt(i, 4).toString());
                total += precio;
            }

        }
        return total;
    }

    private double totalizarS() {
        double total = 0;
        double precio = 0;
        double Total_iva = 0;
        if (view.getTblServicio().getRowCount() > 0) {
            for (int i = 0; i < view.getTblServicio().getRowCount(); i++) {
                precio = Double.parseDouble(view.getTblServicio().getValueAt(i, 3).toString());
                total += precio;
            }

        }
        return total;
    }

    private double SubTotal() {
        double subtotal = 0;
        subtotal = totalizarP() + totalizarS();

        return subtotal;
    }

    private double totalizarServicio() {
        double total = 0;
        double precio = 0;
        double Total_iva = 0;
        if (view.getTblServicio().getRowCount() > 0) {
            for (int i = 0; i < view.getTblServicio().getRowCount(); i++) {
                precio = Double.parseDouble(view.getTblServicio().getValueAt(i, 3).toString());
                total += precio;
            }
            Total_iva = total * 12 / 100 + total;
        } else {
            view.getSpinTotal().setValue(0);
        }
        return Total_iva;
    }

    //Metodo para calcular el total de productos
    public Double calcularTotalProd() {
        double totalfac = Double.valueOf(view.getTxtPrecioProduc().getText());
        double prec = Math.round(totalfac);
        int cant = Integer.parseInt(view.getSppCantidad().getValue().toString());
        double precio = prec * cant;
        double precioFinal = Math.round(precio);
        return precioFinal;
    }

    public void CrearDetalleServicio() {
        ModelDetalleServicio modelo = new ModelDetalleServicio();
        for (int i = 0; i < view.getTblServicio().getRowCount(); i++) {
            String codDetServicio = modelo.codigoDetalle();
            String idServicio = view.getTblServicio().getValueAt(i, 0).toString();
            String idFactura = view.getTxt_IDFactura().getText();
            String descripcion = (view.getTblServicio().getValueAt(i, 2).toString());
            double total = Double.valueOf(view.getTblServicio().getValueAt(i, 3).toString());
            //Guardar los datos
            modelo.setCodigo_detalle(codDetServicio);
            modelo.setCodigo_factura(idFactura);
            modelo.setDescripcion(descripcion);
            modelo.setCodigo_servicio(idServicio);
            modelo.setTotal(total);
            if (modelo.CrearDetalleSer()) {
                System.out.println("Detalle servicios creado");
            } else {
                System.out.println("No se creo el detalle servicios");
            }
        }
    }

    //Validacion del txt
    public float validaFloat(String number) {
        float result = 0; //Valor default.
        try {
            if (number != null) {
                result = Float.parseFloat(number);
            }
        } catch (NumberFormatException nfe) {
            //*No es numerico!
        }
        return result;
    }

    public double CalcularVuelto() {
        float dinero = validaFloat(String.valueOf(view.getSpnDinero().getValue()));
        float totalfactura = validaFloat(String.valueOf(view.getSpinTotal().getValue()));
        double vuelto = 0;
        double precioFinal = 0;
        if (dinero < totalfactura) {
            JOptionPane.showMessageDialog(view, "Saldo insuficiete ingresa valor nuevamente");
        } else {
            vuelto = dinero - totalfactura;
            precioFinal = Math.round(vuelto*100.0)/100.0;
            view.getSpinCambio().setValue(precioFinal);
        }
        return precioFinal;
    }

    //METODOS DE DIALOGOS
    public void abrirDialogo(int ce) {
        String title;
        if (ce == 1) {
            title = "Visualizar Veterinario";
            view.getDlgMedico().setName("Mascota");
            view.getDlgMedico().setSize(700, 400);
            view.getDlgMedico().setLocationRelativeTo(view);
            view.getDlgMedico().setTitle(title);
            view.getDlgMedico().setVisible(true);

        } else if (ce == 2) {
            title = "Visualizar Cliente";
            view.getDlgCliente().setName("Veterinario");
            view.getDlgCliente().setSize(800, 400);
            view.getDlgCliente().setLocationRelativeTo(view);
            view.getDlgCliente().setTitle(title);
            view.getDlgCliente().setVisible(true);

        }
    }

    public void abrirDlg(int ce) {
        String title;
        if (ce == 1) {
            title = "Visualizar Producto";
            view.getDlgProducto().setName("Producto");
            view.getDlgProducto().setSize(970, 525);
            view.getDlgProducto().setLocationRelativeTo(view);
            view.getDlgProducto().setTitle(title);
            view.getDlgProducto().setVisible(true);
            view.getBttAceptarAñadirProduct().setVisible(false);

        } else if (ce == 2) {
            title = "Visualizar Servicio";
            view.getDlgServicio().setName("Servicio");
            view.getDlgServicio().setSize(800, 400);
            view.getDlgServicio().setLocationRelativeTo(view);
            view.getDlgServicio().setTitle(title);
            view.getDlgServicio().setVisible(true);

        } else {
            title = "Editar Producto";
            view.getDlgProducto().setName(" Editar Producto");
            view.getDlgProducto().setSize(800, 550);
            view.getDlgProducto().setLocationRelativeTo(view);
            view.getDlgProducto().setTitle(title);
            view.getDlgProducto().setVisible(true);
        }
    }

    //METODOS FECHAS
    //metodo para mostrar la fecha de hoy
    public static String fechaActual() {
        java.util.Date fecha = new java.util.Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("YYYY-MM-dd");
        return formatofecha.format(fecha);
    }
    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

    public String getFecha(JDateChooser jd) {
        if (jd.getDate() != null) {
            return formato.format(jd.getDate());
        } else {
            return null;
        }
    }

    //METODOS DE DIALOGO VETERINARIO
    public void agregarVeterinario() {
        int selecc = view.getTblVeterinario().getSelectedRow();
        if (selecc != -1) {
            String ver = view.getTblVeterinario().getValueAt(selecc, 0).toString();
            String dato = view.getTxtbuscarVeterinario().getText();
            ArrayList<Veterinario> tableVet = modelFactura.listVet_busqueda(dato);
            for (int j = 0; j < tableVet.size(); j++) {
                if (tableVet.get(j).getid_medico().equals(ver)) {
                    view.getTxt_IDMedico().setText(tableVet.get(j).getid_medico());
                    view.getTxt_Nombre().setText(tableVet.get(j).getNombre_medico());
                }
            }
            view.getDlgMedico().setVisible(false);

        } else {
            JOptionPane.showMessageDialog(view, "No a seleccionado a ningun veterinario");
        }
    }

    public void CargarVeterinario() {

        //Enlace de la tabla con el metodo de las etiquetas
        DefaultTableModel tblmodel;
        tblmodel = (DefaultTableModel) view.getTblVeterinario().getModel();
        tblmodel.setNumRows(0);
        String dato = view.getTxtbuscarVeterinario().getText();
        ArrayList<Veterinario> tablaVet = modelFactura.listVet_busqueda(dato);
        Holder<Integer> i = new Holder<>(0);
        tablaVet.stream().forEach(pac -> {
            //Agregar a la tabla
            tblmodel.addRow(new Object[5]);
            view.getTblVeterinario().setValueAt(pac.getid_medico(), i.value, 0);
            view.getTblVeterinario().setValueAt(pac.getNombre_medico(), i.value, 1);
            view.getTblVeterinario().setValueAt(pac.getApellido_medico(), i.value, 2);
            view.getTblVeterinario().setValueAt(pac.getDireccion_medico(), i.value, 3);
            view.getTblVeterinario().setValueAt(pac.getEspecialidad(), i.value, 4);
            i.value++;
        });

    }

    //METODOS DE CLIENTES
    public void CargarCliente() {
        DefaultTableModel tblmodel;
        tblmodel = (DefaultTableModel) view.getTblClie().getModel();
        tblmodel.setNumRows(0);

        ArrayList<Clientes> tableCli = modelFactura.ListarClientes();
        Holder<Integer> i = new Holder<>(0);
        tableCli.stream().forEach(pac -> {
            tblmodel.addRow(new Object[6]);
            view.getTblClie().setValueAt(pac.getId_cliente(), i.value, 0);
            view.getTblClie().setValueAt(pac.getNombre_cliente(), i.value, 1);
            view.getTblClie().setValueAt(pac.getApellido_cliente(), i.value, 2);
            view.getTblClie().setValueAt(pac.getTelefono(), i.value, 3);
            view.getTblClie().setValueAt(pac.getEmail(), i.value, 4);
            view.getTblClie().setValueAt(pac.getDireccion_cliente(), i.value, 5);
            i.value++;
        });
    }

    public void agregarCliente() {
        int selecc = view.getTblClie().getSelectedRow();
        if (selecc != -1) {
            String ver = view.getTblClie().getValueAt(selecc, 0).toString();
            ArrayList<Clientes> tableCli = modelFactura.ListarClientes();
            for (int j = 0; j < tableCli.size(); j++) {
                if (tableCli.get(j).getId_cliente().equals(ver)) {
                    view.getTxt_IDCliente().setText(tableCli.get(j).getId_cliente());
                    view.getTxt_NombreCli().setText(tableCli.get(j).getNombre_cliente());
                    view.getTxtTelefonoCli().setText(tableCli.get(j).getTelefono());
                    view.getTxtDireccionClie().setText(tableCli.get(j).getDireccion_cliente());
                }
            }
            view.getDlgCliente().setVisible(false);
        }
    }

    //METODOS DE DIALOGO SERVICIOS
    public void agregarServicio() {
        int selecc = view.getTblServiciosAñadir().getSelectedRow();
        if (selecc != -1) {
            String ver = view.getTblServiciosAñadir().getValueAt(selecc, 0).toString();
            List<Servicios> tableSer = modelFactura.listarServicios();
            for (int j = 0; j < tableSer.size(); j++) {
                if (tableSer.get(j).getId_servicio().equals(ver)) {
                }

            }
        }
    }

    public void cargarServicio() {
        DefaultTableModel tblmodel;
        tblmodel = (DefaultTableModel) view.getTblServiciosAñadir().getModel();
        tblmodel.setNumRows(0);

        List<Servicios> tableSer = modelFactura.listarServicios();
        Holder<Integer> i = new Holder<>(0);
        tableSer.stream().forEach(pac -> {
            tblmodel.addRow(new Object[6]);
            view.getTblServiciosAñadir().setValueAt(pac.getId_servicio(), i.value, 0);
            view.getTblServiciosAñadir().setValueAt(pac.getNombre_servi(), i.value, 1);
            view.getTblServiciosAñadir().setValueAt(pac.getDescripcion(), i.value, 2);
            view.getTblServiciosAñadir().setValueAt(pac.getCosto_servi(), i.value, 3);

            i.value++;
        });
    }

    public void llenarTabla_Ser() {

        DefaultTableModel tablamodel;
        tablamodel = (DefaultTableModel) view.getTblServicio().getModel();
        int selecc = view.getTblServiciosAñadir().getSelectedRow();
        if (selecc != -1) {
            String ver = view.getTblServiciosAñadir().getValueAt(selecc, 0).toString();
            List<Servicios> tableSer = modelFactura.listarServicios();
            for (int i = 0; i < tableSer.size(); i++) {
                if (tableSer.get(i).getId_servicio().equals(ver)) {
                    String idServicio = (String) (view.getTblServiciosAñadir().getValueAt(i, 0));
                    String nomServicio = (String) (view.getTblServiciosAñadir().getValueAt(i, 1));
                    String descripcion = (String) (view.getTblServiciosAñadir().getValueAt(i, 2).toString());
                    Float costo = (Float) (view.getTblServiciosAñadir().getValueAt(i, 3));

                    //Creamos un arraylist para agregar los objetos
                    ArrayList listaVentans = new ArrayList();
                    listaVentans.add(idServicio);
                    listaVentans.add(nomServicio);
                    listaVentans.add(descripcion);
                    listaVentans.add(costo);
                    //Creamos una matriz para poner las ventas en la tabla
                    Object[] data = new Object[4];
                    data[0] = listaVentans.get(0);
                    data[1] = listaVentans.get(1);
                    data[2] = listaVentans.get(2);
                    data[3] = listaVentans.get(3);
                    tablamodel.addRow(data);
                    view.getTblServicio().setModel(tablamodel);
                    view.getDlgServicio().setVisible(false);
                }
                TotalFactura();
            }
        } else {
            // System.out.println("No se señalo nada");
        }

    }

    //METODOS DE DIALOGO PRODUCTOS
    public void cargarProducto() {

        view.getTblProductoF().setDefaultRenderer(Object.class, new ImagenTabla());
        view.getTblProductoF().setRowHeight(100);
        DefaultTableModel tblmodel;
        tblmodel = (DefaultTableModel) view.getTblProductoF().getModel();
        tblmodel.setNumRows(0);

        List<Productos> list = modelFactura.listarProductos();
        Holder<Integer> i = new Holder<>(0);
        list.stream().forEach(pac -> {

            //Agregar a la tabla
            tblmodel.addRow(new Object[5]);
            view.getTblProductoF().setValueAt(pac.getIdProducto(), i.value, 0);
            view.getTblProductoF().setValueAt(pac.getNombreProducto(), i.value, 1);
            view.getTblProductoF().setValueAt(pac.getPrecio(), i.value, 2);
            view.getTblProductoF().setValueAt(pac.getIdCategoria(), i.value, 3);
            view.getTblProductoF().setValueAt(pac.getStock(), i.value, 4);
            Image foto = pac.getFoto();
            if (foto != null) {
                Image nimg = foto.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                ImageIcon icon = new ImageIcon(nimg);
                DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
                renderer.setIcon(icon);
                JLabel label = new JLabel(icon);
                view.getTblProductoF().setValueAt(label, i.value, 5);
            } else {
                view.getTblProductoF().setValueAt(null, i.value, 5);
            }
            i.value++;
           
        });
    }

    public void agregarProducto() {
        int selecc = view.getTblProductoF().getSelectedRow();
        if (selecc != -1) {

            String ver = view.getTblProductoF().getValueAt(selecc, 0).toString();
            List<Productos> tablePro = modelFactura.listarProductos();
            for (int j = 0; j < tablePro.size(); j++) {
                if (tablePro.get(j).getIdProducto().equals(ver)) {
                    view.getTxtIDProduc().setText(tablePro.get(j).getIdProducto());
                    view.getTxtNombreProduc().setText(tablePro.get(j).getNombreProducto());
                    view.getTxtPrecioProduc().setText("" + tablePro.get(j).getPrecio());
                    view.getTxtCategoria().setText(tablePro.get(j).getIdCategoria());
                    if (tablePro.get(j).getFoto() == null) {
                        view.getFotoPro().setIcon(null);
                    } else {
                        Image in = tablePro.get(j).getFoto();
                        Image img = in.getScaledInstance(133, 147, Image.SCALE_SMOOTH);
                        Icon icono = new ImageIcon(img);
                        view.getFotoPro().setIcon(icono);
                    }
                    view.getBttAceptarAñadirProduct().setVisible(true);
                    
                }

            }
        } else {
            JOptionPane.showMessageDialog(view, "Por favor seleccione una fila");
        }
    }

    public void llenarTabla_Pro() {

        if (view.getDlgProducto().getName().equals("Producto")) {
            DefaultTableModel tablamodel;
            tablamodel = (DefaultTableModel) view.getTblProducto().getModel();
            String idProducto = (view.getTxtIDProduc().getText());
            String nombreProducto = view.getTxtNombreProduc().getText();
            double total = Double.valueOf(deci.format(calcularTotalProd()).replace(",", "."));
            String idCategoria = view.getTxtCategoria().getText();
            int cantidad = Integer.valueOf(view.getSppCantidad().getValue().toString());
            int canComp = Integer.valueOf(view.getTblProductoF().getValueAt(view.getTblProductoF().getSelectedRow(), 4).toString());
            if (cantidad <= canComp) {
                //Creamos un arraylist para agregar los objetos
                ArrayList listaVentans = new ArrayList();
                listaVentans.add(idProducto);
                listaVentans.add(nombreProducto);
                listaVentans.add(idCategoria);
                listaVentans.add(cantidad);
                listaVentans.add(total);
                //Creamos una matriz para poner las ventas en la tabla
                Object[] data = new Object[5];
                data[0] = listaVentans.get(0);
                data[1] = listaVentans.get(1);
                data[2] = listaVentans.get(2);
                data[3] = listaVentans.get(3);
                data[4] = listaVentans.get(4);
                tablamodel.addRow(data);
                view.getTblProducto().setModel(tablamodel);
                view.getDlgProducto().setVisible(false);
                TotalFactura();
                limpiar_DlgPro();
                LimpiarTablaPD();
                cargarProducto();
            } else {
                JOptionPane.showMessageDialog(view, "Cantidad de producto no disponible");
            }
        } else {
            DefaultTableModel tablamodel;
            tablamodel = (DefaultTableModel) view.getTblProducto().getModel();

            String idProducto = (view.getTxtIDProduc().getText());
            String nombreProducto = view.getTxtNombreProduc().getText();
            double total = Double.valueOf(deci.format(calcularTotalProd()).replace(",", "."));
            String idCategoria = view.getTxtCategoria().getText();
            int cantidad = Integer.valueOf(view.getSppCantidad().getValue().toString());

            //Creamos un arraylist para agregar los objetos
            ArrayList listaVentans = new ArrayList();
            listaVentans.add(idProducto);
            listaVentans.add(nombreProducto);
            listaVentans.add(idCategoria);
            listaVentans.add(cantidad);
            listaVentans.add(total);
            //Creamos una matriz para poner las ventas en la tabla
            Object[] data = new Object[5];
            data[0] = listaVentans.get(0);
            data[1] = listaVentans.get(1);
            data[2] = listaVentans.get(2);
            data[3] = listaVentans.get(3);
            data[4] = listaVentans.get(4);
            tablamodel.addRow(data);
            view.getTblProducto().setModel(tablamodel);
            view.getDlgProducto().setVisible(false);
            TotalFactura();
            limpiar_DlgPro();
            LimpiarTablaP();
        }
    }

    public void SelecionModi() {
        int selecc = view.getTblProducto().getSelectedRow();
        if (selecc != -1) {
            String ver = view.getTblProducto().getValueAt(selecc, 0).toString();
            List<Productos> tablaMas = modelFactura.listarProductos();
            for (int j = 0; j < tablaMas.size(); j++) {
                if (tablaMas.get(j).getIdProducto().equals(ver)) {
                    view.getTxtIDProduc().setText(tablaMas.get(j).getIdProducto());
                    view.getTxtNombreProduc().setText(tablaMas.get(j).getNombreProducto());
                    view.getTxtPrecioProduc().setText("" + tablaMas.get(j).getPrecio());
                    view.getTxtCategoria().setText(tablaMas.get(j).getIdCategoria());
                    view.getSppCantidad().setValue(view.getTblProducto().getValueAt(selecc, 3));
                    if (tablaMas.get(j).getFoto() == null) {
                        view.getFotoPro().setIcon(null);
                    } else {
                        Image in = tablaMas.get(j).getFoto();
                        Image img = in.getScaledInstance(133, 147, Image.SCALE_SMOOTH);
                        Icon icono = new ImageIcon(img);
                        view.getFotoPro().setIcon(icono);
                    }

                }
            }

        } else {
        }
    }

    //Metodos codigo de factura
    private void cargarOrden() {
        //Numero de ceros para rellenar el consecutivo de la factura
        int NUMERO_CEROS = 3;
        int cliente = modelFactura.codigoFactura() + 1;
        String numeroConsecutivo = rellenarConCeros(String.valueOf(cliente), NUMERO_CEROS);
        view.getTxt_IDFactura().setText(numeroConsecutivo);
    }

    private String rellenarConCeros(String cadena, int numCeros) {
        String ceros = "FAC";
        for (int i = cadena.length(); i < numCeros; i++) {
            ceros += "0";
        }
        return ceros + cadena;
    }

    //,METODOS DE BUSQUEDA
    public void buscarProducto(java.awt.event.KeyEvent evt) {
        DefaultTableModel tablamodel;
        tablamodel = (DefaultTableModel) view.getTblProductoF().getModel();
        tablamodel.setNumRows(0);
        List<Productos> list = modelFactura.busquedaProductos(view.getBuscarProducto().getText());
        list.stream().forEach(Productos -> {
            String[] filas = {Productos.getIdProducto(), Productos.getNombreProducto(), String.valueOf(Productos.getPrecio()),
                Productos.getIdCategoria(), String.valueOf(Productos.getStock())};
            tablamodel.addRow(filas);
        });
    }

    private void setEventoKeytyped(JTextField txt) {
        txt.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                buscarProducto(e);
            }
        });
    }

    public void buscarServicio(java.awt.event.KeyEvent evt) {
        DefaultTableModel tablamodel;
        tablamodel = (DefaultTableModel) view.getTblServiciosAñadir().getModel();
        tablamodel.setNumRows(0);
        List<Servicios> list = modelFactura.busquedaServicio(view.getTxtBuscarServicios().getText());
        list.stream().forEach(Servicios -> {
            String[] filas = {Servicios.getId_servicio(), Servicios.getNombre_servi(),
                String.valueOf(Servicios.getDescripcion()), String.valueOf(Servicios.getCosto_servi())};
            tablamodel.addRow(filas);
        });
    }

    private void setEventKeytyped(JTextField txt) {
        txt.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent i) {
                buscarServicio(i);
            }
        });
    }

    public void buscarCliente(java.awt.event.KeyEvent evt) {
        DefaultTableModel tablamodel;
        tablamodel = (DefaultTableModel) view.getTblClie().getModel();
        tablamodel.setNumRows(0);
        List<Clientes> list = modelFactura.buscarCliente(view.getTxtBuscarClie().getText());
        list.stream().forEach(Clientes -> {
            String[] filas = {Clientes.getId_cliente(), Clientes.getNombre_cliente(),
                (Clientes.getApellido_cliente()), String.valueOf(Clientes.getTelefono()),
                Clientes.getEmail(), Clientes.getDireccion_cliente()};
            tablamodel.addRow(filas);
        });
    }

    private void setEventKeytypedC(JTextField txt) {
        txt.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent i) {
                buscarCliente(i);
            }
        });
    }

    public void buscarVet(java.awt.event.KeyEvent evt) {
        DefaultTableModel tablamodel;
        tablamodel = (DefaultTableModel) view.getTblVeterinario().getModel();
        tablamodel.setNumRows(0);
        List<Veterinario> list = modelFactura.listVet_busqueda(view.getTxtbuscarVeterinario().getText());
        list.stream().forEach(Veterinario -> {
            String[] filas = {Veterinario.getid_medico(), Veterinario.getNombre_medico(),
                (Veterinario.getApellido_medico()), (Veterinario.getDireccion_medico()),
                Veterinario.getEspecialidad()};
            tablamodel.addRow(filas);
        });
    }

    private void setEventKeytypedV(JTextField txt) {
        txt.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent i) {
                buscarVet(i);
            }
        });
    }

    //METODOS DE LIMPIEZA
    public void LimpiarFactura() {
        view.getTxt_IDFactura().setText("");
        view.getTxt_Fecha().setText("");
        view.getTxt_IDMedico().setText("");
        view.getTxt_Nombre().setText("");
        view.getTxt_IDCliente().setText("");
        view.getTxt_NombreCli().setText("");
        view.getTxtTelefonoCli().setText("");
        view.getTxtDireccionClie().setText("");
        view.getSpnDinero().setValue(0);
        view.getSpinTotal().setValue(0.00f);
        view.getSpinCambio().setValue(0);
    }

    public void limpiar_DlgPro() {
        view.getTxtIDProduc().setText("");
        view.getTxtNombreProduc().setText("");
        view.getTxtPrecioProduc().setText("");
        view.getTxtCategoria().setText("");
        view.getFotoPro().setIcon(new ImageIcon("imagenesProyecto/BLANCO.PNG"));
        view.getSppCantidad().setValue(0);
    }

    public void LimpiarTablaP() {
        DefaultTableModel modelo = (DefaultTableModel) view.getTblProducto().getModel();
        int a = view.getTblProducto().getRowCount() - 1;
        int i;
        for (i = a; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    public void LimpiarTablaPD() {
        DefaultTableModel modelo = (DefaultTableModel) view.getTblProductoF().getModel();
        int a = view.getTblProductoF().getRowCount() - 1;
        int i;
        for (i = a; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    public void LimpiarTablaS() {
        DefaultTableModel modelo = (DefaultTableModel) view.getTblServicio().getModel();
        int a = view.getTblServicio().getRowCount() - 1;
        int i;
        for (i = a; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    //METODOS DE ELIMINADO
    public void eliminar_datoProduc() {
        DefaultTableModel tablamodel = (DefaultTableModel) view.getTblProducto().getModel();

        int selecc = view.getTblProducto().getSelectedRow();
        if (selecc != -1) {
            tablamodel.removeRow(selecc);
            JOptionPane.showMessageDialog(view, "Producto Eliminado");
            TotalFactura();
        }
    }

    public void eliminar_datoSer() {
        DefaultTableModel tablamodel = (DefaultTableModel) view.getTblServicio().getModel();

        int selecc = view.getTblServicio().getSelectedRow();
        if (selecc != -1) {
            tablamodel.removeRow(selecc);
            JOptionPane.showMessageDialog(view, "Servicio Eliminado");
            TotalFactura();
        }
    }

    private void ImprimirFactura() {
        ConectionPg conexion = new ConectionPg();
        try {
            JasperReport jr = (JasperReport) JRLoader.loadObject(getClass().getResource("/View/Reporte/PV_Facturacion.jasper"));
            Map<String, Object> parametros = new HashMap<>();
            parametros.put("Factura", view.getTxt_IDFactura().getText());
            parametros.put("IVA", view.getTxtIva().getText());
            parametros.put("SUBTOTAL", view.getTxtSubtotal().getText());
            parametros.put("TOTAL", String.valueOf(view.getSpinTotal().getValue()));
            parametros.put("CAMBIO", String.valueOf(view.getSpinCambio().getValue()));
            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, conexion.getCon());
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(ReporteFacturacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
