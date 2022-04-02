/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.CrudClientes;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Jose David Naula
 */
public class VistaCrudPersona extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaCrudPersona
     */
    public VistaCrudPersona() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgClie = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtTelefonoClie = new javax.swing.JTextField();
        txtApellidoClie = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreClie = new javax.swing.JTextField();
        lb_apellidoC = new javax.swing.JLabel();
        txtIdClie = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        FechaNacimientoClie = new com.toedter.calendar.JDateChooser();
        FechaIngreClie = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        txtDireccionClie = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEmailClie = new javax.swing.JTextField();
        bttCrearClie = new javax.swing.JButton();
        bttCancelarClie = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lb_nombreC = new javax.swing.JLabel();
        lb_telefonoC = new javax.swing.JLabel();
        lb_emailC = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lb_direccionC = new javax.swing.JLabel();
        lb_fIngresoC = new javax.swing.JLabel();
        lb_fNacimientoC = new javax.swing.JLabel();
        lb_idC = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtBuscarClie = new javax.swing.JTextField();
        bttAgregarCli = new javax.swing.JButton();
        bttModificarClie = new javax.swing.JButton();
        bttEliminarClie = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablacliente = new javax.swing.JTable();
        bttImprimirClie = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        dlgClie.setBackground(new java.awt.Color(255, 255, 255));
        dlgClie.setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel5.setText("Telefono:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));
        jPanel3.add(txtTelefonoClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 190, -1));
        jPanel3.add(txtApellidoClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 190, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel3.setText("Apellido:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel1.setText("Nombre:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));
        jPanel3.add(txtNombreClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 190, -1));

        lb_apellidoC.setFont(new java.awt.Font("Arial", 3, 10)); // NOI18N
        lb_apellidoC.setForeground(new java.awt.Color(255, 51, 51));
        jPanel3.add(lb_apellidoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 170, 20));
        jPanel3.add(txtIdClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 190, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel6.setText("Fecha Nacimiento:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));
        jPanel3.add(FechaNacimientoClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 190, -1));
        jPanel3.add(FechaIngreClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 190, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel8.setText("Fecha Ingreso:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));
        jPanel3.add(txtDireccionClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 190, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel7.setText("Direccion:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel4.setText("Email:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));
        jPanel3.add(txtEmailClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 190, -1));

        bttCrearClie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/aceptar.png"))); // NOI18N
        bttCrearClie.setText("ACEPTAR");
        bttCrearClie.setBorderPainted(false);
        jPanel3.add(bttCrearClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, -1, -1));

        bttCancelarClie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/cancelar.png"))); // NOI18N
        bttCancelarClie.setText("CANCELAR");
        bttCancelarClie.setBorderPainted(false);
        jPanel3.add(bttCancelarClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 280, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/competencia-marketing-clientes-clinica-veterinaria.jpg"))); // NOI18N
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 370, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel15.setText("ID Cliente:");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        lb_nombreC.setFont(new java.awt.Font("Arial", 3, 10)); // NOI18N
        lb_nombreC.setForeground(new java.awt.Color(255, 51, 51));
        jPanel3.add(lb_nombreC, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 170, 20));

        lb_telefonoC.setFont(new java.awt.Font("Arial", 3, 10)); // NOI18N
        lb_telefonoC.setForeground(new java.awt.Color(255, 51, 51));
        jPanel3.add(lb_telefonoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 170, 20));

        lb_emailC.setFont(new java.awt.Font("Arial", 3, 10)); // NOI18N
        lb_emailC.setForeground(new java.awt.Color(255, 51, 51));
        jPanel3.add(lb_emailC, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 170, 20));

        jLabel19.setFont(new java.awt.Font("Arial", 3, 10)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 51, 51));
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 170, 20));

        lb_direccionC.setFont(new java.awt.Font("Arial", 3, 10)); // NOI18N
        lb_direccionC.setForeground(new java.awt.Color(255, 51, 51));
        jPanel3.add(lb_direccionC, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 170, 20));

        lb_fIngresoC.setFont(new java.awt.Font("Arial", 3, 10)); // NOI18N
        lb_fIngresoC.setForeground(new java.awt.Color(255, 51, 51));
        jPanel3.add(lb_fIngresoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 170, 20));

        lb_fNacimientoC.setFont(new java.awt.Font("Arial", 3, 10)); // NOI18N
        lb_fNacimientoC.setForeground(new java.awt.Color(255, 51, 51));
        jPanel3.add(lb_fNacimientoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 170, 20));

        lb_idC.setFont(new java.awt.Font("Arial", 3, 10)); // NOI18N
        lb_idC.setForeground(new java.awt.Color(255, 51, 51));
        jPanel3.add(lb_idC, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 170, 20));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        jLabel9.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/velocidad.png"))); // NOI18N
        jLabel9.setText("CLIENTES.");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(367, 367, 367)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout dlgClieLayout = new javax.swing.GroupLayout(dlgClie.getContentPane());
        dlgClie.getContentPane().setLayout(dlgClieLayout);
        dlgClieLayout.setHorizontalGroup(
            dlgClieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(dlgClieLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        dlgClieLayout.setVerticalGroup(
            dlgClieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgClieLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE))
        );

        setBackground(new java.awt.Color(51, 51, 51));
        setClosable(true);
        setIconifiable(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Buscar:");

        txtBuscarClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarClieActionPerformed(evt);
            }
        });

        bttAgregarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/agregar.png"))); // NOI18N
        bttAgregarCli.setText("AGREGAR");
        bttAgregarCli.setBorderPainted(false);
        bttAgregarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttAgregarCliActionPerformed(evt);
            }
        });

        bttModificarClie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/editar-documento (1).png"))); // NOI18N
        bttModificarClie.setText("MODIFICAR");
        bttModificarClie.setBorderPainted(false);

        bttEliminarClie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/basura.png"))); // NOI18N
        bttEliminarClie.setText("ELIMINAR");
        bttEliminarClie.setBorderPainted(false);

        jLabel13.setFont(new java.awt.Font("Arial", 3, 26)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/velocidad.png"))); // NOI18N
        jLabel13.setText("Clientes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarClie, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bttAgregarCli)
                .addGap(18, 18, 18)
                .addComponent(bttModificarClie)
                .addGap(96, 96, 96)
                .addComponent(bttEliminarClie)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscarClie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bttAgregarCli)
                            .addComponent(bttModificarClie)
                            .addComponent(bttEliminarClie))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(115, 179, 62));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablacliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "Edad", "Telefono", "Email", "Direccion", "Fecha Ingreso"
            }
        ));
        jScrollPane1.setViewportView(tablacliente);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 699, 240));

        bttImprimirClie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/impresion.png"))); // NOI18N
        bttImprimirClie.setText("IMPRIMIR");
        bttImprimirClie.setBorderPainted(false);
        jPanel2.add(bttImprimirClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/pngegg (5).png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/pngegg (6).png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 70, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 996, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttAgregarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttAgregarCliActionPerformed
        
    }//GEN-LAST:event_bttAgregarCliActionPerformed

    private void txtBuscarClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarClieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarClieActionPerformed

    public JLabel getLb_apellidoC() {
        return lb_apellidoC;
    }

    public void setLb_apellidoC(JLabel lb_apellidoC) {
        this.lb_apellidoC = lb_apellidoC;
    }

    public JLabel getLb_direccionC() {
        return lb_direccionC;
    }

    public void setLb_direccionC(JLabel lb_direccionC) {
        this.lb_direccionC = lb_direccionC;
    }

    public JLabel getLb_emailC() {
        return lb_emailC;
    }

    public void setLb_emailC(JLabel lb_emailC) {
        this.lb_emailC = lb_emailC;
    }

    public JLabel getLb_fIngresoC() {
        return lb_fIngresoC;
    }

    public void setLb_fIngresoC(JLabel lb_fIngresoC) {
        this.lb_fIngresoC = lb_fIngresoC;
    }

    public JLabel getLb_fNacimientoC() {
        return lb_fNacimientoC;
    }

    public void setLb_fNacimientoC(JLabel lb_fNacimientoC) {
        this.lb_fNacimientoC = lb_fNacimientoC;
    }

    public JLabel getLb_idC() {
        return lb_idC;
    }

    public void setLb_idC(JLabel lb_idC) {
        this.lb_idC = lb_idC;
    }

    public JLabel getLb_nombreC() {
        return lb_nombreC;
    }

    public void setLb_nombreC(JLabel lb_nombreC) {
        this.lb_nombreC = lb_nombreC;
    }

    public JLabel getLb_telefonoC() {
        return lb_telefonoC;
    }

    public void setLb_telefonoC(JLabel lb_telefonoC) {
        this.lb_telefonoC = lb_telefonoC;
    }
    
    
    public JDateChooser getFechaIngreClie() {
        return FechaIngreClie;
    }

    public void setFechaIngreClie(JDateChooser FechaIngreClie) {
        this.FechaIngreClie = FechaIngreClie;
    }

    public JDateChooser getFechaNacimientoClie() {
        return FechaNacimientoClie;
    }

    public void setFechaNacimientoClie(JDateChooser FechaNacimientoClie) {
        this.FechaNacimientoClie = FechaNacimientoClie;
    }

    public JButton getBttAgregarCli() {
        return bttAgregarCli;
    }

    public void setBttAgregarCli(JButton bttAgregarCli) {
        this.bttAgregarCli = bttAgregarCli;
    }

    public JButton getBttCancelarClie() {
        return bttCancelarClie;
    }

    public void setBttCancelarClie(JButton bttCancelarClie) {
        this.bttCancelarClie = bttCancelarClie;
    }

    public JButton getBttCrearClie() {
        return bttCrearClie;
    }

    public void setBttCrearClie(JButton bttCrearClie) {
        this.bttCrearClie = bttCrearClie;
    }

    public JButton getBttEliminarClie() {
        return bttEliminarClie;
    }

    public void setBttEliminarClie(JButton bttEliminarClie) {
        this.bttEliminarClie = bttEliminarClie;
    }

    public JButton getBttImprimirClie() {
        return bttImprimirClie;
    }

    public void setBttImprimirClie(JButton bttImprimirClie) {
        this.bttImprimirClie = bttImprimirClie;
    }

    public JButton getBttModificarClie() {
        return bttModificarClie;
    }

    public void setBttModificarClie(JButton bttModificarClie) {
        this.bttModificarClie = bttModificarClie;
    }

    public JDialog getDlgClie() {
        return dlgClie;
    }

    public void setDlgClie(JDialog dlgClie) {
        this.dlgClie = dlgClie;
    }

    public JTable getTablacliente() {
        return tablacliente;
    }

    public void setTablacliente(JTable tablacliente) {
        this.tablacliente = tablacliente;
    }

    public JTextField getTxtApellidoClie() {
        return txtApellidoClie;
    }

    public void setTxtApellidoClie(JTextField txtApellidoClie) {
        this.txtApellidoClie = txtApellidoClie;
    }

    public JTextField getTxtBuscarClie() {
        return txtBuscarClie;
    }

    public void setTxtBuscarClie(JTextField txtBuscarClie) {
        this.txtBuscarClie = txtBuscarClie;
    }

    public JTextField getTxtDireccionClie() {
        return txtDireccionClie;
    }

    public void setTxtDireccionClie(JTextField txtDireccionClie) {
        this.txtDireccionClie = txtDireccionClie;
    }

    public JTextField getTxtEmailClie() {
        return txtEmailClie;
    }

    public void setTxtEmailClie(JTextField txtEmailClie) {
        this.txtEmailClie = txtEmailClie;
    }

    public JTextField getTxtIdClie() {
        return txtIdClie;
    }

    public void setTxtIdClie(JTextField txtIdClie) {
        this.txtIdClie = txtIdClie;
    }

    public JTextField getTxtNombreClie() {
        return txtNombreClie;
    }

    public void setTxtNombreClie(JTextField txtNombreClie) {
        this.txtNombreClie = txtNombreClie;
    }

    public JTextField getTxtTelefonoClie() {
        return txtTelefonoClie;
    }

    public void setTxtTelefonoClie(JTextField txtTelefonoClie) {
        this.txtTelefonoClie = txtTelefonoClie;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaIngreClie;
    private com.toedter.calendar.JDateChooser FechaNacimientoClie;
    private javax.swing.JButton bttAgregarCli;
    private javax.swing.JButton bttCancelarClie;
    private javax.swing.JButton bttCrearClie;
    private javax.swing.JButton bttEliminarClie;
    private javax.swing.JButton bttImprimirClie;
    private javax.swing.JButton bttModificarClie;
    private javax.swing.JDialog dlgClie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_apellidoC;
    private javax.swing.JLabel lb_direccionC;
    private javax.swing.JLabel lb_emailC;
    private javax.swing.JLabel lb_fIngresoC;
    private javax.swing.JLabel lb_fNacimientoC;
    private javax.swing.JLabel lb_idC;
    private javax.swing.JLabel lb_nombreC;
    private javax.swing.JLabel lb_telefonoC;
    private javax.swing.JTable tablacliente;
    private javax.swing.JTextField txtApellidoClie;
    private javax.swing.JTextField txtBuscarClie;
    private javax.swing.JTextField txtDireccionClie;
    private javax.swing.JTextField txtEmailClie;
    private javax.swing.JTextField txtIdClie;
    private javax.swing.JTextField txtNombreClie;
    private javax.swing.JTextField txtTelefonoClie;
    // End of variables declaration//GEN-END:variables
}
