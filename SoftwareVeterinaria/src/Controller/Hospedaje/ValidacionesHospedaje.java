
package Controller.Hospedaje;

import Model.Celda.ModelCelda;
import Model.Guarderia.ModelGuarderia;
import View.Hospedaje.VistaHospedaje;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ValidacionesHospedaje extends ControladorHospedaje{

    public ValidacionesHospedaje(ModelGuarderia modelo, VistaHospedaje vista, ModelCelda modelCel) {
        super(modelo, vista, modelCel);
    }

    @Override
    public void iniciarControl() {
        super.iniciarControl(); //To change body of generated methods, choose Tools | Templates.
        //Celdas
        vista.getTxt_IDCelda().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                validarCelda();
            }
        });
        vista.getTxt_UbiCelda().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                validarCelda();
            }
        });
        vista.getDialogCelda().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                validarCelda(); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
        //Hospedaje
        vista.getTxtCodMascota().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                ValidarHospedaje();
            }
        });
        vista.getTxtCodCelda().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                ValidarHospedaje();
            }
        });
        vista.getjPanel18().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                ValidarHospedaje(); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
    }
    private void ValidarHospedaje(){
        String codMascota = vista.getTxtCodMascota().getText();
        String codCelda = vista.getTxtCodCelda().getText();
        boolean codMb=false;
        boolean codCb=false;
        
        //M
        if(codMascota.isEmpty()){
            vista.getLb_MascotaV().setText("*Campo requerido");
            codMb=false;
        }else if(codMascota.length()!=10){
            vista.getLb_MascotaV().setText("*Debe contener 10 caracteres");
            codMb=false;
        }else if(!codMascota.matches("\\d*")){
            vista.getLb_MascotaV().setText("*Solo se permiten numeros");
        }else{
            vista.getLb_MascotaV().setText("");
            codMb=true;
        }
        //C
        if(codCelda.isEmpty()){
            vista.getLb_CeldaV().setText("*Campo requerido");
            codCb=false;
        }else if(codCelda.length()!=10){
            vista.getLb_CeldaV().setText("*Debe contener 10 caracteres");
            codCb=false;
        }else if(!codCelda.matches("\\d*")){
            vista.getLb_CeldaV().setText("*Solo se permiten numeros");
        }else{
            vista.getLb_CeldaV().setText("");
            codCb=true;
        }
        //boton
        if( !codMb || !codCb){
            vista.getBtnAceptar().setEnabled(false);
        }else{
            vista.getBtnAceptar().setEnabled(true);
        }
    }
    private void validarCelda(){
        String idCelda = vista.getTxt_IDCelda().getText();
        String ubicacionCel = vista.getTxt_UbiCelda().getText();
        
        boolean idCb=false;
        boolean ubicacionb=false;

        //ID
        if(idCelda.isEmpty()){
            vista.getLb_idCeldaV().setText("*Campo requerido");
            idCb=false;
        }else if(idCelda.length()!=10){
            vista.getLb_idCeldaV().setText("*Debe contener 10 caracteres");
            idCb=false;
        }else if(!idCelda.matches("\\d*")){
            vista.getLb_idCeldaV().setText("*Solo se permiten numeros");
        }else{
            vista.getLb_idCeldaV().setText("");
            idCb=true;
        }
        //Ubicacion
        if(ubicacionCel.isEmpty()){
            vista.getLb_ubicacionV().setText("*Campo requerido");
            ubicacionb=false;
        }else{
            vista.getLb_ubicacionV().setText("");
            ubicacionb=true;
        }
        //boton
        if(!idCb || !ubicacionb){
            vista.getBtn_AgregarCel().setEnabled(false);
        }else{
            vista.getBtn_AgregarCel().setEnabled(true);
        }
    }
}
