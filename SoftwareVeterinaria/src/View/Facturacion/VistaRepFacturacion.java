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
import javax.swing.JLabel;
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

    public JDateChooser getBusquedaFecha() {
        return Fecha2;
    }

    public void setBusquedaFecha(JDateChooser BusquedaFecha) {
        this.Fecha2 = BusquedaFecha;
    }

    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    public void setBtnBuscar(JButton btnBuscar) {
        this.btnBuscar = btnBuscar;
    }


    public JSpinner getSpinMenores() {
        return spnMenores;
    }

    public void setSpinMenores(JSpinner SpinMenores) {
        this.spnMenores = SpinMenores;
    }

    public JSpinner getSpnMayores() {
        return spnMayores;
    }

    public JButton getBtnImprimirTodo() {
        return btnImprimirTodo;
    }

    public void setBtnImprimirTodo(JButton btnImprimirTodo) {
        this.btnImprimirTodo = btnImprimirTodo;
    }

    public void setSpnMayores(JSpinner SpnMayores) {
        this.spnMayores = SpnMayores;
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

    public JButton getBtnBuscarMayoMen() {
        return btnBuscarMayoMen;
    }

    public void setBtnBuscarMayoMen(JButton btnBuscarMayoMen) {
        this.btnBuscarMayoMen = btnBuscarMayoMen;
    }

    public JRadioButton getRbMayor() {
        return rbMayor;
    }

    public void setRbMayor(JRadioButton rbMayor) {
        this.rbMayor = rbMayor;
    }

    public JRadioButton getRbMenor() {
        return rbMenor;
    }

    public void setRbMenor(JRadioButton rbMenor) {
        this.rbMenor = rbMenor;
    }

    public JSpinner getSpnMenores() {
        return spnMenores;
    }

    public void setSpnMenores(JSpinner spnMenores) {
        this.spnMenores = spnMenores;
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

    public JButton getBtnAgre_Fac() {
        return btnAgre_Fac;
    }

    public JLabel getLblCedula() {
        return lblCedula;
    }

    public void setLblCedula(JLabel lblCedula) {
        this.lblCedula = lblCedula;
    }

    public void setBtnAgre_Fac(JButton btnAgre_Fac) {
        this.btnAgre_Fac = btnAgre_Fac;
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

        btnGru = new javax.swing.ButtonGroup();
        dlgClientesRep = new javax.swing.JDialog();
        jPanel14 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        txtBuscar_CliRe = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblClientes_Re = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        btnAgre_Fac = new javax.swing.JButton();
        lblCedula = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbl_ReporteFac = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        cb_ClientesT = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        rbActivar = new javax.swing.JRadioButton();
        rbDesactivar = new javax.swing.JRadioButton();
        jLabel43 = new javax.swing.JLabel();
        btnImprimir = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        spnMayores = new javax.swing.JSpinner();
        jLabel46 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        spnMenores = new javax.swing.JSpinner();
        jPanel9 = new javax.swing.JPanel();
        rbMenor = new javax.swing.JRadioButton();
        rbMayor = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        btnBuscarMayoMen = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        txtBuscarIDFAC = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Fecha1 = new com.toedter.calendar.JDateChooser();
        Fecha2 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnImprimirTodo = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();

        dlgClientesRep.setResizable(false);

        jPanel14.setBackground(new java.awt.Color(51, 51, 51));

        jLabel44.setBackground(new java.awt.Color(255, 255, 255));
        jLabel44.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/velocidad.png"))); // NOI18N
        jLabel44.setText("CLIENTES");

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel15.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 398, 103));

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));

        btnAgre_Fac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/agregar-archivo.png"))); // NOI18N
        btnAgre_Fac.setText("Agregar");
        btnAgre_Fac.setBorderPainted(false);

        lblCedula.setBackground(new java.awt.Color(255, 255, 255));
        lblCedula.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnAgre_Fac)
                .addGap(150, 150, 150))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAgre_Fac, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel15.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 430, -1));

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
                        .addGap(39, 39, 39)
                        .addComponent(jLabel50)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscar_CliRe, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dlgClientesRepLayout = new javax.swing.GroupLayout(dlgClientesRep.getContentPane());
        dlgClientesRep.getContentPane().setLayout(dlgClientesRepLayout);
        dlgClientesRepLayout.setHorizontalGroup(
            dlgClientesRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        dlgClientesRepLayout.setVerticalGroup(
            dlgClientesRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setBackground(new java.awt.Color(51, 51, 51));
        setClosable(true);
        setIconifiable(true);

        jPanel8.setBackground(new java.awt.Color(251, 118, 33));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel8.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 590, 340));

        jPanel2.setBackground(new java.awt.Color(251, 118, 33));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 0, 0));
        jLabel40.setText("Clientes Top:");
        jPanel7.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        cb_ClientesT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Clientes Top", "Clientes Ocasionales" }));
        jPanel7.add(cb_ClientesT, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 170, 30));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        rbActivar.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(rbActivar);
        rbActivar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        rbActivar.setForeground(new java.awt.Color(255, 255, 255));
        rbActivar.setText("Activar");

        rbDesactivar.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(rbDesactivar);
        rbDesactivar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        rbDesactivar.setForeground(new java.awt.Color(255, 255, 255));
        rbDesactivar.setText("Desactivar");

        jLabel43.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(126, 197, 68));
        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/lupa.png"))); // NOI18N
        jLabel43.setText("FILTROS  PARA REPORTE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbActivar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addComponent(rbDesactivar)
                        .addGap(15, 15, 15))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbActivar)
                    .addComponent(rbDesactivar))
                .addGap(20, 20, 20))
        );

        jPanel7.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 80));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 320, 160));

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/impresion.png"))); // NOI18N
        btnImprimir.setText("IMPRIMIR");
        btnImprimir.setBorderPainted(false);
        jPanel2.add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 130, 40));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        spnMayores.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel6.add(spnMayores, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 50, -1));

        jLabel46.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jPanel6.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, 40));

        jLabel7.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("FACTURAS");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 20));

        jLabel12.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Mayores a:");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Menores a:");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        spnMenores.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel6.add(spnMenores, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 50, -1));

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        rbMenor.setBackground(new java.awt.Color(51, 51, 51));
        btnGru.add(rbMenor);
        rbMenor.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        rbMenor.setForeground(new java.awt.Color(255, 255, 255));
        rbMenor.setText("Menores");

        rbMayor.setBackground(new java.awt.Color(51, 51, 51));
        btnGru.add(rbMayor);
        rbMayor.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        rbMayor.setForeground(new java.awt.Color(255, 255, 255));
        rbMayor.setText("Mayores");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(126, 197, 68));
        jLabel13.setText("ACTIVAR:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(rbMayor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbMenor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbMayor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbMenor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 70));

        btnBuscarMayoMen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/Reporteico.png"))); // NOI18N
        btnBuscarMayoMen.setBorderPainted(false);
        btnBuscarMayoMen.setContentAreaFilled(false);
        btnBuscarMayoMen.setRequestFocusEnabled(false);
        jPanel6.add(btnBuscarMayoMen, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 40, 40));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 170));

        jPanel8.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 330, 400));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel51.setBackground(new java.awt.Color(255, 255, 255));
        jLabel51.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Buscar:");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BUSQUEDA POR: Codigo/Nombre-Cliente");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Desde");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hasta");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/Reporteico.png"))); // NOI18N
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(":");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BUSQUEDA POR: Rango de Fechas");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addGap(26, 26, 26)
                        .addComponent(txtBuscarIDFAC, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)
                                .addComponent(jLabel5)
                                .addGap(31, 31, 31))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(226, 226, 226))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel51)
                                    .addComponent(txtBuscarIDFAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
        );

        jPanel8.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 940, 90));

        btnImprimirTodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/impresion.png"))); // NOI18N
        btnImprimirTodo.setText("IMPRIMIR GENERAL");
        jPanel8.add(btnImprimirTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, -1, 40));

        jPanel16.setBackground(new java.awt.Color(51, 51, 51));
        jPanel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel39.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(126, 197, 68));
        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProyecto/Iconos/banco.png"))); // NOI18N
        jLabel39.setText("FACTURACIÓN");

        jLabel45.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("FILTROS DE BUSQUEDA");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel45)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel39)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel45)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Fecha1;
    private com.toedter.calendar.JDateChooser Fecha2;
    private javax.swing.JButton btnAgre_Fac;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarMayoMen;
    private javax.swing.ButtonGroup btnGru;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnImprimirTodo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cb_ClientesT;
    private javax.swing.JDialog dlgClientesRep;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JRadioButton rbActivar;
    private javax.swing.JRadioButton rbDesactivar;
    private javax.swing.JRadioButton rbMayor;
    private javax.swing.JRadioButton rbMenor;
    private javax.swing.JSpinner spnMayores;
    private javax.swing.JSpinner spnMenores;
    private javax.swing.JTable tblClientes_Re;
    private javax.swing.JTable tbl_ReporteFac;
    private javax.swing.JTextField txtBuscarIDFAC;
    private javax.swing.JTextField txtBuscar_CliRe;
    // End of variables declaration//GEN-END:variables
}
