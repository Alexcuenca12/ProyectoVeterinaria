package Controller.Factura;

import Model.Clientes.ModeloClientes;
import Model.Paciente.ModeloPaciente;
import Model.Productos.Productos;
import Model.facturación.*;
import View.Facturacion.VistaFacturacion;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class ControladorFactura {

    private ModelDetalleProducto modeloDeta_P;
    private ModelDetalleServicio modeloDeta_S;
    private VistaFacturacion view;

    DefaultTableModel modelTa = new DefaultTableModel();
    ModeloClientes modeloCli = new ModeloClientes();
    ModeloPaciente modeloPac = new ModeloPaciente();
    Productos produc = new Productos();
    DetalleProducto detalleP = new DetalleProducto();
    DetalleServicio detalleS = new DetalleServicio();

    public ControladorFactura(ModelDetalleProducto modeloDeta_P, ModelDetalleServicio modeloDeta_S, VistaFacturacion view) {
        this.modeloDeta_P = modeloDeta_P;
        this.modeloDeta_S = modeloDeta_S;
        this.view = view;

        Calendar calendar = new GregorianCalendar();
        view.getTxt_Fecha().setText("" + calendar.get(Calendar.YEAR) + "-" + calendar.get(Calendar.MONTH) + "-" + calendar.get(Calendar.DAY_OF_MONTH));
        view.getTxt_IDFactura().setEnabled(false);
    }

}
