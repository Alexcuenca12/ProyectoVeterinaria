package Controller.Factura;

import Controller.Revision.ImagenTabla;
import Model.Clientes.Clientes;
import Model.Clientes.ModeloClientes;
import Model.ConectionPg;
import Model.CrudServicios.Servicios;
import Model.Paciente.ModeloPaciente;
import Model.Paciente.*;
import Model.Productos.Productos;
import Model.Veterinario.ModelVeterinario;
import Model.Veterinario.Veterinario;
import Model.facturación.*;
import View.Facturacion.VistaFacturacion;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;

/**
 *
 * @author Usuario
 */
public class ControladorFactura {

    private ModelDetalleProducto modeloDeta_P;
    private ModelDetalleServicio modeloDeta_S;
    private ModelFactura modelFactura;
    private VistaFacturacion view;

    DefaultTableModel modelTa = new DefaultTableModel();
    //Productos produc = new Productos();
    ModelDetalleProducto detalleP = new ModelDetalleProducto();
    ModelDetalleServicio detalleS = new ModelDetalleServicio();

    String idp;
    double tpagar;
    int cant;
    double pree;

    public ControladorFactura(ModelFactura modelFactura, VistaFacturacion view) {

        this.modelFactura = modelFactura;
        this.view = view;
        view.setVisible(true);
        codigo();
        CargarCliente();
        cargarProducto();
        cargarServicio();
        CargarVeterinario();
        Calendar calendar = new GregorianCalendar();
        view.getTxtIva().setText("12");
        view.getTxt_Fecha().setText("" + calendar.get(Calendar.YEAR) + "-" + calendar.get(Calendar.MONTH) + "-" + calendar.get(Calendar.DAY_OF_MONTH));
        view.getTxt_IDFactura().setEnabled(false);
    }

    public void iniciaControl() {
//        Estar  la escucha de todos los eventos de la vista
        view.getBttBuscarIdMedico().addActionListener(l -> abrirDialogo(1));
        view.getBttBuscarClie().addActionListener(l -> abrirDialogo(2));
        view.getBttAgregar().addActionListener(l -> agregarVeterinario());
        view.getBttAgregarC().addActionListener(l -> agregarCliente());
        view.getBttAgregarP().addActionListener(l -> agregarProducto());
        view.getBttañadirp().addActionListener(l -> abrirDlg(1));
        view.getBttañadirs().addActionListener(l -> abrirDlg(2));
        view.getBttAceptarAñadirProduct().addActionListener(l -> llenarTabla_Pro());
        view.getBttAcepatarAñadirS().addActionListener(l -> llenarTabla_Ser());
        setEventoKeytyped(view.getBuscarProducto());
        setEventKeytyped(view.getTxtBuscarServicios());
        setEventKeytypedV(view.getTxtbuscarVeterinario());
        setEventKeytypedC(view.getTxtBuscarClie());
    }

    public void abrirDialogo(int ce) {
        String title;
        if (ce == 1) {
            title = "Visualizar Veterinario";
            view.getDlgMedico().setName("Mascota");
            view.getDlgMedico().setLocationRelativeTo(view);
            view.getDlgMedico().setSize(700, 400);
            view.getDlgMedico().setTitle(title);
            view.getDlgMedico().setVisible(true);

        } else if (ce == 2) {
            title = "Visualizar Cliente";
            view.getDlgCliente().setName("Veterinario");
            view.getDlgCliente().setLocationRelativeTo(view);
            view.getDlgCliente().setSize(800, 400);
            view.getDlgCliente().setTitle(title);
            view.getDlgCliente().setVisible(true);

        }
    }

    public void abrirDlg(int ce) {
        String title;
        if (ce == 1) {
            title = "Visualizar Producto";
            view.getDlgProducto().setName("Producto");
            view.getDlgProducto().setLocationRelativeTo(view);
            view.getDlgProducto().setSize(800, 550);
            view.getDlgProducto().setTitle(title);
            view.getDlgProducto().setVisible(true);

        } else if (ce == 2) {
            title = "Visualizar Servicio";
            view.getDlgServicio().setName("Servicio");
            view.getDlgServicio().setLocationRelativeTo(view);
            view.getDlgServicio().setSize(800, 400);
            view.getDlgServicio().setTitle(title);
            view.getDlgServicio().setVisible(true);

        }
    }

