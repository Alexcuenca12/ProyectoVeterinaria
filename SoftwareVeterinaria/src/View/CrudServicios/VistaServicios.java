
package View.CrudServicios;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VistaServicios extends javax.swing.JInternalFrame {

    public VistaServicios() {
        initComponents();
    }

    public JLabel getLb_costoS() {
        return lb_costoS;
    }

    public JDialog getDlgReporteServicio() {
        return DlgReporteServicio;
    }

    public void setDlgReporteServicio(JDialog DlgReporteServicio) {
        this.DlgReporteServicio = DlgReporteServicio;
    }

    public JButton getBtnReporteImprimir() {
        return btnReporteImprimir;
    }

    public void setBtnReporteImprimir(JButton btnReporteImprimir) {
        this.btnReporteImprimir = btnReporteImprimir;
    }

    public JTextField getTxtReporteIdServicio() {
        return txtReporteIdServicio;
    }

    public void setTxtReporteIdServicio(JTextField txtReporteIdServicio) {
        this.txtReporteIdServicio = txtReporteIdServicio;
    }

    public JTextField getTxtReporteNombre() {
        return txtReporteNombre;
    }

    public void setTxtReporteNombre(JTextField txtReporteNombre) {
        this.txtReporteNombre = txtReporteNombre;
    }

    public void setLb_costoS(JLabel lb_costoS) {
        this.lb_costoS = lb_costoS;
    }

    public JLabel getLb_descripcionS() {
        return lb_descripcionS;
    }

    public void setLb_descripcionS(JLabel lb_descripcionS) {
        this.lb_descripcionS = lb_descripcionS;
    }

    public JLabel getLb_idS() {
        return lb_idS;
    }

    public void setLb_idS(JLabel lb_idS) {
        this.lb_idS = lb_idS;
    }

    public JLabel getLb_nombreS() {
        return lb_nombreS;
    }

    public void setLb_nombreS(JLabel lb_nombreS) {
        this.lb_nombreS = lb_nombreS;
    }
    
    
    
    public JTable getTabla_Servicios() {
        return Tabla_Servicios;
    }

    public void setTabla_Servicios(JTable Tabla_Servicios) {
        this.Tabla_Servicios = Tabla_Servicios;
    }

    public JButton getBtnEditar() {
        return btnEditar;
    }

    public void setBtnEditar(JButton btnEditar) {
        this.btnEditar = btnEditar;
    }

    public JButton getBtnIngresar() {
        return btnIngresar;
    }

    public void setBtnIngresar(JButton btnIngresar) {
        this.btnIngresar = btnIngresar;
    }

    public JButton getBtnRemover() {
        return btnRemover;
    }

    public void setBtnRemover(JButton btnRemover) {
        this.btnRemover = btnRemover;
    }

    public JButton getBtnaceptar() {
        return btnaceptar;
    }

    public void setBtnaceptar(JButton btnaceptar) {
        this.btnaceptar = btnaceptar;
    }

    public JButton getBtnimprimir() {
        return btnimprimir;
    }

    public void setBtnimprimir(JButton btnimprimir) {
        this.btnimprimir = btnimprimir;
    }

    public JDialog getDlgservicios() {
        return dlgservicios;
    }

    public void setDlgservicios(JDialog dlgservicios) {
        this.dlgservicios = dlgservicios;
    }

    public JSpinner getSpcosto() {
        return spcosto;
    }

    public void setSpcosto(JSpinner spcosto) {
        this.spcosto = spcosto;
    }

    public JTextArea getTxadescripcion() {
        return txadescripcion;
    }

    public void setTxadescripcion(JTextArea txadescripcion) {
        this.txadescripcion = txadescripcion;
    }

    public JTextField getTxtBuscar() {
        return txtBuscar;
    }

    public void setTxtBuscar(JTextField txtBuscar) {
        this.txtBuscar = txtBuscar;
    }

    public JTextField getTxtidservicio() {
        return txtidservicio;
    }

    public void setTxtidservicio(JTextField txtidservicio) {
        this.txtidservicio = txtidservicio;
    }

    public JTextField getTxtnombre() {
        return txtnombre;
    }

    public void setTxtnombre(JTextField txtnombre) {
        this.txtnombre = txtnombre;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgservicios = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        btnaceptar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txadescripcion = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        spcosto = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtidservicio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lb_idS = new javax.swing.JLabel();
        lb_nombreS = new javax.swing.JLabel();
        lb_costoS = new javax.swing.JLabel();
        lb_descripcionS = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        DlgReporteServicio = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnReporteImprimir = new javax.swing.JButton();
        txtReporteNombre = new javax.swing.JTextField();
        txtReporteIdServicio = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnIngresar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Servicios = new javax.swing.JTable();
        btnimprimir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        dlgservicios.setBackground(new java.awt.Color(51, 51, 51));
        dlgservicios.setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnaceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/aceptar.png"))); // NOI18N
        btnaceptar.setText("Aceptar");
        btnaceptar.setBorderPainted(false);
        btnaceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(btnaceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel4.setText("Descripcion");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        txadescripcion.setColumns(20);
        txadescripcion.setRows(5);
        jScrollPane2.setViewportView(txadescripcion);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 290, 120));

        jLabel5.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel5.setText("Costo");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 60, -1));

        spcosto.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 1.0f));
        jPanel3.add(spcosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 180, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel3.setText("Nombre");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 70, -1));

        txtnombre.setToolTipText("Ingrese un nombre para el servicio");
        jPanel3.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 180, -1));

        txtidservicio.setEditable(false);
        txtidservicio.setToolTipText("Identificador del servicio");
        jPanel3.add(txtidservicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 180, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel8.setText("ID Servicio");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 90, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/beautiful-brunette-woman.jpg"))); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 340, 390));

        lb_idS.setFont(new java.awt.Font("Arial", 3, 10)); // NOI18N
        lb_idS.setForeground(new java.awt.Color(255, 51, 51));
        jPanel3.add(lb_idS, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 120, 20));

        lb_nombreS.setFont(new java.awt.Font("Arial", 3, 10)); // NOI18N
        lb_nombreS.setForeground(new java.awt.Color(255, 51, 51));
        jPanel3.add(lb_nombreS, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 120, 20));

        lb_costoS.setFont(new java.awt.Font("Arial", 3, 10)); // NOI18N
        lb_costoS.setForeground(new java.awt.Color(255, 51, 51));
        jPanel3.add(lb_costoS, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 120, 20));

        lb_descripcionS.setFont(new java.awt.Font("Arial", 3, 10)); // NOI18N
        lb_descripcionS.setForeground(new java.awt.Color(255, 51, 51));
        jPanel3.add(lb_descripcionS, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 130, 20));

        dlgservicios.getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setFocusCycleRoot(true);

        jLabel2.setFont(new java.awt.Font("Arial", 3, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(126, 197, 68));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/servicios.png"))); // NOI18N
        jLabel2.setText("Servicio");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        dlgservicios.getContentPane().add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 204, 0));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/seo.png"))); // NOI18N
        jLabel10.setText("Parametros para Imprimir");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(17, 17, 17))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Bucar por:");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 23, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel12.setText("ID Servicio:");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 67, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel13.setText("Nombre:");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 100, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/pugbuscar.png"))); // NOI18N
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 180, -1));

        btnReporteImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/impresion.png"))); // NOI18N
        btnReporteImprimir.setText("Imprimir");
        btnReporteImprimir.setBorderPainted(false);
        btnReporteImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(btnReporteImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 125, -1, -1));
        jPanel6.add(txtReporteNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 91, 170, -1));
        jPanel6.add(txtReporteIdServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 58, 170, -1));

        javax.swing.GroupLayout DlgReporteServicioLayout = new javax.swing.GroupLayout(DlgReporteServicio.getContentPane());
        DlgReporteServicio.getContentPane().setLayout(DlgReporteServicioLayout);
        DlgReporteServicioLayout.setHorizontalGroup(
            DlgReporteServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DlgReporteServicioLayout.setVerticalGroup(
            DlgReporteServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DlgReporteServicioLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setBackground(new java.awt.Color(51, 51, 51));
        setClosable(true);
        setIconifiable(true);
        setTitle("Servicios");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/10x16.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/agregar.png"))); // NOI18N
        btnIngresar.setText("INGRESAR");
        btnIngresar.setBorderPainted(false);
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, -1, -1));

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/editar-documento (1).png"))); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.setBorderPainted(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, -1, -1));

        btnRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/basura.png"))); // NOI18N
        btnRemover.setText("REMOVER");
        btnRemover.setBorderPainted(false);
        btnRemover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/informacion.png"))); // NOI18N
        jLabel1.setToolTipText("Ingrese en el cuadro de busqueda el ID o Nombre del servicio");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, -1));
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 302, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Arial", 3, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(126, 197, 68));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/servicios.png"))); // NOI18N
        jLabel6.setText("Servicios");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Buscar:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 90, -1));

        jPanel2.setBackground(new java.awt.Color(251, 118, 33));
        jPanel2.setForeground(new java.awt.Color(11, 29, 33));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla_Servicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "DESCRIPCION", "COSTO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_Servicios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(Tabla_Servicios);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 700, 270));

        btnimprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/impresion.png"))); // NOI18N
        btnimprimir.setText("IMPRIMIR");
        btnimprimir.setBorderPainted(false);
        btnimprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(btnimprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/pngegg (10).png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog DlgReporteServicio;
    private javax.swing.JTable Tabla_Servicios;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnReporteImprimir;
    private javax.swing.JButton btnaceptar;
    private javax.swing.JButton btnimprimir;
    private javax.swing.JDialog dlgservicios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_costoS;
    private javax.swing.JLabel lb_descripcionS;
    private javax.swing.JLabel lb_idS;
    private javax.swing.JLabel lb_nombreS;
    private javax.swing.JSpinner spcosto;
    private javax.swing.JTextArea txadescripcion;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtReporteIdServicio;
    private javax.swing.JTextField txtReporteNombre;
    private javax.swing.JTextField txtidservicio;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
