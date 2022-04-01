package Controller.Hospedaje;

import Model.Celda.Celda;
import Model.Celda.ModelCelda;
import Model.Guarderia.Guarderia;
import Model.Guarderia.ModelGuarderia;
import Model.Paciente.Paciente;
import View.Hospedaje.VistaHospedaje;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;

/**
 *
 * @author Usuario
 */
public class ControladorHospedaje {

    private ModelGuarderia modelo;
    private VistaHospedaje vista;
    private ModelCelda modelCel;

    //Constructor
    public ControladorHospedaje(ModelGuarderia modelo, VistaHospedaje vista, ModelCelda modelCel) {
        this.modelo = modelo;
        this.vista = vista;
        this.modelCel = modelCel;
        vista.setVisible(true);
        CargarHospedaje();
        cargarCelda();
    }

    private void abrirDlg(int ce) {
        String tittle = "";
        vista.getDialogCelda().setSize(700, 300);
        vista.getDialogCelda().setLocationRelativeTo(vista);
        if (ce == 1) {
            tittle = "Crear nueva Celda";
            vista.getDialogCelda().setName("crear");
            vista.getDialogCelda().setVisible(true);

        } else {
            if (vista.getTblCelda().getSelectedRow() > -1) {
                tittle = "Modificar Celda";
                //cargaMod();
                vista.getDialogCelda().setName("edit");
                vista.getDialogCelda().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(vista, "Seleccion una fila de la tabla");
            }
        }
        vista.getDialogCelda().setTitle(tittle);
    }

