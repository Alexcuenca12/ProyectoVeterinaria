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
        dlgCliente = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtBuscarClie = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblClie = new javax.swing.JTable();
        dlgProducto = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblProductoF = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        BuscarProducto = new javax.swing.JTextField();
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
        jLabel1 = new javax.swing.JLabel();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblServicio = new javax.swing.JTable();
        btnImprimir = new javax.swing.JButton();
        bttañadirs = new javax.swing.JButton();
        btnBorrar_deta = new javax.swing.JButton();
        btnEditar_deta = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txt_Total = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProducto = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtIva = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        bttañadirp = new javax.swing.JButton();
        txtCambio = new javax.swing.JTextField();
        txtDinero = new javax.swing.JTextField();
        txtDescuento = new javax.swing.JTextField();

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel14.setText("VETERINARIO");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscarVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        tblVeterinario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Medico", "Nombre", "Apellido", "Direccion", "Especialidad"
            }
        ));
        jScrollPane3.setViewportView(tblVeterinario);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel22.setText("Cliente");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtBuscarClie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        tblClie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Cliente", "Nombre", "Apellido", "Telefono", "Email", "Direccion"
            }
        ));
        jScrollPane4.setViewportView(tblClie);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
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
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel24.setText("Producto:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel24)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        tblProductoF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Producto", "Nombre", "Precio", "Cantidad", "Foto"
            }
        ));
        jScrollPane5.setViewportView(tblProductoF);

        jLabel25.setText("Buscar:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(BuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel26.setText("Detalles:");

        jLabel27.setText("ID Producto:");

        jLabel28.setText("Nombre:");

        jLabel29.setText("Precio:");

        jLabel30.setText("Cantidad");

        BttAceptarAñadirProduct.setText("Aceptar");

        bttCancelarAñadirProduct.setText("Cancelar");

        FotoPro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(SppCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(BttAceptarAñadirProduct)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(bttCancelarAñadirProduct)
                .addGap(40, 40, 40))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(66, 66, 66)
                        .addComponent(FotoPro, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(jLabel27)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtIDProduc, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(jLabel28)
                            .addGap(41, 41, 41)
                            .addComponent(txtNombreProduc, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel29)
                                .addComponent(jLabel30))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPrecioProduc, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addContainerGap(30, Short.MAX_VALUE)
                        .addComponent(FotoPro, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txtIDProduc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtNombreProduc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtPrecioProduc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(SppCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BttAceptarAñadirProduct)
                    .addComponent(bttCancelarAñadirProduct))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout dlgProductoLayout = new javax.swing.GroupLayout(dlgProducto.getContentPane());
        dlgProducto.getContentPane().setLayout(dlgProductoLayout);
        dlgProductoLayout.setHorizontalGroup(
            dlgProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(dlgProductoLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dlgProductoLayout.setVerticalGroup(
            dlgProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgProductoLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dlgProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgProductoLayout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel32.setText("Servicios");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel32)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel32)
                .addGap(35, 35, 35))
        );

        bttAcepatarAñadirS.setText("Aceptar");

        bttCancelarS.setText("Cancelar");

        jLabel33.setText("Buscar:");

        tblServiciosAñadir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Servicio", "Nombre", "Descripcion", "Costo"
            }
        ));
        jScrollPane6.setViewportView(tblServiciosAñadir);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bttAcepatarAñadirS)
                .addGap(18, 18, 18)
                .addComponent(bttCancelarS)
                .addGap(66, 66, 66))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel33)
                .addGap(30, 30, 30)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscarServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttAcepatarAñadirS)
                    .addComponent(bttCancelarS))
                .addGap(50, 50, 50))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setClosable(true);
        setIconifiable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Id Factura:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 50, -1, -1));

        jLabel1.setText("Facturacion:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, -1, -1));

        jLabel8.setText("Fecha:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 90, -1, -1));

        jLabel7.setText("Id Medico:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 139, -1, -1));

        jLabel6.setText("Id Cliente:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, -1));
        jPanel1.add(txt_IDFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 46, 240, -1));
        jPanel1.add(txt_IDCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 220, -1));
        jPanel1.add(txt_IDMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 135, 240, -1));

        bttBuscarIdMedico.setText("...");
        jPanel1.add(bttBuscarIdMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        bttBuscarClie.setText("...");
        jPanel1.add(bttBuscarClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 50, -1, -1));

        jLabel13.setText("Nombres:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 179, -1, -1));
        jPanel1.add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 175, 240, -1));

        jLabel15.setText("Nombres:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, -1, -1));
        jPanel1.add(txt_NombreCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 220, -1));

        jLabel16.setText("Telefono:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, -1, -1));
        jPanel1.add(txtTelefonoCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 220, -1));

        jLabel17.setText("Direccion:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, -1, -1));
        jPanel1.add(txtDireccionClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 230, -1));
        jPanel1.add(txt_Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 86, 140, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 113, -1, -1));

        tblServicio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Servicio", "Nombre", "Descripcion", "Total"
            }
        ));
        jScrollPane1.setViewportView(tblServicio);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 520, 130));

        btnImprimir.setText("Imprimir");
        jPanel2.add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        bttañadirs.setText("Añadir");
        jPanel2.add(bttañadirs, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, -1, -1));

        btnBorrar_deta.setText("Borrar");
        jPanel2.add(btnBorrar_deta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        btnEditar_deta.setText("Editar");
        jPanel2.add(btnEditar_deta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jLabel3.setText("Total:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 280, -1, -1));

        btnAceptar.setText("Aceptar");
        jPanel2.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 320, -1, -1));

        btnCancelar.setText("Cancelar");
        jPanel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 320, -1, -1));

        txt_Total.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txt_Total.setText("0,000");
        jPanel2.add(txt_Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 260, -1, 46));

        jLabel12.setText("Producto");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        tblProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Producto", "Nombre", "ID Categoria", "Cantidad", "Total"
            }
        ));
        jScrollPane2.setViewportView(tblProducto);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 82, 520, 130));

        jLabel18.setText("Servicio");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jLabel19.setText("Detalle:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 7, -1, -1));

        jLabel2.setText("Dinero:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 180, -1, -1));

        jLabel9.setText("%");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, -1, -1));

        jLabel10.setText("Descuento");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, -1, -1));

        jLabel11.setText("Cambio");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 220, -1, 10));
        jPanel2.add(txtIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 70, -1));

        jLabel20.setText("Iva");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, -1, -1));

        bttañadirp.setText("Añadir");
        jPanel2.add(bttañadirp, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, -1, -1));
        jPanel2.add(txtCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 210, 110, -1));
        jPanel2.add(txtDinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 170, 110, -1));
        jPanel2.add(txtDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 40, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 962, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar_deta;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton bttAcepatarAñadirS;
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
    private javax.swing.JPanel jPanel11;
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
