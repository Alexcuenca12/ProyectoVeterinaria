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
        txtIdClienteCita = new javax.swing.JTextField();
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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
        jLabel7 = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("DATOS DE LA CITA MEDICA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(23, 23, 23))
        );

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("DATOS DE  USUARIO");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        jLabel5.setText("CODIGO DE CITA:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));
        jPanel4.add(txtIdCitaMedica, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 80, 30));

        jLabel6.setText(" Veterinario:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, -1, -1));

        jLabel8.setText("Apellido:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel9.setText("Nombre:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel10.setText("Mascota:");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));
        jPanel4.add(txtVerNombreVeterinario, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 150, -1));
        jPanel4.add(txtVerApellidoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 200, -1));
        jPanel4.add(txtVerMascotaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 200, -1));
        jPanel4.add(txtVerNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 200, -1));
        jPanel4.add(txtVerFechaSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 160, -1));

        jLabel11.setText("Fecha de solicitud:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        jLabel12.setText("Hora:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, -1));
        jPanel4.add(txtVerHoraCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 160, -1));

        jLabel13.setText("Telefono:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));
        jPanel4.add(txtVerTelefonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 200, -1));

        jLabel32.setText("DATOS DE LA CITA");
        jPanel4.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, -1, -1));

        jLabel35.setText("Fecha de cita:");
        jPanel4.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));
        jPanel4.add(txtFechaCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 160, -1));
        jPanel4.add(txtVerApellidoVet, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 140, -1));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/cerrar-sesion32.png"))); // NOI18N
        btnCerrar.setText("SALIR");
        jPanel4.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, -1, -1));

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

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel14.setText("CREAR/EDITAR CITA MEDICA");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel14)
                .addContainerGap(409, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(24, 24, 24))
        );

        jLabel15.setText("ID Cita:");

        jLabel16.setText("ID Medico:");

        jLabel17.setText("ID Cliente:");

        jLabel18.setText("Fecha Solicitud");

        jLabel19.setText("CREO QUE AQUI VA LA FECHA ACTUAL");

        jLabel20.setText("Fecha Cita:");

        jLabel21.setText("Hora:");

        Hora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione una hora", "7:00 am a 8:00 am", "8:00 am a 9:00 am", "9:00 am a 10:00 am", "10:00 am a 11:00 am", "11:00 am a 12:00 pm", "12:00 pm a 13:00 pm", "14:00 pm a 15:00 pm", "15:00 pm a 16:00 pm", "16:00 pm a 17:00 pm", "17:00 pm a 18:00 pm" }));

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
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(177, 177, 177)
                                .addComponent(btnAceptarCita)
                                .addGap(60, 60, 60)
                                .addComponent(btnCancelarCita))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(FechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                        .addComponent(txtIdClienteCita, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bttAgregarClienteCita)))
                                .addGap(94, 94, 94))))))
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
                            .addComponent(txtIdClienteCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DlgAgregarLayout = new javax.swing.GroupLayout(DlgAgregar.getContentPane());
        DlgAgregar.getContentPane().setLayout(DlgAgregarLayout);
        DlgAgregarLayout.setHorizontalGroup(
            DlgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(DlgAgregarLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Citas Medicas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(728, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 60));

        btnCrearCita.setText("CREAR");

        btnModificarCita.setText("MODIFICAR");

        btnImprimir.setText("IMPRIMIR GENERAL");

        btnEliminarCita.setText("ELIMINAR");

        tblCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID CITA", "ID MEDICO", "ID CLIENTE", "FECHA SOLICITUD", "FECHA CITA", "HORA", "ESTADO"
            }
        ));
        jScrollPane1.setViewportView(tblCitas);

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
                .addContainerGap(631, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCrearCita)
                        .addGap(27, 27, 27)
                        .addComponent(btnModificarCita)
                        .addGap(26, 26, 26)
                        .addComponent(btnEliminarCita)
                        .addGap(27, 27, 27)
                        .addComponent(btnImprimir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(cbEstadoCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 940, 260));

        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CBFechas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccionar", "-Todos los registros", "-Buscar por fecha" }));
        jPanel11.add(CBFechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 110, -1));
        jPanel11.add(BusquedaFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 144, 30));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/lupa.png"))); // NOI18N
        jPanel11.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 40, 50));

        jLabel37.setText("Busqueda por fecha especifica");
        jPanel11.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

        jPanel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel34.setText("Busqueda por rangos de fechas ");

        jLabel38.setText("Desde");

        jLabel39.setText(":");

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
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 940, 120));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("FILTROS DE BUSQUEDA DE CITAS MEDICAS");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2AncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
