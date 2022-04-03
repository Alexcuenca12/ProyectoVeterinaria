/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View.Productos;

import Controller.Productos.ControladorProductos;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Edison
 */
public class VistaCrudProductos extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaCrudProductos
     */
    public VistaCrudProductos() {
        initComponents();
        ControladorProductos.cargarCombo(cb_categoria);
    }

    public JButton getBtn_FPLimpiar() {
        return btn_FPLimpiar;
    }

    public void setBtn_FPLimpiar(JButton btn_FPLimpiar) {
        this.btn_FPLimpiar = btn_FPLimpiar;
    }

    public JButton getBtn_FPSeleccionar1() {
        return btn_FPSeleccionar1;
    }

    public void setBtn_FPSeleccionar1(JButton btn_FPSeleccionar1) {
        this.btn_FPSeleccionar1 = btn_FPSeleccionar1;
    }

    public JDialog getDlgFiltrosProveedores() {
        return dlgFiltrosProveedores;
    }

    public void setDlgFiltrosProveedores(JDialog dlgFiltrosProveedores) {
        this.dlgFiltrosProveedores = dlgFiltrosProveedores;
    }

    public JTable getJtFiltroproveedor() {
        return jtFiltroproveedor;
    }

    public void setJtFiltroproveedor(JTable jtFiltroproveedor) {
        this.jtFiltroproveedor = jtFiltroproveedor;
    }

    public JTextField getTxtFiltrobusqProv() {
        return txtFiltrobusqProv;
    }

    public void setTxtFiltrobusqProv(JTextField txtFiltrobusqProv) {
        this.txtFiltrobusqProv = txtFiltrobusqProv;
    }
    
    
    public JTextField getTxtNombreP() {
        return txtNombreP;
    }

    public JLabel getLb_categoriaP() {
        return lb_categoriaP;
    }

    public void setLb_categoriaP(JLabel lb_categoriaP) {
        this.lb_categoriaP = lb_categoriaP;
    }

    public JLabel getLb_fotoP() {
        return lb_fotoP;
    }

    public void setLb_fotoP(JLabel lb_fotoP) {
        this.lb_fotoP = lb_fotoP;
    }

    public JLabel getLb_idP() {
        return lb_idP;
    }

    public void setLb_idP(JLabel lb_idP) {
        this.lb_idP = lb_idP;
    }

    public JLabel getLb_nombreP() {
        return lb_nombreP;
    }

    public void setLb_nombreP(JLabel lb_nombreP) {
        this.lb_nombreP = lb_nombreP;
    }

    public JLabel getLb_proveedorP() {
        return lb_proveedorP;
    }

    public void setLb_proveedorP(JLabel lb_proveedorP) {
        this.lb_proveedorP = lb_proveedorP;
    }
    
    
    public void setTxtNombreP(JTextField txtNombreP) {
        this.txtNombreP = txtNombreP;
    }

    public JSpinner getSpStock() {
        return spStock;
    }

    public void setSpStock(JSpinner spStock) {
        this.spStock = spStock;
    }

    public JSpinner getSpPrecioP() {
        return spPrecioP;
    }

    public void setSpPrecioP(JSpinner spPrecioP) {
        this.spPrecioP = spPrecioP;
    }

    
    
    
    public JButton getBtnAgregarProv() {
        return btnAgregarProv;
    }

    public void setBtnAgregarProv(JButton btnAgregarProv) {
        this.btnAgregarProv = btnAgregarProv;
    }

    public JTextField getTxtProveedor() {
        return txtProveedor;
    }

    public void setTxtProveedor(JTextField txtProveedor) {
        this.txtProveedor = txtProveedor;
    }

    public JDialog getDlgProveedores() {
        return dlgProveedores;
    }

    public void setDlgProveedores(JDialog dlgProveedores) {
        this.dlgProveedores = dlgProveedores;
    }

    public JTable getJtproveedor() {
        return jtproveedor;
    }

    public void setJtproveedor(JTable jtproveedor) {
        this.jtproveedor = jtproveedor;
    }

    public JTextField getTxtbusqProv() {
        return txtbusqProv;
    }

    public void setTxtbusqProv(JTextField txtbusqProv) {
        this.txtbusqProv = txtbusqProv;
    }

    public JButton getBtnFiltroCategoria() {
        return btnFiltroCategoria;
    }

    public void setBtnFiltroCategoria(JButton btnFiltroCategoria) {
        this.btnFiltroCategoria = btnFiltroCategoria;
    }

    public JButton getBtnFiltroProveedor() {
        return btnFiltroProveedor;
    }

    public void setBtnFiltroProveedor(JButton btnFiltroProveedor) {
        this.btnFiltroProveedor = btnFiltroProveedor;
    }

    public JButton getBtnOpcionOK() {
        return btnOpcionOK;
    }

    public void setBtnOpcionOK(JButton btnOpcionOK) {
        this.btnOpcionOK = btnOpcionOK;
    }

    public JComboBox<String> getCbFiltroVentas() {
        return cbFiltroVentas;
    }

    public void setCbFiltroVentas(JComboBox<String> cbFiltroVentas) {
        this.cbFiltroVentas = cbFiltroVentas;
    }

    public JSpinner getSpOpcionCantidad() {
        return spOpcionCantidad;
    }

    public void setSpOpcionCantidad(JSpinner spOpcionCantidad) {
        this.spOpcionCantidad = spOpcionCantidad;
    }

    public JTextField getTxtFiltroCategoria() {
        return txtFiltroCategoria;
    }

    public void setTxtFiltroCategoria(JTextField txtFiltroCategoria) {
        this.txtFiltroCategoria = txtFiltroCategoria;
    }

    public JTextField getTxtFiltroProveedor() {
        return txtFiltroProveedor;
    }

    public void setTxtFiltroProveedor(JTextField txtFiltroProveedor) {
        this.txtFiltroProveedor = txtFiltroProveedor;
    }

    public JTextField getTxtOpcionProd() {
        return txtOpcionProd;
    }

    public void setTxtOpcionProd(JTextField txtOpcionProd) {
        this.txtOpcionProd = txtOpcionProd;
    }

    
    public JComboBox<String> getCb_categoria() {
        return cb_categoria;
    }

    public void setCb_categoria(JComboBox<String> cb_categoria) {
        this.cb_categoria = cb_categoria;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JButton getBtnAceptarP() {
        return btnAceptarP;
    }

    public void setBtnAceptarP(JButton btnAceptarP) {
        this.btnAceptarP = btnAceptarP;
    }

    public JButton getBtnAgregarP() {
        return btnAgregarP;
    }

    public void setBtnAgregarP(JButton btnAgregarP) {
        this.btnAgregarP = btnAgregarP;
    }

    public JButton getBtnCancelarP() {
        return btnCancelarP;
    }

    public void setBtnCancelarP(JButton btnCancelarP) {
        this.btnCancelarP = btnCancelarP;
    }

    public JButton getBtnEliminarP() {
        return btnEliminarP;
    }

    public void setBtnEliminarP(JButton btnEliminarP) {
        this.btnEliminarP = btnEliminarP;
    }

    public JButton getBtnExaminarP() {
        return btnExaminarP;
    }

    public void setBtnExaminarP(JButton btnExaminarP) {
        this.btnExaminarP = btnExaminarP;
    }

    public JButton getBtnImprimirP() {
        return btnImprimirP;
    }

    public void setBtnImprimirP(JButton btnImprimirP) {
        this.btnImprimirP = btnImprimirP;
    }

    public JButton getBtnModificarP() {
        return btnModificarP;
    }

    public void setBtnModificarP(JButton btnModificarP) {
        this.btnModificarP = btnModificarP;
    }

    public JDialog getDlgCrearProd() {
        return dlgCrearProd;
    }

    public void setDlgCrearProd(JDialog dlgCrearProd) {
        this.dlgCrearProd = dlgCrearProd;
    }

    public JLabel getLblFoto() {
        return lblFoto;
    }

    public void setLblFoto(JLabel lblFoto) {
        this.lblFoto = lblFoto;
    }

    public JTable getTblProductos() {
        return tblProductos;
    }

    public void setTblProductos(JTable tblProductos) {
        this.tblProductos = tblProductos;
    }

    public JTextField getTxtBuscarP() {
        return txtBuscarP;
    }

    public void setTxtBuscarP(JTextField txtBuscarP) {
        this.txtBuscarP = txtBuscarP;
    }

    public JTextField getTxtIdprod() {
        return txtIdprod;
    }

    public void setTxtIdprod(JTextField txtIdprod) {
        this.txtIdprod = txtIdprod;
    }

    public JButton getBtnCategoria() {
        return btnCategoria;
    }

    public void setBtnCategoria(JButton btnCategoria) {
        this.btnCategoria = btnCategoria;
    }

    public JButton getBtn_agregarCate() {
        return btn_agregarCate;
    }

    public void setBtn_agregarCate(JButton btn_agregarCate) {
        this.btn_agregarCate = btn_agregarCate;
    }

    public JDialog getDlgCategoria() {
        return dlgCategoria;
    }

    public void setDlgCategoria(JDialog dlgCategoria) {
        this.dlgCategoria = dlgCategoria;
    }

    public JDesktopPane getjDesktopPane1() {
        return jDesktopPane1;
    }

    public void setjDesktopPane1(JDesktopPane jDesktopPane1) {
        this.jDesktopPane1 = jDesktopPane1;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel10() {
        return jLabel10;
    }

    public void setjLabel10(JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JLabel getLblTITULO() {
        return lblTITULO;
    }

    public void setLblTITULO(JLabel lblTITULO) {
        this.lblTITULO = lblTITULO;
    }

    public JLabel getjLabel8() {
        return jLabel8;
    }

    public void setjLabel8(JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    public JLabel getjLabel9() {
        return jLabel9;
    }

    public void setjLabel9(JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JTable getTblCategoria() {
        return tblCategoria;
    }

    public void setTblCategoria(JTable tblCategoria) {
        this.tblCategoria = tblCategoria;
    }



    public JTextField getTxt_IdCate() {
        return txt_IdCate;
    }

    public void setTxt_IdCate(JTextField txt_IdCate) {
        this.txt_IdCate = txt_IdCate;
    }

    public JTextField getTxt_nomCate() {
        return txt_nomCate;
    }

    public void setTxt_nomCate(JTextField txt_nomCate) {
        this.txt_nomCate = txt_nomCate;
    }

    public JButton getBtn_FCLimpiar() {
        return btn_FCLimpiar;
    }

    public void setBtn_FCLimpiar(JButton btn_FCLimpiar) {
        this.btn_FCLimpiar = btn_FCLimpiar;
    }

    public JButton getBtn_FCSeleccionar() {
        return btn_FCSeleccionar;
    }

    public void setBtn_FCSeleccionar(JButton btn_FCSeleccionar) {
        this.btn_FCSeleccionar = btn_FCSeleccionar;
    }

    public JDialog getDlgFiltrosCategoria() {
        return dlgFiltrosCategoria;
    }

    public void setDlgFiltrosCategoria(JDialog dlgFiltrosCategoria) {
        this.dlgFiltrosCategoria = dlgFiltrosCategoria;
    }

    public JTable getTblFiltroCategoria() {
        return tblFiltroCategoria;
    }

    public void setTblFiltroCategoria(JTable tblFiltroCategoria) {
        this.tblFiltroCategoria = tblFiltroCategoria;
    }

    public JTextField getTxt_FCBusqueda() {
        return txt_FCBusqueda;
    }

    public void setTxt_FCBusqueda(JTextField txt_FCBusqueda) {
        this.txt_FCBusqueda = txt_FCBusqueda;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgCrearProd = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        btnAceptarP = new javax.swing.JButton();
        btnCancelarP = new javax.swing.JButton();
        btnExaminarP = new javax.swing.JButton();
        lblFoto = new javax.swing.JLabel();
        btnCategoria = new javax.swing.JButton();
        txtProveedor = new javax.swing.JTextField();
        txtIdprod = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cb_categoria = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtNombreP = new javax.swing.JTextField();
        btnAgregarProv = new javax.swing.JButton();
        spStock = new javax.swing.JSpinner();
        spPrecioP = new javax.swing.JSpinner();
        lb_idP = new javax.swing.JLabel();
        lb_fotoP = new javax.swing.JLabel();
        lb_categoriaP = new javax.swing.JLabel();
        lb_proveedorP = new javax.swing.JLabel();
        lb_nombreV4 = new javax.swing.JLabel();
        lb_nombreP = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblTITULO = new javax.swing.JLabel();
        dlgCategoria = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txt_IdCate = new javax.swing.JTextField();
        txt_nomCate = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCategoria = new javax.swing.JTable();
        btn_agregarCate = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        dlgProveedores = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        txtbusqProv = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtproveedor = new javax.swing.JTable();
        dlgFiltrosCategoria = new javax.swing.JDialog();
        txt_FCBusqueda = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblFiltroCategoria = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btn_FCLimpiar = new javax.swing.JButton();
        btn_FCSeleccionar = new javax.swing.JButton();
        dlgFiltrosProveedores = new javax.swing.JDialog();
        txtFiltrobusqProv = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtFiltroproveedor = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        btn_FPLimpiar = new javax.swing.JButton();
        btn_FPSeleccionar1 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtBuscarP = new javax.swing.JTextField();
        btnAgregarP = new javax.swing.JButton();
        btnModificarP = new javax.swing.JButton();
        btnEliminarP = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnImprimirP = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cbFiltroVentas = new javax.swing.JComboBox<>();
        btnFiltroProveedor = new javax.swing.JButton();
        txtFiltroProveedor = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtOpcionProd = new javax.swing.JTextField();
        spOpcionCantidad = new javax.swing.JSpinner();
        btnFiltroCategoria = new javax.swing.JButton();
        txtFiltroCategoria = new javax.swing.JTextField();
        btnOpcionOK = new javax.swing.JButton();

        dlgCrearProd.setResizable(false);
        dlgCrearProd.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(99, 166, 183));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAceptarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/aceptar.png"))); // NOI18N
        btnAceptarP.setText("Aceptar");
        btnAceptarP.setBorderPainted(false);
        jPanel3.add(btnAceptarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, -1, -1));

        btnCancelarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/cancelar.png"))); // NOI18N
        btnCancelarP.setText("Cancelar");
        btnCancelarP.setBorderPainted(false);
        jPanel3.add(btnCancelarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, -1, -1));

        btnExaminarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/subir.png"))); // NOI18N
        btnExaminarP.setText("Examinar");
        btnExaminarP.setBorderPainted(false);
        btnExaminarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExaminarPActionPerformed(evt);
            }
        });
        jPanel3.add(btnExaminarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, -1, -1));

        lblFoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(lblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 140, 180));

        btnCategoria.setText("Crear Categoria");
        btnCategoria.setBorderPainted(false);
        jPanel3.add(btnCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 120, 30));
        jPanel3.add(txtProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 110, -1));
        jPanel3.add(txtIdprod, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 210, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        jPanel3.add(cb_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 170, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel2.setText("ID PRODUCTO:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel4.setText("NOMBRE:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel5.setText("PRECIO:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel6.setText("STOCK:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel11.setText("$");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel13.setText("Proveedor:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel14.setText("CATEGORIA:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));
        jPanel3.add(txtNombreP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 210, -1));

        btnAgregarProv.setText("Agregar");
        jPanel3.add(btnAgregarProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 90, 30));

        spStock.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel3.add(spStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 90, -1));

        spPrecioP.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));
        jPanel3.add(spPrecioP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 90, -1));

        lb_idP.setFont(new java.awt.Font("Arial", 3, 10)); // NOI18N
        lb_idP.setForeground(new java.awt.Color(255, 51, 51));
        jPanel3.add(lb_idP, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 180, 20));

        lb_fotoP.setFont(new java.awt.Font("Arial", 3, 10)); // NOI18N
        lb_fotoP.setForeground(new java.awt.Color(255, 51, 51));
        jPanel3.add(lb_fotoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 130, 20));

        lb_categoriaP.setFont(new java.awt.Font("Arial", 3, 10)); // NOI18N
        lb_categoriaP.setForeground(new java.awt.Color(255, 51, 51));
        jPanel3.add(lb_categoriaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 150, 20));

        lb_proveedorP.setFont(new java.awt.Font("Arial", 3, 10)); // NOI18N
        lb_proveedorP.setForeground(new java.awt.Color(255, 51, 51));
        jPanel3.add(lb_proveedorP, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 170, 20));

        lb_nombreV4.setFont(new java.awt.Font("Arial", 3, 10)); // NOI18N
        lb_nombreV4.setForeground(new java.awt.Color(255, 51, 51));
        jPanel3.add(lb_nombreV4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 130, 20));

        lb_nombreP.setFont(new java.awt.Font("Arial", 3, 10)); // NOI18N
        lb_nombreP.setForeground(new java.awt.Color(255, 51, 51));
        jPanel3.add(lb_nombreP, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 130, 20));

        dlgCrearProd.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 790, 420));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        lblTITULO.setBackground(new java.awt.Color(255, 255, 255));
        lblTITULO.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTITULO.setForeground(new java.awt.Color(255, 255, 255));
        lblTITULO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/caja.png"))); // NOI18N
        lblTITULO.setText("     CREAR PRODUCTOS");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(lblTITULO, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(233, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(lblTITULO)
                .addGap(17, 17, 17))
        );

        dlgCrearProd.getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 70));

        dlgCategoria.setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel9.setText("ID CATEGORIA:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 110, -1, -1));
        jPanel2.add(txt_IdCate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 179, -1));
        jPanel2.add(txt_nomCate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 179, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel10.setText("NOMBRE:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 146, -1, -1));

        tblCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Categoria", "Nombre Categoria"
            }
        ));
        jScrollPane2.setViewportView(tblCategoria);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 310, 111));

        btn_agregarCate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/agregar-archivo.png"))); // NOI18N
        btn_agregarCate.setText("Agregar");
        btn_agregarCate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarCateActionPerformed(evt);
            }
        });
        jPanel2.add(btn_agregarCate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, -1, 39));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setForeground(new java.awt.Color(51, 51, 51));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/caja.png"))); // NOI18N
        jLabel8.setText("CATEGORIAS");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel8)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(20, 20, 20))
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, -1));

        javax.swing.GroupLayout dlgCategoriaLayout = new javax.swing.GroupLayout(dlgCategoria.getContentPane());
        dlgCategoria.getContentPane().setLayout(dlgCategoriaLayout);
        dlgCategoriaLayout.setHorizontalGroup(
            dlgCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        dlgCategoriaLayout.setVerticalGroup(
            dlgCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dlgProveedores.setResizable(false);

        jPanel5.setBackground(new java.awt.Color(99, 166, 183));

        jLabel25.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel25.setText("Busqueda:");

        txtbusqProv.setToolTipText("Cuador de busqueda");

        jtproveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RUC", "Nombre", "Apellido", "Telefono", "Direccion", "Descripcion", "Empresa", "Email"
            }
        ));
        jScrollPane3.setViewportView(jtproveedor);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addComponent(txtbusqProv, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbusqProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout dlgProveedoresLayout = new javax.swing.GroupLayout(dlgProveedores.getContentPane());
        dlgProveedores.getContentPane().setLayout(dlgProveedoresLayout);
        dlgProveedoresLayout.setHorizontalGroup(
            dlgProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgProveedoresLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        dlgProveedoresLayout.setVerticalGroup(
            dlgProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dlgFiltrosCategoria.setResizable(false);
        dlgFiltrosCategoria.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_FCBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_FCBusquedaActionPerformed(evt);
            }
        });
        dlgFiltrosCategoria.getContentPane().add(txt_FCBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 320, -1));

        jLabel23.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel23.setText("Busqueda:");
        dlgFiltrosCategoria.getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        tblFiltroCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Categoria", "Nombre Categoria"
            }
        ));
        jScrollPane4.setViewportView(tblFiltroCategoria);

        dlgFiltrosCategoria.getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 530, 111));

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setForeground(new java.awt.Color(51, 51, 51));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/caja.png"))); // NOI18N
        jLabel24.setText("CATEGORIAS");
        jPanel7.add(jLabel24);

        dlgFiltrosCategoria.getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, -1));

        btn_FCLimpiar.setText("Limpiar Eleccion");
        jPanel8.add(btn_FCLimpiar);

        btn_FCSeleccionar.setText("Seleccionar");
        btn_FCSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FCSeleccionarActionPerformed(evt);
            }
        });
        jPanel8.add(btn_FCSeleccionar);

        dlgFiltrosCategoria.getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 530, 40));

        dlgFiltrosProveedores.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dlgFiltrosProveedores.setResizable(false);

        txtFiltrobusqProv.setToolTipText("Cuador de busqueda");

        jtFiltroproveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RUC", "Nombre", "Apellido", "Telefono", "Direccion", "Descripcion", "Empresa", "Email"
            }
        ));
        jScrollPane5.setViewportView(jtFiltroproveedor);

        jLabel26.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel26.setText("Busqueda:");

        btn_FPLimpiar.setText("Limpiar Eleccion");
        jPanel9.add(btn_FPLimpiar);

        btn_FPSeleccionar1.setText("Seleccionar");
        btn_FPSeleccionar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FPSeleccionar1ActionPerformed(evt);
            }
        });
        jPanel9.add(btn_FPSeleccionar1);

        javax.swing.GroupLayout dlgFiltrosProveedoresLayout = new javax.swing.GroupLayout(dlgFiltrosProveedores.getContentPane());
        dlgFiltrosProveedores.getContentPane().setLayout(dlgFiltrosProveedoresLayout);
        dlgFiltrosProveedoresLayout.setHorizontalGroup(
            dlgFiltrosProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgFiltrosProveedoresLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel26)
                .addGap(18, 18, 18)
                .addComponent(txtFiltrobusqProv, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        dlgFiltrosProveedoresLayout.setVerticalGroup(
            dlgFiltrosProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgFiltrosProveedoresLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(dlgFiltrosProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFiltrobusqProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setClosable(true);
        setIconifiable(true);
        setTitle("Productos");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/1x16.png"))); // NOI18N

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Cantidad");
        jDesktopPane1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, -1, -1));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        txtBuscarP.setToolTipText("Area de busqueda");

        btnAgregarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/agregar.png"))); // NOI18N
        btnAgregarP.setText("Agregar");
        btnAgregarP.setBorderPainted(false);

        btnModificarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/editar-documento (1).png"))); // NOI18N
        btnModificarP.setText("Modificar");
        btnModificarP.setBorderPainted(false);

        btnEliminarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/basura.png"))); // NOI18N
        btnEliminarP.setText("Eliminar");
        btnEliminarP.setBorderPainted(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/lupa.png"))); // NOI18N

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/caja.png"))); // NOI18N
        jLabel7.setText("Productos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(txtBuscarP, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(btnAgregarP)
                .addGap(18, 18, 18)
                .addComponent(btnModificarP)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarP)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarP)
                    .addComponent(btnModificarP)
                    .addComponent(btnEliminarP))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtBuscarP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGap(353, 353, 353))
        );

        jDesktopPane1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 95));

        btnImprimirP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/impresion.png"))); // NOI18N
        btnImprimirP.setText("Imprimir");
        btnImprimirP.setBorderPainted(false);
        jDesktopPane1.add(btnImprimirP, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 419, -1, -1));

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "PRECIO", "CANTIDAD", "Proveedor", "ID CATEGORIA", "FOTO", "Ventas"
            }
        ));
        jScrollPane1.setViewportView(tblProductos);

        jDesktopPane1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 640, 290));
        jDesktopPane1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, -1, -1));

        jLabel17.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Proveedor");
        jDesktopPane1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, -1, -1));

        jLabel18.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Ventas");
        jDesktopPane1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, -1, -1));

        jLabel19.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Opciones rapidas");
        jDesktopPane1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 310, -1, -1));

        cbFiltroVentas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mas Vendidos", "Menos Vendidos" }));
        jDesktopPane1.add(cbFiltroVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 260, 100, -1));

        btnFiltroProveedor.setText("Seleccionar");
        btnFiltroProveedor.setBorderPainted(false);
        jDesktopPane1.add(btnFiltroProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 200, -1, -1));

        txtFiltroProveedor.setEditable(false);
        txtFiltroProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiltroProveedorActionPerformed(evt);
            }
        });
        jDesktopPane1.add(txtFiltroProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 200, 140, 30));
        jDesktopPane1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, 330, -1));

        jLabel20.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Filtros de busqueda");
        jDesktopPane1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, -1, -1));

        jLabel21.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Categoria");
        jDesktopPane1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, -1, -1));

        jLabel22.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Producto");
        jDesktopPane1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 340, -1, -1));

        txtOpcionProd.setEditable(false);
        jDesktopPane1.add(txtOpcionProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 340, 130, -1));

        spOpcionCantidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jDesktopPane1.add(spOpcionCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 380, 130, -1));

        btnFiltroCategoria.setText("Seleccionar");
        btnFiltroCategoria.setBorderPainted(false);
        jDesktopPane1.add(btnFiltroCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 160, -1, -1));

        txtFiltroCategoria.setEditable(false);
        txtFiltroCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiltroCategoriaActionPerformed(evt);
            }
        });
        jDesktopPane1.add(txtFiltroCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 160, 140, 30));

        btnOpcionOK.setText("OK");
        btnOpcionOK.setBorderPainted(false);
        jDesktopPane1.add(btnOpcionOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 360, 70, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarCateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarCateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_agregarCateActionPerformed

    private void btnExaminarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExaminarPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExaminarPActionPerformed

    private void txtFiltroProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltroProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFiltroProveedorActionPerformed

    private void txtFiltroCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltroCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFiltroCategoriaActionPerformed

    private void btn_FCSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FCSeleccionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_FCSeleccionarActionPerformed

    private void txt_FCBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_FCBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_FCBusquedaActionPerformed

    private void btn_FPSeleccionar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FPSeleccionar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_FPSeleccionar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarP;
    private javax.swing.JButton btnAgregarP;
    private javax.swing.JButton btnAgregarProv;
    private javax.swing.JButton btnCancelarP;
    private javax.swing.JButton btnCategoria;
    private javax.swing.JButton btnEliminarP;
    private javax.swing.JButton btnExaminarP;
    private javax.swing.JButton btnFiltroCategoria;
    private javax.swing.JButton btnFiltroProveedor;
    private javax.swing.JButton btnImprimirP;
    private javax.swing.JButton btnModificarP;
    private javax.swing.JButton btnOpcionOK;
    private javax.swing.JButton btn_FCLimpiar;
    private javax.swing.JButton btn_FCSeleccionar;
    private javax.swing.JButton btn_FPLimpiar;
    private javax.swing.JButton btn_FPSeleccionar1;
    private javax.swing.JButton btn_agregarCate;
    private javax.swing.JComboBox<String> cbFiltroVentas;
    private javax.swing.JComboBox<String> cb_categoria;
    private javax.swing.JDialog dlgCategoria;
    private javax.swing.JDialog dlgCrearProd;
    private javax.swing.JDialog dlgFiltrosCategoria;
    private javax.swing.JDialog dlgFiltrosProveedores;
    private javax.swing.JDialog dlgProveedores;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jtFiltroproveedor;
    private javax.swing.JTable jtproveedor;
    private javax.swing.JLabel lb_categoriaP;
    private javax.swing.JLabel lb_fotoP;
    private javax.swing.JLabel lb_idP;
    private javax.swing.JLabel lb_nombreP;
    private javax.swing.JLabel lb_nombreV4;
    private javax.swing.JLabel lb_proveedorP;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblTITULO;
    private javax.swing.JSpinner spOpcionCantidad;
    private javax.swing.JSpinner spPrecioP;
    private javax.swing.JSpinner spStock;
    private javax.swing.JTable tblCategoria;
    private javax.swing.JTable tblFiltroCategoria;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtBuscarP;
    private javax.swing.JTextField txtFiltroCategoria;
    private javax.swing.JTextField txtFiltroProveedor;
    private javax.swing.JTextField txtFiltrobusqProv;
    private javax.swing.JTextField txtIdprod;
    private javax.swing.JTextField txtNombreP;
    private javax.swing.JTextField txtOpcionProd;
    private javax.swing.JTextField txtProveedor;
    private javax.swing.JTextField txt_FCBusqueda;
    private javax.swing.JTextField txt_IdCate;
    private javax.swing.JTextField txt_nomCate;
    private javax.swing.JTextField txtbusqProv;
    // End of variables declaration//GEN-END:variables
}
