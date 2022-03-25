package Controller.Factura;

import Model.Clientes.ModeloClientes;
import Model.ConectionPg;
import Model.Paciente.ModeloPaciente;
import Model.Productos.Productos;
import Model.facturación.*;
import View.Facturacion.VistaFacturacion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class ControladorFactura {

    private ModelDetalleProducto modeloDeta_P;
    private ModelDetalleServicio modeloDeta_S;
    private VistaFacturacion view;

    DefaultTableModel modelTa = new DefaultTableModel();
    ModeloClientes modeloCli = new ModeloClientes();
    ModeloPaciente modeloPac = new ModeloPaciente();
    Productos produc = new Productos();
    ModelDetalleProducto detalleP = new ModelDetalleProducto();
    ModelDetalleServicio detalleS = new ModelDetalleServicio();

    String idp;
    double tpagar;
    int cant;
    double pree;

    public ControladorFactura(ModelDetalleProducto modeloDeta_P, ModelDetalleServicio modeloDeta_S, VistaFacturacion view) {
        this.modeloDeta_P = modeloDeta_P;
        this.modeloDeta_S = modeloDeta_S;
        this.view = view;

        Calendar calendar = new GregorianCalendar();
        view.getTxt_Fecha().setText("" + calendar.get(Calendar.YEAR) + "-" + calendar.get(Calendar.MONTH) + "-" + calendar.get(Calendar.DAY_OF_MONTH));
        view.getTxt_IDFactura().setEnabled(false);
    }

    public void agregarproducto() {
//        double total;
//        int item = 0;
//        modelTa = (DefaultTableModel) view.getTblFactura().getModel();
//        item = item + 1;
//        String idfac = view.getTxt_IDFactura().getText();
//        String idProducto = view.getTxt_IDProducto().getText();
//        String nomProducto = view.getTxtNombreProducto().getText();
//        Double precio = Double.parseDouble(view.getTxtPrecio().getText());
//        int cantidad = Integer.parseInt(view.getSpinnerCantidad().getValue().toString());
//        int stock = Integer.parseInt(view.getTxtStock().getText());
//        total = cantidad * precio;
//        ArrayList listaagre = new ArrayList();
//        if (stock >= cantidad) {
//            listaagre.add(item);
//            listaagre.add(idfac);
//            listaagre.add(idProducto);
//            listaagre.add(nomProducto);
//            listaagre.add(cantidad);
//            listaagre.add(precio);
//            listaagre.add(total);
//            Object[] object = new Object[7];
//            object[0] = listaagre.get(0);
//            object[1] = listaagre.get(1);
//            object[2] = listaagre.get(2);
//            object[3] = listaagre.get(3);
//            object[4] = listaagre.get(4);
//            object[5] = listaagre.get(5);
//            object[6] = listaagre.get(6);
//            modelTa.addRow(object);
//            view.getTblFactura().setModel(modelTa);
//            calculartotal();
//
//        } else {
//            JOptionPane.showMessageDialog(view, "Stock producto no disponible");
//        }
//        int respuesta = 0;
//        respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas ingresar otro producto?");
//        if (respuesta == 0) {
//            view.getTxtIDP().setText("");
//            view.getTxtNombre().setText("");
//            view.getTxtPrecio().setText("");
//            view.getSpinnerCantidad().getValue().equals(0);
//            view.getTxtStock().setText("");
//            view.getFotoLabel().setIcon(null);
//        } else {
//
//        }
    }

    public void agregarServicio() {
//        double total;
//        int item = 0;
//
//        modelTa = (DefaultTableModel) view.getTblFactura().getModel();
//        item = item + 1;
//        String idfac = view.getTxt_IDFactura().getText();
//        String idServicio = view.getTxt_IDServicio().getText();
//        String nomServicio = view.getTxtNomServicio().getText();
//        Double precio = Double.parseDouble(view.getTxtPrecio().getText());
//        int cantidad = Integer.parseInt(view.getSpinnerCantidad().getValue().toString());
//        int stock = Integer.parseInt(view.getTxtStock().getText());
//        total = cantidad * precio;
//        ArrayList listaagre = new ArrayList();
//        if (stock >= cantidad) {
//            listaagre.add(item);
//            listaagre.add(idfac);
//            listaagre.add(idServicio);
//            listaagre.add(nomServicio);
//            listaagre.add(cantidad);
//            listaagre.add(precio);
//            listaagre.add(total);
//            Object[] object = new Object[7];
//            object[0] = listaagre.get(0);
//            object[1] = listaagre.get(1);
//            object[2] = listaagre.get(2);
//            object[3] = listaagre.get(3);
//            object[4] = listaagre.get(4);
//            object[5] = listaagre.get(5);
//            object[6] = listaagre.get(6);
//            modelTa.addRow(object);
//            view.getTblFactura().setModel(modelTa);
//            calculartotal();
//
//        } else {
//            JOptionPane.showMessageDialog(view, "Stock producto no disponible");
//        }
//        int respuesta = 0;
//        respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas ingresar otro producto?");
//        if (respuesta == 0) {
//            view.getTxtIDP().setText("");
//            view.getTxtNombre().setText("");
//            view.getTxtPrecio().setText("");
//            view.getSpinnerCantidad().getValue().equals(0);
//            view.getTxtStock().setText("");
//            view.getFotoLabel().setIcon(null);
//        } else {
//
//        }
    }

    public void calculartotal() {
//        tpagar = 0;
//        for (int i = 0; i < view.getTblFactura().getRowCount(); i++) {
//            cant = (int) (view.getTblFactura().getValueAt(i, 4));
//            pree = Double.parseDouble(view.getTblFactura().getValueAt(i, 5).toString());
//            tpagar = tpagar + (cant * pree);
//        }
//        view.getTxtTotal().setText("" + tpagar);
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

    public void guardarDetalleP() {
        for (int i = 0; i < view.getTblFactura().getRowCount(); i++) {
            // int idDetalle = Integer.parseInt(vista.getTxtDetalle().getText());
            String factura = view.getTblFactura().getValueAt(i, 1).toString();
            String producto = view.getTblFactura().getValueAt(i, 2).toString();
            int cantdetalle = Integer.parseInt(view.getTblFactura().getValueAt(i, 3).toString());
            double totaldetalle = Double.parseDouble(view.getTblFactura().getValueAt(i, 4).toString());
            //detalle.setId_Detallefac(idDetalle);
            detalleP.setCodigo_factura(Integer.parseInt(factura));
            detalleP.setCodigo_producto(producto);
            detalleP.setCantidad(cantdetalle);
            detalleP.setTotal(totaldetalle);

            if (detalleP.CrearDetalleProd()) {
                JOptionPane.showMessageDialog(view, "Detalle Factura Guardado satisfactoriamente");
            } else {
                JOptionPane.showMessageDialog(view, "No se pudo crear el detalle factura");
            }
        }
    }

    public void guardarDetalleS() {
        for (int i = 0; i < view.getTblFactura().getRowCount(); i++) {
            // int idDetalle = Integer.parseInt(vista.getTxtDetalle().getText());
            String factura = view.getTblFactura().getValueAt(i, 1).toString();
            String Servicio = view.getTblFactura().getValueAt(i, 2).toString();
            int cantdetalle = Integer.parseInt(view.getTblFactura().getValueAt(i, 3).toString());
            double totaldetalle = Double.parseDouble(view.getTblFactura().getValueAt(i, 4).toString());
            //detalle.setId_Detallefac(idDetalle);
            detalleS.setCodigo_factura(Integer.parseInt(factura));
            detalleS.setCodigo_servicio(Servicio);
            detalleS.setCantidad(cantdetalle);
            detalleS.setTotal(totaldetalle);

            if (detalleS.CrearDetalleSer()) {
                JOptionPane.showMessageDialog(view, "Detalle Factura Guardado satisfactoriamente");
            } else {
                JOptionPane.showMessageDialog(view, "No se pudo crear el detalle factura");
            }
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
                String sql = "SELECT id FROM factura WHERE id='" + codigo + "'";
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
}
