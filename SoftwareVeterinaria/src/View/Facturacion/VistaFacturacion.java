/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Facturacion;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
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

    public JButton getBtnEditar_deta() {
        return btnEditar_deta;
    }

    public void setBtnEditar_deta(JButton btnEditar_deta) {
        this.btnEditar_deta = btnEditar_deta;
    }

    public JButton getBtnImprimir() {
        return btnImprimir;
    }

    public void setBtnImprimir(JButton btnImprimir) {
        this.btnImprimir = btnImprimir;
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

    public JButton getBttCancelarAñadirProduct() {
        return bttCancelarAñadirProduct;
    }

    public void setBttCancelarAñadirProduct(JButton bttCancelarAñadirProduct) {
        this.bttCancelarAñadirProduct = bttCancelarAñadirProduct;
    }

    public JButton getBttCancelarS() {
        return bttCancelarS;
    }

    public void setBttCancelarS(JButton bttCancelarS) {
        this.bttCancelarS = bttCancelarS;
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

    public JTextField getTxtCambio() {
        return txtCambio;
    }

    public void setTxtCambio(JTextField txtCambio) {
        this.txtCambio = txtCambio;
    }

    public JTextField getTxtDescuento() {
        return txtDescuento;
    }

    public void setTxtDescuento(JTextField txtDescuento) {
        this.txtDescuento = txtDescuento;
    }

    public JTextField getTxtDinero() {
        return txtDinero;
    }

    public void setTxtDinero(JTextField txtDinero) {
        this.txtDinero = txtDinero;
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

    public JTextField getTxt_Total() {
        return txt_Total;
    }

    public void setTxt_Total(JTextField txt_Total) {
        this.txt_Total = txt_Total;
    }

    public JTextField getTxtbuscarVeterinario() {
        return txtbuscarVeterinario;
    }

    public void setTxtbuscarVeterinario(JTextField txtbuscarVeterinario) {
        this.txtbuscarVeterinario = txtbuscarVeterinario;
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
        bttCancelarAñadirProduct = new javax.swing.JButton();
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
        bttCancelarS = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        txtBuscarServicios = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblServiciosAñadir = new javax.swing.JTable();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_IDFactura = new javax.swing.JTextField();
        txt_IDCliente = new javax.swing.JTextField();
        txt_IDMedico = new javax.swing.JTextField();
        bttBuscarIdMedico = new javax.swing.JButton();
        bttBuscarClie = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_NombreCli = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtTelefonoCli = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtDireccionClie = new javax.swing.JTextField();
        txt_Fecha = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblServicio = new javax.swing.JTable();
        btnImprimir = new javax.swing.JButton();
        bttañadirs = new javax.swing.JButton();
        btnBorrar_deta = new javax.swing.JButton();
        btnEditar_deta = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProducto = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        bttañadirp = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        txtCambio = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDinero = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        txtIva = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txt_Total = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();

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
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/caja.png"))); // NOI18N
        jLabel24.setText("Producto");
        jPanel7.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));
        jPanel7.add(BuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 292, -1));

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Buscar:");
        jPanel7.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/pngegg (11).png"))); // NOI18N
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, -1, -1));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/pngegg (12).png"))); // NOI18N
        jPanel7.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, -1, -1));

        dlgProducto.getContentPane().add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel9.setBackground(new java.awt.Color(153, 204, 0));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel26.setText("Detalles:");
        jPanel9.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 15, -1, -1));

        jLabel27.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel27.setText("ID Producto:");
        jPanel9.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel28.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel28.setText("Nombre:");
        jPanel9.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel29.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel29.setText("Precio:");
        jPanel9.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel30.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel30.setText("Cantidad");
        jPanel9.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));
        jPanel9.add(txtNombreProduc, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 205, -1));
        jPanel9.add(txtIDProduc, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 205, -1));
        jPanel9.add(txtPrecioProduc, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 205, -1));

        BttAceptarAñadirProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/aceptar.png"))); // NOI18N
        BttAceptarAñadirProduct.setText("Aceptar");
        jPanel9.add(BttAceptarAñadirProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 340, -1, -1));

        bttCancelarAñadirProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/cancelar.png"))); // NOI18N
        bttCancelarAñadirProduct.setText("Cancelar");
        jPanel9.add(bttCancelarAñadirProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 340, -1, -1));
        jPanel9.add(SppCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 88, -1));

        FotoPro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.add(FotoPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 145, 131));
        jPanel9.add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 205, -1));

        jLabel31.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel31.setText("Categoria");
        jPanel9.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        bttAgregarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/agregar-archivo.png"))); // NOI18N
        bttAgregarP.setText("Agregar");
        jPanel9.add(bttAgregarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, -1, -1));

        tblProductoF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Producto", "Nombre", "Precio", "ID Categoria", "Cantidad"
            }
        ));
        jScrollPane5.setViewportView(tblProductoF);

        jPanel9.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 600, 320));
        jPanel9.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 30, 30));

        dlgProducto.getContentPane().add(jPanel9, java.awt.BorderLayout.PAGE_END);

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

        bttCancelarS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/cancelar.png"))); // NOI18N
        bttCancelarS.setText("Cancelar");

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
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 344, Short.MAX_VALUE)
                                .addComponent(bttAcepatarAñadirS)
                                .addGap(31, 31, 31)
                                .addComponent(bttCancelarS)))
                        .addGap(53, 53, 53))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addGap(30, 30, 30)
                        .addComponent(txtBuscarServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bttCancelarS)
                            .addComponent(bttAcepatarAñadirS))
                        .addGap(29, 29, 29))))
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

        setBackground(new java.awt.Color(51, 51, 51));
        setClosable(true);
        setIconifiable(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel5.setText("Id Factura:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel8.setText("Fecha:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel7.setText("Id Medico:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel6.setText("Id Cliente:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, -1, -1));
        jPanel1.add(txt_IDFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 240, -1));
        jPanel1.add(txt_IDCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 220, -1));
        jPanel1.add(txt_IDMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 240, -1));

        bttBuscarIdMedico.setText("...");
        bttBuscarIdMedico.setBorderPainted(false);
        jPanel1.add(bttBuscarIdMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 50, -1));

        bttBuscarClie.setText("...");
        bttBuscarClie.setBorderPainted(false);
        jPanel1.add(bttBuscarClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, 50, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel13.setText("Nombres:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));
        jPanel1.add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 240, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel15.setText("Nombres:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, -1, -1));
        jPanel1.add(txt_NombreCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 220, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel16.setText("Telefono:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, -1, -1));
        jPanel1.add(txtTelefonoCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 220, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel17.setText("Direccion:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, -1));
        jPanel1.add(txtDireccionClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 220, -1));
        jPanel1.add(txt_Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 240, -1));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/pngegg (10).png"))); // NOI18N
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tblServicio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Servicio", "Nombre", "Descripcion", "Total"
            }
        ));
        jScrollPane1.setViewportView(tblServicio);

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/impresion.png"))); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.setBorderPainted(false);

        bttañadirs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/agregar.png"))); // NOI18N
        bttañadirs.setText("Añadir");
        bttañadirs.setBorderPainted(false);

        btnBorrar_deta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/basura.png"))); // NOI18N
        btnBorrar_deta.setText("Borrar");
        btnBorrar_deta.setBorderPainted(false);

        btnEditar_deta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/editar-documento (1).png"))); // NOI18N
        btnEditar_deta.setText("Editar");
        btnEditar_deta.setBorderPainted(false);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("Producto");

        tblProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Producto", "Nombre", "ID Categoria", "Cantidad", "Total"
            }
        ));
        jScrollPane2.setViewportView(tblProducto);

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setText("Servicio");

        jLabel19.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel19.setText("Detalle:");

        bttañadirp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/agregar.png"))); // NOI18N
        bttañadirp.setText("Añadir");
        bttañadirp.setBorderPainted(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel19)
                        .addGap(15, 15, 15)
                        .addComponent(btnBorrar_deta)
                        .addGap(17, 17, 17)
                        .addComponent(btnEditar_deta)
                        .addGap(231, 231, 231)
                        .addComponent(btnImprimir))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel4))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(bttañadirp))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bttañadirs)))
                .addGap(245, 245, 245))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBorrar_deta)
                            .addComponent(btnEditar_deta)
                            .addComponent(btnImprimir))))
                .addGap(12, 12, 12)
                .addComponent(jLabel12)
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel4))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttañadirp))
                .addGap(10, 10, 10)
                .addComponent(jLabel18)
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttañadirs))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/carrito-de-compras (1).png"))); // NOI18N
        jLabel1.setText("Facturacion");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(15, 15, 15))
        );

        jPanel13.setBackground(new java.awt.Color(51, 51, 51));
        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cambio");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Dinero:");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Descuento");

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Iva");

        txt_Total.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txt_Total.setText("0");

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

        btnCalcular.setText("Calcular");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCancelar)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txt_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(btnAceptar)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(81, 81, 81)
                        .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel35))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(28, 28, 28)
                        .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(50, 50, 50)
                        .addComponent(txtDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(49, 49, 49)
                        .addComponent(txtCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCalcular))
                .addGap(0, 61, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel20))
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel35)))
                .addGap(3, 3, 3)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel10))
                    .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addComponent(txtDinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BttAceptarAñadirProduct;
    private javax.swing.JTextField BuscarProducto;
    private javax.swing.JLabel FotoPro;
    private javax.swing.JSpinner SppCantidad;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBorrar_deta;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar_deta;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton bttAcepatarAñadirS;
    private javax.swing.JButton bttAgregar;
    private javax.swing.JButton bttAgregarC;
    private javax.swing.JButton bttAgregarP;
    private javax.swing.JButton bttBuscarClie;
    private javax.swing.JButton bttBuscarIdMedico;
    private javax.swing.JButton bttCancelarAñadirProduct;
    private javax.swing.JButton bttCancelarS;
    private javax.swing.JButton bttañadirp;
    private javax.swing.JButton bttañadirs;
    private javax.swing.JDialog dlgCliente;
    private javax.swing.JDialog dlgMedico;
    private javax.swing.JDialog dlgProducto;
    private javax.swing.JDialog dlgServicio;
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
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTable tblClie;
    private javax.swing.JTable tblProducto;
    private javax.swing.JTable tblProductoF;
    private javax.swing.JTable tblServicio;
    private javax.swing.JTable tblServiciosAñadir;
    private javax.swing.JTable tblVeterinario;
    private javax.swing.JTextField txtBuscarClie;
    private javax.swing.JTextField txtBuscarServicios;
    private javax.swing.JTextField txtCambio;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtDinero;
    private javax.swing.JTextField txtDireccionClie;
    private javax.swing.JTextField txtIDProduc;
    private javax.swing.JTextField txtIva;
    private javax.swing.JTextField txtNombreProduc;
    private javax.swing.JTextField txtPrecioProduc;
    private javax.swing.JTextField txtTelefonoCli;
    private javax.swing.JTextField txt_Fecha;
    private javax.swing.JTextField txt_IDCliente;
    private javax.swing.JTextField txt_IDFactura;
    private javax.swing.JTextField txt_IDMedico;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_NombreCli;
    private javax.swing.JTextField txt_Total;
    private javax.swing.JTextField txtbuscarVeterinario;
    // End of variables declaration//GEN-END:variables
}
