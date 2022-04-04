/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Cliente;

import Model.Clientes.Clientes;
import Model.Clientes.ModeloClientes;
import Model.ConectionPg;
import View.CrudClientes.VistaCrudPersona;
import com.toedter.calendar.JDateChooser;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Usuario
 */
public class ControladorCliente {

    private ModeloClientes modelo;
    protected VistaCrudPersona vista;

    //Constructor 
    public ControladorCliente(ModeloClientes modelo, VistaCrudPersona vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
        CargarCliente();
        vista.getFechaIngreClie().setDate(new java.util.Date(fechaActual()));
        vista.getFechaNacimientoClie().setDate(new java.util.Date(fechaActual()));
    }

    public void iniciarControl() {
        vista.getBttAgregarCli().addActionListener(xd -> abrirDialogo(1));
        vista.getBttModificarClie().addActionListener(xd -> abrirDialogo(2));
        vista.getBttEliminarClie().addActionListener(xd -> eliminarCliente());
        vista.getBttImprimirClie().addActionListener(xd -> imprimirReporte());
        vista.getBttCrearClie().addActionListener(xd -> crear_editar());
        vista.getBttCancelarClie().addActionListener(xd -> Cancelar());
        vista.getBttImprimirClie().addActionListener(xd -> Imprimir_Clientes());
        

        vista.getTxtBuscarClie().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                CargarCliente();
            }
        });
    }

    public void CargarCliente() {
        DefaultTableModel tablamodel = (DefaultTableModel) vista.getTablacliente().getModel();
        tablamodel.setNumRows(0);
        String valor = vista.getTxtBuscarClie().getText();
        List<Clientes> listaClientes = modelo.ListClient(valor);
        listaClientes.stream().forEach(cliente -> {
            String[] filas = {cliente.getId_cliente(), cliente.getNombre_cliente(), cliente.getApellido_cliente(),
                String.valueOf(CalcularEdad(cliente.getFechanacimiento())), cliente.getTelefono(), cliente.getEmail(), cliente.getDireccion_cliente(),
                String.valueOf(cliente.getFechaingreso())};
            tablamodel.addRow(filas);
        });
    }

    public static int CalcularEdad(Date fecha) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        SimpleDateFormat forma = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendario = Calendar.getInstance();
        String nacimiento = forma.format(fecha);
        LocalDate FechaNacimiento = LocalDate.parse(nacimiento, formato);
        LocalDate actualidad = LocalDate.now();
        Period periodo = Period.between(FechaNacimiento, actualidad);
        int anios = periodo.getYears();
        return anios;
    }

    private void Crear() {
        vista.getDlgClie().setSize(931, 450);
        vista.getDlgClie().setVisible(true);
        vista.getDlgClie().setLocationRelativeTo(null);
        vista.getTxtIdClie().setText("");
        vista.getTxtNombreClie().setText("");
        vista.getTxtApellidoClie().setText("");
        vista.getTxtTelefonoClie().setText("");
        vista.getTxtEmailClie().setText("");
        vista.getTxtDireccionClie().setText("");
        vista.getFechaIngreClie().setDate(new java.util.Date(fechaActual()));
        vista.getFechaNacimientoClie().setDate(new java.util.Date(fechaActual()));
        //titulo="REGISTRAR CLIENTE";
        vista.getDlgClie().setName("crear");
    }

    public void editar() {
        //titulo="MODIFICAR CLIENTE";
        vista.getDlgClie().setName("editar");
        boolean encontrada;
        int fila = vista.getTablacliente().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(vista, "Debes seleccionar una fila");

        } else {
            vista.getDlgClie().setSize(931, 450);
            vista.getDlgClie().setVisible(true);
            String identificador = vista.getTablacliente().getValueAt(fila, 0).toString();
            List<Clientes> listaClientes = modelo.ListClient(identificador);
            for (int i = 0; i < listaClientes.size(); i++) {
                if (listaClientes.get(i).getId_cliente().equals(identificador)) {
                    vista.getTxtIdClie().setText(listaClientes.get(i).getId_cliente());
                    vista.getTxtNombreClie().setText(listaClientes.get(i).getNombre_cliente());
                    vista.getTxtApellidoClie().setText(listaClientes.get(i).getApellido_cliente());
                    vista.getTxtTelefonoClie().setText(listaClientes.get(i).getTelefono());
                    vista.getTxtEmailClie().setText(listaClientes.get(i).getEmail());
                    vista.getTxtDireccionClie().setText(listaClientes.get(i).getDireccion_cliente());
                    vista.getFechaNacimientoClie().setDate(listaClientes.get(i).getFechanacimiento());
                    vista.getFechaIngreClie().setDate(listaClientes.get(i).getFechaingreso());
                }
            }
        }
    }

    public void abrirDialogo(int num) {
        if (num == 1) {
            vista.getTxtIdClie().setEditable(true);
            Crear();
        } else {
            vista.getTxtIdClie().setEditable(false);
            editar();
        }

        //vista.getDlgClie().setTitle(titulo);
    }

    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

    public String getFecha(JDateChooser jd) {
        if (jd.getDate() != null) {
            return formato.format(jd.getDate());
        } else {
            return null;
        }
    }

    public void CrearCliente() {
        String cedula = vista.getTxtIdClie().getText();
        String nombre = vista.getTxtNombreClie().getText();
        String apellido = vista.getTxtApellidoClie().getText();
        String telefono = vista.getTxtTelefonoClie().getText();
        String email = vista.getTxtEmailClie().getText();
        String direccion = vista.getTxtDireccionClie().getText();
        String fechan = getFecha(vista.getFechaNacimientoClie());
        String fechai = getFecha(vista.getFechaIngreClie());
        if (cedula.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || telefono.isEmpty() || email.isEmpty() || direccion.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Porfavor llenar todos los campos");
        } else {
            ModeloClientes cliente = new ModeloClientes();
            cliente.setId_cliente(cedula);
            cliente.setNombre_cliente(nombre);
            cliente.setApellido_cliente(apellido);
            cliente.setTelefono(telefono);
            cliente.setEmail(email);
            cliente.setDireccion_cliente(direccion);
            cliente.setFechanacimiento(Date.valueOf(fechan));
            cliente.setFechaingreso(Date.valueOf(fechai));
            if (cliente.CrearClientes()) {
                JOptionPane.showMessageDialog(vista, "El cliente se creo satisfactoriamente");
                vista.getDlgClie().setVisible(false);
                LimpiarTabla();
                CargarCliente();
                vista.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(vista, "Error no se pudo crear el cliente");
            }
        }
    }

    public void EditarCliente() {
        String cedula = vista.getTxtIdClie().getText();
        String nombre = vista.getTxtNombreClie().getText();
        String apellido = vista.getTxtApellidoClie().getText();
        String telefono = vista.getTxtTelefonoClie().getText();
        String email = vista.getTxtEmailClie().getText();
        String direccion = vista.getTxtDireccionClie().getText();
        String fechan = getFecha(vista.getFechaNacimientoClie());
        String fechai = getFecha(vista.getFechaIngreClie());
        if (cedula.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || telefono.isEmpty() || email.isEmpty() || direccion.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Porfavor llenar todos los campos");
        } else {
            ModeloClientes cliente = new ModeloClientes();
            cliente.setId_cliente(cedula);
            cliente.setNombre_cliente(nombre);
            cliente.setApellido_cliente(apellido);
            cliente.setTelefono(telefono);
            cliente.setEmail(email);
            cliente.setDireccion_cliente(direccion);
            cliente.setFechanacimiento(Date.valueOf(fechan));
            cliente.setFechaingreso(Date.valueOf(fechai));
            if (cliente.ModificarClientes()) {
                JOptionPane.showMessageDialog(vista, "El cliente se modifico  satisfactoriamente");
                LimpiarTabla();
                CargarCliente();
                vista.setVisible(true);
                vista.getTxtIdClie().setEditable(true);
            } else {
                JOptionPane.showMessageDialog(vista, "Error no se pudo modificar el cliente");
            }
        }
    }

    public void crear_editar() {
        if (vista.getDlgClie().getName() == "crear") {
            CrearCliente();

        } else {
            EditarCliente();

        }
    }

    public void eliminarCliente() {
        if (vista.getTablacliente().getSelectedRow() > -1) {
            ModeloClientes cliente = new ModeloClientes();
            String codigo = vista.getTablacliente().getValueAt(vista.getTablacliente().getSelectedRow(), 0).toString();
            cliente.setId_cliente(codigo);
            if (cliente.EliminaClientes()) {
                JOptionPane.showMessageDialog(vista, "Exito en la operacion");
                CargarCliente();
            } else {
                JOptionPane.showMessageDialog(vista, "Error en la operacion");
            }
        } else {
            JOptionPane.showMessageDialog(vista, "Seleccion una fila de la tabla");
        }

    }

    public void Cancelar() {
        vista.setVisible(true);
        vista.getDlgClie().setVisible(false);
    }

    public void LimpiarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) vista.getTablacliente().getModel();
        int a = vista.getTablacliente().getRowCount() - 1;
        int i;
        for (i = a; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    public void buscarCliente(java.awt.event.KeyEvent evt) {
        DefaultTableModel tablamodel = (DefaultTableModel) vista.getTablacliente().getModel();
        tablamodel.setNumRows(0);
        List<Clientes> listaClientes = modelo.ListClient_B(vista.getTxtBuscarClie().getText());
        listaClientes.stream().forEach(cliente -> {
            String[] filas = {cliente.getId_cliente(), cliente.getNombre_cliente(), cliente.getApellido_cliente(),
                String.valueOf(CalcularEdad(cliente.getFechanacimiento())), cliente.getTelefono(), cliente.getEmail(), cliente.getDireccion_cliente(),
                String.valueOf(cliente.getFechaingreso())};
            tablamodel.addRow(filas);
        });
    }

    public void imprimirReporte() {

    }

    protected static String fechaActual() {
        String fechaact = null;
        try {
            Calendar fecha = new GregorianCalendar();
            //Obtenemos el valor del año, mes, día,
            //usando el método get y el parámetro correspondiente                                                     
            int año = fecha.get(Calendar.YEAR);
            int mes = fecha.get(Calendar.MONTH);
            int dia = fecha.get(Calendar.DAY_OF_MONTH);
            fechaact = año + "/" + (mes + 1) + "/" + dia;
        } catch (Exception e) {
            System.out.println(e);
        }
        return fechaact;
    }
    
    
     private void Imprimir_Clientes(){
         ConectionPg connection = new ConectionPg();
         System.out.println("Hola");
         
        try {
            JasperReport jr=(JasperReport)JRLoader.loadObject(getClass().getResource("/View/Reporte/PV_Cliente.jasper"));
            //CARGANDO EL REPORTE DE LA BASE
            JasperPrint jp= JasperFillManager.fillReport(jr,null, connection.getCon());
            //VER
            JasperViewer jv= new JasperViewer(jp);
            jv.setVisible(true);
        
        } catch (JRException ex) {
            Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
}
