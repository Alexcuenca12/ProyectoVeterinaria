/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Veterinario;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class ViewVeterinario extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewVeterinario
     */
    public ViewVeterinario() {
        initComponents();
    }

    public JLabel getLb_ApellidoV() {
        return lb_ApellidoV;
    }

    public void setLb_ApellidoV(JLabel lb_ApellidoV) {
        this.lb_ApellidoV = lb_ApellidoV;
    }

    public JLabel getLb_DireccionV() {
        return lb_DireccionV;
    }

    public void setLb_DireccionV(JLabel lb_DireccionV) {
        this.lb_DireccionV = lb_DireccionV;
    }

    public JLabel getLb_EspecialidadV() {
        return lb_EspecialidadV;
    }

    public void setLb_EspecialidadV(JLabel lb_EspecialidadV) {
        this.lb_EspecialidadV = lb_EspecialidadV;
    }

    public JLabel getLb_IdV() {
        return lb_IdV;
    }

    public void setLb_IdV(JLabel lb_IdV) {
        this.lb_IdV = lb_IdV;
    }

    public JLabel getLb_nombreV() {
        return lb_nombreV;
    }

    public void setLb_nombreV(JLabel lb_nombreV) {
        this.lb_nombreV = lb_nombreV;
    }
    
    
    
    
    public JButton getBtnAgregar_Vet() {
        return btnAgregar_Vet;
    }

    public void setBtnAgregar_Vet(JButton btnAgregar_Vet) {
        this.btnAgregar_Vet = btnAgregar_Vet;
    }

    public JButton getBtnCancelar_Vet() {
        return btnCancelar_Vet;
    }

    public void setBtnCancelar_Vet(JButton btnCancelar_Vet) {
        this.btnCancelar_Vet = btnCancelar_Vet;
    }

    public JButton getBtnCrear_Vet() {
        return btnCrear_Vet;
    }

    public void setBtnCrear_Vet(JButton btnCrear_Vet) {
        this.btnCrear_Vet = btnCrear_Vet;
    }

    public JButton getBtnEliminar_Vet() {
        return btnEliminar_Vet;
    }

    public void setBtnEliminar_Vet(JButton btnEliminar_Vet) {
        this.btnEliminar_Vet = btnEliminar_Vet;
    }

    public JButton getBtnImprimir_Vet() {
        return btnImprimir_Vet;
    }

    public void setBtnImprimir_Vet(JButton btnImprimir_Vet) {
        this.btnImprimir_Vet = btnImprimir_Vet;
    }

    public JButton getBtnModificar_Vet() {
        return btnModificar_Vet;
    }

    public void setBtnModificar_Vet(JButton btnModificar_Vet) {
        this.btnModificar_Vet = btnModificar_Vet;
    }

    public JComboBox<String> getCb_EspecialidadVet() {
        return cb_EspecialidadVet;
    }

    public void setCb_EspecialidadVet(JComboBox<String> cb_EspecialidadVet) {
        this.cb_EspecialidadVet = cb_EspecialidadVet;
    }

    public JDialog getDlg_Vet() {
        return dlg_Vet;
    }

    public void setDlg_Vet(JDialog dlg_Vet) {
        this.dlg_Vet = dlg_Vet;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTable getTbl_Veterinario() {
        return tbl_Veterinario;
    }

    public void setTbl_Veterinario(JTable tbl_Veterinario) {
        this.tbl_Veterinario = tbl_Veterinario;
    }

    public JTextField getTxtApellidoClie() {
        return txtApellidoClie;
    }

    public void setTxtApellidoClie(JTextField txtApellidoClie) {
        this.txtApellidoClie = txtApellidoClie;
    }

    public JTextField getTxtBuscar_Vet() {
        return txtBuscar_Vet;
    }

    public void setTxtBuscar_Vet(JTextField txtBuscar_Vet) {
        this.txtBuscar_Vet = txtBuscar_Vet;
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlg_Vet = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnCrear_Vet = new javax.swing.JButton();
        btnCancelar_Vet = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cb_EspecialidadVet = new javax.swing.JComboBox<>();
        txtTelefonoClie = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtApellidoClie = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNombreClie = new javax.swing.JTextField();
        lb_nombreV = new javax.swing.JLabel();
        txtIdClie = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lb_ApellidoV = new javax.swing.JLabel();
        lb_DireccionV = new javax.swing.JLabel();
        lb_EspecialidadV = new javax.swing.JLabel();
        lb_IdV = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtBuscar_Vet = new javax.swing.JTextField();
        btnAgregar_Vet = new javax.swing.JButton();
        btnModificar_Vet = new javax.swing.JButton();
        btnEliminar_Vet = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Veterinario = new javax.swing.JTable();
        btnImprimir_Vet = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        dlg_Vet.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/salud.png"))); // NOI18N
        jLabel9.setText("Veterinario");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(345, 345, 345))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCrear_Vet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/aceptar.png"))); // NOI18N
        btnCrear_Vet.setText("ACEPTAR");
        btnCrear_Vet.setBorderPainted(false);
        jPanel4.add(btnCrear_Vet, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        btnCancelar_Vet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/cancelar.png"))); // NOI18N
        btnCancelar_Vet.setText("CANCELAR");
        btnCancelar_Vet.setBorderPainted(false);
        jPanel4.add(btnCancelar_Vet, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel4.setText("Especialidad");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        cb_EspecialidadVet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Selecione-", "Cirugía.", "Oncología.", "Fisioterapia.", "Rehabilitación.", "Imagenología.", "Fauna Silvestre." }));
        jPanel4.add(cb_EspecialidadVet, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 269, -1));
        jPanel4.add(txtTelefonoClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 269, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel5.setText("Direccion");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel3.setText("Apellido Veterinario:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));
        jPanel4.add(txtApellidoClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 269, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel1.setText("Nombre Veterinario:");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));
        jPanel4.add(txtNombreClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 269, -1));

        lb_nombreV.setFont(new java.awt.Font("Arial", 3, 10)); // NOI18N
        lb_nombreV.setForeground(new java.awt.Color(255, 51, 51));
        jPanel4.add(lb_nombreV, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 130, 20));
        jPanel4.add(txtIdClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 269, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/doctor-looking-at-the-pet-closely.jpg"))); // NOI18N
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 270, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel11.setText("ID Veterinario:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        lb_ApellidoV.setFont(new java.awt.Font("Arial", 3, 10)); // NOI18N
        lb_ApellidoV.setForeground(new java.awt.Color(255, 51, 51));
        jPanel4.add(lb_ApellidoV, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 120, 20));

        lb_DireccionV.setFont(new java.awt.Font("Arial", 3, 10)); // NOI18N
        lb_DireccionV.setForeground(new java.awt.Color(255, 51, 51));
        jPanel4.add(lb_DireccionV, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 130, 20));

        lb_EspecialidadV.setFont(new java.awt.Font("Arial", 3, 10)); // NOI18N
        lb_EspecialidadV.setForeground(new java.awt.Color(255, 51, 51));
        jPanel4.add(lb_EspecialidadV, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 130, 20));

        lb_IdV.setFont(new java.awt.Font("Arial", 3, 10)); // NOI18N
        lb_IdV.setForeground(new java.awt.Color(255, 51, 51));
        jPanel4.add(lb_IdV, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 200, 20));

        javax.swing.GroupLayout dlg_VetLayout = new javax.swing.GroupLayout(dlg_Vet.getContentPane());
        dlg_Vet.getContentPane().setLayout(dlg_VetLayout);
        dlg_VetLayout.setHorizontalGroup(
            dlg_VetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dlg_VetLayout.setVerticalGroup(
            dlg_VetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlg_VetLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        btnAgregar_Vet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/agregar.png"))); // NOI18N
        btnAgregar_Vet.setText("AGREGAR");
        btnAgregar_Vet.setToolTipText("");
        btnAgregar_Vet.setBorderPainted(false);

        btnModificar_Vet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/editar-documento (1).png"))); // NOI18N
        btnModificar_Vet.setText("MODIFICAR");
        btnModificar_Vet.setBorderPainted(false);

        btnEliminar_Vet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/basura.png"))); // NOI18N
        btnEliminar_Vet.setText("ELIMINAR");
        btnEliminar_Vet.setBorderPainted(false);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/lupa.png"))); // NOI18N

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/salud.png"))); // NOI18N
        jLabel7.setText("Veterinario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(txtBuscar_Vet, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregar_Vet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificar_Vet)
                .addGap(51, 51, 51)
                .addComponent(btnEliminar_Vet)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar_Vet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAgregar_Vet)
                        .addComponent(btnModificar_Vet)
                        .addComponent(btnEliminar_Vet))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(24, 24, 24))
        );

        jPanel2.setBackground(new java.awt.Color(251, 240, 117));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_Veterinario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_Veterinario", "Nombre_Veterinario", "Apellido_Veterinario", "Direccion_Veterinario", "Especialidad"
            }
        ));
        jScrollPane1.setViewportView(tbl_Veterinario);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 18, 649, 191));

        btnImprimir_Vet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/impresion.png"))); // NOI18N
        btnImprimir_Vet.setText("IMPRIMIR");
        btnImprimir_Vet.setBorderPainted(false);
        jPanel2.add(btnImprimir_Vet, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 221, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/front-view-of-female-veterinarian-observing-little-dog-on-yellow-wall.jpg"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(681, 6, 355, 293));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar_Vet;
    private javax.swing.JButton btnCancelar_Vet;
    private javax.swing.JButton btnCrear_Vet;
    private javax.swing.JButton btnEliminar_Vet;
    private javax.swing.JButton btnImprimir_Vet;
    private javax.swing.JButton btnModificar_Vet;
    private javax.swing.JComboBox<String> cb_EspecialidadVet;
    private javax.swing.JDialog dlg_Vet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel lb_ApellidoV;
    private javax.swing.JLabel lb_DireccionV;
    private javax.swing.JLabel lb_EspecialidadV;
    private javax.swing.JLabel lb_IdV;
    private javax.swing.JLabel lb_nombreV;
    private javax.swing.JTable tbl_Veterinario;
    private javax.swing.JTextField txtApellidoClie;
    private javax.swing.JTextField txtBuscar_Vet;
    private javax.swing.JTextField txtIdClie;
    private javax.swing.JTextField txtNombreClie;
    private javax.swing.JTextField txtTelefonoClie;
    // End of variables declaration//GEN-END:variables
}
