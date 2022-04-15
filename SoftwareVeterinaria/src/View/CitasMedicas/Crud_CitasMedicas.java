/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.CitasMedicas;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author USUARIO
 */
public class Crud_CitasMedicas extends javax.swing.JInternalFrame {

    /**
     * Creates new form Crud_CitasMedicas
     */
    public Crud_CitasMedicas() {
        initComponents();
    }

    public JComboBox<String> getCbEstadoCita() {
        return cbEstadoCita;
    }

    public void setCbEstadoCita(JComboBox<String> cbEstadoCita) {
        this.cbEstadoCita = cbEstadoCita;
    }

    public JButton getBtnReporteImprimir() {
        return BtnReporteImprimir;
    }

    public void setBtnReporteImprimir(JButton BtnReporteImprimir) {
        this.BtnReporteImprimir = BtnReporteImprimir;
    }

    public JDialog getDlgReporteCitas() {
        return dlgReporteCitas;
    }

    public void setDlgReporteCitas(JDialog dlgReporteCitas) {
        this.dlgReporteCitas = dlgReporteCitas;
    }

    public JTextField getTxtReporteIdCliente() {
        return txtReporteIdCliente;
    }

    public void setTxtReporteIdCliente(JTextField txtReporteIdCliente) {
        this.txtReporteIdCliente = txtReporteIdCliente;
    }

    public JTextField getTxtReporteIdMedico() {
        return txtReporteIdMedico;
    }

    public void setTxtReporteIdMedico(JTextField txtReporteIdMedico) {
        this.txtReporteIdMedico = txtReporteIdMedico;
    }

    public JDateChooser getBusquedaFecha() {
        return BusquedaFecha;
    }

    public void setBusquedaFecha(JDateChooser BusquedaFecha) {
        this.BusquedaFecha = BusquedaFecha;
    }

    public JComboBox<String> getCBFechas() {
        return CBFechas;
    }

    public void setCBFechas(JComboBox<String> CBFechas) {
        this.CBFechas = CBFechas;
    }

    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    public void setBtnBuscar(JButton btnBuscar) {
        this.btnBuscar = btnBuscar;
    }

    public JDialog getDlgAgregar() {
        return DlgAgregar;
    }

    public void setDlgAgregar(JDialog DlgAgregar) {
        this.DlgAgregar = DlgAgregar;
    }

    public JDialog getDlgCliente() {
        return DlgCliente;
    }

    public JRadioButton getRbCumplido() {
        return rbCumplido;
    }

    public void setRbCumplido(JRadioButton rbCumplido) {
        this.rbCumplido = rbCumplido;
    }

    public JRadioButton getRbPorCumplir() {
        return rbPorCumplir;
    }

    public void setRbPorCumplir(JRadioButton rbPorCumplir) {
        this.rbPorCumplir = rbPorCumplir;
    }

    public void setDlgCliente(JDialog DlgCliente) {
        this.DlgCliente = DlgCliente;
    }

    public JDialog getDlgVista() {
        return DlgVista;
    }

    public void setDlgVista(JDialog DlgVista) {
        this.DlgVista = DlgVista;
    }

    public JDateChooser getFechaCita() {
        return FechaCita;
    }

    public void setFechaCita(JDateChooser FechaCita) {
        this.FechaCita = FechaCita;
    }

    public JComboBox<String> getHora() {
        return Hora;
    }

    public void setHora(JComboBox<String> Hora) {
        this.Hora = Hora;
    }

    public JButton getBtnAceptarCita() {
        return btnAceptarCita;
    }

    public void setBtnAceptarCita(JButton btnAceptarCita) {
        this.btnAceptarCita = btnAceptarCita;
    }

    public JButton getBtnAgregarCliente() {
        return btnAgregarCliente;
    }

    public void setBtnAgregarCliente(JButton btnAgregarCliente) {
        this.btnAgregarCliente = btnAgregarCliente;
    }

    public JButton getBtnAgregarVeterinario() {
        return btnAgregarVeterinario;
    }

