/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Facturacion;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class VistaRepFacturacion extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaRepFacturacion
     */
    public VistaRepFacturacion() {
        initComponents();
    }

    public JDateChooser getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(JDateChooser FechaFin) {
        this.FechaFin = FechaFin;
    }

    public JDateChooser getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(JDateChooser FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public JSpinner getSpinMenores() {
        return SpinMenores;
    }

    public void setSpinMenores(JSpinner SpinMenores) {
        this.SpinMenores = SpinMenores;
    }

    public JSpinner getSpnMayores() {
        return SpnMayores;
    }

    public void setSpnMayores(JSpinner SpnMayores) {
        this.SpnMayores = SpnMayores;
    }

    public JButton getBtnAgregar_FacR() {
        return btnAgregar_FacR;
    }

    public void setBtnAgregar_FacR(JButton btnAgregar_FacR) {
        this.btnAgregar_FacR = btnAgregar_FacR;
    }

    public JButton getBtnImprimir() {
        return btnImprimir;
    }

    public void setBtnImprimir(JButton btnImprimir) {
        this.btnImprimir = btnImprimir;
    }

    public JComboBox<String> getCb_ClientesT() {
        return cb_ClientesT;
    }

    public void setCb_ClientesT(JComboBox<String> cb_ClientesT) {
        this.cb_ClientesT = cb_ClientesT;
    }

    public JRadioButton getRbActivar() {
        return rbActivar;
    }

    public void setRbActivar(JRadioButton rbActivar) {
        this.rbActivar = rbActivar;
    }

    public JRadioButton getRbDesactivar() {
        return rbDesactivar;
    }

    public void setRbDesactivar(JRadioButton rbDesactivar) {
        this.rbDesactivar = rbDesactivar;
    }

    public JTable getTbl_ReporteFac() {
        return tbl_ReporteFac;
    }

    public void setTbl_ReporteFac(JTable tbl_ReporteFac) {
        this.tbl_ReporteFac = tbl_ReporteFac;
    }

    public JTextField getTxtBuscarIDFAC() {
        return txtBuscarIDFAC;
    }

    public void setTxtBuscarIDFAC(JTextField txtBuscarIDFAC) {
        this.txtBuscarIDFAC = txtBuscarIDFAC;
    }

    public JTextField getTxt_IDCliRep() {
        return txt_IDCliRep;
    }

    public void setTxt_IDCliRep(JTextField txt_IDCliRep) {
        this.txt_IDCliRep = txt_IDCliRep;
    }

    public JButton getBtnAgre_Fac() {
        return btnAgre_Fac;
    }

    public void setBtnAgre_Fac(JButton btnAgre_Fac) {
        this.btnAgre_Fac = btnAgre_Fac;
    }

    public JButton getBtnLimpiar_Re() {
        return btnLimpiar_Re;
    }

    public void setBtnLimpiar_Re(JButton btnLimpiar_Re) {
        this.btnLimpiar_Re = btnLimpiar_Re;
    }

    public JDialog getDlgClientesRep() {
        return dlgClientesRep;
    }

    public void setDlgClientesRep(JDialog dlgClientesRep) {
        this.dlgClientesRep = dlgClientesRep;
    }

    public JTable getTblClientes_Re() {
        return tblClientes_Re;
    }

    public void setTblClientes_Re(JTable tblClientes_Re) {
        this.tblClientes_Re = tblClientes_Re;
    }

    public JTextField getTxtBuscar_CliRe() {
        return txtBuscar_CliRe;
    }

    public void setTxtBuscar_CliRe(JTextField txtBuscar_CliRe) {
        this.txtBuscar_CliRe = txtBuscar_CliRe;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgClientesRep = new javax.swing.JDialog();
        jPanel14 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        txtBuscar_CliRe = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblClientes_Re = new javax.swing.JTable();
        btnAgre_Fac = new javax.swing.JButton();
        btnLimpiar_Re = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        txt_IDCliRep = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        FechaInicio = new com.toedter.calendar.JDateChooser();
        jLabel43 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        cb_ClientesT = new javax.swing.JComboBox<>();
        btnAgregar_FacR = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        SpnMayores = new javax.swing.JSpinner();
        SpinMenores = new javax.swing.JSpinner();
        jLabel46 = new javax.swing.JLabel();
        FechaFin = new com.toedter.calendar.JDateChooser();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        btnImprimir = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbl_ReporteFac = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        txtBuscarIDFAC = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        rbActivar = new javax.swing.JRadioButton();
        rbDesactivar = new javax.swing.JRadioButton();
        jLabel52 = new javax.swing.JLabel();

        dlgClientesRep.setResizable(false);

        jPanel14.setBackground(new java.awt.Color(51, 51, 51));

        jLabel44.setBackground(new java.awt.Color(255, 255, 255));
        jLabel44.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/velocidad.png"))); // NOI18N
        jLabel44.setText("CLIENTES");

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        tblClientes_Re.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Cliente", "Nombre", "Apellido"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(tblClientes_Re);

        btnAgre_Fac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/agregar-archivo.png"))); // NOI18N
        btnAgre_Fac.setText("Agregar");
        btnAgre_Fac.setBorderPainted(false);

        btnLimpiar_Re.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/codigo-limpio.png"))); // NOI18N
        btnLimpiar_Re.setText("Limpiar");
        btnLimpiar_Re.setBorderPainted(false);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgre_Fac)
                .addGap(28, 28, 28)
                .addComponent(btnLimpiar_Re)
                .addGap(33, 33, 33))
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar_Re)
                    .addComponent(btnAgre_Fac))
                .addGap(14, 14, 14))
        );

        jLabel50.setBackground(new java.awt.Color(255, 255, 255));
        jLabel50.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Buscar:");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar_CliRe, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel44))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar_CliRe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50))
                .addGap(18, 18, 18)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout dlgClientesRepLayout = new javax.swing.GroupLayout(dlgClientesRep.getContentPane());
        dlgClientesRep.getContentPane().setLayout(dlgClientesRepLayout);
        dlgClientesRepLayout.setHorizontalGroup(
            dlgClientesRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dlgClientesRepLayout.setVerticalGroup(
            dlgClientesRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel41.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel41.setText("Cliente");
        jPanel8.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, -1, -1));
        jPanel8.add(txt_IDCliRep, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 70, 121, -1));

        jLabel42.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel42.setText("Hasta:");
        jPanel8.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, -1, -1));
        jPanel8.add(FechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 120, 160, 20));

        jLabel43.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/lupa.png"))); // NOI18N
        jLabel43.setText("FILTRO DE BUSQUEDA");
        jPanel8.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, -1, -1));

        jLabel40.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel40.setText("Clientes Top:");
        jPanel8.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, -1, -1));

        cb_ClientesT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Clientes Top", "Clientes Regulares", "Clientes Ocasionales" }));
        jPanel8.add(cb_ClientesT, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 180, 160, 30));

        btnAgregar_FacR.setText("Agregar");
        btnAgregar_FacR.setBorderPainted(false);
        jPanel8.add(btnAgregar_FacR, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel10.setText("Facturas Mayores a:");
        jPanel8.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 140, -1));

        SpnMayores.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel8.add(SpnMayores, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 220, 130, -1));

        SpinMenores.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel8.add(SpinMenores, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 260, 130, -1));

        jLabel46.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel46.setText("Facturas Menores a:");
        jPanel8.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, -1, -1));
        jPanel8.add(FechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 150, 160, 20));

        jLabel48.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel48.setText("Fechas:");
        jPanel8.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, -1, 10));

        jLabel49.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel49.setText("Desde:");
        jPanel8.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, -1, -1));

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/impresion.png"))); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.setBorderPainted(false);
        jPanel8.add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 300, -1, 34));

        tbl_ReporteFac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Factura", "Vendedor", "ID Cliente", "Nombre Cliente", "Fecha de compra", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(tbl_ReporteFac);

        jPanel8.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 600, 330));

        jPanel16.setBackground(new java.awt.Color(51, 51, 51));
        jPanel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel39.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(126, 197, 68));
        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/banco.png"))); // NOI18N
        jLabel39.setText("FACTURACION");

        jLabel51.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Buscar:");

        rbActivar.setBackground(new java.awt.Color(51, 51, 51));
        rbActivar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        rbActivar.setForeground(new java.awt.Color(255, 255, 255));
        rbActivar.setText("Activar");

        rbDesactivar.setBackground(new java.awt.Color(51, 51, 51));
        rbDesactivar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        rbDesactivar.setForeground(new java.awt.Color(255, 255, 255));
        rbDesactivar.setText("Desactivar");

        jLabel52.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Herramientas de busqueda");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarIDFAC, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(rbActivar)
                        .addGap(18, 18, 18)
                        .addComponent(rbDesactivar))
                    .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(164, 164, 164))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel52)
                        .addGap(9, 9, 9)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbActivar)
                            .addComponent(rbDesactivar)))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscarIDFAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel51))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaFin;
    private com.toedter.calendar.JDateChooser FechaInicio;
    private javax.swing.JSpinner SpinMenores;
    private javax.swing.JSpinner SpnMayores;
    private javax.swing.JButton btnAgre_Fac;
    private javax.swing.JButton btnAgregar_FacR;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLimpiar_Re;
    private javax.swing.JComboBox<String> cb_ClientesT;
    private javax.swing.JDialog dlgClientesRep;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JRadioButton rbActivar;
    private javax.swing.JRadioButton rbDesactivar;
    private javax.swing.JTable tblClientes_Re;
    private javax.swing.JTable tbl_ReporteFac;
    private javax.swing.JTextField txtBuscarIDFAC;
    private javax.swing.JTextField txtBuscar_CliRe;
    private javax.swing.JTextField txt_IDCliRep;
    // End of variables declaration//GEN-END:variables
}
