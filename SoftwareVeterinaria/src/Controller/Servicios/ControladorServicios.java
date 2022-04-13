/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Servicios;

import Model.ConectionPg;
import Model.CrudServicios.ModelServicios;
import Model.CrudServicios.Servicios;
import View.CrudServicios.VistaServicios;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
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
 * @author Edison
 */
public class ControladorServicios {

    private ModelServicios modelo;
    protected VistaServicios vista;

    public ControladorServicios(ModelServicios modelo, VistaServicios vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
        CargarServicios();
    }

    public void iniciaControl() {
        vista.getBtnIngresar().addActionListener(l -> abrirDialogo(1));
        vista.getBtnEditar().addActionListener(l -> abrirDialogo(2));
        vista.getBtnRemover().addActionListener(l -> eliminarServicio());
        vista.getBtnimprimir().addActionListener(l -> AbrirDlg());
        vista.getBtnReporteImprimir().addActionListener(l -> Imprimir_Servicio());
        vista.getBtnaceptar().addActionListener(l -> crear_editar());

        vista.getTxtBuscar().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                CargarServicios();
            }
        });
    }

    public void abrirDialogo(int num) {
        if (num == 1) {
            Crear();
            vista.getDlgservicios().setSize(780, 480);

            vista.getDlgservicios().setLocationRelativeTo(null);
            vista.getDlgservicios().setVisible(true);
        } else {
            Editar();
        }

    }

    public void Editar() {
        vista.getDlgservicios().setName("editar");
        boolean e;
        int fila = vista.getTabla_Servicios().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(vista, "Debes seleccionar una fila");
        } else {
            vista.getDlgservicios().setSize(780, 480);
            vista.getDlgservicios().setLocationRelativeTo(null);
            vista.getDlgservicios().setVisible(true);
            String identificador = vista.getTabla_Servicios().getValueAt(fila, 0).toString();
            String dato = vista.getTxtBuscar().getText();
            List<Servicios> listaServicios = modelo.listaServicios(dato);
            for (int i = 0; i < listaServicios.size(); i++) {
                if (listaServicios.get(i).getId_servicio().equals(identificador)) {
                    vista.getTxtidservicio().setText(listaServicios.get(i).getId_servicio());
                    vista.getTxadescripcion().setText(listaServicios.get(i).getDescripcion());
                    vista.getTxtnombre().setText(listaServicios.get(i).getNombre_servi());
                    vista.getSpcosto().setValue(listaServicios.get(i).getCosto_servi());
                }
            }
        }
    }

    private void Crear() {
        vista.getDlgservicios().setLocationRelativeTo(null);
        Generar_Cod();
        vista.getTxadescripcion().setText("");
        vista.getTxtnombre().setText("");
        vista.getSpcosto().setValue(0);
        vista.getDlgservicios().setName("crear");
    }

    public void CrearServicios() {
        String idservicios = vista.getTxtidservicio().getText();
        String descripcion = vista.getTxadescripcion().getText();
        String nombre = vista.getTxtnombre().getText();
        Float costo = (Float) vista.getSpcosto().getValue();
        if (idservicios.isEmpty() || descripcion.isEmpty() || nombre.isEmpty() || costo == 0) {
            JOptionPane.showMessageDialog(null, "Por favor llenar todos los campos");
        } else {
            ModelServicios servicios = new ModelServicios();
            servicios.setId_servicio(idservicios);
            servicios.setDescripcion(descripcion);
            servicios.setNombre_servi(nombre);
            servicios.setCosto_servi(costo);
            if (servicios.CrearServicio()) {
                JOptionPane.showMessageDialog(vista, "El servicio se creo satisfactoriamente");
                vista.getDlgservicios().setVisible(false);
                LimpiarTabla();
                CargarServicios();
                vista.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(vista, "!Error! No se pudo crear el servicio");
            }
        }
    }

    public void EditarServicios() {
        String idservicios = vista.getTxtidservicio().getText();
        String descripcion = vista.getTxadescripcion().getText();
        String nombre = vista.getTxtnombre().getText();
        Float costo = (Float) vista.getSpcosto().getValue();
        if (idservicios.isEmpty() || descripcion.isEmpty() || nombre.isEmpty() || costo == 0) {
            JOptionPane.showMessageDialog(null, "Por favor llenar todos los campos");
        } else {
            ModelServicios servicios = new ModelServicios();
            servicios.setId_servicio(idservicios);
            servicios.setDescripcion(descripcion);
            servicios.setNombre_servi(nombre);
            servicios.setCosto_servi(costo);
            if (servicios.ModificarServicio()) {
                JOptionPane.showMessageDialog(vista, "El servicio se modifico satisfactoriamente");
                LimpiarTabla();
                CargarServicios();
                vista.getDlgservicios().setVisible(false);
                vista.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(vista, "!Error! No se pudo modificar el servicio");
            }
        }
    }

    public void CargarServicios() {
        DefaultTableModel tablamodel = (DefaultTableModel) vista.getTabla_Servicios().getModel();
        tablamodel.setNumRows(0);
        String dato = vista.getTxtBuscar().getText();
        List<Servicios> listaServicios = modelo.listaServicios(dato);
        listaServicios.stream().forEach(servicios -> {
            String[] filas = {servicios.getId_servicio(), servicios.getNombre_servi(), servicios.getDescripcion(),
                String.valueOf(servicios.getCosto_servi())};
            tablamodel.addRow(filas);
        });
    }

    public void crear_editar() {
        if (vista.getDlgservicios().getName() == "crear") {
            CrearServicios();

        } else {
            EditarServicios();

        }
    }

    public void eliminarServicio() {
        int selecc = vista.getTabla_Servicios().getSelectedRow();
        if (selecc > -1) {
            String idRev = vista.getTabla_Servicios().getValueAt(selecc, 0).toString();
            if (modelo.eliminarServicio(idRev)) {
                JOptionPane.showMessageDialog(vista, "Registro eliminado");
                CargarServicios();
            } else {
                JOptionPane.showMessageDialog(vista, "Ha ocurrido un error");
            }
        } else {
            JOptionPane.showMessageDialog(vista, "Seleccione una fila");
        }
    }

    public void LimpiarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) vista.getTabla_Servicios().getModel();
        int a = vista.getTabla_Servicios().getRowCount() - 1;
        int i;
        for (i = a; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    public void buscarServicio(java.awt.event.KeyEvent evt) {
        DefaultTableModel tablamodel = (DefaultTableModel) vista.getTabla_Servicios().getModel();
        tablamodel.setNumRows(0);
        String dato = vista.getTxtBuscar().getText();
        List<Servicios> listaServicio = modelo.listaServicios(dato);
        listaServicio.stream().forEach(servicios -> {
            String[] filas = {servicios.getId_servicio(), servicios.getDescripcion(), servicios.getNombre_servi(),
                String.valueOf(servicios.getCosto_servi())};
            tablamodel.addRow(filas);
        });
    }
    
    public void AbrirDlg(){
         vista.getDlgReporteServicio().setVisible(true);
         vista.getDlgReporteServicio().setSize(495, 300);
         vista.getDlgReporteServicio().setLocationRelativeTo(null);
     }

    private void Imprimir_Servicio() {
        ConectionPg connection = new ConectionPg();
        String IdServicio= vista.getTxtReporteIdServicio().getText();
        String Nombre= vista.getTxtReporteNombre().getText();

        try {
            JasperReport jr = (JasperReport) JRLoader.loadObject(getClass().getResource("/View/Reporte/PV_Servicio.jasper"));
            
            
            Map<String,Object> parametros= new HashMap<>();
            parametros.put("IdServicio", IdServicio);
            parametros.put("NombreServicio", Nombre);

            //CARGANDO EL REPORTE DE LA BASE
            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, connection.getCon());
            //VER
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(ControladorServicios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Generar_Cod() {
        Random rnd = new Random();
        String codigos = "0123456789ABCDEFGHIJKLMNOPQRS";
        String contenedor = "Cod_";
        int m = 0, pos = 0, num;
        while (m < 1) {
            pos = (int) (rnd.nextDouble() * codigos.length() - 1 + 0);
            num = (int) (rnd.nextDouble() * 9999 + 1000);
            contenedor = contenedor + codigos.charAt(pos) + num;
            pos = (int) (rnd.nextDouble() * codigos.length() - 1 + 0);
            contenedor = contenedor + codigos.charAt(pos);
            vista.getTxtidservicio().setText(contenedor);

            contenedor = "";
            m++;
        }
    }
}
