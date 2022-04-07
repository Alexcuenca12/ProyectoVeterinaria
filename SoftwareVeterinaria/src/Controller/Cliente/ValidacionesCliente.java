/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Cliente;

import Model.Clientes.ModeloClientes;
import View.CrudClientes.VistaCrudPersona;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author DELL
 */
public class ValidacionesCliente extends ControladorCliente{
    
    public ValidacionesCliente(ModeloClientes modelo, VistaCrudPersona vista) {
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
        

        
        vista.getTxtNombreClie().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                Validar();
            }
            
        });
        

        
        vista.getTxtEmailClie().addKeyListener(new KeyAdapter() {
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
        vista.getDlgClie().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                Validar(); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
    }
    
    
    protected void Validar(){
        String cedula=vista.getTxtIdClie().getText();
        String nombre=vista.getTxtNombreClie().getText();
        String telefono=vista.getTxtTelefonoClie().getText();
        String email=vista.getTxtEmailClie().getText();
        String nacimiento=getFecha(vista.getFechaNacimientoClie());
        
        boolean cedulab=false;
        boolean nombreb=false;
        boolean telefonob=false;
        boolean emailb=false;
        boolean nacimientob=false;
        
        //Cedula
        if(cedula.isEmpty()){
            vista.getLb_idC().setText("*Campo requerido");
            cedulab=false;
        }else if(cedula.length()!=10){
            vista.getLb_idC().setText("*Debe contener 10 caracteres");
            cedulab=false;
        }else if(!cedula.matches("\\d*")){
            vista.getLb_idC().setText("*Solo se permiten numeros");
        }else{
            vista.getLb_idC().setText("");
            cedulab=true;
        }
        //Nombre
        if(nombre.isEmpty()){
            vista.getLb_nombreC().setText("*Campo requerido");
            nombreb=false;
        }else{
            vista.getLb_nombreC().setText("");
            nombreb=true;
        }

        //Telefono
        if(telefono.isEmpty()){
            vista.getLb_telefonoC().setText("*Campo requerido");
            telefonob=false;
        }else if(telefono.length()!=7){
            vista.getLb_telefonoC().setText("*Debe contener 7 caracteres");
            telefonob=false;
        }else if(!telefono.matches("\\d*")){
            vista.getLb_telefonoC().setText("*Solo se permiten numeros");
        }else{
            vista.getLb_telefonoC().setText("");
            telefonob=true;
        }
        //Email
        if(email.isEmpty()){
            vista.getLb_emailC().setText("*Campo requerido");
            emailb=false;
        }else if(!email.contains("@") || (!email.contains(".") )){
            vista.getLb_emailC().setText("*Correo no valido");
        }else{
            vista.getLb_emailC().setText("");
            emailb=true;
        }

        //Nacimiento
        if(nacimiento.isEmpty()){
            vista.getLb_fNacimientoC().setText("*Campo requerido");
            nacimientob=false;
        }else{
            vista.getLb_fNacimientoC().setText("");
            nacimientob=true;
        }

        //Boton
        if(!cedulab || !nombreb ||  !telefonob || !emailb || !nacimientob ){
            vista.getBttCrearClie().setEnabled(false);
        }else{
            vista.getBttCrearClie().setEnabled(true);
        }
    }
}
