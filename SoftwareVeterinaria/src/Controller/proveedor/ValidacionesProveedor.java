
package Controller.proveedor;

import Model.Proveedor.ModelProveedor;
import View.CrudProveedor.VistaProveedor;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ValidacionesProveedor extends ControllerProveedor{

    public ValidacionesProveedor(ModelProveedor model, VistaProveedor vista) {
        super(model, vista);
    }

    @Override
    public void IniciaControl() {
        super.IniciaControl(); //To change body of generated methods, choose Tools | Templates.
        vista.getTxdir().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                Validar();
            }
        });
        vista.getTxtel().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                Validar();
            }
        });
        vista.getTxema().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                Validar();
            }
        });
        vista.getTxruc().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                Validar();
            }
        });
        vista.getjDialog1().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                Validar(); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
    }
    
    public void Validar(){
         String ruc_proveedor = vista.getTxruc().getText();
         String telefono = vista.getTxtel().getText();
         String direccion = vista.getTxdir().getText();
         String correo = vista.getTxema().getText();
         
         boolean rucb=false;
         boolean telefonob=false;
         boolean direccionb=false;
         boolean correob=false;
         //Ruc
         if(ruc_proveedor.isEmpty()){
            vista.getLb_Ruc().setText("*Campo requerido");
            rucb=false;
        }else if(ruc_proveedor.length()!=10){
            vista.getLb_Ruc().setText("*Debe contener 10 caracteres");
            rucb=false;
        }else if(!ruc_proveedor.matches("\\d*")){
            vista.getLb_Ruc().setText("*Solo se permiten numeros");
        }else{
            vista.getLb_Ruc().setText("");
            rucb=true;
        }
         //Telefono
         if(telefono.isEmpty()){
            vista.getLb_TelefonoP().setText("*Campo requerido");
            telefonob=false;
        }else if(telefono.length()!=7){
            vista.getLb_TelefonoP().setText("*Debe contener 7 caracteres");
            telefonob=false;
        }else if(!telefono.matches("\\d*")){
            vista.getLb_TelefonoP().setText("*Solo se permiten numeros");
        }else{
            vista.getLb_TelefonoP().setText("");
            telefonob=true;
        }
         //Direccion
         if(direccion.isEmpty()){
            vista.getLb_DireccionP().setText("*Campo requerido");
            direccionb=false;
        }else{
            vista.getLb_DireccionP().setText("");
            direccionb=true;
        }
         //Correo
         if(correo.isEmpty()){
            vista.getLb_EmailP().setText("*Campo requerido");
            correob=false;
        }else if(!correo.contains("@") || (!correo.contains(".") )){
            vista.getLb_EmailP().setText("*Correo no valido");
        }else{
            vista.getLb_EmailP().setText("");
            correob=true;
        }
         //Boton
        if(!rucb || !correob || !telefonob || !direccionb){
            vista.getBtnace().setEnabled(false);
        }else{
            vista.getBtnace().setEnabled(true);
        }
    }
}
