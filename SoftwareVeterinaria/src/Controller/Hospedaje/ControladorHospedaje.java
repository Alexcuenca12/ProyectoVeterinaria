package Controller.Hospedaje;

import Controller.Paciente.ImagenTabla;
import Model.Celda.Celda;
import Model.Celda.ModelCelda;
import Model.Guarderia.Guarderia;
import Model.Guarderia.ModelGuarderia;
import Model.Paciente.Paciente;
import View.Hospedaje.VistaHospedaje;
import com.toedter.calendar.JDateChooser;
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
        vista.getBtnBuscarMascota().addActionListener(l ->CargarMascota());
        vista.getBtnAñadir().addActionListener(l ->agregarMascota());
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
    
   
    public void CargarMascota(){
         vista.getDialogMascota().setSize(973,388);
        vista.getDialogMascota().setLocationRelativeTo(vista);
        vista.getDialogMascota().setVisible(true);
       vista.getTabla_Mascotas().setDefaultRenderer(Object.class, new ImagenTabla());
       vista.getTabla_Mascotas().setRowHeight(100);

        //Enlace de la tabla con el metodo de las etiquetas
        DefaultTableModel tblmodel;
        tblmodel = (DefaultTableModel)vista.getTabla_Mascotas().getModel();
        tblmodel.setNumRows(0);

        ArrayList<Paciente> list = modelo.listarPacientes();
        Holder<Integer> i = new Holder<>(0);
        list.stream().forEach(pac -> {
            //Para calcular la edad de la persona
            Period edad = Period.between(pac.getFecha_nacimiento_mascota().toLocalDate(), LocalDate.now());
            //Agregar a la tabla
            tblmodel.addRow(new Object[10]);
            vista.getTabla_Mascotas().setValueAt(pac.getId_mascota(), i.value, 0);
            vista.getTabla_Mascotas().setValueAt(pac.getId_cliente_m(), i.value, 1);
           vista.getTabla_Mascotas().setValueAt(pac.getNombre_mascota(), i.value, 2);
            vista.getTabla_Mascotas().setValueAt(pac.getSexo_mascota(), i.value, 3);
            vista.getTabla_Mascotas().setValueAt(pac.getEspecie_mascota(), i.value, 4);
            vista.getTabla_Mascotas().setValueAt(pac.getRaza_mascota(), i.value, 5);
            vista.getTabla_Mascotas().setValueAt(pac.getColor_mascota(), i.value, 6);
            vista.getTabla_Mascotas().setValueAt(edad.getYears(), i.value, 7);
            vista.getTabla_Mascotas().setValueAt(pac.getFecha_ingreso_mascota(), i.value, 8);
            Image foto = pac.getFoto();
            if (foto != null) {

                Image nimg = foto.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                ImageIcon icono = new ImageIcon(nimg);
                DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
                renderer.setIcon(icono);
                vista.getTabla_Mascotas().setValueAt(new JLabel(icono), i.value, 9);

            } else {
                vista.getTabla_Mascotas().setValueAt(null, i.value, 9);
            }
            i.value++;

        });
 
    }
    public void agregarMascota() {
        boolean encontrada;
        int selecc = vista.getTabla_Mascotas().getSelectedRow();
        if (selecc != -1) {
            String ver = vista.getTabla_Mascotas().getValueAt(selecc, 0).toString();
            List<Paciente> tablaMas = modelo.listarPacientes();
            for (int j = 0; j < tablaMas.size(); j++) {
                if (tablaMas.get(j).getId_mascota().equals(ver)) {
                    vista.getTxtNombreMas().setText(tablaMas.get(j).getNombre_mascota());
                    vista.getTxtSexo().setText(tablaMas.get(j).getSexo_mascota());
                    vista.getTxtEspecie().setText(tablaMas.get(j).getEspecie_mascota());
                    vista.getTxtRaza().setText(tablaMas.get(j).getRaza_mascota());
                    vista.getTxtEdad().setText(String.valueOf(CalcularEdad(tablaMas.get(j).getFecha_nacimiento_mascota())));
                    if (tablaMas.get(j).getFoto() == null) {
                        vista.getLblFoto().setIcon(null);
                    } else {
                        Image in = tablaMas.get(j).getFoto();
                        Image img = in.getScaledInstance(133, 147, Image.SCALE_SMOOTH);
                        Icon icono = new ImageIcon(img);
                        vista.getLblFoto().setIcon(icono);
                    }
                }
            }
            vista.getDialogMascota().setVisible(false);
        } else {
            //JOptionPane.showMessageDialog(vistaM, "No a seleccionado a niguna mascota");
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
        if (vista.getDlgHospedaje().getName()=="crear") {
            CrearHospedaje();
        }else{
            EditarHospedaje();
        }
    }
    
    public void CrearHospedaje(){
        int codigoH=Integer.valueOf(vista.getTxtCodHospedaje().getText());
        String codMascota=vista.getTxtCodMascota().getText();
        String codCelda=vista.getTxtCodCelda().getText();
        String fechaIngreso=getFecha(vista.getFechaIngreso());
        String fechaSalida=getFecha(vista.getFechaSalida());
        boolean estado=OpcionEstado();
        
        if (vista.getTxtCodHospedaje().getText().isEmpty()||codMascota.isEmpty()||codCelda.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Porfavor llenar todos los campos"); 
        }else{
            ModelGuarderia hospedaje=new ModelGuarderia();
            hospedaje.setId_hospedaje(codigoH);
            hospedaje.setId_mascota(codMascota);
            hospedaje.setId_celda(codCelda);
            hospedaje.setFecha_ingreso(Date.valueOf(fechaIngreso));
            hospedaje.setFecha_salida(Date.valueOf(fechaSalida));
            hospedaje.setEstado(estado);
            if (hospedaje.CrearGuarderia()) {
                JOptionPane.showMessageDialog(vista, "El hospedaje se creo satisfactoriamente");
                vista.getDlgHospedaje().setVisible(false);
                LimpiarTabla();
                CargarHospedaje();
                vista.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(vista, "Error no se pudo crear el hospedaje");
            }
            
        }
    }
    
    public void EditarHospedaje(){
       int codigoH=Integer.valueOf(vista.getTxtCodHospedaje().getText());
        String codMascota=vista.getTxtCodMascota().getText();
        String codCelda=vista.getTxtCodCelda().getText();
        String fechaIngreso=getFecha(vista.getFechaIngreso());
        String fechaSalida=getFecha(vista.getFechaSalida());
        boolean estado=OpcionEstado();
        
        if (vista.getTxtCodHospedaje().getText().isEmpty()||codMascota.isEmpty()||codCelda.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Porfavor llenar todos los campos"); 
        }else{
            ModelGuarderia hospedaje=new ModelGuarderia();
            hospedaje.setId_hospedaje(codigoH);
            hospedaje.setId_mascota(codMascota);
            hospedaje.setId_celda(codCelda);
            hospedaje.setFecha_ingreso(Date.valueOf(fechaIngreso));
            hospedaje.setFecha_salida(Date.valueOf(fechaSalida));
            hospedaje.setEstado(estado);
            if (hospedaje.editarGuarderia()) {
                JOptionPane.showMessageDialog(vista, "El hospedaje se modifico satisfactoriamente");
                vista.getDlgHospedaje().setVisible(false);
                LimpiarTabla();
                CargarHospedaje();
                vista.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(vista, "Error no se pudo modificar el hospedaje");
            }  
        } 
    }
     //Metodo de radioButton estado
    public boolean OpcionEstado() {
        boolean opcion=true;
        if (vista.getRbDisponible().isSelected()) {
            opcion = true;
        }
        if (vista.getRbOcupado().isSelected()) {
            opcion = false;
        }
        return opcion;
    }
    
    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
    public String getFecha(JDateChooser jd) {
        if (jd.getDate() != null) {
            return formato.format(jd.getDate());
        } else {
            return null;
        }
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
