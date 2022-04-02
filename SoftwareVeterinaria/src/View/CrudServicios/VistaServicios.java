
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

    public JButton getBtncancelar() {
        return btncancelar;
    }

    public void setBtncancelar(JButton btncancelar) {
        this.btncancelar = btncancelar;
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
        btncancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txadescripcion = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        spcosto = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtidservicio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lb_idS = new javax.swing.JLabel();
        lb_nombreS = new javax.swing.JLabel();
        lb_costoS = new javax.swing.JLabel();
        lb_descripcionS = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnIngresar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Servicios = new javax.swing.JTable();
        btnimprimir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        dlgservicios.setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnaceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/aceptar.png"))); // NOI18N
        btnaceptar.setText("Aceptar");
        btnaceptar.setBorderPainted(false);
        jPanel3.add(btnaceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/cancelar.png"))); // NOI18N
        btncancelar.setText("Cancelar");
        btncancelar.setBorderPainted(false);
        jPanel3.add(btncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel4.setText("Descripcion");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        txadescripcion.setColumns(20);
        txadescripcion.setRows(5);
        jScrollPane2.setViewportView(txadescripcion);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 290, 120));

        jLabel5.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel5.setText("Costo");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        spcosto.setModel(new javax.swing.SpinnerNumberModel(1.0f, 1.0f, null, 1.0f));
        jPanel3.add(spcosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 160, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel3.setText("Nombre");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        txtnombre.setToolTipText("Ingrese un nombre para el servicio");
        jPanel3.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 163, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/servicios.png"))); // NOI18N
        jLabel2.setText("Servicio");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        txtidservicio.setToolTipText("Identificador del servicio");
        jPanel3.add(txtidservicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 163, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel8.setText("ID Servicio");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/beautiful-brunette-woman.jpg"))); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 340, 390));

        lb_idS.setFont(new java.awt.Font("Arial", 3, 10)); // NOI18N
        lb_idS.setForeground(new java.awt.Color(255, 51, 51));
        jPanel3.add(lb_idS, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 150, 20));

        lb_nombreS.setFont(new java.awt.Font("Arial", 3, 10)); // NOI18N
        lb_nombreS.setForeground(new java.awt.Color(255, 51, 51));
        jPanel3.add(lb_nombreS, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 150, 20));

        lb_costoS.setFont(new java.awt.Font("Arial", 3, 10)); // NOI18N
        lb_costoS.setForeground(new java.awt.Color(255, 51, 51));
        jPanel3.add(lb_costoS, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 150, 20));

        lb_descripcionS.setFont(new java.awt.Font("Arial", 3, 10)); // NOI18N
        lb_descripcionS.setForeground(new java.awt.Color(255, 51, 51));
        jPanel3.add(lb_descripcionS, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 190, 20));

        javax.swing.GroupLayout dlgserviciosLayout = new javax.swing.GroupLayout(dlgservicios.getContentPane());
        dlgservicios.getContentPane().setLayout(dlgserviciosLayout);
        dlgserviciosLayout.setHorizontalGroup(
            dlgserviciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        dlgserviciosLayout.setVerticalGroup(
            dlgserviciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/agregar.png"))); // NOI18N
        btnIngresar.setText("INGRESAR");
        btnIngresar.setBorderPainted(false);

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/editar-documento (1).png"))); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.setBorderPainted(false);

        btnRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/basura.png"))); // NOI18N
        btnRemover.setText("REMOVER");
        btnRemover.setBorderPainted(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/lupa.png"))); // NOI18N

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/servicios.png"))); // NOI18N
        jLabel6.setText("Servicios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIngresar)
                .addGap(18, 18, 18)
                .addComponent(btnEditar)
                .addGap(42, 42, 42)
                .addComponent(btnRemover)
                .addGap(158, 158, 158))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(60, 60, 60))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnIngresar)
                            .addComponent(btnEditar)
                            .addComponent(btnRemover)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(11, 29, 33));
        jPanel2.setForeground(new java.awt.Color(11, 29, 33));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla_Servicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "DESCRIPCION", "COSTO"
            }
        ));
        jScrollPane1.setViewportView(Tabla_Servicios);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 542, 176));

        btnimprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/impresion.png"))); // NOI18N
        btnimprimir.setText("IMPRIMIR");
        btnimprimir.setBorderPainted(false);
        jPanel2.add(btnimprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/beautiful-pet-portrait-of-cat.jpg"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 442, -1));

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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla_Servicios;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnaceptar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnimprimir;
    private javax.swing.JDialog dlgservicios;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_costoS;
    private javax.swing.JLabel lb_descripcionS;
    private javax.swing.JLabel lb_idS;
    private javax.swing.JLabel lb_nombreS;
    private javax.swing.JSpinner spcosto;
    private javax.swing.JTextArea txadescripcion;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtidservicio;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
