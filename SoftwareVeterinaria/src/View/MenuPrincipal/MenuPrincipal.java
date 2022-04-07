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

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("imagenesProyecto/gato.png"));

        return retValue;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setIconImage(getIconImage());

        jSplitPane2.setBackground(new java.awt.Color(0, 0, 0));
        jSplitPane2.setDividerLocation(200);
        jSplitPane2.setDividerSize(0);
        jSplitPane2.setForeground(new java.awt.Color(0, 0, 0));

        jDesktop.setBackground(new java.awt.Color(251, 195, 51));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/LogoVeterinaria.png"))); // NOI18N

        jDesktop.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopLayout = new javax.swing.GroupLayout(jDesktop);
        jDesktop.setLayout(jDesktopLayout);
        jDesktopLayout.setHorizontalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 849, Short.MAX_VALUE)
        );
        jDesktopLayout.setVerticalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE)
        );

        jSplitPane2.setRightComponent(jDesktop);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        btnClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/7.png"))); // NOI18N
        btnClientes.setText("Personas");
        btnClientes.setToolTipText("Clientes");
        btnClientes.setBorderPainted(false);
        btnClientes.setContentAreaFilled(false);
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
        btnPacientes.setBorderPainted(false);
        btnPacientes.setContentAreaFilled(false);
        btnPacientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnProductos.setForeground(new java.awt.Color(255, 255, 255));
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/2.png"))); // NOI18N
        btnProductos.setText("Productos");
        btnProductos.setToolTipText("Productos");
        btnProductos.setBorderPainted(false);
        btnProductos.setContentAreaFilled(false);
        btnProductos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnFacturacion.setForeground(new java.awt.Color(255, 255, 255));
        btnFacturacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/4.png"))); // NOI18N
        btnFacturacion.setText("Facturacion");
        btnFacturacion.setToolTipText("Facturacion");
        btnFacturacion.setBorderPainted(false);
        btnFacturacion.setContentAreaFilled(false);
        btnFacturacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnHospedaje.setForeground(new java.awt.Color(255, 255, 255));
        btnHospedaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/6.png"))); // NOI18N
        btnHospedaje.setText("Hospedaje/Celdas");
        btnHospedaje.setToolTipText("Celda");
        btnHospedaje.setBorderPainted(false);
        btnHospedaje.setContentAreaFilled(false);
        btnHospedaje.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnCitas.setForeground(new java.awt.Color(255, 255, 255));
        btnCitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/3.png"))); // NOI18N
        btnCitas.setText("Citas");
        btnCitas.setToolTipText("Citas");
        btnCitas.setBorderPainted(false);
        btnCitas.setContentAreaFilled(false);
        btnCitas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnServicios.setForeground(new java.awt.Color(255, 255, 255));
        btnServicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/11.png"))); // NOI18N
        btnServicios.setText("Servicios");
        btnServicios.setToolTipText("Servicios");
        btnServicios.setBorderPainted(false);
        btnServicios.setContentAreaFilled(false);
        btnServicios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnRevision.setForeground(new java.awt.Color(255, 255, 255));
        btnRevision.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/5.png"))); // NOI18N
        btnRevision.setText("Revision/Historial");
        btnRevision.setToolTipText("Revision");
        btnRevision.setBorderPainted(false);
        btnRevision.setContentAreaFilled(false);
        btnRevision.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPacientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFacturacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHospedaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRevision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnServicios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPacientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProductos)
                .addGap(18, 18, 18)
                .addComponent(btnFacturacion)
                .addGap(18, 18, 18)
                .addComponent(btnHospedaje)
                .addGap(18, 18, 18)
                .addComponent(btnCitas)
                .addGap(18, 18, 18)
                .addComponent(btnRevision)
                .addGap(18, 18, 18)
                .addComponent(btnServicios)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        jSplitPane2.setLeftComponent(jPanel1);

        getContentPane().add(jSplitPane2, java.awt.BorderLayout.CENTER);

        jmOpciones.setText("Opciones                                               ");
        jMenuBar1.add(jmOpciones);

        jMenu1.setText("Clientes");

        miClientes.setText("Menu Clientes");
        jMenu1.add(miClientes);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Pacientes");

        miPaciente.setText("Menu Pacientes");
        jMenu2.add(miPaciente);

        miRevicion.setText("Menu Revicion");
        jMenu2.add(miRevicion);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Producto");

        miProductos.setText("Menu Productos");
        jMenu3.add(miProductos);

        miProveedores.setText("Menu Proveedores");
        jMenu3.add(miProveedores);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Veterinario");

        miVeterinario.setText("Menu Veterinario");
        jMenu4.add(miVeterinario);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Facturación");

        miFacturacion.setText("Menu Facturacion");
        jMenu5.add(miFacturacion);

        miRepFacturacion.setText("Reporte Facturas");
        jMenu5.add(miRepFacturacion);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Hospedaje");

        jMenuItem5.setText("Menu Hospedaje");
        jMenu6.add(jMenuItem5);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Citas");

        jMenuItem6.setText("Menu Citas");
        jMenu7.add(jMenuItem6);

        jMenuBar1.add(jMenu7);

        jMenu8.setText("Servicios");

        miServicios.setText("Menu Servicios");
        jMenu8.add(miServicios);

        jMenuBar1.add(jMenu8);

        jMenu9.setText("Salir");

        miCerrarSes.setText("Cerrar Sesión");
        jMenu9.add(miCerrarSes);

        jMenuBar1.add(jMenu9);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClientesActionPerformed

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
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JMenu jmOpciones;
    private javax.swing.JMenuItem miCerrarSes;
    private javax.swing.JMenuItem miClientes;
    private javax.swing.JMenuItem miFacturacion;
    private javax.swing.JMenuItem miPaciente;
    private javax.swing.JMenuItem miProductos;
    private javax.swing.JMenuItem miProveedores;
    private javax.swing.JMenuItem miRepFacturacion;
    private javax.swing.JMenuItem miRevicion;
    private javax.swing.JMenuItem miServicios;
    private javax.swing.JMenuItem miVeterinario;
    // End of variables declaration//GEN-END:variables
}