    public void iniciarControl() {
        vista.getBtnAgregar().addActionListener(l -> abrirDialogo(1));
        vista.getBtnEditar().addActionListener(l -> abrirDialogo(2));
        vista.getBtnEliminar().addActionListener(l -> eliminarHospedaje());
        vista.getBtnAceptar().addActionListener(l -> crear_editar());
        vista.getBtnCancelar().addActionListener(l -> Cancelar());
        vista.getBtnBuscarCelda().addActionListener(l -> abrirDlg(1));
        vista.getBtn_AgregarCel().addActionListener(l -> crearEditarCelda());
//        vista.getBtnBuscarMascota().addActionListener(l->abriDialogox(1));
        vista.getTxt_Buscar().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                cargarCelda();
            }
        });
    }

    public void abrirDialogox(int x) {
        if (x == 1) {
            vista.getDialogMascota().setName("mascota");
//            vista.getDialogMascota().setSize();
        }
    }

    public void CargarHospedaje() {
        DefaultTableModel tablamodel = (DefaultTableModel) vista.getTabla_hospedaje().getModel();
        tablamodel.setNumRows(0);
        List<Guarderia> listaHospedaje = modelo.listarGuarderia();
        listaHospedaje.stream().forEach(hosp -> {
            String[] filas = {String.valueOf(hosp.getId_hospedaje()), hosp.getId_mascota(), hosp.getId_celda(),
                String.valueOf(hosp.getFecha_ingreso()), String.valueOf(hosp.getFecha_salida()), String.valueOf(hosp.isEstado())};
            tablamodel.addRow(filas);
        });
    }

    public void abrirDialogo(int num) {
        if (num == 1) {
            Crear();
        } else {
            Editar();
        }
        vista.getDlgHospedaje().setVisible(true);
        vista.getDlgHospedaje().setSize(795, 540);
    }

    public void Crear() {
        vista.getTxtNombreMas().setText("");
        vista.getTxtRaza().setText("");
        vista.getTxtSexo().setText("");
        vista.getTxtEspecie().setText("");
        vista.getTxtEdad().setText("");
        vista.getLblFoto().setIcon(null);
        vista.getTxtCodigoCelda().setText("");
        vista.getTxtUbicacion().setText("");
        vista.getTxtCosto().setText("");
        vista.getTxtCodHospedaje().setText("");
        vista.getTxtCodMascota().setText("");
        vista.getTxtCodCelda().setText("");
        vista.getFechaIngreso().setDate(null);
        vista.getFechaSalida().setDate(null);
        //RADIOS BUTONS
    }

    public void Editar() {
        vista.getDlgHospedaje().setName("editar");
        boolean encontrado;
        int fila = vista.getTabla_hospedaje().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(vista, "Debes seleccionar una fila");
            vista.getDlgHospedaje().dispose();
            vista.setVisible(true);
        } else {
            String identificador = vista.getTabla_hospedaje().getValueAt(fila, 0).toString();
            List<Guarderia> listaHospedaje = modelo.listarGuarderia();
            for (int i = 0; i < listaHospedaje.size(); i++) {
                if (String.valueOf(listaHospedaje.get(i).getId_hospedaje()).equals(identificador)) {
                    vista.getTxtCodHospedaje().setText(String.valueOf(listaHospedaje.get(i).getId_hospedaje()));
                    vista.getTxtCodMascota().setText(listaHospedaje.get(i).getId_mascota());
                    vista.getTxtCodCelda().setText(listaHospedaje.get(i).getId_celda());
                    vista.getFechaIngreso().setDate(listaHospedaje.get(i).getFecha_ingreso());
                    vista.getFechaSalida().setDate(listaHospedaje.get(i).getFecha_salida());
                }
            }
            List<Paciente> listaMascotas = modelo.listarPacientes();
            listaMascotas.stream().forEach(masc -> {
                vista.getTxtNombreMas().setText(masc.getNombre_mascota());
                vista.getTxtRaza().setText(masc.getRaza_mascota());
                vista.getTxtSexo().setText(masc.getSexo_mascota());
                int edad = CalcularEdad(masc.getFecha_nacimiento_mascota());
                vista.getTxtEdad().setText("" + edad);
                //FOTO
                Image foto = masc.getFoto();
                if (foto != null) {
                    Image nimg = foto.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                    ImageIcon icon = new ImageIcon(nimg);
                    DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
                    renderer.setIcon(icon);
                    vista.getLblFoto().setIcon(icon);
                } else {
                    vista.getLblFoto().setIcon(null);
                }
            });
        }
    }

    public static int CalcularEdad(Date fecha) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        SimpleDateFormat forma = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendario = Calendar.getInstance();
        String nacimiento = forma.format(fecha);
        LocalDate FechaNacimiento = LocalDate.parse(nacimiento, formato);
        LocalDate actualidad = LocalDate.now();
        Period periodo = Period.between(FechaNacimiento, actualidad);
        int anios = periodo.getYears();
        return anios;
    }

    public void crear_editar() {

    }

    public void eliminarHospedaje() {
        int confirmacion = JOptionPane.showConfirmDialog(null, "Esta seguro de retirar este hospedaje?", "Confirmacion", JOptionPane.YES_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            int fila = vista.getTabla_hospedaje().getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(vista, "Debes seleccionar un registro");
            } else {
                String id = (String.valueOf(vista.getTabla_hospedaje().getValueAt(fila, 0).toString()));
                modelo.eliminarGuarderia(id);
                JOptionPane.showMessageDialog(vista, "El registro a sido eliminado");
                System.out.println("");
                CargarHospedaje();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro");
        }
    }

    public void Cancelar() {
        vista.setVisible(true);
        vista.getDlgHospedaje().setVisible(false);
    }

    public void LimpiarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) vista.getTabla_hospedaje().getModel();
        int a = vista.getTabla_hospedaje().getRowCount() - 1;
        int i;
        for (i = a; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    public void buscarHospedaje(java.awt.event.KeyEvent evt) {
        DefaultTableModel tablamodel = (DefaultTableModel) vista.getTabla_hospedaje().getModel();
        tablamodel.setNumRows(0);
        List<Guarderia> listaHospedaje = modelo.busqueda(vista.getTxtBuscar().getText());
        listaHospedaje.stream().forEach(hosp -> {
            String[] filas = {String.valueOf(hosp.getId_hospedaje()), hosp.getId_mascota(), hosp.getId_celda(),
                String.valueOf(hosp.getFecha_ingreso()), String.valueOf(hosp.getFecha_salida()), String.valueOf(hosp.isEstado())};
            tablamodel.addRow(filas);
        });
    }

    //Metodo de busqueda
    private void setEventoKeytyped(JTextField txt) {
        txt.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                buscarHospedaje(e);
            }
        });
    }

    public void ImprimirReporte() {

    }

    public void cargarCelda() {
        DefaultTableModel tblmodel;
        tblmodel = (DefaultTableModel) vista.getTblCelda().getModel();
        tblmodel.setNumRows(0);
        String valor = vista.getTxt_IDCelda().getText();
        List<Celda> list = modelCel.ListarCelda(valor);
        Holder<Integer> i = new Holder<>(0);
        list.stream().forEach(prov -> {
            tblmodel.addRow(new Object[8]);
            vista.getTblCelda().setValueAt(prov.getId_celda(), i.value, 0);
            vista.getTblCelda().setValueAt(prov.getCosto_celda(), i.value, 1);
            vista.getTblCelda().setValueAt(prov.getUbicacion_celda(), i.value, 2);
            i.value++;

        });
    }

    private void crearEditarCelda() {
        if (vista.getDialogCelda().getName().equals("crear")) {

            String idCelda = vista.getTxt_IDCelda().getText();
            Double costoCelda = Double.parseDouble(vista.getTxt_CosCelda().getText());
            String ubicacionCel = vista.getTxt_UbiCelda().getText();

            ModelCelda celda = new ModelCelda();
            celda.setId_celda(idCelda);
            celda.setCosto_celda(costoCelda);
            celda.setUbicacion_celda(ubicacionCel);

            if (celda.crearCelda()) {
                vista.getDialogCelda().setVisible(false);
                JOptionPane.showMessageDialog(vista, "Exito en la operacion");
                limpiarCelda();
                cargarCelda();
            } else {
                JOptionPane.showMessageDialog(vista, "Error en la operacion");
            }
        }
    }

    public void editarCelda() {

        String idCelda = vista.getTxt_IDCelda().getText();
        Double costoCelda = Double.parseDouble(vista.getTxt_CosCelda().getText());
        String ubicacionCel = vista.getTxt_UbiCelda().getText();

        ModelCelda celda = new ModelCelda();
        celda.setId_celda(idCelda);
        celda.setCosto_celda(costoCelda);
        celda.setUbicacion_celda(ubicacionCel);

        if (celda.editarCelda()) {
            //vista.getDialogCelda().setVisible(false);
            JOptionPane.showMessageDialog(vista, "Exito en la operacion");
            limpiarCelda();
            cargarCelda();
        } else {
            JOptionPane.showMessageDialog(vista, "Error en la operacion");
        }

    }

    private void delete() {
        if (vista.getTblCelda().getSelectedRow() > -1) {
            ModelCelda celda = new ModelCelda();
            String idCelda = vista.getTblCelda().getValueAt(vista.getTblCelda().getSelectedRow(), 0).toString();
            celda.setId_celda(idCelda);
            if (celda.eliminarCelda(idCelda)) {
                JOptionPane.showMessageDialog(vista, "Exito en la operacion");
                cargarCelda();
                limpiarCelda();
            } else {
                JOptionPane.showMessageDialog(vista, "Error en la operacion");
            }
        } else {
            JOptionPane.showMessageDialog(vista, "Seleccion una fila de la tabla");
        }
    }



    public void limpiarCelda() {
        vista.getTxt_IDCelda().setText("");
        vista.getTxt_CosCelda().setText("");
        vista.getTxt_UbiCelda().setText("");
    }
}
