package Controller.CitasMedicas;

import Model.CitasMedicas.ModeloCitasMed;
import View.CitasMedicas.Crud_CitasMedicas;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ValidacionesCitas extends ControladorCitas {

    public ValidacionesCitas(ModeloCitasMed modelC, Crud_CitasMedicas vistaC) {
        super(modelC, vistaC);
    }

    @Override
    public void iniciarControl() {
        super.iniciarControl(); //To change body of generated methods, choose Tools | Templates.
        vistaC.getHora().addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                Validar();
            }
        });
        
        
        vistaC.getFechaCita().addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                Validar();
            }
        });
        vistaC.getTxtIdMedicoCita().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                Validar();
            }
        });
        vistaC.getTxtIdClienteCita().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                Validar();
            }
        });
        vistaC.getDlgAgregar().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                Validar(); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
    }

    public void Validar() {
        String id_medicoC = vistaC.getTxtIdMedicoCita().getText();
        String id_clienteC = vistaC.getTxtIdClienteCita().getText();
        int hora = vistaC.getHora().getSelectedIndex();
        String fechaCita = getFecha(vistaC.getFechaCita());
        
        boolean id_medicob=false;
        boolean id_clienteb=false;
        boolean horab=false;
        boolean fechab=false;
        
         if(id_medicoC.isEmpty()){
            vistaC.getLb_MedicoV().setText("*CR");
            id_medicob=false;
        }else{
            vistaC.getLb_MedicoV().setText("");
            id_medicob=true;
        }
         
          if(id_clienteC.isEmpty()){
            vistaC.getLb_ClienteV().setText("*CR");
            id_clienteb=false;
        }else{
            vistaC.getLb_ClienteV().setText("");
            id_clienteb=true;
        }
          
           if(hora==0){
            vistaC.getLb_HoraV().setText("*CR");
            horab=false;
        }else{
            vistaC.getLb_HoraV().setText("");
            horab=true;
        }
           
            if(fechaCita.isEmpty()){
            vistaC.getLb_FechaV().setText("*CR");
            fechab=false;
        }else{
            vistaC.getLb_FechaV().setText("");
            fechab=true;
        }
        
        
        
        
        
        
        if(!id_clienteb || !id_medicob || !horab || !fechab){
            vistaC.getBtnAceptarCita().setEnabled(false);
        }else{
            vistaC.getBtnAceptarCita().setEnabled(true);
        }
    }
}
