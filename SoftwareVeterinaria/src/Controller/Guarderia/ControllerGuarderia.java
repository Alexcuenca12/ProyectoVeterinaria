/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Guarderia;

import Controller.Revision.ImagenTabla;
import Model.Guarderia.Guarderia;
import Model.Guarderia.ModelGuarderia;
import Model.Paciente.Paciente;
import Model.Paciente.ModeloPaciente;
import View.Guarderia.VistaGuarderia;
import com.toedter.calendar.JDateChooser;
import java.awt.Image;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;

/**
 *
 * @author Edison
 */
public class ControllerGuarderia {
    private ModelGuarderia modelo;
    private VistaGuarderia vistaG;
    ModeloPaciente modelPac;

    public ControllerGuarderia(ModelGuarderia modelo, VistaGuarderia vistaG) {
        this.modelo = modelo;
        this.vistaG = vistaG;
        vistaG.setVisible(true);
//        CargarHospedaje();
    }
    
    public void iniciarControl(){
        vistaG.getBtnCelda1().addActionListener(l -> abrirDialogo(1));
        vistaG.getBtnCelda2().addActionListener(l -> abrirDialogo(1));
        vistaG.getBtnCelda3().addActionListener(l -> abrirDialogo(1));
        vistaG.getBtnCelda4().addActionListener(l -> abrirDialogo(1));
        vistaG.getBtnCelda5().addActionListener(l -> abrirDialogo(1));
        vistaG.getBtnCelda6().addActionListener(l -> abrirDialogo(1));
        vistaG.getBtnCelda7().addActionListener(l -> abrirDialogo(1));
        vistaG.getBtnCelda8().addActionListener(l -> abrirDialogo(1));
        vistaG.getBtnCelda9().addActionListener(l -> abrirDialogo(1));
        vistaG.getBtnCelda10().addActionListener(l -> abrirDialogo(1));
        
        vistaG.getBtnBuscarMascota().addActionListener(l -> abrirDialogo2(2));
        vistaG.getBtnAgregarMasG().addActionListener(l -> agregarMascota());
        vistaG.getBtnAceptarIng().addActionListener(l -> agregarHospedaje());
        
    }
    
//    public void abrirDialogo(int ce) {
//        String title;
//        if (ce == 1) {
//
//            title = "Ingreso Mascota";
//            vistaG.getDlgIngreso().setName("Celda");
//            vistaG.getDlgIngreso().setLocationRelativeTo(vistaG);
//            vistaG.getDlgIngreso().setSize(973, 388);
//            vistaG.getDlgIngreso().setTitle(title);
//            vistaG.getDlgIngreso().setVisible(true);
//        } else{
//            editar();
//        }
//    }
    
    public void abrirDialogo(int num){
        if (num==1) {
            Crear();
        }else{
            //editar();
        }
        vistaG.getDlgIngreso().setVisible(true);
        vistaG.getDlgIngreso().setSize(820, 320);
    }
    
    private void Crear(){
        vistaG.getDlgIngreso().setLocationRelativeTo(null);
        vistaG.getTxtIdHospedaje().setText("");
        vistaG.getTxtIdMascota().setText("");
        vistaG.getTxtIdCelda().setText("");
        vistaG.getJdtFechaIngreso().setCalendar(null);
        vistaG.getJdtFechaSalida().setCalendar(null);
        vistaG.getBtgEstado().clearSelection();

        vistaG.getDlgIngreso().setName("Crear");
    }
    
//    public void editar(){
//        //titulo="MODIFICAR CLIENTE";
//        vistaG.getDlgIngreso().setName("editar");
//        boolean encontrada;
//        int fila=vistaG.getTblGuarderia().getSelectedRow();
//        if (fila==-1) {
//            JOptionPane.showMessageDialog(vistaG, "Debes seleccionar una fila");
//            vistaG.getDlgIngreso().dispose();
//            vistaG.setVisible(true);
//        }else{
//            String identificador =vistaG.getTblGuarderia().getValueAt(fila, 0).toString();
//            List<Guarderia> listaGuarderia=modelo.listarGuarderia();
//            for (int i = 0; i < listaGuarderia.size(); i++) {
//                if (listaGuarderia.get(i).getId_hospedaje()) {
//                 vistaG.getTxtIdHospedaje().setText(listaGuarderia.get(i).getId_hospedaje());
//                 vistaG.getTxtIdMascota().setText(listaGuarderia.get(i).getId_mascota());
//                 vistaG.getTxtIdCelda().setText(listaGuarderia.get(i).getId_celda());
//                 vistaG.getJdtFechaIngreso().setDate(listaGuarderia.get(i).getFecha_ingreso());
//                 vistaG.getJdtFechaSalida().setDate(listaGuarderia.get(i).getFecha_salida());
//                 vistaG.getBtgEstado().setSelected(listaGuarderia.get(i).isEstado());
//
//                } 
//            }
//        }
//    }
    
