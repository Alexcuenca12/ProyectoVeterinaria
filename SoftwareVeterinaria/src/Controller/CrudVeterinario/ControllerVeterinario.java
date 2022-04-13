/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.CrudVeterinario;

import Model.ConectionPg;
import Model.Veterinario.ModelVeterinario;
import Model.Veterinario.Veterinario;
import View.Veterinario.ViewVeterinario;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
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
 * @author JOSE DAVID NAULA
 */
public class ControllerVeterinario {

    private ModelVeterinario modelo;
    protected ViewVeterinario vista;

    public ControllerVeterinario(ModelVeterinario modelo, ViewVeterinario vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
        CargarVeterinario();
    }

    public void iniciarControl() {

        //Dialogo
        vista.getBtnAgregar_Vet().addActionListener(xd -> abrirDialogo(1));
        vista.getBtnModificar_Vet().addActionListener(xd -> abrirDialogo(2));
        //Creacion
        vista.getBtnCrear_Vet().addActionListener(xd -> Crear_ModificarVet());
        vista.getBtnEliminar_Vet().addActionListener(xd -> EliminarVeterinario());
        vista.getBtnCancelar_Vet().addActionListener(xd -> Cancelar());
        vista.getBtnImprimir_Vet().addActionListener(xd -> AbrirDlg());
        vista.getBtnReporteVeterinario().addActionListener(xd -> Imprimir());
        

        vista.getTxtBuscar_Vet().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                CargarVeterinario();
            }
        });
    }

    public void abrirDialogo(int num) {
        String titulo;
        limpiar();
        if (num == 1) {
            vista.getTxtIdClie().setEditable(true);
            titulo = "Crear Veterinario";
            vista.getDlg_Vet().setName("Crear");
            vista.getDlg_Vet().setSize(880, 389);
            vista.getDlg_Vet().setLocationRelativeTo(null);
            vista.getDlg_Vet().setVisible(true);
        } else {
            titulo = "Editar Veterinario";
            vista.getDlg_Vet().setName("Modificar");
            if (SelecionModi()) {
                vista.getTxtIdClie().setEditable(false);
                vista.getDlg_Vet().setSize(880, 389);
                vista.getDlg_Vet().setLocationRelativeTo(null);
                vista.getDlg_Vet().setVisible(true);
            }

        }

        vista.getDlg_Vet().setTitle(titulo);

    }

    public void Crear_ModificarVet() {
        //Creacion
        if (vista.getDlg_Vet().getName() == "Crear") {
            //CrearVeterinario();
            String idVeterinario = vista.getTxtIdClie().getText();
            String nombre = vista.getTxtNombreClie().getText();
            String apellido = vista.getTxtApellidoClie().getText();
            String direccion = vista.getTxtTelefonoClie().getText();
            String especialidad = vista.getCb_EspecialidadVet().getSelectedItem().toString();

            if (idVeterinario.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || direccion.isEmpty() || vista.getCb_EspecialidadVet().getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Porfavor llenar todos los campos");
            } else {
                ModelVeterinario veterinario = new ModelVeterinario();
                veterinario.setid_medico(idVeterinario);
                veterinario.setNombre_medico(nombre);
                veterinario.setApellido_medico(apellido);
                veterinario.setDireccion_medico(direccion);
                veterinario.setEspecialidad(especialidad);
                veterinario.setContraseña("1234");
                if (veterinario.CrearVeterinario()) {
                    JOptionPane.showMessageDialog(vista, "El veterinario se creo satisfactoriamente");
                    vista.getDlg_Vet().setVisible(false);
                    vista.setVisible(true);
                    CargarVeterinario();
                } else {
                    JOptionPane.showMessageDialog(vista, "Error no se pudo crear el veterinario");
                }
            }
        } else {
            //Editar
            if (vista.getDlg_Vet().getName() == "Modificar") {

                String idVeterinario = vista.getTxtIdClie().getText();
                String nombre = vista.getTxtNombreClie().getText();
                String apellido = vista.getTxtApellidoClie().getText();
                String direccion = vista.getTxtTelefonoClie().getText();
                String especialidad = vista.getCb_EspecialidadVet().getSelectedItem().toString();

                if (idVeterinario.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || direccion.isEmpty() || vista.getCb_EspecialidadVet().getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(null, "Porfavor llenar todos los campos");
                } else {
                    ModelVeterinario veterinario = new ModelVeterinario();
                    veterinario.setid_medico(idVeterinario);
                    veterinario.setNombre_medico(nombre);
                    veterinario.setApellido_medico(apellido);
                    veterinario.setDireccion_medico(direccion);
                    veterinario.setEspecialidad(especialidad);
                    if (veterinario.ModificarVeterinario()) {
                        JOptionPane.showMessageDialog(vista, "El veterinario se modifico satisfactoriamente");
                        vista.getDlg_Vet().setVisible(false);
                        vista.setVisible(true);
                        CargarVeterinario();
                    } else {
                        JOptionPane.showMessageDialog(vista, "Error no se pudo modificar el veterinario");
                    }
                    //SelecionModi();
                }
            }
        }
    }

    public void limpiar() {
        vista.getDlg_Vet().setLocationRelativeTo(null);
        vista.getTxtIdClie().setText("");
        vista.getTxtNombreClie().setText("");
        vista.getTxtApellidoClie().setText("");
        vista.getTxtTelefonoClie().setText("");
        vista.getCb_EspecialidadVet().setSelectedIndex(0);
    }

    public boolean SelecionModi() {
        int fila = vista.getTbl_Veterinario().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(vista, "Seleccione una fila");
            return false;
        } else {
            String dato = vista.getTbl_Veterinario().getValueAt(fila, 0).toString();
            List<Veterinario> listaVeterinario = modelo.ListVet_completa(vista.getTbl_Veterinario().getValueAt(vista.getTbl_Veterinario().getSelectedRow(), 0).toString());
            for (int i = 0; i < listaVeterinario.size(); i++) {

                vista.getTxtIdClie().setText(listaVeterinario.get(i).getid_medico());
                vista.getTxtNombreClie().setText(listaVeterinario.get(i).getNombre_medico());
                vista.getTxtApellidoClie().setText(listaVeterinario.get(i).getApellido_medico());
                vista.getTxtTelefonoClie().setText(listaVeterinario.get(i).getDireccion_medico());
                vista.getCb_EspecialidadVet().setSelectedItem(listaVeterinario.get(i).getEspecialidad());

            }
            return true;
        }
    }

    public void CargarVeterinario() {

        //Enlace de la tabla con el metodo de las etiquetas
        DefaultTableModel tblmodel;
        tblmodel = (DefaultTableModel) vista.getTbl_Veterinario().getModel();
        tblmodel.setNumRows(0);
        String valor = vista.getTxtBuscar_Vet().getText();
        ArrayList<Veterinario> tablaVet = modelo.ListVet_completa(valor);
        Holder<Integer> i = new Holder<>(0);
        tablaVet.stream().forEach(pac -> {
            //Agregar a la tabla
            tblmodel.addRow(new Object[5]);
            vista.getTbl_Veterinario().setValueAt(pac.getid_medico(), i.value, 0);
            vista.getTbl_Veterinario().setValueAt(pac.getNombre_medico(), i.value, 1);
            vista.getTbl_Veterinario().setValueAt(pac.getApellido_medico(), i.value, 2);
            vista.getTbl_Veterinario().setValueAt(pac.getDireccion_medico(), i.value, 3);
            vista.getTbl_Veterinario().setValueAt(pac.getEspecialidad(), i.value, 4);
            i.value++;
        });

    }

    public void EliminarVeterinario() {
        ModelVeterinario veterinario = new ModelVeterinario();
        int fila = vista.getTbl_Veterinario().getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(vista, "Por favor, seleccione una fila");
        } else {
            String idveterinario = vista.getTbl_Veterinario().getValueAt(fila, 0).toString();
            veterinario.EliminaVeterinario(idveterinario);
            JOptionPane.showMessageDialog(vista, "Usuario Eliminado");
            CargarVeterinario();
        }
    }

    public void buscarVet(java.awt.event.KeyEvent evt) {
        DefaultTableModel tablamodel;
        tablamodel = (DefaultTableModel) vista.getTbl_Veterinario().getModel();
        tablamodel.setNumRows(0);
        List<Veterinario> list = modelo.ListVet_completa(vista.getTxtBuscar_Vet().getText());
        list.stream().forEach(Veterinario -> {
            String[] filas = {Veterinario.getid_medico(), Veterinario.getNombre_medico(),
                (Veterinario.getApellido_medico()), (Veterinario.getDireccion_medico()),
                Veterinario.getEspecialidad()};
            tablamodel.addRow(filas);
        });
    }

    public void Cancelar() {
        vista.getDlg_Vet().dispose();
    }
    
    public void AbrirDlg(){
         vista.getDlgReporteVeterinario().setVisible(true);
         vista.getDlgReporteVeterinario().setSize(495, 300);
         vista.getDlgReporteVeterinario().setLocationRelativeTo(null);
     }

    public void Imprimir() {
         ConectionPg connection = new ConectionPg();
         String IdVerinario= vista.getTxtReporteIdMedico().getText();
        String Nombre= vista.getTxtReporteNombre().getText();
         
         
        try {
            JasperReport jr=(JasperReport)JRLoader.loadObject(getClass().getResource("/View/Reporte/PV_Veterinario.jasper"));
            
            
            Map<String,Object> parametros= new HashMap<>();
            parametros.put("IdMedicoo", IdVerinario);
            parametros.put("NombreMedico", Nombre);
            
            
            //CARGANDO EL REPORTE DE LA BASE
            JasperPrint jp= JasperFillManager.fillReport(jr,parametros, connection.getCon());
            //VER
            JasperViewer jv= new JasperViewer(jp,false);
            jv.setVisible(true);
        
        } catch (JRException ex) {
            Logger.getLogger(ControllerVeterinario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
