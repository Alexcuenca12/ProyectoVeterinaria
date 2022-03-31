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
        Validar();
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
        
        vista.getTxtDireccionClie().addKeyListener(new KeyAdapter() {
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
    }
    
    
    protected void Validar(){
        String cedula=vista.getTxtIdClie().getText();
        String nombre=vista.getTxtNombreClie().getText();
        String apellido=vista.getTxtApellidoClie().getText();
        String telefono=vista.getTxtTelefonoClie().getText();
        String email=vista.getTxtEmailClie().getText();
        String direccion=vista.getTxtDireccionClie().getText();
        String nacimiento=getFecha(vista.getFechaNacimientoClie());
        String ingreso=getFecha(vista.getFechaIngreClie());
        
        boolean cedulab=false;
        boolean nombreb=false;
        boolean apellidob=false;
        boolean telefonob=false;
        boolean emailb=false;
        boolean direccionb=false;
        boolean nacimientob=false;
        boolean ingresob=false;
        
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
        //Apellido
        if(apellido.isEmpty()){
            vista.getLb_apellidoC().setText("*Campo requerido");
            apellidob=false;
        }else{
            vista.getLb_apellidoC().setText("");
            apellidob=true;
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
        //Direccion
        if(direccion.isEmpty()){
            vista.getLb_direccionC().setText("*Campo requerido");
            direccionb=false;
        }else{
            vista.getLb_direccionC().setText("");
            direccionb=true;
        }
        //Nacimiento
        if(nacimiento.isEmpty()){
            vista.getLb_fNacimientoC().setText("*Campo requerido");
            nacimientob=false;
        }else{
            vista.getLb_fNacimientoC().setText("");
            nacimientob=true;
        }
        //Ingreso
        if(ingreso.isEmpty()){
            vista.getLb_fIngresoC().setText("*Campo requerido");
            ingresob=false;
        }else{
            vista.getLb_fIngresoC().setText("");
            ingresob=true;
        }
        //Boton
        if(!cedulab || !nombreb || !apellidob || !direccionb|| !telefonob || !emailb || !nacimientob || !ingresob){
            vista.getBttCrearClie().setEnabled(false);
        }else{
            vista.getBttCrearClie().setEnabled(true);
        }
    }
}
