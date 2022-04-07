
package Controller.Factura;

import Model.facturación.ModelFactura;
import View.Facturacion.VistaFacturacion;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ValidacionesFacturacion extends ControladorFactura{

    public ValidacionesFacturacion(ModelFactura modelFactura, VistaFacturacion view) {
        super(modelFactura, view);
    }

    @Override
    public void iniciaControl() {
        super.iniciaControl(); //To change body of generated methods, choose Tools | Templates.
        
        view.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                Validar(); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
        view.getTxt_IDMedico().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                Validar();
            }
        });
        view.getTxt_IDCliente().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                Validar();
            }
        });
    }
    
    public void Validar(){
        String medico = view.getTxt_IDMedico().getText();
        String cliente = view.getTxt_IDCliente().getText();
        Double total = Double.parseDouble(view.getTxt_Total().getText());
        
        boolean medicob=false;
        boolean clienteb=false;
        boolean totalb=false;
        
        if(medico.isEmpty()){
            view.getLb_IDMedicoV().setText("*Campo requerido");
            medicob=false;
        }else{
            view.getLb_IDMedicoV().setText("");
            medicob=true;
        }
        
        if(cliente.isEmpty()){
            view.getLb_IDClienteV().setText("*Campo requerido");
            clienteb=false;
        }else{
            view.getLb_IDClienteV().setText("");
            clienteb=true;
        }
        
        if(total<=0){
            totalb=false;
        }else{
            totalb=true;
        }
         //Boton
        if(!medicob || !clienteb || !totalb ){
            view.getBtnAceptar().setEnabled(false);
        }else{
            view.getBtnAceptar().setEnabled(true);
        }
    }
}