    public void setBtnAgregarVeterinario(JButton btnAgregarVeterinario) {
        this.btnAgregarVeterinario = btnAgregarVeterinario;
    }

    public JTextField getBtnBuscarVeterinario() {
        return btnBuscarVeterinario;
    }

    public void setBtnBuscarVeterinario(JTextField btnBuscarVeterinario) {
        this.btnBuscarVeterinario = btnBuscarVeterinario;
    }

    public JButton getBtnCancelarCita() {
        return btnCancelarCita;
    }

    public void setBtnCancelarCita(JButton btnCancelarCita) {
        this.btnCancelarCita = btnCancelarCita;
    }

    public JButton getBtnCrearCita() {
        return btnCrearCita;
    }

    public void setBtnCrearCita(JButton btnCrearCita) {
        this.btnCrearCita = btnCrearCita;
    }

    public JButton getBtnEliminarCita() {
        return btnEliminarCita;
    }

    public void setBtnEliminarCita(JButton btnEliminarCita) {
        this.btnEliminarCita = btnEliminarCita;
    }

    public JButton getBtnImprimir() {
        return btnImprimir;
    }

    public void setBtnImprimir(JButton btnImprimir) {
        this.btnImprimir = btnImprimir;
    }

    public JButton getBtnLimpiarCliente() {
        return btnLimpiarCliente;
    }

    public void setBtnLimpiarCliente(JButton btnLimpiarCliente) {
        this.btnLimpiarCliente = btnLimpiarCliente;
    }

    public JButton getBtnLimpiarVeterinario() {
        return btnLimpiarVeterinario;
    }

    public void setBtnLimpiarVeterinario(JButton btnLimpiarVeterinario) {
        this.btnLimpiarVeterinario = btnLimpiarVeterinario;
    }

    public JButton getBtnModificarCita() {
        return btnModificarCita;
    }

    public void setBtnModificarCita(JButton btnModificarCita) {
        this.btnModificarCita = btnModificarCita;
    }

    public JButton getBttAgregarClienteCita() {
        return bttAgregarClienteCita;
    }

    public void setBttAgregarClienteCita(JButton bttAgregarClienteCita) {
        this.bttAgregarClienteCita = bttAgregarClienteCita;
    }

    public JButton getBttAgregarMedicoCita() {
        return bttAgregarMedicoCita;
    }

    public void setBttAgregarMedicoCita(JButton bttAgregarMedicoCita) {
        this.bttAgregarMedicoCita = bttAgregarMedicoCita;
    }

    public JDialog getDlgVeterinario() {
        return dlgVeterinario;
    }

    public void setDlgVeterinario(JDialog dlgVeterinario) {
        this.dlgVeterinario = dlgVeterinario;
    }

    public JTable getTblAgregarCliente() {
        return tblAgregarCliente;
    }

    public void setTblAgregarCliente(JTable tblAgregarCliente) {
        this.tblAgregarCliente = tblAgregarCliente;
    }

    public JTable getTblBuscarVeterinario() {
        return tblBuscarVeterinario;
    }

    public void setTblBuscarVeterinario(JTable tblBuscarVeterinario) {
        this.tblBuscarVeterinario = tblBuscarVeterinario;
    }

    public JTable getTblCitas() {
        return tblCitas;
    }

    public void setTblCitas(JTable tblCitas) {
        this.tblCitas = tblCitas;
    }

    public JTextField getTxtApellidoClienteCita() {
        return txtApellidoClienteCita;
    }

    public void setTxtApellidoClienteCita(JTextField txtApellidoClienteCita) {
        this.txtApellidoClienteCita = txtApellidoClienteCita;
    }

    public JTextField getTxtApellidoVeterinarioCita() {
        return txtApellidoVeterinarioCita;
    }

    public void setTxtApellidoVeterinarioCita(JTextField txtApellidoVeterinarioCita) {
        this.txtApellidoVeterinarioCita = txtApellidoVeterinarioCita;
    }

