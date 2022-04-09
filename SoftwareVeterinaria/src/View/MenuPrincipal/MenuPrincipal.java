/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.MenuPrincipal;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author Edison
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
    }

    public JMenuItem getMiLimpiar() {
        return miLimpiar;
    }

    public void setMiLimpiar(JMenuItem miLimpiar) {
        this.miLimpiar = miLimpiar;
    }
    
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("imagenesProyecto/gato.png"));

        return retValue;
    }

    public JMenuItem getMiHospedaje() {
        return jMenuItem5;
    }

    public void setMiHospedaje(JMenuItem miHospedaje) {
        this.jMenuItem5 = miHospedaje;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public void setBtnSalir(JButton btnSalir) {
        this.btnSalir = btnSalir;
    }
    
    

    public JSplitPane getjSplitPane2() {
        return jSplitPane2;
    }

    public void setjSplitPane2(JSplitPane jSplitPane2) {
        this.jSplitPane2 = jSplitPane2;
    }

    public JMenuItem getMiFacturacion() {
        return miFacturacion;
    }

    public void setMiFacturacion(JMenuItem miFacturacion) {
        this.miFacturacion = miFacturacion;
    }

    public JMenuItem getMiRepFacturacion() {
        return miRepFacturacion;
    }

    public void setMiRepFacturacion(JMenuItem miRepFacturacion) {
        this.miRepFacturacion = miRepFacturacion;
    }
    
    
    public JButton getBtnRevision() {
        return btnRevision;
    }

    public void setBtnRevision(JButton btnRevision) {
        this.btnRevision = btnRevision;
    }

    public JButton getBtnClientes() {
        return btnClientes;
    }

    public JMenuItem getMiProveedores() {
        return miProveedores;
    }

    public void setMiProveedores(JMenuItem miProveedores) {
        this.miProveedores = miProveedores;
    }

    public void setBtnClientes(JButton btnClientes) {
        this.btnClientes = btnClientes;
    }

    public JDesktopPane getjDesktop() {
        return jDesktop;
    }

    public void setjDesktop(JDesktopPane jDesktop) {
        this.jDesktop = jDesktop;
    }

    public JButton getBtnCitas() {
        return btnCitas;
    }

    public void setBtnCitas(JButton btnCitas) {
        this.btnCitas = btnCitas;
    }

    public JPanel getPnlMenu() {
        return jPanel1;
    }

    public void setPnlMenu(JPanel pnlMenu) {
        this.jPanel1 = pnlMenu;
    }

    public JMenu getJmOpciones() {
        return jmOpciones;
    }

    public void setJmOpciones(JMenu jmOpciones) {
        this.jmOpciones = jmOpciones;
    }

    public JButton getBtnFacturacion() {
        return btnFacturacion;
    }

    public void setBtnFacturacion(JButton btnFacturacion) {
        this.btnFacturacion = btnFacturacion;
    }

    public JButton getBtnHospedaje() {
        return btnHospedaje;
    }

    public void setBtnHospedaje(JButton btnHospedaje) {
        this.btnHospedaje = btnHospedaje;
    }

    public JButton getBtnPacientes() {
        return btnPacientes;
    }

    public void setBtnPacientes(JButton btnPacientes) {
        this.btnPacientes = btnPacientes;
    }

    public JButton getBtnProductos() {
        return btnProductos;
    }

    public void setBtnProductos(JButton btnProductos) {
        this.btnProductos = btnProductos;
    }

    public JButton getBtnServicios() {
        return btnServicios;
    }

    public void setBtnServicios(JButton btnServicios) {
        this.btnServicios = btnServicios;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JMenuItem getMiClientes() {
        return miClientes;
    }

    public void setMiClientes(JMenuItem miClientes) {
        this.miClientes = miClientes;
    }

    public JMenuItem getMiPaciente() {
        return miPaciente;
    }

    public void setMiPaciente(JMenuItem miPaciente) {
        this.miPaciente = miPaciente;
    }

    public JMenuItem getMiProductos() {
        return miProductos;
    }

    public void setMiProductos(JMenuItem miProductos) {
        this.miProductos = miProductos;
    }

    public JMenuItem getMiServicios() {
        return miServicios;
    }

    public void setMiServicios(JMenuItem miServicios) {
        this.miServicios = miServicios;
    }

    public JMenuItem getMiVeterinario() {
        return miVeterinario;
    }

    public void setMiVeterinario(JMenuItem miVeterinario) {
        this.miVeterinario = miVeterinario;
    }

    public JMenuItem getMiCerrarSes() {
        return miCerrarSes;
    }

    public void setMiCerrarSes(JMenuItem miCerrarSes) {
        this.miCerrarSes = miCerrarSes;
    }

    public JMenuItem getMiRevicion() {
        return miRevicion;
    }

    public void setMiRevicion(JMenuItem miRevicion) {
        this.miRevicion = miRevicion;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        miLimpiar = new javax.swing.JMenuItem();
        jSplitPane2 = new javax.swing.JSplitPane();
        jDesktop = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnClientes = new javax.swing.JButton();
        btnPacientes = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnFacturacion = new javax.swing.JButton();
        btnHospedaje = new javax.swing.JButton();
        btnCitas = new javax.swing.JButton();
        btnServicios = new javax.swing.JButton();
        btnRevision = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmOpciones = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        miClientes = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        miPaciente = new javax.swing.JMenuItem();
        miRevicion = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        miProductos = new javax.swing.JMenuItem();
        miProveedores = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        miVeterinario = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        miFacturacion = new javax.swing.JMenuItem();
        miRepFacturacion = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        miServicios = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        miCerrarSes = new javax.swing.JMenuItem();

        jPopupMenu1.setInvoker(this);

        miLimpiar.setText("Cerrar Ventanas");
        miLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLimpiarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(miLimpiar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setIconImage(getIconImage());

        jSplitPane2.setBackground(new java.awt.Color(0, 0, 0));
        jSplitPane2.setDividerLocation(200);
        jSplitPane2.setDividerSize(0);
        jSplitPane2.setForeground(new java.awt.Color(0, 0, 0));

        jDesktop.setBackground(new java.awt.Color(251, 195, 51));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/LogoVeterinaria.png"))); // NOI18N
        jLabel4.setComponentPopupMenu(jPopupMenu1);

        jDesktop.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopLayout = new javax.swing.GroupLayout(jDesktop);
        jDesktop.setLayout(jDesktopLayout);
        jDesktopLayout.setHorizontalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopLayout.setVerticalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jSplitPane2.setRightComponent(jDesktop);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        btnClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/7.png"))); // NOI18N
        btnClientes.setText("Personas");
        btnClientes.setToolTipText("Clientes");
        btnClientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnClientes.setBorderPainted(false);
        btnClientes.setContentAreaFilled(false);
        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnPacientes.setForeground(new java.awt.Color(255, 255, 255));
        btnPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/9.png"))); // NOI18N
        btnPacientes.setText("Pacientes");
        btnPacientes.setToolTipText("Pacientes");
        btnPacientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPacientes.setBorderPainted(false);
        btnPacientes.setContentAreaFilled(false);
        btnPacientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPacientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnProductos.setForeground(new java.awt.Color(255, 255, 255));
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/2.png"))); // NOI18N
        btnProductos.setText("Productos");
        btnProductos.setToolTipText("Productos");
        btnProductos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProductos.setBorderPainted(false);
        btnProductos.setContentAreaFilled(false);
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnFacturacion.setForeground(new java.awt.Color(255, 255, 255));
        btnFacturacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/4.png"))); // NOI18N
        btnFacturacion.setText("Facturacion");
        btnFacturacion.setToolTipText("Facturacion");
        btnFacturacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFacturacion.setBorderPainted(false);
        btnFacturacion.setContentAreaFilled(false);
        btnFacturacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFacturacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnHospedaje.setForeground(new java.awt.Color(255, 255, 255));
        btnHospedaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/6.png"))); // NOI18N
        btnHospedaje.setText("Hospedaje/Celdas");
        btnHospedaje.setToolTipText("Celda");
        btnHospedaje.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHospedaje.setBorderPainted(false);
        btnHospedaje.setContentAreaFilled(false);
        btnHospedaje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHospedaje.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnCitas.setForeground(new java.awt.Color(255, 255, 255));
        btnCitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/3.png"))); // NOI18N
        btnCitas.setText("Citas");
        btnCitas.setToolTipText("Citas");
        btnCitas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCitas.setBorderPainted(false);
        btnCitas.setContentAreaFilled(false);
        btnCitas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCitas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCitasActionPerformed(evt);
            }
        });

        btnServicios.setForeground(new java.awt.Color(255, 255, 255));
        btnServicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/11.png"))); // NOI18N
        btnServicios.setText("Servicios");
        btnServicios.setToolTipText("Servicios");
        btnServicios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnServicios.setBorderPainted(false);
        btnServicios.setContentAreaFilled(false);
        btnServicios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnServicios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnRevision.setForeground(new java.awt.Color(255, 255, 255));
        btnRevision.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/5.png"))); // NOI18N
        btnRevision.setText("Revision/Historial");
        btnRevision.setToolTipText("Revision");
        btnRevision.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRevision.setBorderPainted(false);
        btnRevision.setContentAreaFilled(false);
        btnRevision.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRevision.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/cerrar-sesion32.png"))); // NOI18N
        btnSalir.setText("Cerrar Sesión");
        btnSalir.setToolTipText("Servicios");
        btnSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPacientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnProductos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnFacturacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnHospedaje, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
            .addComponent(btnCitas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnRevision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnServicios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(btnClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPacientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProductos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFacturacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHospedaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCitas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRevision)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnServicios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 514, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSplitPane2.setLeftComponent(jPanel1);

        getContentPane().add(jSplitPane2, java.awt.BorderLayout.CENTER);

        jmOpciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/menu.png"))); // NOI18N
        jmOpciones.setText("Opciones ||");
        jmOpciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.add(jmOpciones);

        jMenu1.setText("Clientes ||");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        miClientes.setText("Menu Clientes");
        miClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.add(miClientes);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Pacientes ||");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        miPaciente.setText("Menu Pacientes");
        miPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.add(miPaciente);

        miRevicion.setText("Menu Revicion");
        miRevicion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.add(miRevicion);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Producto  ||");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        miProductos.setText("Menu Productos");
        miProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.add(miProductos);

        miProveedores.setText("Menu Proveedores");
        miProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.add(miProveedores);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Veterinario  ||");
        jMenu4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        miVeterinario.setText("Menu Veterinario");
        miVeterinario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu4.add(miVeterinario);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Facturación  ||");
        jMenu5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        miFacturacion.setText("Menu Facturacion");
        miFacturacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu5.add(miFacturacion);

        miRepFacturacion.setText("Reporte Facturas");
        miRepFacturacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu5.add(miRepFacturacion);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Hospedaje  ||");
        jMenu6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem5.setText("Menu Hospedaje");
        jMenuItem5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu6.add(jMenuItem5);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Citas  ||");
        jMenu7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem6.setText("Menu Citas");
        jMenuItem6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu7.add(jMenuItem6);

        jMenuBar1.add(jMenu7);

        jMenu8.setText("Servicios  ||");
        jMenu8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        miServicios.setText("Menu Servicios");
        miServicios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu8.add(miServicios);

        jMenuBar1.add(jMenu8);

        jMenu9.setText("Salir  ||");
        jMenu9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        miCerrarSes.setText("Cerrar Sesión");
        miCerrarSes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu9.add(miCerrarSes);

        jMenuBar1.add(jMenu9);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCitasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCitasActionPerformed

    private void miLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miLimpiarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCitas;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnFacturacion;
    private javax.swing.JButton btnHospedaje;
    private javax.swing.JButton btnPacientes;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnRevision;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnServicios;
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JMenu jmOpciones;
    private javax.swing.JMenuItem miCerrarSes;
    private javax.swing.JMenuItem miClientes;
    private javax.swing.JMenuItem miFacturacion;
    private javax.swing.JMenuItem miLimpiar;
    private javax.swing.JMenuItem miPaciente;
    private javax.swing.JMenuItem miProductos;
    private javax.swing.JMenuItem miProveedores;
    private javax.swing.JMenuItem miRepFacturacion;
    private javax.swing.JMenuItem miRevicion;
    private javax.swing.JMenuItem miServicios;
    private javax.swing.JMenuItem miVeterinario;
    // End of variables declaration//GEN-END:variables
}
