package Controller.Factura;

import Model.Clientes.Clientes;
import Model.facturación.Factura;
import Model.facturación.ModelFactura;
import View.Facturacion.VistaRepFacturacion;
import com.toedter.calendar.JDateChooser;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;

public class ReporteFacturacion {

    private ModelFactura modelFactura;
    private VistaRepFacturacion view;

    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

    public ReporteFacturacion(ModelFactura modelFactura, VistaRepFacturacion view) {
        this.modelFactura = modelFactura;
        this.view = view;
        view.getBusquedaFecha().setEnabled(false);
        view.setSize(950, 605);
        //view.setLocationRelativeTo(view);
        view.setTitle("Reporte");
        view.setVisible(true);
        view.getBtnAgregar_FacR().setEnabled(false);
        view.getTxt_IDCliRep().setEditable(false);
        view.getFechaInicio().setEnabled(false);
        view.getFechaFin().setEnabled(false);
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
        view.getBtnBuscar().addActionListener(l -> FiltroBusqueda());
        view.getCBFechas().addActionListener(l -> Activar());
        view.getTxtBuscarIDFAC().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                cargarFactura();
            }
        });

        view.getBtnLimpiar_Re().addActionListener(l -> limpiar_DlgF());
        view.getBtnAgre_Fac().addActionListener(l -> agregarClientesF());
        //view.getBtnAgregar_FacR().addActionListener(l -> abrirDlgReporte(2));

        setEventKeytypedCF(view.getTxtBuscar_CliRe());
    }

    public void cargarFactura() {
//        LimpiarTabla();
        DefaultTableModel tblmodel;
        tblmodel = (DefaultTableModel) view.getTbl_ReporteFac().getModel();
        tblmodel.setNumRows(0);
        //Variables
        String buscar = view.getTxtBuscarIDFAC().getText();
        String fechaInicio = getFecha(view.getFechaInicio());
        String fechaFin = getFecha(view.getFechaFin());
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
        view.getBtnAgregar_FacR().setEnabled(true);
        view.getTxt_IDCliRep().setEditable(false);
        view.getFechaInicio().setEnabled(true);
        view.getFechaFin().setEnabled(true);
        view.getCb_ClientesT().setEnabled(true);
        view.getSpinMenores().setEnabled(true);
        view.getSpnMayores().setEnabled(true);
    }

    public void DesactivarFiltros() {
        view.getBtnAgregar_FacR().setEnabled(false);
        view.getTxt_IDCliRep().setEditable(false);
        view.getFechaInicio().setEnabled(false);
        view.getFechaFin().setEnabled(false);
        view.getCb_ClientesT().setEnabled(false);
        view.getSpinMenores().setEnabled(false);
        view.getSpnMayores().setEnabled(false);
    }

    public void limpiar_DlgF() {
        view.getTxt_IDCliRep().setText("");
        view.getDlgClientesRep().setVisible(false);
    }

    //METODOS DE CLIENTES EN REPORTES
    public void agregarClientesF() {
        int selecc = view.getTblClientes_Re().getSelectedRow();
        if (selecc != -1) {

            String ver = view.getTblClientes_Re().getValueAt(selecc, 0).toString();
            ArrayList<Clientes> tableClientes = modelFactura.ListarClientes();
            for (int j = 0; j < tableClientes.size(); j++) {
                if (tableClientes.get(j).getId_cliente().equals(ver)) {
                    view.getTxt_IDCliRep().setText(tableClientes.get(j).getId_cliente());
                }
            }
            view.getDlgClientesRep().setVisible(false);
        } else {
            JOptionPane.showMessageDialog(view, "Por favor seleccione una fila");
        }
    }

//    public void Filtro1() {
//        int valor = view.getTblClie().getSelectedRow();
//        if (valor == -1) {
//            JOptionPane.showMessageDialog(view, "Seleccione una fila porfavor");
//        } else {
//            String cedula = view.getTblClie().getValueAt(valor, 0).toString();
//            view.getTxt_IDCliRep().setText(cedula);
//            cargarFactura();
//            view.getDlgClientesRep().setVisible(false);
//        }
//    }
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

    public void Activar() {
        if (view.getCBFechas().getSelectedIndex() == 2) {
            view.getBusquedaFecha().setEnabled(true);
        } else {
            view.getBusquedaFecha().setEnabled(false);
        }
    }

    public void FiltroBusqueda() {
        if (view.getCBFechas().getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione una opcion");

        } else if (view.getCBFechas().getSelectedIndex() == 2 && view.getBusquedaFecha().getCalendar() == null) {
            JOptionPane.showMessageDialog(null, "Seleccione una fecha porfavor");
        } else {
            CargarDatos();
        }
    }

    public void CargarDatos() {
        int seleccionar = view.getCBFechas().getSelectedIndex();
        String fecha = null;
        if (seleccionar == 1) {
            cargarFactura();
        } if (seleccionar == 2) {
            fecha = formato.format(view.getBusquedaFecha().getDate());
            //Enlace de la tabla con el metodo de las etiquetas
            DefaultTableModel tblmodel;
            tblmodel = (DefaultTableModel) view.getTbl_ReporteFac().getModel();
            tblmodel.setNumRows(0);
            String valor = view.getTxtBuscarIDFAC().getText();
            List<Factura> tablaRev = modelFactura.ListaFacturaFecha(fecha);
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
        } else {
            JOptionPane.showMessageDialog(null, "No existen registros en esta fecha");
            cargarFactura();
        }

    }
}
