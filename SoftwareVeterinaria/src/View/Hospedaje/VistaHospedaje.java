/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Hospedaje;

import com.toedter.calendar.JDateChooser;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class VistaHospedaje extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaHospedaje
     */
    public VistaHospedaje() {
        initComponents();
    }

    public JLabel getLb_costoV() {
        return lb_costoV;
    }

    public void setLb_costoV(JLabel lb_costoV) {
        this.lb_costoV = lb_costoV;
    }

    public JLabel getLb_idCeldaV() {
        return lb_idCeldaV;
    }

    public void setLb_idCeldaV(JLabel lb_idCeldaV) {
        this.lb_idCeldaV = lb_idCeldaV;
    }

    public JDialog getDlgReporteHospedaje() {
        return DlgReporteHospedaje;
    }

    public void setDlgReporteHospedaje(JDialog DlgReporteHospedaje) {
        this.DlgReporteHospedaje = DlgReporteHospedaje;
    }

    public JButton getBtnReporteImprimir() {
        return btnReporteImprimir;
    }

    public void setBtnReporteImprimir(JButton btnReporteImprimir) {
        this.btnReporteImprimir = btnReporteImprimir;
    }

    public JTextField getTxtReporteIdHospedaje() {
        return txtReporteIdHospedaje;
    }

    public void setTxtReporteIdHospedaje(JTextField txtReporteIdHospedaje) {
        this.txtReporteIdHospedaje = txtReporteIdHospedaje;
    }

    public JTextField getTxtReporteIdMascota() {
        return txtReporteIdMascota;
    }

    public void setTxtReporteIdMascota(JTextField txtReporteIdMascota) {
        this.txtReporteIdMascota = txtReporteIdMascota;
    }

    public JLabel getLb_ubicacionV() {
        return lb_ubicacionV;
    }

    public void setLb_ubicacionV(JLabel lb_ubicacionV) {
        this.lb_ubicacionV = lb_ubicacionV;
    }
    
    
    public JTable getTabla_hospedaje() {
        return tabla_hospedaje;
    }

    public void setTabla_hospedaje(JTable tabla_hospedaje) {
        this.tabla_hospedaje = tabla_hospedaje;
    }

    public JDialog getDialogMascota() {
        return DialogMascota;
    }

    public void setDialogMascota(JDialog DialogMascota) {
        this.DialogMascota = DialogMascota;
    }

    public JDateChooser getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(JDateChooser FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }

    public JDateChooser getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(JDateChooser FechaSalida) {
        this.FechaSalida = FechaSalida;
    }

    public JTextField getTxtBuscar() {
        return TxtBuscarH;
    }

    public void setTxtBuscar(JTextField TxtBuscar) {
        this.TxtBuscarH = TxtBuscar;
    }

    public JButton getBtnAceptar() {
        return btnAceptar;
    }

    public void setBtnAceptar(JButton btnAceptar) {
        this.btnAceptar = btnAceptar;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JButton getBtnAñadir() {
        return btnAñadir;
    }

    public void setBtnAñadir(JButton btnAñadir) {
        this.btnAñadir = btnAñadir;
    }

    public JButton getBtnBuscarCelda() {
        return btnBuscarCelda;
    }

    public void setBtnBuscarCelda(JButton btnBuscarCelda) {
        this.btnBuscarCelda = btnBuscarCelda;
    }

    public JButton getBtnBuscarMascota() {
        return btnBuscarMascota;
    }

    public void setBtnBuscarMascota(JButton btnBuscarMascota) {
        this.btnBuscarMascota = btnBuscarMascota;
    }

    public JButton getBtnEditar() {
        return btnEditar;
    }

    public void setBtnEditar(JButton btnEditar) {
        this.btnEditar = btnEditar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JButton getBtnImprimir() {
        return btnImprimir;
    }

    public void setBtnImprimir(JButton btnImprimir) {
        this.btnImprimir = btnImprimir;
    }

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    public void setButtonGroup1(ButtonGroup buttonGroup1) {
        this.buttonGroup1 = buttonGroup1;
    }

    public JDialog getDlgHospedaje() {
        return dlgHospedaje;
    }

    public void setDlgHospedaje(JDialog dlgHospedaje) {
        this.dlgHospedaje = dlgHospedaje;
    }

    public JLabel getLblFoto() {
        return lblFoto;
    }

    public void setLblFoto(JLabel lblFoto) {
        this.lblFoto = lblFoto;
    }


    public JTable getTabla_Mascotas() {
        return tabla_Mascotas;
    }

    public void setTabla_Mascotas(JTable tabla_Mascotas) {
        this.tabla_Mascotas = tabla_Mascotas;
    }

    public JTextField getTxtBuscarH() {
        return TxtBuscarH;
    }

    public void setTxtBuscarH(JTextField TxtBuscarH) {
        this.TxtBuscarH = TxtBuscarH;
    }

    public JTextField getTxtCodCelda() {
        return txtCodCelda;
    }

    public void setTxtCodCelda(JTextField txtCodCelda) {
        this.txtCodCelda = txtCodCelda;
    }

    public JTextField getTxtCodHospedaje() {
        return txtCodHospedaje;
    }

    public void setTxtCodHospedaje(JTextField txtCodHospedaje) {
        this.txtCodHospedaje = txtCodHospedaje;
    }

    public JTextField getTxtCodMascota() {
        return txtCodMascota;
    }

    public void setTxtCodMascota(JTextField txtCodMascota) {
        this.txtCodMascota = txtCodMascota;
    }

    public JTextField getTxtCodigoCelda() {
        return txtCodigoCelda;
    }

    public void setTxtCodigoCelda(JTextField txtCodigoCelda) {
        this.txtCodigoCelda = txtCodigoCelda;
    }

    public JTextField getTxtCosto() {
        return txtCosto;
    }

    public void setTxtCosto(JTextField txtCosto) {
        this.txtCosto = txtCosto;
    }

    public JTextField getTxtEdad() {
        return txtEdad;
    }

    public void setTxtEdad(JTextField txtEdad) {
        this.txtEdad = txtEdad;
    }

    public JTextField getTxtEspecie() {
        return txtEspecie;
    }

    public void setTxtEspecie(JTextField txtEspecie) {
        this.txtEspecie = txtEspecie;
    }

    public JTextField getTxtNombreMas() {
        return txtNombreMas;
    }

    public void setTxtNombreMas(JTextField txtNombreMas) {
        this.txtNombreMas = txtNombreMas;
    }

    public JTextField getTxtRaza() {
        return txtRaza;
    }

    public void setTxtRaza(JTextField txtRaza) {
        this.txtRaza = txtRaza;
    }

    public JTextField getTxtSexo() {
        return txtSexo;
    }

    public void setTxtSexo(JTextField txtSexo) {
        this.txtSexo = txtSexo;
    }

    public JTextArea getTxtUbicacion() {
        return txtUbicacion;
    }

    public void setTxtUbicacion(JTextArea txtUbicacion) {
        this.txtUbicacion = txtUbicacion;
    }

    public JDialog getDialogCelda() {
        return DialogCelda;
    }

    public void setDialogCelda(JDialog DialogCelda) {
        this.DialogCelda = DialogCelda;
    }

    public JTextField getTxt_IDCelda() {
        return Txt_IDCelda;
    }

    public void setTxt_IDCelda(JTextField Txt_IDCelda) {
        this.Txt_IDCelda = Txt_IDCelda;
    }

    public JSpinner getSpCostoCelda() {
        return spCostoCelda;
    }

    public void setSpCostoCelda(JSpinner spCostoCelda) {
        this.spCostoCelda = spCostoCelda;
    }

    

    public JTextField getTxt_Buscar() {
        return Txt_Buscar;
    }

    public void setTxt_Buscar(JTextField Txt_Buscar) {
        this.Txt_Buscar = Txt_Buscar;
    }

    public JTextField getTxt_UbiCelda() {
        return Txt_UbiCelda;
    }

    public void setTxt_UbiCelda(JTextField Txt_UbiCelda) {
        this.Txt_UbiCelda = Txt_UbiCelda;
    }

    public JButton getBtn_AgregarCel() {
        return btn_AgregarCel;
    }

    public void setBtn_AgregarCel(JButton btn_AgregarCel) {
        this.btn_AgregarCel = btn_AgregarCel;
    }

    public JButton getBtn_AgregarT() {
        return btn_AgregarT;
    }

    public void setBtn_AgregarT(JButton btn_AgregarT) {
        this.btn_AgregarT = btn_AgregarT;
    }

    public JTable getTblCelda() {
        return tblCelda;
    }

    public void setTblCelda(JTable tblCelda) {
        this.tblCelda = tblCelda;
    }

    public JLabel getLb_CeldaV() {
        return lb_CeldaV;
    }

    public void setLb_CeldaV(JLabel lb_CeldaV) {
        this.lb_CeldaV = lb_CeldaV;
    }

    public JLabel getLb_HospedajeV2() {
        return lb_HospedajeV2;
    }

    public void setLb_HospedajeV2(JLabel lb_HospedajeV2) {
        this.lb_HospedajeV2 = lb_HospedajeV2;
    }

    public JLabel getLb_MascotaV() {
        return lb_MascotaV;
    }

    public void setLb_MascotaV(JLabel lb_MascotaV) {
        this.lb_MascotaV = lb_MascotaV;
    }

    public JPanel getjPanel18() {
        return jPanel18;
    }

    public void setjPanel18(JPanel jPanel18) {
        this.jPanel18 = jPanel18;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgHospedaje = new javax.swing.JDialog();
        jPanel12 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtCodHospedaje = new javax.swing.JTextField();
        txtCodMascota = new javax.swing.JTextField();
        txtCodCelda = new javax.swing.JTextField();
        FechaSalida = new com.toedter.calendar.JDateChooser();
        FechaIngreso = new com.toedter.calendar.JDateChooser();
        btnBuscarMascota = new javax.swing.JButton();
        btnBuscarCelda = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lb_MascotaV = new javax.swing.JLabel();
        lb_CeldaV = new javax.swing.JLabel();
        lb_HospedajeV2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNombreMas = new javax.swing.JTextField();
        txtRaza = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        txtEspecie = new javax.swing.JTextField();
        lblFoto = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtUbicacion = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        txtCodigoCelda = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        DialogMascota = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_Mascotas = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        btnAñadir = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        DialogCelda = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCelda = new javax.swing.JTable();
        btn_AgregarT = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        Txt_IDCelda = new javax.swing.JTextField();
        Txt_UbiCelda = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        btn_AgregarCel = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        lb_idCeldaV = new javax.swing.JLabel();
        lb_costoV = new javax.swing.JLabel();
        lb_ubicacionV = new javax.swing.JLabel();
        spCostoCelda = new javax.swing.JSpinner();
        Txt_Buscar = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        DlgReporteHospedaje = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtReporteIdHospedaje = new javax.swing.JTextField();
        txtReporteIdMascota = new javax.swing.JTextField();
        btnReporteImprimir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TxtBuscarH = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_hospedaje = new javax.swing.JTable();
        btnImprimir = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();

        dlgHospedaje.setBackground(new java.awt.Color(255, 255, 255));
        dlgHospedaje.setResizable(false);

        jPanel12.setBackground(new java.awt.Color(51, 51, 51));

        jLabel11.setBackground(new java.awt.Color(126, 197, 68));
        jLabel11.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(126, 197, 68));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/imagen.png"))); // NOI18N
        jLabel11.setText("HOSPEDAJE");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(340, 340, 340))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel11)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel17.setBackground(new java.awt.Color(51, 51, 51));

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/aceptar.png"))); // NOI18N
        btnAceptar.setText("ACEPTAR");
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAceptar)
                .addGap(343, 343, 343))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAceptar)
                .addGap(14, 14, 14))
        );

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel12.setText("Codigo Hospedaje:");
        jPanel18.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 43, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel13.setText("Id Mascota:");
        jPanel18.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel14.setText("Id celda:");
        jPanel18.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel16.setText("Fecha ingreso:");
        jPanel18.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, -1, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel17.setText("Fecha salida:");
        jPanel18.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, -1, -1));
        jPanel18.add(txtCodHospedaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 120, -1));
        jPanel18.add(txtCodMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 120, -1));
        jPanel18.add(txtCodCelda, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 120, -1));
        jPanel18.add(FechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, 140, 26));
        jPanel18.add(FechaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 140, 24));

        btnBuscarMascota.setText("jButton1");
        btnBuscarMascota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel18.add(btnBuscarMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 31, -1));

        btnBuscarCelda.setText("jButton2");
        btnBuscarCelda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel18.add(btnBuscarCelda, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 34, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("INGRESE DATOS DE HOSPEDAJE:");
        jPanel18.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, -1, -1));

        lb_MascotaV.setFont(new java.awt.Font("Arial", 3, 10)); // NOI18N
        lb_MascotaV.setForeground(new java.awt.Color(255, 51, 51));
        jPanel18.add(lb_MascotaV, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 130, 20));

        lb_CeldaV.setFont(new java.awt.Font("Arial", 3, 10)); // NOI18N
        lb_CeldaV.setForeground(new java.awt.Color(255, 51, 51));
        jPanel18.add(lb_CeldaV, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 160, 20));

        lb_HospedajeV2.setFont(new java.awt.Font("Arial", 3, 10)); // NOI18N
        lb_HospedajeV2.setForeground(new java.awt.Color(255, 51, 51));
        jPanel18.add(lb_HospedajeV2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 130, 20));

        jPanel2.setBackground(new java.awt.Color(251, 118, 33));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/9x16.png"))); // NOI18N
        jLabel3.setText("DATOS DE LA MASCOTA");

        jLabel5.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel5.setText("Nombre:");

        jLabel6.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel6.setText("Raza:");

        jLabel7.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel7.setText("Sexo:");

        jLabel8.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel8.setText("Especie:");

        jLabel9.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel9.setText("Edad:");

        jLabel10.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel10.setText("Foto:");

        lblFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel23.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel23.setText("Costo:");

        jLabel22.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel22.setText("Ubicacion:");

        txtUbicacion.setColumns(20);
        txtUbicacion.setRows(5);
        jScrollPane3.setViewportView(txtUbicacion);

        jLabel19.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel19.setText("Codigo:");

        jLabel4.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/4x16.png"))); // NOI18N
        jLabel4.setText("DATOS DE LA CELDA");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRaza)
                            .addComponent(txtNombreMas)
                            .addComponent(txtSexo)
                            .addComponent(txtEspecie, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigoCelda, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(56, 56, 56))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(txtCodigoCelda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel22)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtNombreMas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel10)
                                        .addGap(118, 118, 118))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addContainerGap())))))))
            .addComponent(jSeparator1)
        );

        javax.swing.GroupLayout dlgHospedajeLayout = new javax.swing.GroupLayout(dlgHospedaje.getContentPane());
        dlgHospedaje.getContentPane().setLayout(dlgHospedajeLayout);
        dlgHospedajeLayout.setHorizontalGroup(
            dlgHospedajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dlgHospedajeLayout.setVerticalGroup(
            dlgHospedajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgHospedajeLayout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        DialogMascota.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(126, 197, 68));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/salud.png"))); // NOI18N
        jLabel20.setText("PACIENTES");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(387, 387, 387)
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel20)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        tabla_Mascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "CI Cliente", "Nombre", "Sexo", "Especie", "Raza", "Color", "Edad", "Fecha Ingreso", "Foto"
            }
        ));
        tabla_Mascotas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane2.setViewportView(tabla_Mascotas);

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel21.setText("BUSCAR:");

        btnAñadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/agregar-archivo.png"))); // NOI18N
        btnAñadir.setText("Añadir");
        btnAñadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(67, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAñadir)
                        .addGap(46, 46, 46))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAñadir)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout DialogMascotaLayout = new javax.swing.GroupLayout(DialogMascota.getContentPane());
        DialogMascota.getContentPane().setLayout(DialogMascotaLayout);
        DialogMascotaLayout.setHorizontalGroup(
            DialogMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DialogMascotaLayout.setVerticalGroup(
            DialogMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogMascotaLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel15.setFont(new java.awt.Font("Arial", 3, 28)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(126, 197, 68));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/imagen.png"))); // NOI18N
        jLabel15.setText("Celdas");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel15)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCelda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID CELDA", "COSTO", "UBICACION", "EN USO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblCelda);

        jPanel7.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 444, 115));

        btn_AgregarT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/agregar-archivo.png"))); // NOI18N
        btn_AgregarT.setText("Añadir");
        btn_AgregarT.setBorderPainted(false);
        jPanel7.add(btn_AgregarT, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, -1, -1));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel8.add(Txt_IDCelda, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 80, -1));

        Txt_UbiCelda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_UbiCeldaActionPerformed(evt);
            }
        });
        jPanel8.add(Txt_UbiCelda, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 120, -1));

        jLabel24.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel24.setText("ID_CELDA");
        jPanel8.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 49, -1, -1));

        jLabel25.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel25.setText("COSTO");
        jPanel8.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 86, -1, -1));

        jLabel26.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel26.setText("UBICACION");
        jPanel8.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 123, -1, -1));

        btn_AgregarCel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/aceptar.png"))); // NOI18N
        btn_AgregarCel.setText("Guardar");
        btn_AgregarCel.setBorderPainted(false);
        jPanel8.add(btn_AgregarCel, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 161, -1, -1));

        jLabel31.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel31.setText("Agregar celdas");
        jPanel8.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, -1, -1));

        lb_idCeldaV.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lb_idCeldaV.setForeground(new java.awt.Color(255, 0, 0));
        jPanel8.add(lb_idCeldaV, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 45, 150, 24));

        lb_costoV.setForeground(new java.awt.Color(255, 0, 0));
        jPanel8.add(lb_costoV, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 89, 160, 21));

        lb_ubicacionV.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lb_ubicacionV.setForeground(new java.awt.Color(255, 0, 0));
        jPanel8.add(lb_ubicacionV, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 119, 130, 24));

        spCostoCelda.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));
        jPanel8.add(spCostoCelda, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 80, -1));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 230));
        jPanel7.add(Txt_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 10, 270, -1));

        jLabel30.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Busqueda:");
        jPanel7.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        javax.swing.GroupLayout DialogCeldaLayout = new javax.swing.GroupLayout(DialogCelda.getContentPane());
        DialogCelda.getContentPane().setLayout(DialogCeldaLayout);
        DialogCeldaLayout.setHorizontalGroup(
            DialogCeldaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
        );
        DialogCeldaLayout.setVerticalGroup(
            DialogCeldaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogCeldaLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DlgReporteHospedaje.setResizable(false);

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));

        jLabel18.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 204, 0));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/seo.png"))); // NOI18N
        jLabel18.setText("Parametros para Imprimir");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(20, 20, 20))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel32.setText("Buscar por:");
        jPanel10.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 24, -1, -1));

        jLabel33.setFont(new java.awt.Font("Arial", 3, 13)); // NOI18N
        jLabel33.setText("Id Hospedaje:");
        jPanel10.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 64, -1, -1));

        jLabel34.setFont(new java.awt.Font("Arial", 3, 13)); // NOI18N
        jLabel34.setText("Id Mascota:");
        jPanel10.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 106, -1, -1));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/pugbuscar.png"))); // NOI18N
        jPanel10.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 24, 180, -1));
        jPanel10.add(txtReporteIdHospedaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 59, 169, -1));
        jPanel10.add(txtReporteIdMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 101, 169, -1));

        btnReporteImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/impresion.png"))); // NOI18N
        btnReporteImprimir.setText("Imprimir");
        btnReporteImprimir.setBorderPainted(false);
        jPanel10.add(btnReporteImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        javax.swing.GroupLayout DlgReporteHospedajeLayout = new javax.swing.GroupLayout(DlgReporteHospedaje.getContentPane());
        DlgReporteHospedaje.getContentPane().setLayout(DlgReporteHospedajeLayout);
        DlgReporteHospedajeLayout.setHorizontalGroup(
            DlgReporteHospedajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
        );
        DlgReporteHospedajeLayout.setVerticalGroup(
            DlgReporteHospedajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DlgReporteHospedajeLayout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBackground(new java.awt.Color(51, 51, 51));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Hospedaje");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/4x16.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/agregar.png"))); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.setBorderPainted(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, -1, -1));

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/editar-documento (1).png"))); // NOI18N
        btnEditar.setText("MODIFICAR");
        btnEditar.setBorderPainted(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, -1, -1));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/basura.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorderPainted(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 50, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BUSCAR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 68, -1, -1));
        jPanel1.add(TxtBuscarH, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 60, 240, 32));

        jLabel27.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(126, 197, 68));
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/imagen.png"))); // NOI18N
        jLabel27.setText("Hospedaje");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 15, -1, -1));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/informacion.png"))); // NOI18N
        jLabel36.setToolTipText("Ingrese en el cuadro de busqueda el codigo del hospedaje");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, -1));

        jPanel4.setBackground(new java.awt.Color(238, 121, 3));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla_hospedaje.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Hospedaje", "Codigo Mascota", "Codigo Celda", "Fecha Ingreso", "Fecha Salida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_hospedaje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(tabla_hospedaje);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, 640, 270));

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/impresion.png"))); // NOI18N
        btnImprimir.setText("IMPRIMIR");
        btnImprimir.setBorderPainted(false);
        btnImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 119, -1, -1));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/pngegg (15).png"))); // NOI18N
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, 330, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_UbiCeldaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_UbiCeldaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_UbiCeldaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog DialogCelda;
    private javax.swing.JDialog DialogMascota;
    private javax.swing.JDialog DlgReporteHospedaje;
    private com.toedter.calendar.JDateChooser FechaIngreso;
    private com.toedter.calendar.JDateChooser FechaSalida;
    private javax.swing.JTextField TxtBuscarH;
    private javax.swing.JTextField Txt_Buscar;
    private javax.swing.JTextField Txt_IDCelda;
    private javax.swing.JTextField Txt_UbiCelda;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnBuscarCelda;
    private javax.swing.JButton btnBuscarMascota;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnReporteImprimir;
    private javax.swing.JButton btn_AgregarCel;
    private javax.swing.JButton btn_AgregarT;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JDialog dlgHospedaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lb_CeldaV;
    private javax.swing.JLabel lb_HospedajeV2;
    private javax.swing.JLabel lb_MascotaV;
    private javax.swing.JLabel lb_costoV;
    private javax.swing.JLabel lb_idCeldaV;
    private javax.swing.JLabel lb_ubicacionV;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JSpinner spCostoCelda;
    private javax.swing.JTable tabla_Mascotas;
    private javax.swing.JTable tabla_hospedaje;
    private javax.swing.JTable tblCelda;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCodCelda;
    private javax.swing.JTextField txtCodHospedaje;
    private javax.swing.JTextField txtCodMascota;
    private javax.swing.JTextField txtCodigoCelda;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtNombreMas;
    private javax.swing.JTextField txtRaza;
    private javax.swing.JTextField txtReporteIdHospedaje;
    private javax.swing.JTextField txtReporteIdMascota;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextArea txtUbicacion;
    // End of variables declaration//GEN-END:variables

    public Object getTxtTelefonoClie() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
