/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Facturacion;

import com.toedter.calendar.JDateChooser;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;



/**
 *
 * @author USUARIO
 */
public class VistaFacturacion extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaFacturacion
     */
    public VistaFacturacion() {
        initComponents();
    }

    public JButton getBtnNuevaFact() {
        return BtnNuevaFact;
    }

    public void setBtnNuevaFact(JButton BtnNuevaFact) {
        this.BtnNuevaFact = BtnNuevaFact;
    }

    public JButton getBtnImprimir() {
        return btnImprimir;
    }

    public void setBtnImprimir(JButton btnImprimir) {
        this.btnImprimir = btnImprimir;
    }

    public JTextField getTxtSubtotal() {
        return txtSubtotal;
    }

    public void setTxtSubtotal(JTextField txtSubtotal) {
        this.txtSubtotal = txtSubtotal;
    }

    public JButton getBttAceptarAñadirProduct() {
        return BttAceptarAñadirProduct;
    }

    public void setBttAceptarAñadirProduct(JButton BttAceptarAñadirProduct) {
        this.BttAceptarAñadirProduct = BttAceptarAñadirProduct;
    }

    public JTextField getTxtCategoria() {
        return txtCategoria;
    }

    public void setTxtCategoria(JTextField txtCategoria) {
        this.txtCategoria = txtCategoria;
    }

    public JButton getBttAgregarC() {
        return bttAgregarC;
    }

    public JButton getBttAgregarP() {
        return bttAgregarP;
    }

    public void setBttAgregarP(JButton bttAgregarP) {
        this.bttAgregarP = bttAgregarP;
    }

    public void setBttAgregarC(JButton bttAgregarC) {
        this.bttAgregarC = bttAgregarC;
    }

    public JTextField getBuscarProducto() {
        return BuscarProducto;
    }

    public void setBuscarProducto(JTextField BuscarProducto) {
        this.BuscarProducto = BuscarProducto;
    }

    public JLabel getFotoPro() {
        return FotoPro;
    }

    public void setFotoPro(JLabel FotoPro) {
        this.FotoPro = FotoPro;
    }

    public JSpinner getSppCantidad() {
        return SppCantidad;
    }

    public void setSppCantidad(JSpinner SppCantidad) {
        this.SppCantidad = SppCantidad;
    }

    public JButton getBtnAceptar() {
        return btnAceptar;
    }

    public void setBtnAceptar(JButton btnAceptar) {
        this.btnAceptar = btnAceptar;
    }

    public JButton getBtnBorrar_deta() {
        return btnBorrar_deta;
    }

    public void setBtnBorrar_deta(JButton btnBorrar_deta) {
        this.btnBorrar_deta = btnBorrar_deta;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }


    public JButton getBttAcepatarAñadirS() {
        return bttAcepatarAñadirS;
    }

    public void setBttAcepatarAñadirS(JButton bttAcepatarAñadirS) {
        this.bttAcepatarAñadirS = bttAcepatarAñadirS;
    }


    public JButton getBttBuscarClie() {
        return bttBuscarClie;
    }

    public void setBttBuscarClie(JButton bttBuscarClie) {
        this.bttBuscarClie = bttBuscarClie;
    }

    public JButton getBttBuscarIdMedico() {
        return bttBuscarIdMedico;
    }

    public void setBttBuscarIdMedico(JButton bttBuscarIdMedico) {
        this.bttBuscarIdMedico = bttBuscarIdMedico;
    }

    public JButton getBttañadirp() {
        return bttañadirp;
    }

    public void setBttañadirp(JButton bttañadirp) {
        this.bttañadirp = bttañadirp;
    }

    public JButton getBttañadirs() {
        return bttañadirs;
    }

    public void setBttañadirs(JButton bttañadirs) {
        this.bttañadirs = bttañadirs;
    }

    public JDialog getDlgCliente() {
        return dlgCliente;
    }

    public void setDlgCliente(JDialog dlgCliente) {
        this.dlgCliente = dlgCliente;
    }

    public JDialog getDlgMedico() {
        return dlgMedico;
    }

    public void setDlgMedico(JDialog dlgMedico) {
        this.dlgMedico = dlgMedico;
    }

    public JDialog getDlgProducto() {
        return dlgProducto;
    }

    public void setDlgProducto(JDialog dlgProducto) {
        this.dlgProducto = dlgProducto;
    }

    public JDialog getDlgServicio() {
        return dlgServicio;
    }

    public void setDlgServicio(JDialog dlgServicio) {
        this.dlgServicio = dlgServicio;
    }

    public JTable getTblClie() {
        return tblClie;
    }

    public void setTblClie(JTable tblClie) {
        this.tblClie = tblClie;
    }

    public JTable getTblProducto() {
        return tblProducto;
    }

    public void setTblProducto(JTable tblProducto) {
        this.tblProducto = tblProducto;
    }

    public JTable getTblProductoF() {
        return tblProductoF;
    }

    public void setTblProductoF(JTable tblProductoF) {
        this.tblProductoF = tblProductoF;
    }

    public JTable getTblServicio() {
        return tblServicio;
    }

    public void setTblServicio(JTable tblServicio) {
        this.tblServicio = tblServicio;
    }

    public JTable getTblServiciosAñadir() {
        return tblServiciosAñadir;
    }

    public void setTblServiciosAñadir(JTable tblServiciosAñadir) {
        this.tblServiciosAñadir = tblServiciosAñadir;
    }

    public JButton getBtnCalcular() {
        return btnCalcular;
    }

    public void setBtnCalcular(JButton bttCalcular) {
        this.btnCalcular = bttCalcular;
    }

    public JTable getTblVeterinario() {
        return tblVeterinario;
    }

    public void setTblVeterinario(JTable tblVeterinario) {
        this.tblVeterinario = tblVeterinario;
    }

    public JTextField getTxtBuscarClie() {
        return txtBuscarClie;
    }

    public void setTxtBuscarClie(JTextField txtBuscarClie) {
        this.txtBuscarClie = txtBuscarClie;
    }

    public JTextField getTxtBuscarServicios() {
        return txtBuscarServicios;
    }

    public void setTxtBuscarServicios(JTextField txtBuscarServicios) {
        this.txtBuscarServicios = txtBuscarServicios;
    }

    
    public JTextField getTxtDireccionClie() {
        return txtDireccionClie;
    }

    public void setTxtDireccionClie(JTextField txtDireccionClie) {
        this.txtDireccionClie = txtDireccionClie;
    }

    public JTextField getTxtIDProduc() {
        return txtIDProduc;
    }

    public void setTxtIDProduc(JTextField txtIDProduc) {
        this.txtIDProduc = txtIDProduc;
    }

    public JTextField getTxtIva() {
        return txtIva;
    }

    public JButton getBttAgregar() {
        return bttAgregar;
    }

    public void setBttAgregar(JButton bttAgregar) {
        this.bttAgregar = bttAgregar;
    }

    public void setTxtIva(JTextField txtIva) {
        this.txtIva = txtIva;
    }

    public JTextField getTxtNombreProduc() {
        return txtNombreProduc;
    }

    public void setTxtNombreProduc(JTextField txtNombreProduc) {
        this.txtNombreProduc = txtNombreProduc;
    }

    public JTextField getTxtPrecioProduc() {
        return txtPrecioProduc;
    }

    public void setTxtPrecioProduc(JTextField txtPrecioProduc) {
        this.txtPrecioProduc = txtPrecioProduc;
    }

    public JTextField getTxtTelefonoCli() {
        return txtTelefonoCli;
    }

    public void setTxtTelefonoCli(JTextField txtTelefonoCli) {
        this.txtTelefonoCli = txtTelefonoCli;
    }

    public JTextField getTxt_Fecha() {
        return txt_Fecha;
    }

    public void setTxt_Fecha(JTextField txt_Fecha) {
        this.txt_Fecha = txt_Fecha;
    }

    public JTextField getTxt_IDCliente() {
        return txt_IDCliente;
    }

    public void setTxt_IDCliente(JTextField txt_IDCliente) {
        this.txt_IDCliente = txt_IDCliente;
    }

    public JTextField getTxt_IDFactura() {
        return txt_IDFactura;
    }

    public void setTxt_IDFactura(JTextField txt_IDFactura) {
        this.txt_IDFactura = txt_IDFactura;
    }

    public JTextField getTxt_IDMedico() {
        return txt_IDMedico;
    }

    public void setTxt_IDMedico(JTextField txt_IDMedico) {
        this.txt_IDMedico = txt_IDMedico;
    }

    public JTextField getTxt_Nombre() {
        return txt_Nombre;
    }

    public void setTxt_Nombre(JTextField txt_Nombre) {
        this.txt_Nombre = txt_Nombre;
    }

    public JTextField getTxt_NombreCli() {
        return txt_NombreCli;
    }

    public void setTxt_NombreCli(JTextField txt_NombreCli) {
        this.txt_NombreCli = txt_NombreCli;
    }

    public JSpinner getSpinCambio() {
        return SpinCambio;
    }

    public void setSpinCambio(JSpinner SpinCambio) {
        this.SpinCambio = SpinCambio;
    }

    public JSpinner getSpinTotal() {
        return SpinTotal;
    }

    public void setSpinTotal(JSpinner SpinTotal) {
        this.SpinTotal = SpinTotal;
    }

    public JSpinner getSpnDinero() {
        return spnDinero;
    }

    public void setSpnDinero(JSpinner spnDinero) {
        this.spnDinero = spnDinero;
    }

    public JTextField getTxtbuscarVeterinario() {
        return txtbuscarVeterinario;
    }

    public void setTxtbuscarVeterinario(JTextField txtbuscarVeterinario) {
        this.txtbuscarVeterinario = txtbuscarVeterinario;
    }

    public ButtonGroup getBg_Activar() {
        return bg_Activar;
    }

    public void setBg_Activar(ButtonGroup bg_Activar) {
        this.bg_Activar = bg_Activar;
    }

    public JLabel getLb_IDClienteV() {
        return lb_IDClienteV;
    }

    public void setLb_IDClienteV(JLabel lb_IDClienteV) {
        this.lb_IDClienteV = lb_IDClienteV;
    }

    public JLabel getLb_IDMedicoV() {
        return lb_IDMedicoV;
    }

    public void setLb_IDMedicoV(JLabel lb_IDMedicoV) {
        this.lb_IDMedicoV = lb_IDMedicoV;
    }

    
    
  
  

   

    

    

   


    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        dlgMedico = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        txtbuscarVeterinario = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblVeterinario = new javax.swing.JTable();
        bttAgregar = new javax.swing.JButton();
        dlgCliente = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtBuscarClie = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblClie = new javax.swing.JTable();
        bttAgregarC = new javax.swing.JButton();
        dlgProducto = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        BuscarProducto = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtNombreProduc = new javax.swing.JTextField();
        txtIDProduc = new javax.swing.JTextField();
        txtPrecioProduc = new javax.swing.JTextField();
        BttAceptarAñadirProduct = new javax.swing.JButton();
        SppCantidad = new javax.swing.JSpinner();
        FotoPro = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        bttAgregarP = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblProductoF = new javax.swing.JTable();
        jLabel36 = new javax.swing.JLabel();
        dlgServicio = new javax.swing.JDialog();
        jPanel10 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        bttAcepatarAñadirS = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        txtBuscarServicios = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblServiciosAñadir = new javax.swing.JTable();
        bg_Activar = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txt_IDMedico = new javax.swing.JTextField();
        bttBuscarIdMedico = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtDireccionClie = new javax.swing.JTextField();
        txtTelefonoCli = new javax.swing.JTextField();
        txt_NombreCli = new javax.swing.JTextField();
        txt_IDCliente = new javax.swing.JTextField();
        bttBuscarClie = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        lb_IDClienteV = new javax.swing.JLabel();
        lb_IDMedicoV = new javax.swing.JLabel();
        BtnNuevaFact = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblServicio = new javax.swing.JTable();
        bttañadirs = new javax.swing.JButton();
        btnBorrar_deta = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProducto = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        bttañadirp = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        btnImprimir = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_IDFactura = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_Fecha = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtIva = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        spnDinero = new javax.swing.JSpinner();
        SpinCambio = new javax.swing.JSpinner();
        SpinTotal = new javax.swing.JSpinner();

        dlgMedico.setResizable(false);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/veterinario.png"))); // NOI18N
        jLabel14.setText("VETERINARIO");

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("BUSCAR:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(txtbuscarVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(298, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscarVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        tblVeterinario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Medico", "Nombre", "Apellido", "Direccion", "Especialidad"
            }
        ));
        jScrollPane3.setViewportView(tblVeterinario);

        bttAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/agregar-archivo.png"))); // NOI18N
        bttAgregar.setText("Agregar");
        bttAgregar.setBorderPainted(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bttAgregar)
                .addGap(38, 38, 38))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bttAgregar)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dlgMedicoLayout = new javax.swing.GroupLayout(dlgMedico.getContentPane());
        dlgMedico.getContentPane().setLayout(dlgMedicoLayout);
        dlgMedicoLayout.setHorizontalGroup(
            dlgMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dlgMedicoLayout.setVerticalGroup(
            dlgMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgMedicoLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        dlgCliente.setResizable(false);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/velocidad.png"))); // NOI18N
        jLabel22.setText("Cliente");

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Buscar:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarClie, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel22))
                .addContainerGap(408, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtBuscarClie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        tblClie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Cliente", "Nombre", "Apellido", "Telefono", "Email", "Direccion"
            }
        ));
        jScrollPane4.setViewportView(tblClie);

        bttAgregarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/agregar-archivo.png"))); // NOI18N
        bttAgregarC.setText("Agregar");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bttAgregarC)
                .addGap(34, 34, 34))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttAgregarC)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dlgClienteLayout = new javax.swing.GroupLayout(dlgCliente.getContentPane());
        dlgCliente.getContentPane().setLayout(dlgClienteLayout);
        dlgClienteLayout.setHorizontalGroup(
            dlgClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dlgClienteLayout.setVerticalGroup(
            dlgClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgClienteLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dlgProducto.setBackground(new java.awt.Color(51, 51, 51));
        dlgProducto.setResizable(false);

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/caja.png"))); // NOI18N
        jLabel24.setText("Producto");

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Buscar:");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/pngegg (11).png"))); // NOI18N

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/pngegg (12).png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel25)
                        .addGap(17, 17, 17)
                        .addComponent(BuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addComponent(jLabel9)
                .addGap(85, 85, 85)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(56, 56, 56))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel24)
                .addGap(8, 8, 8)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(BuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jLabel9)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel37)
        );

        jPanel9.setBackground(new java.awt.Color(153, 204, 0));

        jLabel26.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel26.setText("Detalles:");

        jLabel27.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel27.setText("ID Producto:");

        jLabel28.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel28.setText("Nombre:");

        jLabel29.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel29.setText("Precio:");

        jLabel30.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel30.setText("Cantidad");

        BttAceptarAñadirProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/aceptar.png"))); // NOI18N
        BttAceptarAñadirProduct.setText("Aceptar");

        SppCantidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        FotoPro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel31.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel31.setText("Categoria");

        bttAgregarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/agregar-archivo.png"))); // NOI18N
        bttAgregarP.setText("Agregar");

        tblProductoF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Producto", "Nombre", "Precio", "ID Categoria", "Cantidad", "Foto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblProductoF);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel26))
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(jLabel31)
                    .addComponent(jLabel30))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIDProduc, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreProduc, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecioProduc, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(FotoPro, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SppCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(bttAgregarP)
                        .addGap(182, 182, 182)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BttAceptarAñadirProduct))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel26)
                        .addGap(113, 113, 113)
                        .addComponent(jLabel27)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel28)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel29)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel31)
                        .addGap(22, 22, 22)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(SppCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(FotoPro, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(txtIDProduc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(txtNombreProduc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(txtPrecioProduc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BttAceptarAñadirProduct)
                            .addComponent(bttAgregarP)))))
        );

        javax.swing.GroupLayout dlgProductoLayout = new javax.swing.GroupLayout(dlgProducto.getContentPane());
        dlgProducto.getContentPane().setLayout(dlgProductoLayout);
        dlgProductoLayout.setHorizontalGroup(
            dlgProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dlgProductoLayout.setVerticalGroup(
            dlgProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgProductoLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        dlgServicio.setResizable(false);

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));

        jLabel32.setFont(new java.awt.Font("Arial", 3, 28)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/servicios.png"))); // NOI18N
        jLabel32.setText("Servicios");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel32)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel32)
                .addGap(22, 22, 22))
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        bttAcepatarAñadirS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/aceptar.png"))); // NOI18N
        bttAcepatarAñadirS.setText("Aceptar");

        jLabel33.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel33.setText("Buscar:");

        tblServiciosAñadir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Servicio", "Nombre", "Descripcion", "Precio"
            }
        ));
        jScrollPane6.setViewportView(tblServiciosAñadir);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                        .addGap(53, 53, 53))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(bttAcepatarAñadirS)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bttAcepatarAñadirS)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout dlgServicioLayout = new javax.swing.GroupLayout(dlgServicio.getContentPane());
        dlgServicio.getContentPane().setLayout(dlgServicioLayout);
        dlgServicioLayout.setHorizontalGroup(
            dlgServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dlgServicioLayout.setVerticalGroup(
            dlgServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgServicioLayout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));

        jLabel10.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 204, 0));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/seo.png"))); // NOI18N
        jLabel10.setText("Parametros para Imprimir");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(23, 23, 23))
        );

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel39.setText("Buscar por:");
        jPanel14.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 14, -1, -1));

        jLabel40.setFont(new java.awt.Font("Arial", 3, 13)); // NOI18N
        jLabel40.setText("Id Medico:");
        jPanel14.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 60, -1, -1));

        jLabel41.setFont(new java.awt.Font("Arial", 3, 13)); // NOI18N
        jLabel41.setText("Id Factura:");
        jPanel14.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 102, -1, -1));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/pugbuscar.png"))); // NOI18N
        jPanel14.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 190, -1));

        jLabel43.setFont(new java.awt.Font("Arial", 3, 13)); // NOI18N
        jLabel43.setText("Id Cliente:");
        jPanel14.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 144, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/impresion.png"))); // NOI18N
        jButton1.setText("Imprimir");
        jButton1.setBorderPainted(false);
        jPanel14.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));
        jPanel14.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 55, 152, -1));
        jPanel14.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 139, 152, -1));
        jPanel14.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 97, 152, -1));

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
        );

        setBackground(new java.awt.Color(51, 51, 51));
        setClosable(true);
        setIconifiable(true);
        setTitle("Facturacion");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/3x16.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("ENCABEZADO"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel7.setText("Id Medico:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        txt_IDMedico.setEditable(false);
        jPanel1.add(txt_IDMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 240, -1));

        bttBuscarIdMedico.setText("...");
        bttBuscarIdMedico.setBorderPainted(false);
        jPanel1.add(bttBuscarIdMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 50, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel13.setText("Nombres:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        txt_Nombre.setEditable(false);
        jPanel1.add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 240, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel6.setText("Id Cliente:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel15.setText("Nombres:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel16.setText("Telefono:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel17.setText("Direccion:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        txtDireccionClie.setEditable(false);
        jPanel1.add(txtDireccionClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 240, -1));

        txtTelefonoCli.setEditable(false);
        jPanel1.add(txtTelefonoCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 240, -1));

        txt_NombreCli.setEditable(false);
        jPanel1.add(txt_NombreCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 240, -1));

        txt_IDCliente.setEditable(false);
        jPanel1.add(txt_IDCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 240, -1));

        bttBuscarClie.setText("...");
        bttBuscarClie.setBorderPainted(false);
        bttBuscarClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttBuscarClieActionPerformed(evt);
            }
        });
        jPanel1.add(bttBuscarClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 50, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 400, -1));

        lb_IDClienteV.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lb_IDClienteV.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lb_IDClienteV, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 180, 20));

        lb_IDMedicoV.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lb_IDMedicoV.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lb_IDMedicoV, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 180, 20));

        BtnNuevaFact.setText("NUEVA");
        jPanel1.add(BtnNuevaFact, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 100, 50));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("DETALLE"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 130, -1, -1));

        tblServicio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Servicio", "Nombre", "Descripcion", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblServicio);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 640, 120));

        bttañadirs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/agregar.png"))); // NOI18N
        bttañadirs.setText("Añadir Servicio");
        bttañadirs.setBorderPainted(false);
        jPanel2.add(bttañadirs, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 190, -1, -1));

        btnBorrar_deta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/basura.png"))); // NOI18N
        btnBorrar_deta.setText("Borrar");
        btnBorrar_deta.setBorderPainted(false);
        jPanel2.add(btnBorrar_deta, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 30, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("Producto");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        tblProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Producto", "Nombre", "ID Categoria", "Cantidad", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblProducto);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 640, 130));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setText("Servicio");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        bttañadirp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/agregar.png"))); // NOI18N
        bttañadirp.setText("Añadir Producto");
        bttañadirp.setBorderPainted(false);
        jPanel2.add(bttañadirp, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, -1, -1));

        jLabel46.setText("IMPRIMIR FACTURA");

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/impresion.png"))); // NOI18N

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 240, 150, 70));

        jPanel12.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(126, 197, 68));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/carrito-de-compras (1).png"))); // NOI18N
        jLabel1.setText("Facturacion");

        jLabel5.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Id Factura:");

        jLabel8.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Fecha:");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(77, 77, 77)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(txt_IDFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(txt_IDFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txt_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanel13.setBackground(new java.awt.Color(51, 51, 51));
        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel13.setForeground(new java.awt.Color(51, 51, 51));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Dinero Recibido:");

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Iva:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total:");

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/aceptar.png"))); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.setBorderPainted(false);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorderPainted(false);

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("%");

        btnCalcular.setText("Calcular Cambio");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("$");

        jLabel19.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("$");

        jLabel34.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("$");

        jLabel44.setBackground(new java.awt.Color(255, 255, 255));
        jLabel44.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("SUBTOTAL:");

        txtSubtotal.setEditable(false);

        jLabel45.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("$");

        spnDinero.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 1.0f));

        SpinCambio.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 1.0f));
        SpinCambio.setEnabled(false);

        SpinTotal.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 1.0f));
        SpinTotal.setEnabled(false);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btnCalcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(jLabel19))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel20)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtIva, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spnDinero)
                    .addComponent(SpinCambio, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addComponent(jLabel35)
                .addGap(32, 32, 32))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jSeparator2)
                .addContainerGap())
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(24, 24, 24))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel34))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel45)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSubtotal)
                    .addComponent(SpinTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel20))
                    .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel11)
                    .addComponent(spnDinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular)
                    .addComponent(jLabel19)
                    .addComponent(SpinCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45)
                    .addComponent(jLabel44))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel34)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(SpinTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttBuscarClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttBuscarClieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttBuscarClieActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnNuevaFact;
    private javax.swing.JButton BttAceptarAñadirProduct;
    private javax.swing.JTextField BuscarProducto;
    private javax.swing.JLabel FotoPro;
    private javax.swing.JSpinner SpinCambio;
    private javax.swing.JSpinner SpinTotal;
    private javax.swing.JSpinner SppCantidad;
    private javax.swing.ButtonGroup bg_Activar;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBorrar_deta;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton bttAcepatarAñadirS;
    private javax.swing.JButton bttAgregar;
    private javax.swing.JButton bttAgregarC;
    private javax.swing.JButton bttAgregarP;
    private javax.swing.JButton bttBuscarClie;
    private javax.swing.JButton bttBuscarIdMedico;
    private javax.swing.JButton bttañadirp;
    private javax.swing.JButton bttañadirs;
    private javax.swing.JDialog dlgCliente;
    private javax.swing.JDialog dlgMedico;
    private javax.swing.JDialog dlgProducto;
    private javax.swing.JDialog dlgServicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
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
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
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
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lb_IDClienteV;
    private javax.swing.JLabel lb_IDMedicoV;
    private javax.swing.JSpinner spnDinero;
    private javax.swing.JTable tblClie;
    private javax.swing.JTable tblProducto;
    private javax.swing.JTable tblProductoF;
    private javax.swing.JTable tblServicio;
    private javax.swing.JTable tblServiciosAñadir;
    private javax.swing.JTable tblVeterinario;
    private javax.swing.JTextField txtBuscarClie;
    private javax.swing.JTextField txtBuscarServicios;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtDireccionClie;
    private javax.swing.JTextField txtIDProduc;
    private javax.swing.JTextField txtIva;
    private javax.swing.JTextField txtNombreProduc;
    private javax.swing.JTextField txtPrecioProduc;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTelefonoCli;
    private javax.swing.JTextField txt_Fecha;
    private javax.swing.JTextField txt_IDCliente;
    private javax.swing.JTextField txt_IDFactura;
    private javax.swing.JTextField txt_IDMedico;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_NombreCli;
    private javax.swing.JTextField txtbuscarVeterinario;
    // End of variables declaration//GEN-END:variables
}
