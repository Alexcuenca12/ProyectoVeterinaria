
package Controller.Servicios;

import Model.CrudServicios.ModelServicios;
import View.CrudServicios.VistaServicios;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ValidacionesServicions extends ControladorServicios{

    public ValidacionesServicions(ModelServicios modelo, VistaServicios vista) {
        super(modelo, vista);
    }
    
    
    @Override
    public void iniciaControl() {
        super.iniciaControl(); //To change body of generated methods, choose Tools | Templates.
        
        vista.getTxadescripcion().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                Validar();
            }
        });
        vista.getTxtidservicio().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                Validar();
            }
        });
        vista.getTxtnombre().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                Validar();
            }
        });
        vista.getDlgservicios().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                Validar(); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
    }
    
    protected void Validar(){
        String idservicios=vista.getTxtidservicio().getText();
        String descripcion=vista.getTxadescripcion().getText();
        String nombre=vista.getTxtnombre().getText();
        
        boolean idserviciob=false;
        boolean descripcionb=false;
        boolean nombreb=false;
        
        //ID
        if(idservicios.isEmpty()){
            vista.getLb_idS().setText("*Campo requerido");
            idserviciob=false;
        }else if(idservicios.length()!=10){
            vista.getLb_idS().setText("*Debe contener 10 caracteres");
            idserviciob=false;
        }else if(!idservicios.matches("\\d*")){
            vista.getLb_idS().setText("*Solo se permiten numeros");
        }else{
            vista.getLb_idS().setText("");
            idserviciob=true;
        }
        //Desc
        if(descripcion.isEmpty()){
            vista.getLb_descripcionS().setText("*Campo requerido");
            descripcionb=false;
        }else{
            vista.getLb_descripcionS().setText("");
            descripcionb=true;
        }
        //Nom
        if(nombre.isEmpty()){
            vista.getLb_nombreS().setText("*Campo requerido");
            nombreb=false;
        }else{
            vista.getLb_nombreS().setText("");
            nombreb=true;
        }
        //Boton
        if(!idserviciob || !descripcionb || !nombreb){
            vista.getBtnaceptar().setEnabled(false);
        }else{
            vista.getBtnaceptar().setEnabled(true);
        }
    }
}