    public JTextField getTxtBuscarCita() {
        return txtBuscarCita;
    }

    public void setTxtBuscarCita(JTextField txtBuscarCita) {
        this.txtBuscarCita = txtBuscarCita;
    }

    public JTextField getTxtBuscarCliente() {
        return txtBuscarCliente;
    }

    public void setTxtBuscarCliente(JTextField txtBuscarCliente) {
        this.txtBuscarCliente = txtBuscarCliente;
    }

    public JTextField getTxtEspecialidadCita() {
        return txtEspecialidadCita;
    }

    public void setTxtEspecialidadCita(JTextField txtEspecialidadCita) {
        this.txtEspecialidadCita = txtEspecialidadCita;
    }

    public JTextField getTxtIdCita() {
        return txtIdCita;
    }

    public void setTxtIdCita(JTextField txtIdCita) {
        this.txtIdCita = txtIdCita;
    }

    public JTextField getTxtIdCitaMedica() {
        return txtIdCitaMedica;
    }

    public void setTxtIdCitaMedica(JTextField txtIdCitaMedica) {
        this.txtIdCitaMedica = txtIdCitaMedica;
    }

    public JTextField getTxtIdMedicoCita() {
        return txtIdMedicoCita;
    }

    public void setTxtIdMedicoCita(JTextField txtIdMedicoCita) {
        this.txtIdMedicoCita = txtIdMedicoCita;
    }

    public JTextField getTxtNombreClienteCita() {
        return txtNombreClienteCita;
    }

    public void setTxtNombreClienteCita(JTextField txtNombreClienteCita) {
        this.txtNombreClienteCita = txtNombreClienteCita;
    }

    public JTextField getTxtNombreVeterinarioCita() {
        return txtNombreVeterinarioCita;
    }

    public void setTxtNombreVeterinarioCita(JTextField txtNombreVeterinarioCita) {
        this.txtNombreVeterinarioCita = txtNombreVeterinarioCita;
    }

    public JTextField getTxtIdClienteCita() {
        return txtIdClienteCita;
    }

    public void setTxtIdClienteCita(JTextField txtIdClienteCita) {
        this.txtIdClienteCita = txtIdClienteCita;
    }

    public JTextField getTxtTelefonoClienteCita() {
        return txtTelefonoClienteCita;
    }

    public void setTxtTelefonoClienteCita(JTextField txtTelefonoClienteCita) {
        this.txtTelefonoClienteCita = txtTelefonoClienteCita;
    }

    public JTextField getTxtVerApellidoCliente() {
        return txtVerApellidoCliente;
    }

    public JDateChooser getFecha1() {
        return Fecha1;
    }

    public void setFecha1(JDateChooser Fecha1) {
        this.Fecha1 = Fecha1;
    }

    public JDateChooser getFecha2() {
        return Fecha2;
    }

    public void setFecha2(JDateChooser Fecha2) {
        this.Fecha2 = Fecha2;
    }

    public JButton getBtnBuscar2() {
        return btnBuscar2;
    }

    public void setBtnBuscar2(JButton btnBuscar2) {
        this.btnBuscar2 = btnBuscar2;
    }

    public void setTxtVerApellidoCliente(JTextField txtVerApellidoCliente) {
        this.txtVerApellidoCliente = txtVerApellidoCliente;
    }

    public JTextField getTxtVerFechaSolicitud() {
        return txtVerFechaSolicitud;
    }

    public void setTxtVerFechaSolicitud(JTextField txtVerFechaSolicitud) {
        this.txtVerFechaSolicitud = txtVerFechaSolicitud;
    }

    public JTextField getTxtVerHoraCita() {
        return txtVerHoraCita;
    }

    public JTextField getTxtVerApellidoVet() {
        return txtVerApellidoVet;
    }

    public JButton getBtnCerrar() {
        return btnCerrar;
    }

    public void setBtnCerrar(JButton btnCerrar) {
        this.btnCerrar = btnCerrar;
    }

