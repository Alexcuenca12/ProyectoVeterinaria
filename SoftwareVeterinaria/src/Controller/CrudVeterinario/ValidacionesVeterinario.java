/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.CrudVeterinario;

import Model.Veterinario.ModelVeterinario;
import View.Veterinario.ViewVeterinario;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author DELL
 */
public class ValidacionesVeterinario extends ControllerVeterinario {

    
    public ValidacionesVeterinario(ModelVeterinario modelo, ViewVeterinario vista) {
        super(modelo, vista);
    }

    @Override
    public void iniciarControl() {
        super.iniciarControl(); //To change body of generated methods, choose Tools | Templates.
        
        vista.getTxtIdClie().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                Validar();
            }
        });
        vista.getTxtApellidoClie().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                Validar();
            }
        });
        vista.getTxtNombreClie().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                Validar();
            }
        });
        vista.getTxtTelefonoClie().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                Validar();
            }
        });
        vista.getCb_EspecialidadVet().addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                Validar();
            }
        });
    }
    
    
    protected void Validar() {
        String idVeterinario = super.vista.getTxtIdClie().getText();
        String nombre = vista.getTxtNombreClie().getText();
        String apellido = vista.getTxtApellidoClie().getText();
        String direccion = vista.getTxtTelefonoClie().getText();
        int especialidad = vista.getCb_EspecialidadVet().getSelectedIndex();
        
        boolean idb=false;
        boolean nombreb=false;
        boolean apellidob=false;
        boolean direccionb=false;
        boolean especialidadb=false;
        
        //ID
        if(idVeterinario.isEmpty()){
            vista.getLb_IdV().setText("*Campo requerido");
            idb=false;
        }else if(idVeterinario.length()!=10){
            vista.getLb_IdV().setText("*Debe contener 10 caracteres");
            idb=false;
        }else if(!idVeterinario.matches("\\d*")){
            vista.getLb_IdV().setText("*Solo se permiten numeros");
        }else{
            vista.getLb_IdV().setText("");
            idb=true;
        }
        
        //Nombre
        if(nombre.isEmpty()){
            vista.getLb_nombreV().setText("*Campo requerido");
            nombreb=false;
        }else{
            vista.getLb_nombreV().setText("");
            nombreb=true;
        }
        //Apellido
         if(apellido.isEmpty()){
            vista.getLb_ApellidoV().setText("*Campo requerido");
            apellidob=false;
        }else{
            vista.getLb_ApellidoV().setText("");
            apellidob=true;
        }
         //Direccion
        if(direccion.isEmpty()){
            vista.getLb_DireccionV().setText("*Campo requerido");
            direccionb=false;
        }else{
            vista.getLb_DireccionV().setText("");
            direccionb=true;
        }
        //Especialidad
        if(especialidad==0){
            vista.getLb_EspecialidadV().setText("*Campo requerido");
            especialidadb=false;
        }else{
            vista.getLb_EspecialidadV().setText("");
            especialidadb=true;
        }
        //Boton
        if(!idb || !nombreb || !apellidob || !direccionb || !especialidadb){
            vista.getBtnCrear_Vet().setEnabled(false);
        }else{
            vista.getBtnCrear_Vet().setEnabled(true);
        }
    }
}
