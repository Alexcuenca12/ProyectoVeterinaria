/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Login;

import Controller.ControladorMenuPrincipal1;
import Model.Login.Login;
import View.MenuPrincipal.LoginVet;
import View.MenuPrincipal.MenuPrincipal;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;


/**
 *
 * @author JOSE DAVID NAULA
 */
public class ControllerLogin {
    
    private LoginVet vistalogin;
    private Login modelologin;
    public static String Usuario;
    
    public ControllerLogin(LoginVet vistalogin, Login modelologin) {
        this.vistalogin = vistalogin;
        this.modelologin = modelologin;
        vistalogin.setVisible(true);
        vistalogin.setLocationRelativeTo(null);
    }

    public void IniciarControl(){
        vistalogin.getBtnIniciarSesion().addActionListener(l->Entrar());
        vistalogin.getSalir().addActionListener(l->Salir());
        
        
        vistalogin.getBtnIniciarSesion().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                BotonAccion(vistalogin.getBtnIniciarSesion(), true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                BotonAccion(vistalogin.getBtnIniciarSesion(), false);
            }

        });
    }  

    public void Entrar() {
        Usuario = vistalogin.getTxtusuario().getText();
        String contraseña = vistalogin.getTxtcontraseña().getText();
        if (modelologin.VerificarIngreso(Usuario, contraseña)!=1){
            if (modelologin.VerificarIngreso(Usuario, contraseña)==2) {
            MenuPrincipal vistaMenu = new MenuPrincipal();
            ControladorMenuPrincipal1 controloador=new ControladorMenuPrincipal1(vistaMenu);
            controloador.iniciaControl();
            vistalogin.dispose();
        }
        if (modelologin.VerificarIngreso(Usuario, contraseña)==3){
            MenuPrincipal vistaMenu = new MenuPrincipal();
            ControladorMenuPrincipal1 controloador=new ControladorMenuPrincipal1(vistaMenu);
            controloador.iniciaControl();
            vistaMenu.getMiVeterinario().setEnabled(false);
            vistalogin.dispose();
        }
        }
    }
    
    public void Salir(){
      System.exit(0);  
    }    
    
    Color colorb;
    public void BotonAccion(JButton boton, boolean Adentro) {
        if (Adentro) {
            colorb = boton.getBackground();
            boton.setBackground(new Color(102, 102, 102));
            //boton.setContentAreaFilled(true);
        } else {
            boton.setBackground(colorb);
            //boton.setContentAreaFilled(false);
        }
    }
}
