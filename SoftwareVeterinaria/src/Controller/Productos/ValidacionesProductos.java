
package Controller.Productos;

import Model.Categorias.ModeloCategoria;
import Model.Productos.ModelProducto;
import View.Productos.VistaCrudProductos;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ValidacionesProductos extends ControladorProductos{
    
    public ValidacionesProductos(ModelProducto modelo, ModeloCategoria modeloCa, VistaCrudProductos vistaP) {
        super(modelo, modeloCa, vistaP);
        
        
        
    }

    @Override
    public void iniciarControl() {
        super.iniciarControl(); //To change body of generated methods, choose Tools | Templates.
        
        
        vistaP.getTxtIdprod().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                Validar();
            }
        });
        vistaP.getTxtProveedor().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                Validar();
            }
        });
        vistaP.getTxtNombreP().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                Validar();
            }
        });
        vistaP.getTxt_IdCate().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                Validar();
            }
        });
        vistaP.getCb_categoria().addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                Validar();
            }
        });
        vistaP.getDlgCrearProd().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                Validar(); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
    }
    
    protected void Validar(){
        String idProducto = vistaP.getTxtIdprod().getText();
        String nomPro = vistaP.getTxtNombreP().getText();
        int idCategoria = vistaP.getCb_categoria().getSelectedIndex();
        String ruc_proveedor = vistaP.getTxtProveedor().getText();
        
        boolean idprod=false;
        boolean nomprob=false;
        boolean idcatb=false;
        boolean ruc_provb=false;
        
        //ID
        if(idProducto.isEmpty()){
            vistaP.getLb_idP().setText("*Campo requerido");
            idprod=false;
        }else if(idProducto.length()!=10){
            vistaP.getLb_idP().setText("*Debe contener 10 caracteres");
            idprod=false;
        }else if(!idProducto.matches("\\d*")){
            vistaP.getLb_idP().setText("*Solo se permiten numeros");
        }else{
            vistaP.getLb_idP().setText("");
            idprod=true;
        }
        //Nombre
        if(nomPro.isEmpty()){
            vistaP.getLb_nombreP().setText("*Campo requerido");
            nomprob=false;
        }else{
            vistaP.getLb_nombreP().setText("");
            nomprob=true;
        }
        //Categoria
        if(idCategoria==0){
            vistaP.getLb_categoriaP().setText("*Campo requerido");
            idcatb=false;
        }else{
            vistaP.getLb_categoriaP().setText("");
            idcatb=true;
        }
        //Ruc_proveedor
        if(ruc_proveedor.isEmpty()){
            vistaP.getLb_proveedorP().setText("*Campo requerido");
            ruc_provb=false;
        }else{
            vistaP.getLb_proveedorP().setText("");
            ruc_provb=true;
        }
        
        //Bototn
        if(!idprod || !idcatb || !ruc_provb || !nomprob){
            vistaP.getBtnAceptarP().setEnabled(false);
        }else{
            vistaP.getBtnAceptarP().setEnabled(true);
        }
        
    }
    
}
