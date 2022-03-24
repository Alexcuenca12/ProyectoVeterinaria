package Controller.proveedor;

import Model.ConectionPg;
import Model.Proveedor.ModelProveedor;
import Model.Proveedor.Proveedor;
import View.CrudProveedor.VistaProveedor;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;

public class ControllerProveedor {

    ModelProveedor model;
    VistaProveedor vista;

    public ControllerProveedor(ModelProveedor model, VistaProveedor vista) {
        this.model = model;
        this.vista = vista;
        vista.setVisible(true);
    }

    public void IniciaControl() {
        vista.getBtnadd().addActionListener(l -> abrirDialogo(1));
        vista.getBtnmod().addActionListener(l -> abrirDialogo(2));
        vista.getBtndel().addActionListener(l -> delete());
        vista.getBtnace().addActionListener(l -> CreatandEdit());
        vista.getBtncan().addActionListener(l -> limpiar());
        vista.getTxbusqueda().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                CargarTabla();
            }
        });
    }

    private void CargarTabla() {
        DefaultTableModel tblmodel;
        tblmodel = (DefaultTableModel) vista.getJtprov().getModel();
        tblmodel.setNumRows(0);
        
        String valor= vista.getTxbusqueda().getText();
        ArrayList<Proveedor> list = model.listProveedores(valor);
        Holder<Integer> i = new Holder<>(0);
        list.stream().forEach(prov -> {
            tblmodel.addRow(new Object[8]);
            vista.getJtprov().setValueAt(prov.getRuc_proveedor(), i.value, 0);
            vista.getJtprov().setValueAt(prov.getNombre(), i.value, 1);
            vista.getJtprov().setValueAt(prov.getApellido(), i.value, 2);
            vista.getJtprov().setValueAt(prov.getTelefono(), i.value, 3);
            vista.getJtprov().setValueAt(prov.getDirecccion(), i.value, 4);
            vista.getJtprov().setValueAt(prov.getDescripcion(), i.value, 5);
            vista.getJtprov().setValueAt(prov.getEmpresa(), i.value, 6);
            vista.getJtprov().setValueAt(prov.getCorreo(), i.value, 7);

            i.value++;

        });

    }

    private void CreatandEdit() {
        if (vista.getjDialog1().getName().equals("crear")) {

            String ruc_proveedor = vista.getTxruc().getText();
            String nombre = vista.getTxnom().getText();
            String apellido = vista.getTxap().getText();
            String telefono = vista.getTxtel().getText();
            String direccion = vista.getTxdir().getText();
            String descripcion = vista.getTxdesc().getText();
            String empresa = vista.getTxemp().getText();
            String correo = vista.getTxema().getText();

            ModelProveedor proveedor = new ModelProveedor();
            proveedor.setApellido(apellido);
            proveedor.setCorreo(correo);
            proveedor.setDescripcion(descripcion);
            proveedor.setDirecccion(direccion);
            proveedor.setEmpresa(empresa);
            proveedor.setNombre(nombre);
            proveedor.setRuc_proveedor(ruc_proveedor);
            proveedor.setTelefono(telefono);

            if (proveedor.CrearProveedor()) {
                vista.getjDialog1().setVisible(false);
                JOptionPane.showMessageDialog(vista, "Exito en la operacion");
            } else {
                JOptionPane.showMessageDialog(vista, "Error en la operacion");
            }
        } else {
            String ruc_proveedor = vista.getTxruc().getText();
            String nombre = vista.getTxnom().getText();
            String apellido = vista.getTxap().getText();
            String telefono = vista.getTxtel().getText();
            String direccion = vista.getTxdir().getText();
            String descripcion = vista.getTxdesc().getText();
            String empresa = vista.getTxemp().getText();
            String correo = vista.getTxema().getText();

            ModelProveedor proveedor = new ModelProveedor();
            proveedor.setApellido(apellido);
            proveedor.setCorreo(correo);
            proveedor.setDescripcion(descripcion);
            proveedor.setDirecccion(direccion);
            proveedor.setEmpresa(empresa);
            proveedor.setNombre(nombre);
            proveedor.setRuc_proveedor(ruc_proveedor);
            proveedor.setTelefono(telefono);

            if (proveedor.ActualizarProveedor()) {
                vista.getjDialog1().setVisible(false);
                JOptionPane.showMessageDialog(vista, "Exito en la operacion");
            } else {
                JOptionPane.showMessageDialog(vista, "Error en la operacion");
            }
        }
    }

    private void delete() {
        if (vista.getJtprov().getSelectedRow() > -1) {
            ModelProveedor proveedor = new ModelProveedor();
            String ruc_proveedor = vista.getJtprov().getValueAt(vista.getJtprov().getSelectedRow(), 0).toString();
            proveedor.setRuc_proveedor(ruc_proveedor);
            if (proveedor.EliminaProveedor()) {
                JOptionPane.showMessageDialog(vista, "Exito en la operacion");
            } else {
                JOptionPane.showMessageDialog(vista, "Error en la operacion");
            }
        } else {
            JOptionPane.showMessageDialog(vista, "Seleccion una fila de la tabla");
        }
    }

    private void abrirDialogo(int ce) {
        String tittle = "";
        vista.getjDialog1().setSize(700, 400);
        vista.getjDialog1().setLocationRelativeTo(vista);
        if (ce == 1) {
            tittle = "Crear nuevo Proveedor";
            vista.getjDialog1().setName("crear");
            vista.getjDialog1().setVisible(true);

        } else {
            if (vista.getJtprov().getSelectedRow() > -1) {
                tittle = "Modificar Proveedor";
                cargaMod();
                vista.getjDialog1().setName("edit");
                vista.getjDialog1().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(vista, "Seleccion una fila de la tabla");
            }
        }
        vista.getjDialog1().setTitle(tittle);
    }

    public void cargaMod() {
        ArrayList<Proveedor> list = model.listProveedores(vista.getJtprov().getValueAt(vista.getJtprov().getSelectedRow(), 0).toString());
        list.stream().forEach(prov -> {
            vista.getTxap().setText(prov.getApellido());
            vista.getTxdesc().setText(prov.getDescripcion());
            vista.getTxdir().setText(prov.getDirecccion());
            vista.getTxema().setText(prov.getCorreo());
            vista.getTxemp().setText(prov.getEmpresa());
            vista.getTxnom().setText(prov.getNombre());
            vista.getTxruc().setText(prov.getRuc_proveedor());
            vista.getTxtel().setText(prov.getTelefono());
        });
    }

    public void imprimirClientes() {

    }

    public void limpiar() {
        vista.getTxap().setText("");
        vista.getTxdesc().setText("");
        vista.getTxdir().setText("");
        vista.getTxema().setText("");
        vista.getTxemp().setText("");
        vista.getTxnom().setText("");
        vista.getTxruc().setText("");
        vista.getTxtel().setText("");
    }
}
