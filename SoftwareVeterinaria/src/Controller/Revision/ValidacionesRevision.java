
package Controller.Revision;

import Model.Revision.ModelRevision;
import View.Revision.ViewCrudRevision;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;

public class ValidacionesRevision  extends ControllerRevision{

    public ValidacionesRevision(ModelRevision modelo, ViewCrudRevision vistaM) {
        super(modelo, vistaM);
    }

    @Override
    public void iniciarControl() {
        super.iniciarControl(); //To change body of generated methods, choose Tools | Templates.
        
        vistaM.getTxt_IDVet().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                Validar();
            }
        });
        vistaM.getTxtIdmascotaRev().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                Validar();
            }
        });
        vistaM.getTxt_enfermedad().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                Validar();
            }
        });
        vistaM.getTxt_Descripcion().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                Validar();
            }
        });
        vistaM.getDlgRevision().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                Validar(); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
    }
    
    protected void Validar(){
        String idMedico = vistaM.getTxt_IDVet().getText();
        String idMascota = vistaM.getTxtIdmascotaRev().getText();
        String diagnostico = vistaM.getTxt_enfermedad().getText();
        String descripRe = vistaM.getTxt_Descripcion().getText();
        
        boolean idMedicob=false;
        boolean idMascotab=false;
        boolean diagnosticob=false;
        boolean descripReb=false;
        
        //IDMed
        if(idMedico.isEmpty()){
            vistaM.getLb_VeterinarioR1().setText("*Campo requerido");
            idMedicob=false;
        }else if(idMedico.length()!=10){
            idMedicob=false;
        }else if(!idMedico.matches("\\d*")){
            vistaM.getLb_VeterinarioR1().setText("*Solo se permiten numeros");
        }else{
            vistaM.getLb_VeterinarioR1().setText("");
            idMedicob=true;
        }
        //IDMas
        if(idMascota.isEmpty()){
            vistaM.getLb_MascotaR().setText("*Campo requerido");
            idMascotab=false;
        }else if(idMascota.length()!=10){
            vistaM.getLb_MascotaR().setText("*Debe contener 10 caracteres");
            idMascotab=false;
        }else if(!idMascota.matches("\\d*")){
            vistaM.getLb_MascotaR().setText("*Solo se permiten numeros");
        }else{
            vistaM.getLb_MascotaR().setText("");
            idMascotab=true;
        }
        //Diagnostico
        if(diagnostico.isEmpty()){
            vistaM.getLb_DiagnosticoR().setText("*Campo requerido");
            diagnosticob=false;
        }else{
            vistaM.getLb_DiagnosticoR().setText("");
            diagnosticob=true;
        }
        //Descripcion
        if(descripRe.isEmpty()){
            vistaM.getLb_DescripcionR().setText("*Campo requerido");
            descripReb=false;
        }else{
            vistaM.getLb_DescripcionR().setText("");
            descripReb=true;
        }
        //Boton
        if(!idMedicob || !idMascotab || !diagnosticob || !descripReb){
            vistaM.getBtnAgregarRev().setEnabled(false);
        }else{
            vistaM.getBtnAgregarRev().setEnabled(true);
        }
    }
}
