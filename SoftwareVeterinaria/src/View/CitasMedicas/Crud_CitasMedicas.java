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

    public JDateChooser getDcFiltroFecha() {
        return dcFiltroFecha;
    }

    public void setDcFiltroFecha(JDateChooser dcFiltroFecha) {
        this.dcFiltroFecha = dcFiltroFecha;
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

    public JButton getBtnVerCita() {
        return btnVerCita;
    }

    public void setBtnVerCita(JButton btnVerCita) {
        this.btnVerCita = btnVerCita;
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

    public JTable getTblCitasMedicas() {
        return tblCitasMedicas;
    }

    public void setTblCitasMedicas(JTable tblCitasMedicas) {
        this.tblCitasMedicas = tblCitasMedicas;
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

    public JTextField getTxtTelefonoClienteCita() {
        return txtTelefonoClienteCita;
    }

    public void setTxtTelefonoClienteCita(JTextField txtTelefonoClienteCita) {
        this.txtTelefonoClienteCita = txtTelefonoClienteCita;
    }

    public JTextField getTxtVerApellidoCliente() {
        return txtVerApellidoCliente;
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

    public void setTxtVerHoraCita(JTextField txtVerHoraCita) {
        this.txtVerHoraCita = txtVerHoraCita;
    }

    public JTextField getTxtVerIDVeterinario() {
        return txtVerIDVeterinario;
    }

    public void setTxtVerIDVeterinario(JTextField txtVerIDVeterinario) {
        this.txtVerIDVeterinario = txtVerIDVeterinario;
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtVerIDVeterinario = new javax.swing.JTextField();
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
        DlgAgregar = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
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
        jTextField18 = new javax.swing.JTextField();
        txtNombreClienteCita = new javax.swing.JTextField();
        bttAgregarClienteCita = new javax.swing.JButton();
        bttAgregarMedicoCita = new javax.swing.JButton();
        btnAceptarCita = new javax.swing.JButton();
        btnCancelarCita = new javax.swing.JButton();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscarCita = new javax.swing.JTextField();
        dcFiltroFecha = new com.toedter.calendar.JDateChooser();
        jLabel32 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnVerCita = new javax.swing.JButton();
        btnCrearCita = new javax.swing.JButton();
        btnModificarCita = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnEliminarCita = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCitasMedicas = new javax.swing.JTable();
        jLabel33 = new javax.swing.JLabel();
        cbEstadoCita = new javax.swing.JComboBox<>();

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("DATOS DE LA CITA MEDICA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(184, 184, 184))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(21, 21, 21))
        );

        jLabel4.setText("DATOS DE EL USUARIO:");

        jLabel5.setText("ID CITA MEDICA:");

        jLabel6.setText("Veterinario:");

        jLabel7.setText("ID Veterinario:");

        jLabel8.setText("Apellido:");

        jLabel9.setText("Nombre:");

        jLabel10.setText("Mascota:");

        jLabel11.setText("Fecha Solicitud:");

        jLabel12.setText("Hora:");

        jLabel13.setText("Telefono:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIdCitaMedica, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel10))
                                        .addGap(47, 47, 47))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(51, 51, 51)))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtVerMascotaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtVerApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtVerNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtVerTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtVerNombreVeterinario, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(txtVerIDVeterinario)
                            .addComponent(txtVerFechaSolicitud)
                            .addComponent(txtVerHoraCita))
                        .addGap(36, 36, 36))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel7))
                            .addComponent(txtVerIDVeterinario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtVerNombreVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVerFechaSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtVerHoraCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtIdCitaMedica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtVerNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtVerApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtVerMascotaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(txtVerTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DlgVistaLayout = new javax.swing.GroupLayout(DlgVista.getContentPane());
        DlgVista.getContentPane().setLayout(DlgVistaLayout);
        DlgVistaLayout.setHorizontalGroup(
            DlgVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(DlgVistaLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        DlgVistaLayout.setVerticalGroup(
            DlgVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DlgVistaLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel14.setText("CREAR/EDITAR CITA MEDICA");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(24, 24, 24))
        );

        jLabel15.setText("ID Cita:");

        jLabel16.setText("ID Medico:");

        jLabel17.setText("ID Cliente:");

        jLabel18.setText("Fecha Solicitud");

        jLabel19.setText("CREO QUE AQUI VA LA FEHCA ACTUAL");

        jLabel20.setText("Fecha Cita:");

        jLabel21.setText("Hora:");

        Hora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7:00 am a 8:00 am", "8:00 am a 9:00 am", "9:00 am a 10:00 am", "10:00 am a 11:00 am", "11:00 am a 12:00 pm", "12:00 pm a 13:00 pm", "14:00 pm a 15:00 pm", "15:00 pm a 16:00 pm", "16:00 pm a 17:00 pm", "17:00 pm a 18:00 pm", " " }));

        jLabel22.setText("Nombre:");

        jLabel23.setText("Nombre:");

        jLabel24.setText("Apellido:");

        jLabel25.setText("Telefono:");

        jLabel26.setText("Apellido:");

        jLabel27.setText("Especialidad:");

        bttAgregarClienteCita.setText("...");

        bttAgregarMedicoCita.setText("...");

        btnAceptarCita.setText("Aceptar");

        btnCancelarCita.setText("Cancelar");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel21)
                            .addComponent(jLabel20))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(FechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(177, 177, 177)
                                .addComponent(btnAceptarCita)
                                .addGap(60, 60, 60)
                                .addComponent(btnCancelarCita)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel22)
                                        .addComponent(jLabel26))
                                    .addGap(38, 38, 38))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel27)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                    .addComponent(txtEspecialidadCita, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(txtIdMedicoCita, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bttAgregarMedicoCita)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel23))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApellidoClienteCita, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefonoClienteCita, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreClienteCita, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bttAgregarClienteCita)))
                                .addGap(91, 91, 91))))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtIdCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
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
                            .addComponent(jLabel17)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bttAgregarClienteCita))
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
                .addGap(33, 33, 33)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGap(24, 24, 24)
                        .addComponent(jLabel20))
                    .addComponent(FechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptarCita)
                    .addComponent(btnCancelarCita))
                .addContainerGap(53, Short.MAX_VALUE))
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
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel28.setText("VETERINARIO");

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
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        tblBuscarVeterinario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Veterinario", "Nombre", "Apellido", "Especialidad"
            }
        ));
        jScrollPane2.setViewportView(tblBuscarVeterinario);

        btnAgregarVeterinario.setText("Agregar");

        btnLimpiarVeterinario.setText("Limpiar");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(577, Short.MAX_VALUE)
                .addComponent(btnAgregarVeterinario)
                .addGap(28, 28, 28)
                .addComponent(btnLimpiarVeterinario)
                .addGap(59, 59, 59))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarVeterinario)
                    .addComponent(btnLimpiarVeterinario))
                .addContainerGap(18, Short.MAX_VALUE))
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
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel30.setText("Cliente");

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

        btnLimpiarCliente.setText("Limpiar");

        btnAgregarCliente.setText("Agregar");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpiarCliente)
                .addGap(56, 56, 56))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                    .addContainerGap(651, Short.MAX_VALUE)
                    .addComponent(btnAgregarCliente)
                    .addGap(160, 160, 160)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpiarCliente)
                .addGap(31, 31, 31))
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                    .addContainerGap(295, Short.MAX_VALUE)
                    .addComponent(btnAgregarCliente)
                    .addGap(30, 30, 30)))
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

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Citas Medicas");

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

        jLabel32.setText("Fecha:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(714, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel32)
                        .addGap(18, 18, 18)
                        .addComponent(dcFiltroFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(248, 248, 248))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtBuscarCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel32))
                    .addComponent(dcFiltroFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnVerCita.setText("VER");

        btnCrearCita.setText("CREAR");

        btnModificarCita.setText("MODIFICAR");

        btnImprimir.setText("IMPRIMIR GENERAL");

        btnEliminarCita.setText("ELIMINAR");

        tblCitasMedicas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID CITA", "ID MEDICO", "ID CLIENTE", "FECHA SOLICITUD", "HORA", "ESTADO"
            }
        ));
        jScrollPane1.setViewportView(tblCitasMedicas);

        jLabel33.setText("Estado  de la Cita:");

        cbEstadoCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Marcar Realizado", "Marcar Pendiente" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbEstadoCita, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVerCita)
                            .addComponent(btnCrearCita)
                            .addComponent(btnModificarCita)
                            .addComponent(btnEliminarCita)
                            .addComponent(btnImprimir))
                        .addGap(47, 47, 47))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnVerCita)
                        .addGap(18, 18, 18)
                        .addComponent(btnCrearCita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificarCita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminarCita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnImprimir)))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(cbEstadoCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2AncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog DlgAgregar;
    private javax.swing.JDialog DlgCliente;
    private javax.swing.JDialog DlgVista;
    private com.toedter.calendar.JDateChooser FechaCita;
    private javax.swing.JComboBox<String> Hora;
    private javax.swing.JButton btnAceptarCita;
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnAgregarVeterinario;
    private javax.swing.JTextField btnBuscarVeterinario;
    private javax.swing.JButton btnCancelarCita;
    private javax.swing.JButton btnCrearCita;
    private javax.swing.JButton btnEliminarCita;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLimpiarCliente;
    private javax.swing.JButton btnLimpiarVeterinario;
    private javax.swing.JButton btnModificarCita;
    private javax.swing.JButton btnVerCita;
    private javax.swing.JButton bttAgregarClienteCita;
    private javax.swing.JButton bttAgregarMedicoCita;
    private javax.swing.JComboBox<String> cbEstadoCita;
    private com.toedter.calendar.JDateChooser dcFiltroFecha;
    private javax.swing.JDialog dlgVeterinario;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
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
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTable tblAgregarCliente;
    private javax.swing.JTable tblBuscarVeterinario;
    private javax.swing.JTable tblCitasMedicas;
    private javax.swing.JTextField txtApellidoClienteCita;
    private javax.swing.JTextField txtApellidoVeterinarioCita;
    private javax.swing.JTextField txtBuscarCita;
    private javax.swing.JTextField txtBuscarCliente;
    private javax.swing.JTextField txtEspecialidadCita;
    private javax.swing.JTextField txtIdCita;
    private javax.swing.JTextField txtIdCitaMedica;
    private javax.swing.JTextField txtIdMedicoCita;
    private javax.swing.JTextField txtNombreClienteCita;
    private javax.swing.JTextField txtNombreVeterinarioCita;
    private javax.swing.JTextField txtTelefonoClienteCita;
    private javax.swing.JTextField txtVerApellidoCliente;
    private javax.swing.JTextField txtVerFechaSolicitud;
    private javax.swing.JTextField txtVerHoraCita;
    private javax.swing.JTextField txtVerIDVeterinario;
    private javax.swing.JTextField txtVerMascotaCliente;
    private javax.swing.JTextField txtVerNombreCliente;
    private javax.swing.JTextField txtVerNombreVeterinario;
    private javax.swing.JTextField txtVerTelefonoCliente;
    // End of variables declaration//GEN-END:variables
}