    public void setTxtVerApellidoVet(JTextField txtVerApellidoVet) {
        this.txtVerApellidoVet = txtVerApellidoVet;
    }

    public void setTxtVerHoraCita(JTextField txtVerHoraCita) {
        this.txtVerHoraCita = txtVerHoraCita;
    }

    public JTextField getTxtFechaCita() {
        return txtFechaCita;
    }

    public void setTxtFechaCita(JTextField txtFechaCita) {
        this.txtFechaCita = txtFechaCita;
    }

    public JTextField getTxtVerMascotaCliente() {
        return txtVerMascotaCliente;
    }

    public void setTxtVerMascotaCliente(JTextField txtVerMascotaCliente) {
        this.txtVerMascotaCliente = txtVerMascotaCliente;
    }

    public JTextField getTxtVerNombreCliente() {
        return txtVerNombreCliente;
    }

    public void setTxtVerNombreCliente(JTextField txtVerNombreCliente) {
        this.txtVerNombreCliente = txtVerNombreCliente;
    }

    public JTextField getTxtVerNombreVeterinario() {
        return txtVerNombreVeterinario;
    }

    public void setTxtVerNombreVeterinario(JTextField txtVerNombreVeterinario) {
        this.txtVerNombreVeterinario = txtVerNombreVeterinario;
    }

    public JTextField getTxtVerTelefonoCliente() {
        return txtVerTelefonoCliente;
    }

