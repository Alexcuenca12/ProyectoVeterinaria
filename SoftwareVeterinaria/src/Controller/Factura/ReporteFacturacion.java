package Controller.Factura;

import Model.Clientes.Clientes;
import Model.ConectionPg;
import Model.facturación.Factura;
import Model.facturación.ModelFactura;
import View.Facturacion.VistaRepFacturacion;
import com.toedter.calendar.JDateChooser;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class ReporteFacturacion {

    private ModelFactura modelFactura;
    private VistaRepFacturacion view;

    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

    public ReporteFacturacion(ModelFactura modelFactura, VistaRepFacturacion view) {
        this.modelFactura = modelFactura;
        this.view = view;
        view.setSize(950, 615);
        //view.setLocationRelativeTo(view);
        view.setTitle("Reporte");
        view.setVisible(true);
        view.getRbDesactivar().setSelected(true);
        view.getCb_ClientesT().setEnabled(false);
        view.getSpinMenores().setEnabled(false);
        view.getSpnMayores().setEnabled(false);  
        //
        CargarCli();
        cargarFactura();
    }

    public void iniciaControl() {
        view.getRbActivar().addActionListener(l -> ActivarFiltros());
        view.getRbDesactivar().addActionListener(l -> DesactivarFiltros());
        view.getRbMayor().addActionListener(l->ActivarSpinMayor());
        view.getRbMenor().addActionListener(l->ActivarSpinMenor());
        view.getBtnBuscar().addActionListener(l -> FiltroBusquedaRangos());
        view.getBtnBuscarMayoMen().addActionListener(l ->FiltroMayores_Menores());
        view.getBtnImprimir().addActionListener(l ->ImprimirReporte());
        view.getBtnImprimirTodo().addActionListener(l ->AbrirDlg());
        view.getBtnAgre_Fac().addActionListener(l ->agregarClientesF());
        view.getTxtBuscarIDFAC().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                cargarFactura();
            }
        });
        //view.getBtnAgregar_FacR().addActionListener(l -> abrirDlgReporte(2));

        setEventKeytypedCF(view.getTxtBuscar_CliRe());
    }
    public void AbrirDlg(){
        view.getDlgClientesRep().setSize(445, 300);
        view.getDlgClientesRep().setLocationRelativeTo(view);
        view.getDlgClientesRep().setVisible(true);
    }
    
    public void cargarFactura() {
//        LimpiarTabla();
        DefaultTableModel tblmodel;
        tblmodel = (DefaultTableModel) view.getTbl_ReporteFac().getModel();
        tblmodel.setNumRows(0);
        //Variables
        String buscar = view.getTxtBuscarIDFAC().getText();
        int top = view.getCb_ClientesT().getSelectedIndex();
        int mayores = Integer.valueOf(view.getSpnMayores().getValue().toString());
        int menores = Integer.valueOf(view.getSpinMenores().getValue().toString());
        List<Factura> tablaFac = modelFactura.listarFacturas(buscar);
        Holder<Integer> i = new Holder<>(0);
        tablaFac.stream().forEach(fac -> {
            tblmodel.addRow(new Object[5]);
            view.getTbl_ReporteFac().setValueAt(fac.getCodigo_factura(), i.value, 0);
            view.getTbl_ReporteFac().setValueAt(fac.getNomVeterinario(), i.value, 1);
            view.getTbl_ReporteFac().setValueAt(fac.getCodigo_cliente(), i.value, 2);
            view.getTbl_ReporteFac().setValueAt(fac.getNomCliente(), i.value, 3);
            view.getTbl_ReporteFac().setValueAt(fac.getFecha(), i.value, 4);
            view.getTbl_ReporteFac().setValueAt(fac.getTotal_factura(), i.value, 5);
            i.value++;
        });
    }

    public String getFecha(JDateChooser jd) {
        if (jd.getDate() != null) {
            return formato.format(jd.getDate());
        } else {
            return null;
        }
    }

    public void ActivarFiltros() { 
        view.getCb_ClientesT().setEnabled(true);
    }

    public void DesactivarFiltros() {
        view.getCb_ClientesT().setEnabled(false);
    }
    
     public void ActivarSpinMayor() { 
       view.getSpnMayores().setEnabled(true);
       view.getSpinMenores().setEnabled(false);
    }

    public void ActivarSpinMenor() {
       view.getSpnMayores().setEnabled(false);
       view.getSpinMenores().setEnabled(true);
    }


    //METODOS DE CLIENTES EN REPORTES
    public void CargarCli() {
        DefaultTableModel tblmodel;
        tblmodel = (DefaultTableModel) view.getTblClientes_Re().getModel();
        tblmodel.setNumRows(0);

        ArrayList<Clientes> tableCli = modelFactura.ListarClientes();
        Holder<Integer> i = new Holder<>(0);
        tableCli.stream().forEach(pac -> {
            tblmodel.addRow(new Object[3]);
            view.getTblClientes_Re().setValueAt(pac.getId_cliente(), i.value, 0);
            view.getTblClientes_Re().setValueAt(pac.getNombre_cliente(), i.value, 1);
            view.getTblClientes_Re().setValueAt(pac.getApellido_cliente(), i.value, 2);
            i.value++;
        });
    }
    
     public void agregarClientesF() {
        int selecc = view.getTblClientes_Re().getSelectedRow();
        if (selecc != -1) {
            String ver = view.getTblClientes_Re().getValueAt(selecc, 0).toString();
            ArrayList<Clientes> tableClientes = modelFactura.ListarClientes();
            for (int j = 0; j < tableClientes.size(); j++) {
                if (tableClientes.get(j).getId_cliente().equals(ver)) {
                    view.getLblCedula().setText(tableClientes.get(j).getId_cliente());
                }
            }
            view.getDlgClientesRep().setVisible(false);
            Imprimir();
        } else {
            Imprimir();
        }
    }
    
    public void buscarClienteF(java.awt.event.KeyEvent evt) {
        DefaultTableModel tablamodel;
        tablamodel = (DefaultTableModel) view.getTblClientes_Re().getModel();
        tablamodel.setNumRows(0);
        List<Clientes> list = modelFactura.buscarClienteF(view.getTxtBuscar_CliRe().getText());
        list.stream().forEach(cli -> {
            String[] filas = {cli.getId_cliente(), cli.getNombre_cliente(),
                (cli.getApellido_cliente())};
            tablamodel.addRow(filas);
        });
    }

    private void setEventKeytypedCF(JTextField txt) {
        txt.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent i) {
                buscarClienteF(i);
            }
        });
    }
     public void LimpiarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) view.getTbl_ReporteFac().getModel();
        int a = view.getTbl_ReporteFac().getRowCount() - 1;
        int i;
        for (i = a; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    //FILTRO DE FACTURAS MAYORES O MENORES A;
    public void FiltroMayores_Menores(){
        if (view.getRbMayor().isSelected()==false && view.getRbMenor().isSelected()==false) { 
            JOptionPane.showMessageDialog(view, "Seleccione un boton (Mayor/Menor)");
            cargarFactura();
        }
        else if (view.getRbMayor().isSelected()) {
            CargarDatosMayores();
            view.getSpnMayores().setValue(0);
        }else{
            CargarDatosMenor();
            view.getSpnMenores().setValue(0);
        }
    }
    
     public void CargarDatosMayores() {
            view.getSpnMayores().setName("Mayor");
            int mayor=Integer.valueOf(view.getSpnMayores().getValue().toString());
            //Enlace de la tabla con el metodo de las etiquetas
            DefaultTableModel tblmodel;
            tblmodel = (DefaultTableModel) view.getTbl_ReporteFac().getModel();
            tblmodel.setNumRows(0);
            String valor = view.getTxtBuscarIDFAC().getText();
            List<Factura> tablaRev = modelFactura.ListaFacturaMayor(mayor);
            Holder<Integer> i = new Holder<>(0);
            tablaRev.stream().forEach(fac -> {
                //Agregar a la tabla
                tblmodel.addRow(new Object[5]);
                view.getTbl_ReporteFac().setValueAt(fac.getCodigo_factura(), i.value, 0);
                view.getTbl_ReporteFac().setValueAt(fac.getNomVeterinario(), i.value, 1);
                view.getTbl_ReporteFac().setValueAt(fac.getCodigo_cliente(), i.value, 2);
                view.getTbl_ReporteFac().setValueAt(fac.getNomCliente(), i.value, 3);
                view.getTbl_ReporteFac().setValueAt(fac.getFecha(), i.value, 4);
                view.getTbl_ReporteFac().setValueAt(fac.getTotal_factura(), i.value, 5);
                i.value++;
            });  
    }
     
    public void CargarDatosMenor() {
            view.getSpinMenores().setName("Menor");
            int menor=Integer.valueOf(view.getSpnMenores().getValue().toString());
            //Enlace de la tabla con el metodo de las etiquetas
            DefaultTableModel tblmodel;
            tblmodel = (DefaultTableModel) view.getTbl_ReporteFac().getModel();
            tblmodel.setNumRows(0);
            String valor = view.getTxtBuscarIDFAC().getText();
            List<Factura> tablaRev = modelFactura.ListaFacturaMenor(menor);
            Holder<Integer> i = new Holder<>(0);
            tablaRev.stream().forEach(fac -> {
                //Agregar a la tabla
                tblmodel.addRow(new Object[5]);
                view.getTbl_ReporteFac().setValueAt(fac.getCodigo_factura(), i.value, 0);
                view.getTbl_ReporteFac().setValueAt(fac.getNomVeterinario(), i.value, 1);
                view.getTbl_ReporteFac().setValueAt(fac.getCodigo_cliente(), i.value, 2);
                view.getTbl_ReporteFac().setValueAt(fac.getNomCliente(), i.value, 3);
                view.getTbl_ReporteFac().setValueAt(fac.getFecha(), i.value, 4);
                view.getTbl_ReporteFac().setValueAt(fac.getTotal_factura(), i.value, 5);
                i.value++;
            });  
    }
    
    
     //FILTROS DE BUSQUEDA
    public void FiltroBusquedaRangos() {
        if (view.getFecha1().getDate() == null) {
            JOptionPane.showMessageDialog(null, "Ingrese la primera fecha porfavor");
        } else if (view.getFecha2().getDate() == null) {
            JOptionPane.showMessageDialog(null, "Ingrese la segunda fecha porfavor");
        } else {
            CargarDatos();
        }
    }
    
    public void CargarDatos() {
        String fecha1 = null;
        String fecha2 = null;
        fecha1 = formato.format(view.getFecha1().getDate());
        fecha2 = formato.format(view.getFecha2().getDate());
        if (Date.valueOf(fecha1).after(Date.valueOf(fecha2))) {
            JOptionPane.showMessageDialog(view, "Porfavor revise que el rango de fechas sea correcto");
        } else {
            //Enlace de la tabla con el metodo de las etiquetas
            DefaultTableModel tblmodel;
            tblmodel = (DefaultTableModel) view.getTbl_ReporteFac().getModel();
            tblmodel.setNumRows(0);
            String valor = view.getTxtBuscarIDFAC().getText();
            List<Factura> tablaRev = modelFactura.ListaFacturaFecha(fecha1, fecha2);
            Holder<Integer> i = new Holder<>(0);
            tablaRev.stream().forEach(fac -> {
                //Agregar a la tabla
                tblmodel.addRow(new Object[5]);
                view.getTbl_ReporteFac().setValueAt(fac.getCodigo_factura(), i.value, 0);
                view.getTbl_ReporteFac().setValueAt(fac.getNomVeterinario(), i.value, 1);
                view.getTbl_ReporteFac().setValueAt(fac.getCodigo_cliente(), i.value, 2);
                view.getTbl_ReporteFac().setValueAt(fac.getNomCliente(), i.value, 3);
                view.getTbl_ReporteFac().setValueAt(fac.getFecha(), i.value, 4);
                view.getTbl_ReporteFac().setValueAt(fac.getTotal_factura(), i.value, 5);
                i.value++;
            });
    }  
    }
    public void ImprimirReporte(){
        if (view.getCb_ClientesT().getSelectedIndex()==0) {
            JOptionPane.showMessageDialog(view, "Seleccione una opcion porfavor");
        }else if (view.getCb_ClientesT().getSelectedIndex()==1) {   
            ImprimirTop();
        }else{    
            ImprimirTop2();
        }
    }
    
    public void ImprimirTop(){
        ConectionPg conexion=new ConectionPg();
        try {
            JasperReport jr=(JasperReport)JRLoader.loadObject(getClass().getResource("/View/Reporte/PV_ClientesTop.jasper"));
            JasperPrint jp=JasperFillManager.fillReport(jr, null,conexion.getCon());
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(ReporteFacturacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void ImprimirTop2(){
        ConectionPg conexion=new ConectionPg();
        try {
            JasperReport jr=(JasperReport)JRLoader.loadObject(getClass().getResource("/View/Reporte/PV_ClientesRegulares.jasper"));
            JasperPrint jp=JasperFillManager.fillReport(jr, null,conexion.getCon());
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(ReporteFacturacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Imprimir(){
         ConectionPg conexion=new ConectionPg();
        try {
            JasperReport jr=(JasperReport)JRLoader.loadObject(getClass().getResource("/View/Reporte/Facturacion.jasper"));
             Map<String,Object> parametros= new HashMap<>();
            String cedula=view.getLblCedula().getText();
            System.out.println(cedula);
             parametros.put("Cliente", cedula);
            JasperPrint jp=JasperFillManager.fillReport(jr, parametros,conexion.getCon());
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(ReporteFacturacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

}