    public void abrirDialogo2(int ce) {
        String title;
        if (ce == 2) {

            title = "Lista Mascotas";
            vistaG.getDlgMascotas().setName("Mascotas");
            vistaG.getDlgMascotas().setLocationRelativeTo(vistaG);
            vistaG.getDlgMascotas().setSize(973, 388);
            vistaG.getDlgMascotas().setTitle(title);
            vistaG.getDlgMascotas().setVisible(true);
            CargarMascota();
        } 
    }
    
    public void CargarMascota() {

        vistaG.getTblMascotas().setDefaultRenderer(Object.class, new ImagenTabla());
        vistaG.getTblMascotas().setRowHeight(100);

        //Enlace de la tabla con el metodo de las etiquetas
        DefaultTableModel tblmodel;
        tblmodel = (DefaultTableModel) vistaG.getTblMascotas().getModel();
        tblmodel.setNumRows(0);

        ArrayList<Paciente> list = modelo.listarPacientes();
        Holder<Integer> i = new Holder<>(0);
        list.stream().forEach(pac -> {
            //Para calcular la edad de la persona
            Period edad = Period.between(pac.getFecha_nacimiento_mascota().toLocalDate(), LocalDate.now());
            //Agregar a la tabla
            tblmodel.addRow(new Object[10]);
            vistaG.getTblMascotas().setValueAt(pac.getId_mascota(), i.value, 0);
            vistaG.getTblMascotas().setValueAt(pac.getId_cliente_m(), i.value, 1);
            vistaG.getTblMascotas().setValueAt(pac.getNombre_mascota(), i.value, 2);
            vistaG.getTblMascotas().setValueAt(pac.getRaza_mascota(), i.value, 3);
            vistaG.getTblMascotas().setValueAt(pac.getSexo_mascota(), i.value, 4);
            vistaG.getTblMascotas().setValueAt(pac.getEspecie_mascota(), i.value, 5);
            vistaG.getTblMascotas().setValueAt(pac.getColor_mascota(), i.value, 6);
            vistaG.getTblMascotas().setValueAt(edad.getYears(), i.value, 7);
            vistaG.getTblMascotas().setValueAt(pac.getFecha_ingreso_mascota(), i.value, 8);
            Image foto = pac.getFoto();
            if (foto != null) {

                Image nimg = foto.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                ImageIcon icono = new ImageIcon(nimg);
                DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
                renderer.setIcon(icono);
                vistaG.getTblMascotas().setValueAt(new JLabel(icono), i.value, 9);

            } else {
                vistaG.getTblMascotas().setValueAt(null, i.value, 9);
            }
            i.value++;

        });
    }
    
    public void agregarMascota() {
        int selecc = vistaG.getTblMascotas().getSelectedRow();
        if (selecc != -1) {
            String ver = vistaG.getTblMascotas().getValueAt(selecc, 0).toString();
            List<Paciente> listMasc = modelo.listarPacientes();
            for (int j = 0; j < listMasc.size(); j++) {
                if (listMasc.get(j).getId_mascota().equals(ver)) {
                    vistaG.getTxtIdMascota().setText(listMasc.get(j).getId_mascota());
                }
            }
            vistaG.getDlgMascotas().setVisible(false);
        } else {
            JOptionPane.showMessageDialog(vistaG, "No a seleccionado a niguna mascota");
        }
    }
    