    public void setTxtVerTelefonoCliente(JTextField txtVerTelefonoCliente) {
        this.txtVerTelefonoCliente = txtVerTelefonoCliente;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DlgVista = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdCitaMedica = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtVerNombreVeterinario = new javax.swing.JTextField();
        txtVerApellidoCliente = new javax.swing.JTextField();
        txtVerMascotaCliente = new javax.swing.JTextField();
        txtVerNombreCliente = new javax.swing.JTextField();
        txtVerFechaSolicitud = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtVerHoraCita = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtVerTelefonoCliente = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtFechaCita = new javax.swing.JTextField();
        txtVerApellidoVet = new javax.swing.JTextField();
        btnCerrar = new javax.swing.JButton();
        DlgAgregar = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        FechaCita = new com.toedter.calendar.JDateChooser();
        jLabel21 = new javax.swing.JLabel();
        Hora = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtNombreVeterinarioCita = new javax.swing.JTextField();
        txtIdCita = new javax.swing.JTextField();
        txtApellidoVeterinarioCita = new javax.swing.JTextField();
        txtEspecialidadCita = new javax.swing.JTextField();
        txtApellidoClienteCita = new javax.swing.JTextField();
        txtIdMedicoCita = new javax.swing.JTextField();
        txtTelefonoClienteCita = new javax.swing.JTextField();
        txtIdClienteCita = new javax.swing.JTextField();
        txtNombreClienteCita = new javax.swing.JTextField();
        bttAgregarClienteCita = new javax.swing.JButton();
        bttAgregarMedicoCita = new javax.swing.JButton();
        btnAceptarCita = new javax.swing.JButton();
        btnCancelarCita = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        rbCumplido = new javax.swing.JRadioButton();
        rbPorCumplir = new javax.swing.JRadioButton();
        dlgVeterinario = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        btnBuscarVeterinario = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBuscarVeterinario = new javax.swing.JTable();
        btnAgregarVeterinario = new javax.swing.JButton();
        btnLimpiarVeterinario = new javax.swing.JButton();
        DlgCliente = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtBuscarCliente = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        btnLimpiarCliente = new javax.swing.JButton();
        btnAgregarCliente = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAgregarCliente = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        dlgReporteCitas = new javax.swing.JDialog();
        jPanel15 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        BtnReporteImprimir = new javax.swing.JButton();
        txtReporteIdMedico = new javax.swing.JTextField();
        txtReporteIdCliente = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnCrearCita = new javax.swing.JButton();
        btnModificarCita = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnEliminarCita = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCitas = new javax.swing.JTable();
        jLabel33 = new javax.swing.JLabel();
        cbEstadoCita = new javax.swing.JComboBox<>();
        jPanel12 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        CBFechas = new javax.swing.JComboBox<>();
        BusquedaFecha = new com.toedter.calendar.JDateChooser();
        btnBuscar = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        txtBuscarCita = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        Fecha1 = new com.toedter.calendar.JDateChooser();
        Fecha2 = new com.toedter.calendar.JDateChooser();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        btnBuscar2 = new javax.swing.JButton();

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(126, 197, 68));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/calendario.png"))); // NOI18N
        jLabel3.setText("DATOS DE LA CITA MEDICA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(167, 167, 167))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(21, 21, 21))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel4.setText("DATOS DE  USUARIO");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel5.setText("CODIGO DE CITA:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));
        jPanel4.add(txtIdCitaMedica, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 80, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel6.setText(" Veterinario:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel8.setText("Apellido:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel9.setText("Nombre:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel10.setText("Direccion:");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));
        jPanel4.add(txtVerNombreVeterinario, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 150, -1));
        jPanel4.add(txtVerApellidoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 200, -1));
        jPanel4.add(txtVerMascotaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 200, -1));
        jPanel4.add(txtVerNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 200, -1));
        jPanel4.add(txtVerFechaSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 160, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel11.setText("Fecha de solicitud:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel12.setText("Hora:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, -1));
        jPanel4.add(txtVerHoraCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 160, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel13.setText("Telefono:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));
        jPanel4.add(txtVerTelefonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 200, -1));

        jLabel32.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel32.setText("DATOS DE LA CITA");
        jPanel4.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, -1, -1));

        jLabel35.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel35.setText("Fecha de cita:");
        jPanel4.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));
        jPanel4.add(txtFechaCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 160, -1));
        jPanel4.add(txtVerApellidoVet, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 140, -1));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/cerrar-sesion32.png"))); // NOI18N
        btnCerrar.setText("SALIR");
        jPanel4.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, -1, -1));

        javax.swing.GroupLayout DlgVistaLayout = new javax.swing.GroupLayout(DlgVista.getContentPane());
        DlgVista.getContentPane().setLayout(DlgVistaLayout);
        DlgVistaLayout.setHorizontalGroup(
            DlgVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        DlgVistaLayout.setVerticalGroup(
            DlgVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DlgVistaLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        jLabel14.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(126, 197, 68));
        jLabel14.setText("CREAR/EDITAR CITA MEDICA");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(15, 15, 15))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel15.setText("ID Cita:");

        jLabel16.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel16.setText("ID Medico:");

        jLabel17.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel17.setText("ID Cliente:");

        jLabel20.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel20.setText("Fecha Cita:");

        jLabel21.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel21.setText("Hora:");

        Hora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione una hora", "7:00 am a 8:00 am", "8:00 am a 9:00 am", "9:00 am a 10:00 am", "10:00 am a 11:00 am", "11:00 am a 12:00 pm", "12:00 pm a 13:00 pm", "14:00 pm a 15:00 pm", "15:00 pm a 16:00 pm", "16:00 pm a 17:00 pm", "17:00 pm a 18:00 pm" }));

        jLabel22.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel22.setText("Nombre:");

        jLabel23.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel23.setText("Nombre:");

        jLabel24.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel24.setText("Apellido:");

        jLabel25.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel25.setText("Telefono:");

        jLabel26.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel26.setText("Apellido:");

        jLabel27.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel27.setText("Especialidad:");

        bttAgregarClienteCita.setText("...");

        bttAgregarMedicoCita.setText("...");

        btnAceptarCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/agregar-archivo.png"))); // NOI18N
        btnAceptarCita.setText("Aceptar");

        btnCancelarCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/cancelar.png"))); // NOI18N
        btnCancelarCita.setText("Cancelar");

        jLabel41.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel41.setText("Estado Cita");

        rbCumplido.setText("Cumplido");

        rbPorCumplir.setText("Por cumplir");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel20))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(177, 177, 177)
                                .addComponent(btnAceptarCita)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelarCita))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(FechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel41)
                                .addGap(18, 18, 18)
                                .addComponent(rbCumplido)
                                .addGap(18, 18, 18)
                                .addComponent(rbPorCumplir)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel15))
                                .addGap(29, 29, 29)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txtIdCita, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApellidoVeterinarioCita, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreVeterinarioCita, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(txtIdMedicoCita, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bttAgregarMedicoCita))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtEspecialidadCita, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel17))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApellidoClienteCita, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefonoClienteCita, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreClienteCita, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(txtIdClienteCita, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bttAgregarClienteCita)))
                                .addGap(94, 94, 94))))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtIdCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(txtIdMedicoCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bttAgregarMedicoCita))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22)
                                    .addComponent(txtNombreVeterinarioCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26)
                                    .addComponent(txtApellidoVeterinarioCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtEspecialidadCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtIdClienteCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bttAgregarClienteCita)
                                    .addComponent(jLabel17))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23)
                                    .addComponent(txtNombreClienteCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel24)
                                    .addComponent(txtApellidoClienteCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel25)
                                    .addComponent(txtTelefonoClienteCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20)
                            .addComponent(FechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel41)
                        .addComponent(rbCumplido)
                        .addComponent(rbPorCumplir)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptarCita)
                    .addComponent(btnCancelarCita))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DlgAgregarLayout = new javax.swing.GroupLayout(DlgAgregar.getContentPane());
        DlgAgregar.getContentPane().setLayout(DlgAgregarLayout);
        DlgAgregarLayout.setHorizontalGroup(
            DlgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DlgAgregarLayout.setVerticalGroup(
            DlgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DlgAgregarLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));

        jLabel28.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(126, 197, 68));
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/5x16.png"))); // NOI18N
        jLabel28.setText("VETERINARIO");

        jLabel29.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Buscar:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscarVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        tblBuscarVeterinario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Veterinario", "Nombre", "Apellido", "Especialidad"
            }
        ));
        jScrollPane2.setViewportView(tblBuscarVeterinario);

        btnAgregarVeterinario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/agregar-archivo.png"))); // NOI18N
        btnAgregarVeterinario.setText("Agregar");
        btnAgregarVeterinario.setBorderPainted(false);
        btnAgregarVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarVeterinarioActionPerformed(evt);
            }
        });

        btnLimpiarVeterinario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/codigo-limpio.png"))); // NOI18N
        btnLimpiarVeterinario.setText("Limpiar");
        btnLimpiarVeterinario.setBorderPainted(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregarVeterinario)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiarVeterinario)
                .addGap(76, 76, 76))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 827, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarVeterinario)
                    .addComponent(btnLimpiarVeterinario))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dlgVeterinarioLayout = new javax.swing.GroupLayout(dlgVeterinario.getContentPane());
        dlgVeterinario.getContentPane().setLayout(dlgVeterinarioLayout);
        dlgVeterinarioLayout.setHorizontalGroup(
            dlgVeterinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dlgVeterinarioLayout.setVerticalGroup(
            dlgVeterinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgVeterinarioLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));

        jLabel30.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(126, 197, 68));
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/8x16.png"))); // NOI18N
        jLabel30.setText("Cliente");

        jLabel31.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Buscar:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel30))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setForeground(new java.awt.Color(255, 255, 255));

        btnLimpiarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/codigo-limpio.png"))); // NOI18N
        btnLimpiarCliente.setText("Limpiar");
        btnLimpiarCliente.setBorderPainted(false);

        btnAgregarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/agregar-archivo.png"))); // NOI18N
        btnAgregarCliente.setText("Agregar");
        btnAgregarCliente.setBorderPainted(false);

        tblAgregarCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Cliente", "Nombre", "Apellido", "Telefono"
            }
        ));
        jScrollPane3.setViewportView(tblAgregarCliente);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarCliente)
                        .addGap(23, 23, 23)
                        .addComponent(btnLimpiarCliente))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarCliente)
                    .addComponent(btnLimpiarCliente))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DlgClienteLayout = new javax.swing.GroupLayout(DlgCliente.getContentPane());
        DlgCliente.getContentPane().setLayout(DlgClienteLayout);
        DlgClienteLayout.setHorizontalGroup(
            DlgClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DlgClienteLayout.setVerticalGroup(
            DlgClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DlgClienteLayout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel15.setBackground(new java.awt.Color(51, 51, 51));

        jLabel18.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 204, 0));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/seo.png"))); // NOI18N
        jLabel18.setText("Parametros para Imprimir");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(26, 26, 26))
        );

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/pugbuscar.png"))); // NOI18N
        jPanel16.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 180, -1));

        jLabel42.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel42.setText("Buscar por:");
        jPanel16.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel44.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel44.setText("ID Medico:");
        jPanel16.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel45.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel45.setText("ID Cliente:");
        jPanel16.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        BtnReporteImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/impresion.png"))); // NOI18N
        BtnReporteImprimir.setText("Imprimir");
        BtnReporteImprimir.setBorderPainted(false);
        jPanel16.add(BtnReporteImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));
        jPanel16.add(txtReporteIdMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 155, -1));
        jPanel16.add(txtReporteIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 155, -1));

        javax.swing.GroupLayout dlgReporteCitasLayout = new javax.swing.GroupLayout(dlgReporteCitas.getContentPane());
        dlgReporteCitas.getContentPane().setLayout(dlgReporteCitasLayout);
        dlgReporteCitasLayout.setHorizontalGroup(
            dlgReporteCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
        );
        dlgReporteCitasLayout.setVerticalGroup(
            dlgReporteCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgReporteCitasLayout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setClosable(true);
        setIconifiable(true);
        setTitle("Citas Medicas");
        setToolTipText("");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/2x16.png"))); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(126, 197, 68));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/calendario (2).png"))); // NOI18N
        jLabel1.setText("Citas Medicas");

        jLabel7.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("FILTROS DE BUSQUEDA DE CITAS MEDICAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(jLabel7)))
                .addContainerGap(257, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 100));

        jPanel2.setBackground(new java.awt.Color(251, 118, 33));

        btnCrearCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/agregar.png"))); // NOI18N
        btnCrearCita.setText("CREAR");
        btnCrearCita.setBorderPainted(false);

        btnModificarCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/editar-documento (1).png"))); // NOI18N
        btnModificarCita.setText("MODIFICAR");
        btnModificarCita.setBorderPainted(false);

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/impresion.png"))); // NOI18N
        btnImprimir.setText("IMPRIMIR GENERAL");
        btnImprimir.setBorderPainted(false);

        btnEliminarCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/basura.png"))); // NOI18N
        btnEliminarCita.setText("ELIMINAR");
        btnEliminarCita.setBorderPainted(false);

        tblCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID CITA", "ID MEDICO", "ID CLIENTE", "FECHA SOLICITUD", "FECHA CITA", "HORA", "ESTADO"
            }
        ));
        jScrollPane1.setViewportView(tblCitas);

        jLabel33.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel33.setText("Estado  de la Cita:");

        cbEstadoCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Marcar Realizado", "Marcar Pendiente" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbEstadoCita, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(610, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCrearCita)
                    .addComponent(btnModificarCita)
                    .addComponent(btnEliminarCita)
                    .addComponent(btnImprimir))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(cbEstadoCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btnCrearCita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificarCita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarCita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnImprimir)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 940, 260));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CBFechas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Citas de hoy", "-Todos las citas", "-Buscar por fecha" }));
        jPanel11.add(CBFechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 110, -1));
        jPanel11.add(BusquedaFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 144, 30));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/lupa.png"))); // NOI18N
        jPanel11.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 40, 50));

        jLabel37.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Busqueda por fecha especifica");
        jPanel11.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        jPanel13.setBackground(new java.awt.Color(51, 51, 51));
        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Buscar:");
        jLabel2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel36.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Busqueda por codigos");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addGap(0, 50, Short.MAX_VALUE))
                    .addComponent(txtBuscarCita))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(22, 22, 22))
        );

        jPanel14.setBackground(new java.awt.Color(51, 51, 51));
        jPanel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel14.setForeground(new java.awt.Color(255, 255, 255));

        jLabel34.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Busqueda por rangos de fechas ");

        jLabel38.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Desde");

        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText(":");

        jLabel40.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Hasta");

        btnBuscar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/lupa.png"))); // NOI18N

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel34)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel39)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addGap(33, 33, 33)))
                .addComponent(btnBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(jLabel39)
                            .addComponent(jLabel40))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnBuscar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 940, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2AncestorAdded

    private void btnAgregarVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarVeterinarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarVeterinarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnReporteImprimir;
    private com.toedter.calendar.JDateChooser BusquedaFecha;
    private javax.swing.JComboBox<String> CBFechas;
    private javax.swing.JDialog DlgAgregar;
    private javax.swing.JDialog DlgCliente;
    private javax.swing.JDialog DlgVista;
    private com.toedter.calendar.JDateChooser Fecha1;
    private com.toedter.calendar.JDateChooser Fecha2;
    private com.toedter.calendar.JDateChooser FechaCita;
    private javax.swing.JComboBox<String> Hora;
    private javax.swing.JButton btnAceptarCita;
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnAgregarVeterinario;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscar2;
    private javax.swing.JTextField btnBuscarVeterinario;
    private javax.swing.JButton btnCancelarCita;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnCrearCita;
    private javax.swing.JButton btnEliminarCita;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLimpiarCliente;
    private javax.swing.JButton btnLimpiarVeterinario;
    private javax.swing.JButton btnModificarCita;
    private javax.swing.JButton bttAgregarClienteCita;
    private javax.swing.JButton bttAgregarMedicoCita;
    private javax.swing.JComboBox<String> cbEstadoCita;
    private javax.swing.JDialog dlgReporteCitas;
    private javax.swing.JDialog dlgVeterinario;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
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
    private javax.swing.JRadioButton rbCumplido;
    private javax.swing.JRadioButton rbPorCumplir;
    private javax.swing.JTable tblAgregarCliente;
    private javax.swing.JTable tblBuscarVeterinario;
    private javax.swing.JTable tblCitas;
    private javax.swing.JTextField txtApellidoClienteCita;
    private javax.swing.JTextField txtApellidoVeterinarioCita;
    private javax.swing.JTextField txtBuscarCita;
    private javax.swing.JTextField txtBuscarCliente;
    private javax.swing.JTextField txtEspecialidadCita;
    private javax.swing.JTextField txtFechaCita;
    private javax.swing.JTextField txtIdCita;
    private javax.swing.JTextField txtIdCitaMedica;
    private javax.swing.JTextField txtIdClienteCita;
    private javax.swing.JTextField txtIdMedicoCita;
    private javax.swing.JTextField txtNombreClienteCita;
    private javax.swing.JTextField txtNombreVeterinarioCita;
    private javax.swing.JTextField txtReporteIdCliente;
    private javax.swing.JTextField txtReporteIdMedico;
    private javax.swing.JTextField txtTelefonoClienteCita;
    private javax.swing.JTextField txtVerApellidoCliente;
    private javax.swing.JTextField txtVerApellidoVet;
    private javax.swing.JTextField txtVerFechaSolicitud;
    private javax.swing.JTextField txtVerHoraCita;
    private javax.swing.JTextField txtVerMascotaCliente;
    private javax.swing.JTextField txtVerNombreCliente;
    private javax.swing.JTextField txtVerNombreVeterinario;
    private javax.swing.JTextField txtVerTelefonoCliente;
    // End of variables declaration//GEN-END:variables
}
