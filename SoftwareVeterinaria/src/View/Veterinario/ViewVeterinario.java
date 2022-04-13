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

    public JButton getBtnReporteVeterinario() {
        return btnReporteVeterinario;
    }

    public void setBtnReporteVeterinario(JButton btnReporteVeterinario) {
        this.btnReporteVeterinario = btnReporteVeterinario;
    }

    public JDialog getDlgReporteVeterinario() {
        return dlgReporteVeterinario;
    }

    public void setDlgReporteVeterinario(JDialog dlgReporteVeterinario) {
        this.dlgReporteVeterinario = dlgReporteVeterinario;
    }

    public JTextField getTxtReporteIdMedico() {
        return txtReporteIdMedico;
    }

    public void setTxtReporteIdMedico(JTextField txtReporteIdMedico) {
        this.txtReporteIdMedico = txtReporteIdMedico;
    }

    public JTextField getTxtReporteNombre() {
        return txtReporteNombre;
    }

    public void setTxtReporteNombre(JTextField txtReporteNombre) {
        this.txtReporteNombre = txtReporteNombre;
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
        dlgReporteVeterinario = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtReporteIdMedico = new javax.swing.JTextField();
        txtReporteNombre = new javax.swing.JTextField();
        btnReporteVeterinario = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtBuscar_Vet = new javax.swing.JTextField();
        btnAgregar_Vet = new javax.swing.JButton();
        btnModificar_Vet = new javax.swing.JButton();
        btnEliminar_Vet = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Veterinario = new javax.swing.JTable();
        btnImprimir_Vet = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        dlg_Vet.setBackground(new java.awt.Color(255, 255, 255));
        dlg_Vet.setResizable(false);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(126, 197, 68));
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
        jPanel4.add(btnCrear_Vet, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));

        btnCancelar_Vet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/cancelar.png"))); // NOI18N
        btnCancelar_Vet.setText("CANCELAR");
        btnCancelar_Vet.setBorderPainted(false);
        jPanel4.add(btnCancelar_Vet, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel4.setText("Especialidad");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        cb_EspecialidadVet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Selecione-", "Cirugía.", "Oncología.", "Fisioterapia.", "Rehabilitación.", "Imagenología.", "Fauna Silvestre." }));
        jPanel4.add(cb_EspecialidadVet, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 269, -1));
        jPanel4.add(txtTelefonoClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 269, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel5.setText("Direccion");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel3.setText("Apellido Veterinario:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));
        jPanel4.add(txtApellidoClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 269, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel1.setText("Nombre Veterinario:");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));
        jPanel4.add(txtNombreClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 269, -1));

        lb_nombreV.setFont(new java.awt.Font("Arial", 3, 10)); // NOI18N
        lb_nombreV.setForeground(new java.awt.Color(255, 51, 51));
        jPanel4.add(lb_nombreV, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, 130, 20));
        jPanel4.add(txtIdClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 269, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/doctor-looking-at-the-pet-closely.jpg"))); // NOI18N
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, 0, 380, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel11.setText("ID Veterinario:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        lb_ApellidoV.setFont(new java.awt.Font("Arial", 3, 10)); // NOI18N
        lb_ApellidoV.setForeground(new java.awt.Color(255, 51, 51));
        jPanel4.add(lb_ApellidoV, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, 120, 20));

        lb_DireccionV.setFont(new java.awt.Font("Arial", 3, 10)); // NOI18N
        lb_DireccionV.setForeground(new java.awt.Color(255, 51, 51));
        jPanel4.add(lb_DireccionV, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, 130, 20));

        lb_EspecialidadV.setFont(new java.awt.Font("Arial", 3, 10)); // NOI18N
        lb_EspecialidadV.setForeground(new java.awt.Color(255, 51, 51));
        jPanel4.add(lb_EspecialidadV, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, 130, 20));

        lb_IdV.setFont(new java.awt.Font("Arial", 3, 10)); // NOI18N
        lb_IdV.setForeground(new java.awt.Color(255, 51, 51));
        jPanel4.add(lb_IdV, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 200, 20));

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

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 204, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/seo.png"))); // NOI18N
        jLabel2.setText("Parametros para Imprimir");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Arial", 3, 13)); // NOI18N
        jLabel12.setText("Id Medico:");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 71, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel13.setText("Buscar por:");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 22, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/pugbuscar.png"))); // NOI18N
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 190, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 3, 13)); // NOI18N
        jLabel15.setText("Nombre:");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 107, -1, -1));
        jPanel6.add(txtReporteIdMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 66, 129, -1));
        jPanel6.add(txtReporteNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 102, 129, -1));

        btnReporteVeterinario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/impresion.png"))); // NOI18N
        btnReporteVeterinario.setText("Imprimir");
        btnReporteVeterinario.setBorderPainted(false);
        jPanel6.add(btnReporteVeterinario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        javax.swing.GroupLayout dlgReporteVeterinarioLayout = new javax.swing.GroupLayout(dlgReporteVeterinario.getContentPane());
        dlgReporteVeterinario.getContentPane().setLayout(dlgReporteVeterinarioLayout);
        dlgReporteVeterinarioLayout.setHorizontalGroup(
            dlgReporteVeterinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dlgReporteVeterinarioLayout.setVerticalGroup(
            dlgReporteVeterinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgReporteVeterinarioLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBackground(new java.awt.Color(51, 51, 51));
        setClosable(true);
        setIconifiable(true);
        setTitle("Veterinario");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/5x16.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtBuscar_Vet, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 50, 288, -1));

        btnAgregar_Vet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/agregar.png"))); // NOI18N
        btnAgregar_Vet.setText("AGREGAR");
        btnAgregar_Vet.setToolTipText("");
        btnAgregar_Vet.setBorderPainted(false);
        jPanel1.add(btnAgregar_Vet, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, -1, -1));

        btnModificar_Vet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/editar-documento (1).png"))); // NOI18N
        btnModificar_Vet.setText("MODIFICAR");
        btnModificar_Vet.setBorderPainted(false);
        jPanel1.add(btnModificar_Vet, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, -1, -1));

        btnEliminar_Vet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/basura.png"))); // NOI18N
        btnEliminar_Vet.setText("ELIMINAR");
        btnEliminar_Vet.setBorderPainted(false);
        jPanel1.add(btnEliminar_Vet, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(126, 197, 68));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/salud.png"))); // NOI18N
        jLabel7.setText("Veterinario");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 6, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/informacion.png"))); // NOI18N
        jLabel20.setToolTipText("Ingrese en el cuadro de busqueda el ID o Nombre del Veterinario");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, -1, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Buscar:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 90, -1));

        jPanel2.setBackground(new java.awt.Color(251, 118, 33));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_Veterinario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_Veterinario", "Nombre_Veterinario", "Apellido_Veterinario", "Direccion_Veterinario", "Especialidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_Veterinario);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 710, 220));

        btnImprimir_Vet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/impresion.png"))); // NOI18N
        btnImprimir_Vet.setText("IMPRIMIR");
        btnImprimir_Vet.setBorderPainted(false);
        jPanel2.add(btnImprimir_Vet, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/pepe.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1009, Short.MAX_VALUE)
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
    private javax.swing.JButton btnReporteVeterinario;
    private javax.swing.JComboBox<String> cb_EspecialidadVet;
    private javax.swing.JDialog dlgReporteVeterinario;
    private javax.swing.JDialog dlg_Vet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
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
    private javax.swing.JTextField txtReporteIdMedico;
    private javax.swing.JTextField txtReporteNombre;
    private javax.swing.JTextField txtTelefonoClie;
    // End of variables declaration//GEN-END:variables
}