    public void agregarHospedaje(){
        int n = 0;
        n = n + 1;
        
        int idHospedaje = Integer.parseInt(vistaG.getTxtIdHospedaje().getText());
        String idMascota = vistaG.getTxtIdMascota().getText();
        String idCelda = vistaG.getTxtIdCelda().getText();
        String fechaingreso =  getFecha(vistaG.getJdtFechaIngreso());
        String fechasalida = getFecha(vistaG.getJdtFechaSalida());
        Boolean Estado = vistaG.getBtgEstado().getSelection().isSelected();

        ModelGuarderia modelGuar = new ModelGuarderia();
        modelGuar.setId_hospedaje(idHospedaje);
        modelGuar.setId_mascota(idMascota);
        
        modelGuar.setId_celda(idCelda);
        modelGuar.setFecha_ingreso(Date.valueOf(fechaingreso));
        modelGuar.setFecha_salida(Date.valueOf(fechasalida));
        modelGuar.setEstado(Estado);
        if (modelGuar.CrearGuarderia()) {
            JOptionPane.showMessageDialog(vistaG, "Hospedaje Guardado Satisfactoriamente");
        } else {
            JOptionPane.showMessageDialog(vistaG, "No se pudo crear el hospedaje");
        }
    }

    
    //Metodo para convertir Date a String
    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

    public String getFecha(JDateChooser jd) {
        if (jd.getDate() != null) {
            return formato.format(jd.getDate());
        } else {
            return null;
        }
    }
     
    public void eliminarHospedaje(){
       int confirmacion = JOptionPane.showConfirmDialog(null, "Esta seguro de retirar este hospedaje?", "Confirmacion", JOptionPane.YES_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) { 
            int fila=vistaG.getTblGuarderia().getSelectedRow();
            if (fila==-1) {
                JOptionPane.showMessageDialog(vistaG, "Debes seleccionar un registro");
            }else{
                String id=(String.valueOf(vistaG.getTblGuarderia().getValueAt(fila, 0).toString()));
//                modelo.eliminarGuarderia(id);
                JOptionPane.showMessageDialog(vistaG, "El registro a sido eliminado");
                System.out.println("");
//                CargarHospedaje();
            }
        }else{
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro");
        }
    }
    
//    public void CargarHospedaje(){
//        DefaultTableModel tablamodel=(DefaultTableModel) vistaG.getTblGuarderia().getModel();
//        tablamodel.setNumRows(0);
//        List<Guarderia> listaGuarderia=modelo.listarGuarderia();
//        Holder<Integer> i = new Holder<>(0);
//        listaGuarderia.stream().forEach(guarderia-> {
//            tablamodel.addRow(new Object[6]);
//            vistaG.getTblGuarderia().setValueAt(guarderia.getId_hospedaje(), 0, 0);
//            vistaG.getTblGuarderia().setValueAt(guarderia.getId_mascota(), 0, 1);
//            vistaG.getTblGuarderia().setValueAt(guarderia.getId_celda(), 0, 2);
//            vistaG.getTblGuarderia().setValueAt(guarderia.getFecha_ingreso(), 0, 3);
//            vistaG.getTblGuarderia().setValueAt(guarderia.getFecha_salida(), 0, 4);
//            vistaG.getTblGuarderia().setValueAt(guarderia.isEstado(), 0, 5);
//            i.value++;
//        });
//    }
    
    public void Cancelar(){
        vistaG.setVisible(true);
        vistaG.getDlgIngreso().setVisible(false);
    }
    
    public void Cancelar2(){
        vistaG.setVisible(true);
        vistaG.getDlgMascotas().setVisible(false);
    }
}