    public void agregarVeterinario() {
        int selecc = view.getTblVeterinario().getSelectedRow();
        if (selecc != -1) {
            String ver = view.getTblVeterinario().getValueAt(selecc, 0).toString();
            ArrayList<Veterinario> tableVet = modelFactura.ListVeterinario();
            for (int j = 0; j < tableVet.size(); j++) {
                if (tableVet.get(j).getid_medico().equals(ver)) {
                    view.getTxt_IDMedico().setText(tableVet.get(j).getid_medico());
                    view.getTxt_Nombre().setText(tableVet.get(j).getNombre_medico());
                }
            }
            view.getDlgMedico().setVisible(false);

        } else {
            //JOptionPane.showMessageDialog(vistaM, "No a seleccionado a ningun veterinario");
        }
    }

    public void CargarVeterinario() {

        //Enlace de la tabla con el metodo de las etiquetas
        DefaultTableModel tblmodel;
        tblmodel = (DefaultTableModel) view.getTblVeterinario().getModel();
        tblmodel.setNumRows(0);

        ArrayList<Veterinario> tablaVet = modelFactura.ListVeterinario();
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

    public void agregarServicio() {
        int selecc = view.getTblServiciosAñadir().getSelectedRow();
        if (selecc != -1) {
            String ver = view.getTblServiciosAñadir().getValueAt(selecc, 0).toString();
            List<Servicios> tableSer = modelFactura.listarServicios();
            for (int j = 0; j < tableSer.size(); j++) {
                if (tableSer.get(j).getId_servicio().equals(ver)) {
                    //view.getTblServiciosAñadir().set
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
            i.value++;
            System.out.println(i.value);
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
                }
            }
        }
    }

    public void calculartotal() {
        tpagar = 0;
        for (int i = 0; i < view.getTblProducto().getRowCount(); i++) {
            cant = (int) (view.getTblProducto().getValueAt(i, 4));
            pree = Double.parseDouble(view.getTblProducto().getValueAt(i, 5).toString());
            tpagar = tpagar + (cant * pree);
        }
        view.getTxt_Total().setText("" + tpagar);
    }

    public void guadarFactura() {
        int id = Integer.parseInt(view.getTxt_IDFactura().getText());
        String fechafac = view.getTxt_Fecha().getText();
        Date fechaactu = java.sql.Date.valueOf(fechafac);
        String cliente = view.getTxt_IDCliente().getText();
        String medico = view.getTxt_IDMedico().getText();

        ModelFactura fac = new ModelFactura();
        fac.setCodigo_factura(id);
        fac.setFecha((java.sql.Date) fechaactu);
        fac.setCodigo_cliente(cliente);
        fac.setCodigo_medico(medico);
        if (fac.CrearFactura()) {
            JOptionPane.showMessageDialog(view, "Factura Guardada satisfactoriamente");
        } else {
            JOptionPane.showMessageDialog(view, "No se pudo crear la factura");
        }
    }

    public void codigo() {

        boolean Codi = false;
        String codigo;
        do {
            Random rd = new Random();
            Random rc = new Random(123);
            codigo = String.valueOf(rd.nextInt(9999 - 1 + 1) + 25);
            ConectionPg cpg = new ConectionPg();
            Statement st;
            ResultSet rs = null;
            PreparedStatement ps = null;
            Connection con = cpg.getCon();

            try {
                String sql = "SELECT id_factura FROM factura WHERE id_factura='" + codigo + "'";
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                    Codi = true;
                }

                rs.close();
            } catch (SQLException ex) {
                System.err.println(ex.toString());
            }

        } while (Codi == true);
        view.getTxt_IDFactura().setText(codigo);

    }

    public void llenarTabla_Pro() {

        DefaultTableModel tablamodel;
        tablamodel = (DefaultTableModel) view.getTblProducto().getModel();
        String idProducto = (view.getTxtIDProduc().getText());
        String nombreProducto = view.getTxtNombreProduc().getText();
        double precio = Double.parseDouble(view.getTxtPrecioProduc().getText());
        String idCategoria = view.getTxtCategoria().getText();
        int cantidad = Integer.valueOf(view.getSppCantidad().getValue().toString());
        //Creamos un arraylist para agregar los objetos
        ArrayList listaVentans = new ArrayList();
        listaVentans.add(idProducto);
        listaVentans.add(nombreProducto);
        listaVentans.add(idCategoria);
        listaVentans.add(cantidad);
        listaVentans.add(precio);
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

    }

    public void llenarTabla_Ser() {

        DefaultTableModel tablamodel;
        tablamodel = (DefaultTableModel) view.getTblServicio().getModel();
        for (int i = 0; i < view.getTblServiciosAñadir().getRowCount(); i++) {
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

    }

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

    private void setEventKeytyped(JTextField txt) {
        txt.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent i) {
                buscarServicio(i);
            }
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

    private void setEventKeytypedC(JTextField txt) {
        txt.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent i) {
                buscarCliente(i);
            }
        });
    }

}
