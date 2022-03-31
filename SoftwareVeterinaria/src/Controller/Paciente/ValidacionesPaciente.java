/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Paciente;

import Model.Paciente.ModeloPaciente;
import View.CrudPacientes.VistaCrudPaciente;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static java.lang.Math.abs;
import java.sql.Date;
import java.util.Calendar;

public class ValidacionesPaciente extends ControladorPaciente {

    public ValidacionesPaciente(ModeloPaciente model, VistaCrudPaciente vista) {
        super(model, vista);
    }

    @Override
    public void iniciaControl() {
        super.iniciaControl(); //To change body of generated methods, choose Tools | Templates.
        
        vista.getTxtcodigo().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                Validar();
            }
        });
        
        vista.getTxtcedula().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                Validar();
            }
        });
        vista.getTxtNombre().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                Validar();
            }
        });
        vista.getTxtRaza().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                Validar();
            }
        });
        vista.getTxtColor().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                Validar();
            }
        });
        vista.getCbEspecie().addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                Validar();
            }
        });
        vista.getDlgPacientes().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                Validar(); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
    }

    public void Validar() {
        vista.getTxtcodigo().setEnabled(true);
        String id_mascota = vista.getTxtcodigo().getText();
        String id_cliente_m = vista.getTxtcedula().getText();
        String nombre_mascota = vista.getTxtNombre().getText();
        String raza_mascota = vista.getTxtRaza().getText();
        int especie_mascota = vista.getCbEspecie().getSelectedIndex();
        String color_mascota = vista.getTxtColor().getText();
        
        
        boolean id_mascotab=false;
        boolean id_clienteb=false;
        boolean nombre_mascotab=false;
        boolean raza_mascotab=false;
        boolean especie_mascotab=false;
        boolean color_mascotab=false;
        
        //Id
        if(id_mascota.isEmpty()){
            vista.getLb_codigo().setText("*Campo requerido");
            id_mascotab=false;
        }else if(id_mascota.length()!=10){
            vista.getLb_codigo().setText("*Debe contener 10 caracteres");
            id_mascotab=false;
        }else if(!id_mascota.matches("\\d*")){
            vista.getLb_codigo().setText("*Solo se permiten numeros");
        }else{
            vista.getLb_codigo().setText("");
            id_mascotab=true;
        }
        //Cliente
        if(id_cliente_m.isEmpty()){
            vista.getLb_CI().setText("*Campo requerido");
            id_clienteb=false;
        }else if(id_cliente_m.length()!=10){
            vista.getLb_CI().setText("*Debe contener 10 caracteres");
            id_clienteb=false;
        }else if(!id_cliente_m.matches("\\d*")){
            vista.getLb_CI().setText("*Solo se permiten numeros");
        }else{
            vista.getLb_CI().setText("");
            id_clienteb=true;
        }
        //Nombre
        if(nombre_mascota.isEmpty()){
            vista.getLb_Nombre().setText("*Campo requerido");
            nombre_mascotab=false;
        }else{
            vista.getLb_Nombre().setText("");
            nombre_mascotab=true;
        }
        //Raza
        if(raza_mascota.isEmpty()){
            vista.getLb_raza().setText("*Campo requerido");
            raza_mascotab=false;
        }else{
            vista.getLb_raza().setText("");
            raza_mascotab=true;
        }
        //Especie
        if(especie_mascota==0){
            vista.getLb_especie().setText("*Seleccione una especie");
            especie_mascotab=false;
        }else{
            vista.getLb_especie().setText("");
            especie_mascotab=true;
        }
        //Color
        if(color_mascota.isEmpty()){
            vista.getLb_color().setText("*Campo requerido");
            color_mascotab=false;
        }else{
            vista.getLb_color().setText("");
            color_mascotab=true;
        }
        
        
        //Boton
        if(!id_mascotab || !id_clienteb || !nombre_mascotab || !raza_mascotab || !especie_mascotab || !color_mascotab){
            vista.getBtnAceptar().setEnabled(false);
        }else{
            vista.getBtnAceptar().setEnabled(true);
        }
    }
}
