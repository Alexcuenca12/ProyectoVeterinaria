/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.CitasMedicas;

import Controller.Login.ControllerLogin;
import Model.CitasMedicas.CitasMedicas;
import Model.CitasMedicas.ModeloCitasMed;
import Model.Clientes.Clientes;
import Model.Clientes.ModeloClientes;
import Model.ConectionPg;
import Model.Veterinario.ModelVeterinario;
import Model.Veterinario.Veterinario;
import View.CitasMedicas.Crud_CitasMedicas;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;
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
public class ControladorCitas extends DefaultTableCellRenderer {

    ModeloCitasMed modelC;
    protected Crud_CitasMedicas vistaC;

    public ControladorCitas(ModeloCitasMed modelC, Crud_CitasMedicas vistaC) {
        this.modelC = modelC;
        this.vistaC = vistaC;
        vistaC.setVisible(true);
        vistaC.getTxtBuscarCita().setText(ControllerLogin.Usuario);
        cargarCitaFecha();
        CargarCliente();
        CargarVeterinario();
        vistaC.getBusquedaFecha().setDate(new java.util.Date(fechaActual()));
        vistaC.getBusquedaFecha().setEnabled(true);
        vistaC.getTxtIdCita().setEditable(false);
        vistaC.getFechaCita().setDate(new java.util.Date(fechaActual()));
        vistaC.getFechaCita().setMinSelectableDate(new java.util.Date(fechaActual()));

    }

    public void iniciarControl() {
        //Dialogo
        vistaC.getBtnCrearCita().addActionListener(l -> abrirDialogo(1));
        vistaC.getBtnModificarCita().addActionListener(l -> abrirDialogo(2));
        vistaC.getBttAgregarClienteCita().addActionListener(l -> abrirDlg(1));
        vistaC.getBttAgregarMedicoCita().addActionListener(l -> abrirDlg(2));
        //Creacion
        vistaC.getBtnAceptarCita().addActionListener(l -> CrearEditCitas());
        vistaC.getBtnEliminarCita().addActionListener(l -> eliminarCita());
        //Agregar datos externos 
        vistaC.getBtnAgregarVeterinario().addActionListener(l -> agregarVeterinario());
        vistaC.getBtnAgregarCliente().addActionListener(l -> agregarCliente());
        vistaC.getCBFechas().addActionListener(l -> Activar());
        vistaC.getBtnBuscar().addActionListener(l -> FiltroBusqueda());
        vistaC.getBtnBuscar2().addActionListener(l -> FiltroBusquedaRangos());
        vistaC.getBtnCerrar().addActionListener(l -> Cerrar());
        vistaC.getTblCitas().setDefaultRenderer(vistaC.getTblCitas().getColumnClass(0), this);
        //IMPRIMIR
        vistaC.getBtnImprimir().addActionListener(l -> AbrirDlgReporte());
        vistaC.getBtnReporteImprimir().addActionListener(l -> Imprimir_Citas());

        vistaC.getTxtBuscarCita().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                cargarCita();
            }
        });
        vistaC.getTxtBuscarCliente().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                CargarCliente();
            }
        });
        vistaC.getBtnBuscarVeterinario().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                CargarVeterinario();
            }
        });

        //Metodo para abrir info de la consulta
        vistaC.getTblCitas().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                vistaC.getDlgVista().setSize(740, 500);
                vistaC.getDlgVista().setLocationRelativeTo(null);
                vistaC.getDlgVista().setVisible(true);
                CargarInfoCita();
            }
        });

        vistaC.getCbEstadoCita().addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                EstadoCita();
            }
        });

        vistaC.getBusquedaFecha().addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                CargarGeneral();
            }
        });
    }

    public void Cerrar() {
        vistaC.getDlgVista().setVisible(false);
    }

    public void Activar() {
        if (vistaC.getCBFechas().getSelectedIndex() == 2) {
            vistaC.getBusquedaFecha().setEnabled(true);
        } else {
            vistaC.getBusquedaFecha().setEnabled(false);
        }
    }

    //FILTROS DE BUSQUEDA
    public void FiltroBusquedaRangos() {
        if (vistaC.getFecha1().getDate() == null) {
            JOptionPane.showMessageDialog(null, "Ingrese la primera fecha porfavor");
        } else if (vistaC.getFecha2().getDate() == null) {
            JOptionPane.showMessageDialog(null, "Ingrese la segunda fecha porfavor");
        } else {
            CargarDatos2();
        }

    }

    public void CargarDatos2() {
        String fecha1 = null;
        String fecha2 = null;
        fecha1 = formato.format(vistaC.getFecha1().getDate());
        fecha2 = formato.format(vistaC.getFecha2().getDate());
        //Enlace de la tabla con el metodo de las etiquetas
        if (Date.valueOf(fecha1).after(Date.valueOf(fecha2))) {
            JOptionPane.showMessageDialog(vistaC, "Porfavor revise que el rango de fechas sea correcto");
        } else {
            DefaultTableModel tblmodel;
            tblmodel = (DefaultTableModel) vistaC.getTblCitas().getModel();
            tblmodel.setNumRows(0);
            List<CitasMedicas> tablaRev = modelC.ListCitasFechas(fecha1, fecha2);
            Holder<Integer> i = new Holder<>(0);
            tablaRev.stream().forEach(cita -> {
                //Agregar a la tabla
                tblmodel.addRow(new Object[6]);
                vistaC.getTblCitas().setValueAt(cita.getCodigoCita(), i.value, 0);
                vistaC.getTblCitas().setValueAt(cita.getCodigoMedico(), i.value, 1);
                vistaC.getTblCitas().setValueAt(cita.getCodigoCliente(), i.value, 2);
                vistaC.getTblCitas().setValueAt(cita.getFechaSolicitud(), i.value, 3);
                vistaC.getTblCitas().setValueAt(cita.getFechaCita(), i.value, 4);
                vistaC.getTblCitas().setValueAt(cita.getHoraCita(), i.value, 5);
                vistaC.getTblCitas().setValueAt(cita.getEstado(), i.value, 6);
                i.value++;

            });
        }
    }

    public void FiltroBusqueda() {
        if (vistaC.getCBFechas().getSelectedIndex() == 0) {
            cargarCitaFecha();

        } else if (vistaC.getCBFechas().getSelectedIndex() == 2 && vistaC.getBusquedaFecha().getCalendar() == null) {
            JOptionPane.showMessageDialog(null, "Seleccione una fecha porfavor");
        } else {
            CargarDatos();
        }
    }

    public void CargarDatos() {

        int seleccionar = vistaC.getCBFechas().getSelectedIndex();
        String fecha = null;
        if (seleccionar == 2) {
            fecha = formato.format(vistaC.getBusquedaFecha().getDate());
            System.out.println(fecha);
            //Enlace de la tabla con el metodo de las etiquetas
            DefaultTableModel tblmodel;
            tblmodel = (DefaultTableModel) vistaC.getTblCitas().getModel();
            tblmodel.setNumRows(0);
            List<CitasMedicas> tablaRev = modelC.listarCitasLogico(fecha);
            Holder<Integer> i = new Holder<>(0);
            tablaRev.stream().forEach(cita -> {
                //Agregar a la tabla
                tblmodel.addRow(new Object[6]);
                vistaC.getTblCitas().setValueAt(cita.getCodigoCita(), i.value, 0);
                vistaC.getTblCitas().setValueAt(cita.getCodigoMedico(), i.value, 1);
                vistaC.getTblCitas().setValueAt(cita.getCodigoCliente(), i.value, 2);
                vistaC.getTblCitas().setValueAt(cita.getFechaSolicitud(), i.value, 3);
                vistaC.getTblCitas().setValueAt(cita.getFechaCita(), i.value, 4);
                vistaC.getTblCitas().setValueAt(cita.getHoraCita(), i.value, 5);
                vistaC.getTblCitas().setValueAt(cita.getEstado(), i.value, 6);
                i.value++;

            });
        } else if (seleccionar == 1) {
            cargarCita();
        } else {
            JOptionPane.showMessageDialog(null, "No existen registros en esta fecha");
        }
    }

    public void CargarGeneral() {

        int seleccionar = vistaC.getCBFechas().getSelectedIndex();
        String fecha = null;
        fecha = formato.format(vistaC.getBusquedaFecha().getDate());
        System.out.println(fecha);
        //Enlace de la tabla con el metodo de las etiquetas
        DefaultTableModel tblmodel;
        tblmodel = (DefaultTableModel) vistaC.getTblCitas().getModel();
        tblmodel.setNumRows(0);
        List<CitasMedicas> tablaRev = modelC.listarCitasLogico(fecha);
        Holder<Integer> i = new Holder<>(0);
        tablaRev.stream().forEach(cita -> {
            //Agregar a la tabla
            tblmodel.addRow(new Object[6]);
            vistaC.getTblCitas().setValueAt(cita.getCodigoCita(), i.value, 0);
            vistaC.getTblCitas().setValueAt(cita.getCodigoMedico(), i.value, 1);
            vistaC.getTblCitas().setValueAt(cita.getCodigoCliente(), i.value, 2);
            vistaC.getTblCitas().setValueAt(cita.getFechaSolicitud(), i.value, 3);
            vistaC.getTblCitas().setValueAt(cita.getFechaCita(), i.value, 4);
            vistaC.getTblCitas().setValueAt(cita.getHoraCita(), i.value, 5);
            vistaC.getTblCitas().setValueAt(cita.getEstado(), i.value, 6);
            i.value++;

        });
    }
    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

    public String getFecha(JDateChooser jd) {
        if (jd.getDate() != null) {
            return formato.format(jd.getDate());
        } else {
            return null;
        }
    }

    //DIALOGOS
    public void abrirDialogo(int num) {
        String titulo;
        if (num == 1) {
            titulo = "Crear Cita";
            vistaC.getDlgAgregar().setName("Crear Cita");
            vistaC.getDlgAgregar().setSize(785, 470);
            vistaC.getDlgAgregar().setLocationRelativeTo(null);
            vistaC.getDlgAgregar().setVisible(true);
            LimpiarDlg();
            vistaC.getTxtIdCita().setText(modelC.codigoCita());
        } else {
            if (vistaC.getTblCitas().getSelectedRow() > -1) {
                vistaC.getDlgVista().dispose();
                titulo = "Editar Cita";
                vistaC.getDlgAgregar().setName("Editar Cita");
                LimpiarDlg();
                vistaC.getTxtIdCita().setEditable(false);
                vistaC.getDlgAgregar().setSize(785, 470);
                vistaC.getDlgAgregar().setLocationRelativeTo(null);
                vistaC.getDlgAgregar().setVisible(true);
                Infomod();
                vistaC.getDlgAgregar().setTitle(titulo);
            } else {
                JOptionPane.showMessageDialog(vistaC, "Seleccion una fila de la tabla");
            }
        }

    }

    public void abrirDlg(int num) {
        String titulo;
        if (num == 1) {
            titulo = "Revisar Cliente";
            vistaC.getDlgCliente().setName("Revisar Cliente");
            vistaC.getDlgCliente().setSize(880, 389);
            vistaC.getDlgCliente().setLocationRelativeTo(null);
            vistaC.getDlgCliente().setVisible(true);
        } else {
            titulo = "Revisar Veterinario";
            vistaC.getDlgVeterinario().setName("Revisar Veterinario");
            vistaC.getDlgVeterinario().setSize(880, 389);
            vistaC.getDlgVeterinario().setLocationRelativeTo(null);
            vistaC.getDlgVeterinario().setVisible(true);

        }

        vistaC.getDlgAgregar().setTitle(titulo);

    }

    //METODOS CITA MEDICA
    private void CrearEditCitas() {
        if (vistaC.getDlgAgregar().getName().equals("Crear Cita")) {
            //Insertar

            String id_cita = modelC.codigoCita();
            String id_medicoC = vistaC.getTxtIdMedicoCita().getText();
            String id_clienteC = vistaC.getTxtIdClienteCita().getText();
            String hora = agregarCombo(vistaC.getHora());
            String fechaCita = getFecha(vistaC.getFechaCita());

            ModeloCitasMed citas = new ModeloCitasMed();

            citas.setCodigoCita(id_cita);
            citas.setCodigoMedico(id_medicoC);
            citas.setHoraCita(hora);
            citas.setCodigoCliente(id_clienteC);
            citas.setFechaCita(Date.valueOf(fechaCita));

            if (citas.comprobarHora(id_medicoC, Date.valueOf(fechaCita), hora).size() == 0) {
                if (citas.CrearCita()) {
                    vistaC.getDlgAgregar().setVisible(false);
                    CargarGeneral();
                    LimpiarDlg();
                    JOptionPane.showMessageDialog(vistaC, "Exito en la operacion");

                } else {
                    JOptionPane.showMessageDialog(vistaC, "Error en la operacion");
                }
            } else {
                JOptionPane.showMessageDialog(vistaC, "Fecha y Hora previamente guardadas, seleccione otra hora");
            }
        } else {
            if (vistaC.getDlgAgregar().getName().equals("Editar Cita")) {
                String id_cita = vistaC.getTxtIdCita().getText();
                String id_medicoC = vistaC.getTxtIdMedicoCita().getText();
                String id_clienteC = vistaC.getTxtIdClienteCita().getText();
                String fechaCita = getFecha(vistaC.getFechaCita());
                String hora = agregarCombo(vistaC.getCbEstadoCita());
                ModeloCitasMed citas = new ModeloCitasMed();

                citas.setCodigoCita(id_cita);
                citas.setCodigoMedico(id_medicoC);
                citas.setCodigoCliente(id_clienteC);
                citas.setFechaCita(Date.valueOf(fechaCita));
                citas.setHoraCita(hora);
                if (citas.ModificarCita()) {
                    vistaC.getDlgAgregar().setVisible(false);
                    JOptionPane.showMessageDialog(vistaC, "Exito en la operacion");
                    cargarCitaFecha();
                } else {
                    JOptionPane.showMessageDialog(vistaC, "Error en la operacion");
                }
            }
        }

    }

    public void eliminarCita() {
        vistaC.getDlgVista().dispose();
        int selecc = vistaC.getTblCitas().getSelectedRow();
        if (selecc > -1) {
            String idCita = vistaC.getTblCitas().getValueAt(selecc, 0).toString();
            if (modelC.eliminarCita(idCita)) {
                JOptionPane.showMessageDialog(vistaC, "Registro eliminado");
                CargarGeneral();
            } else {
                JOptionPane.showMessageDialog(vistaC, "Ha ocurrido un error");
            }
        } else {
            JOptionPane.showMessageDialog(vistaC, "Seleccione una fila");
        }
    }

    public void CargarInfoCita() {
        if (vistaC.getTblCitas().getSelectedRow() > -1) {
            ArrayList<CitasMedicas> listCita = modelC.ListCitas(vistaC.getTblCitas().getValueAt(vistaC.getTblCitas().getSelectedRow(), 0).toString(), ControllerLogin.Usuario);
            vistaC.getTxtIdCita().setEnabled(false);
            listCita.stream().forEach(masc -> {
                try {
                    vistaC.getTxtIdCitaMedica().setText(masc.getCodigoCita());
                    vistaC.getTxtFechaCita().setText(String.valueOf(masc.getFechaCita()));
                    vistaC.getTxtVerFechaSolicitud().setText(String.valueOf(masc.getFechaSolicitud()));
                    vistaC.getTxtVerHoraCita().setText(masc.getHoraCita());
                } catch (Exception e) {
                    System.out.println(e);
                }

            });
            //Para cargar la info del cliente
            ModeloClientes modelCli = new ModeloClientes();
            ArrayList<Clientes> listCli = modelCli.ListClient_B(vistaC.getTblCitas().getValueAt(vistaC.getTblCitas().getSelectedRow(), 2).toString());
            listCli.stream().forEach(cli -> {
                vistaC.getTxtVerNombreCliente().setText(cli.getNombre_cliente());
                vistaC.getTxtVerApellidoCliente().setText(cli.getApellido_cliente());
                vistaC.getTxtVerTelefonoCliente().setText(cli.getTelefono());
                vistaC.getTxtVerMascotaCliente().setText(cli.getDireccion_cliente());
            });

            //Para cargar la info del Veterinario
            ModelVeterinario modelVet = new ModelVeterinario();
            ArrayList<Veterinario> listVet = modelVet.ListVet_completaB(vistaC.getTblCitas().getValueAt(vistaC.getTblCitas().getSelectedRow(), 1).toString());
            listVet.stream().forEach(vet -> {
                vistaC.getTxtIdMedicoCita().setText(vet.getid_medico());
                vistaC.getTxtVerNombreVeterinario().setText(vet.getNombre_medico());
                vistaC.getTxtVerApellidoVet().setText(vet.getApellido_medico());
                vistaC.getTxtEspecialidadCita().setText(vet.getEspecialidad());
            });
            boolean estqado = (boolean) vistaC.getTblCitas().getValueAt(vistaC.getTblCitas().getSelectedRow(), 6);
            if (estqado) {
                vistaC.getCbEstadoCita().setSelectedIndex(1);
            } else {
                vistaC.getCbEstadoCita().setSelectedIndex(0);

            }
        }
    }

    private void Infomod() {
        ArrayList<CitasMedicas> listCita = modelC.ListCitas(vistaC.getTblCitas().getValueAt(vistaC.getTblCitas().getSelectedRow(), 0).toString(), ControllerLogin.Usuario);
        vistaC.getTxtIdCita().setEnabled(false);
        listCita.stream().forEach(citaMed -> {
            try {
                vistaC.getTxtIdCita().setText(citaMed.getCodigoCita());
                vistaC.getTxtIdMedicoCita().setText(citaMed.getCodigoMedico());
                vistaC.getFechaCita().setDate(citaMed.getFechaCita());
                vistaC.getHora().setSelectedItem(citaMed.getHoraCita());
                vistaC.getTxtIdClienteCita().setText(citaMed.getCodigoCliente());

            } catch (Exception e) {
                System.out.println(e);
            }

        });
        //Para cargar la info del cliente
        ModeloClientes modelCli = new ModeloClientes();
        ArrayList<Clientes> listCli = modelCli.ListClient_B(vistaC.getTblCitas().getValueAt(vistaC.getTblCitas().getSelectedRow(), 2).toString());
        listCli.stream().forEach(cli -> {
            vistaC.getTxtIdClienteCita().setText(cli.getId_cliente());
            vistaC.getTxtNombreClienteCita().setText(cli.getNombre_cliente());
            vistaC.getTxtApellidoClienteCita().setText(cli.getApellido_cliente());
            vistaC.getTxtTelefonoClienteCita().setText(cli.getTelefono());
        });

        //Para cargar la info del Veterinario
        ModelVeterinario modelVet = new ModelVeterinario();
        ArrayList<Veterinario> listVet = modelVet.ListVet_completaB(vistaC.getTblCitas().getValueAt(vistaC.getTblCitas().getSelectedRow(), 1).toString());
        listVet.stream().forEach(vet -> {
            vistaC.getTxtIdMedicoCita().setText(vet.getid_medico());
            vistaC.getTxtNombreVeterinarioCita().setText(vet.getNombre_medico());
            vistaC.getTxtApellidoVeterinarioCita().setText(vet.getApellido_medico());
            vistaC.getTxtEspecialidadCita().setText(vet.getEspecialidad());
        });
    }

    private void LimpiarDlg() {
        vistaC.getTxtIdCita().setText("");
        vistaC.getTxtIdClienteCita().setText("");
        vistaC.getTxtNombreClienteCita().setText("");
        vistaC.getTxtApellidoClienteCita().setText("");
        vistaC.getTxtTelefonoClienteCita().setText("");
        vistaC.getTxtNombreVeterinarioCita().setText("");
        vistaC.getTxtApellidoVeterinarioCita().setText("");
        vistaC.getTxtEspecialidadCita().setText("");
        vistaC.getTxtIdMedicoCita().setText("");
        vistaC.getHora().setSelectedIndex(0);
        vistaC.getFechaCita().setDate(new java.util.Date(fechaActual()));

    }

    public void cargarCitaFecha() {
        //Enlace de la tabla con el metodo de las etiquetas
        String fechaHoy = fechaActual();
        DefaultTableModel tblmodel;
        tblmodel = (DefaultTableModel) vistaC.getTblCitas().getModel();
        tblmodel.setNumRows(0);
        String valor = vistaC.getTxtBuscarCita().getText();
        List<CitasMedicas> tablaCita = modelC.listarCitasLogico(fechaHoy);
        Holder<Integer> i = new Holder<>(0);
        tablaCita.stream().forEach(cita -> {
            //Agregar a la tabla
            tblmodel.addRow(new Object[5]);
            vistaC.getTblCitas().setValueAt(cita.getCodigoCita(), i.value, 0);
            vistaC.getTblCitas().setValueAt(cita.getCodigoMedico(), i.value, 1);
            vistaC.getTblCitas().setValueAt(cita.getCodigoCliente(), i.value, 2);
            vistaC.getTblCitas().setValueAt(cita.getFechaSolicitud(), i.value, 3);
            vistaC.getTblCitas().setValueAt(cita.getFechaCita(), i.value, 4);
            vistaC.getTblCitas().setValueAt(cita.getHoraCita(), i.value, 5);
            vistaC.getTblCitas().setValueAt(cita.getEstado(), i.value, 6);
            i.value++;
        });

    }

    public void cargarCita() {
        //Enlace de la tabla con el metodo de las etiquetas
        String fechaHoy = fechaActual();
        DefaultTableModel tblmodel;
        tblmodel = (DefaultTableModel) vistaC.getTblCitas().getModel();
        tblmodel.setNumRows(0);
        String valor = vistaC.getTxtBuscarCita().getText();
        ArrayList<CitasMedicas> tablaCita = modelC.ListCitas(valor, ControllerLogin.Usuario);
        Holder<Integer> i = new Holder<>(0);
        tablaCita.stream().forEach(cita -> {
            //Agregar a la tabla
            tblmodel.addRow(new Object[5]);
            vistaC.getTblCitas().setValueAt(cita.getCodigoCita(), i.value, 0);
            vistaC.getTblCitas().setValueAt(cita.getCodigoMedico(), i.value, 1);
            vistaC.getTblCitas().setValueAt(cita.getCodigoCliente(), i.value, 2);
            vistaC.getTblCitas().setValueAt(cita.getFechaSolicitud(), i.value, 3);
            vistaC.getTblCitas().setValueAt(cita.getFechaCita(), i.value, 4);
            vistaC.getTblCitas().setValueAt(cita.getHoraCita(), i.value, 5);
            vistaC.getTblCitas().setValueAt(cita.getEstado(), i.value, 6);
            i.value++;
        });

    }

    public String agregarCombo(JComboBox combo) {
        int comboSelec = vistaC.getHora().getSelectedIndex();

        String hora = "";
        switch (comboSelec) {
            case 1:
                hora = vistaC.getHora().getSelectedItem().toString();
                break;
            case 2:
                hora = vistaC.getHora().getSelectedItem().toString();
                break;
            case 3:
                hora = vistaC.getHora().getSelectedItem().toString();
                break;
            case 4:
                hora = vistaC.getHora().getSelectedItem().toString();
                break;
            case 5:
                hora = vistaC.getHora().getSelectedItem().toString();
                break;
            case 6:
                hora = vistaC.getHora().getSelectedItem().toString();
                break;
            case 7:
                hora = vistaC.getHora().getSelectedItem().toString();
                break;
            case 8:
                hora = vistaC.getHora().getSelectedItem().toString();
                break;
            case 9:
                hora = vistaC.getHora().getSelectedItem().toString();
                break;
            case 10:
                hora = vistaC.getHora().getSelectedItem().toString();
                break;
            default:
                hora = "00:00:00";
                break;
        }
        return hora;

    }

    //METODOS VETERINARIO
    public void agregarVeterinario() {
        int selecc = vistaC.getTblBuscarVeterinario().getSelectedRow();
        if (selecc != -1) {
            String ver = vistaC.getTblBuscarVeterinario().getValueAt(selecc, 0).toString();
            ArrayList<Veterinario> tablaVet = modelC.ListVet_completa(ver);
            for (int j = 0; j < tablaVet.size(); j++) {
                if (tablaVet.get(j).getid_medico().equals(ver)) {
                    vistaC.getTxtIdMedicoCita().setText(tablaVet.get(j).getid_medico());
                    vistaC.getTxtNombreVeterinarioCita().setText(tablaVet.get(j).getNombre_medico());
                    vistaC.getTxtApellidoVeterinarioCita().setText(tablaVet.get(j).getApellido_medico());
                    vistaC.getTxtEspecialidadCita().setText(tablaVet.get(j).getEspecialidad());
                }
            }
            vistaC.getDlgVeterinario().setVisible(false);
        } else {
            JOptionPane.showMessageDialog(vistaC, "No a seleccionado a ningun veterinario");
        }
    }

    public void CargarVeterinario() {

        //Enlace de la tabla con el metodo de las etiquetas
        DefaultTableModel tblmodel;
        tblmodel = (DefaultTableModel) vistaC.getTblBuscarVeterinario().getModel();
        tblmodel.setNumRows(0);
        String valor = vistaC.getBtnBuscarVeterinario().getText();
        ArrayList<Veterinario> tablaVet = modelC.ListVet_completa(valor);
        Holder<Integer> i = new Holder<>(0);
        tablaVet.stream().forEach(pac -> {
            //Agregar a la tabla
            tblmodel.addRow(new Object[5]);
            vistaC.getTblBuscarVeterinario().setValueAt(pac.getid_medico(), i.value, 0);
            vistaC.getTblBuscarVeterinario().setValueAt(pac.getNombre_medico(), i.value, 1);
            vistaC.getTblBuscarVeterinario().setValueAt(pac.getApellido_medico(), i.value, 2);
            vistaC.getTblBuscarVeterinario().setValueAt(pac.getEspecialidad(), i.value, 3);
            i.value++;
        });

    }

    //METODOS CLIENTE
    public void CargarCliente() {
        DefaultTableModel tablamodel = (DefaultTableModel) vistaC.getTblAgregarCliente().getModel();
        tablamodel.setNumRows(0);
        String valor = vistaC.getTxtBuscarCliente().getText();
        List<Clientes> listaClientes = modelC.ListClient(valor);
        listaClientes.stream().forEach(cliente -> {
            String[] filas = {cliente.getId_cliente(), cliente.getNombre_cliente(), cliente.getApellido_cliente(),
                cliente.getTelefono()};
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

    public void agregarCliente() {
        int selecc = vistaC.getTblAgregarCliente().getSelectedRow();
        if (selecc != -1) {
            String ver = vistaC.getTblAgregarCliente().getValueAt(selecc, 0).toString();
            List<Clientes> listaClientes = modelC.ListClient(ver);
            for (int j = 0; j < listaClientes.size(); j++) {
                if (listaClientes.get(j).getId_cliente().equals(ver)) {
                    vistaC.getTxtIdClienteCita().setText(listaClientes.get(j).getId_cliente());
                    vistaC.getTxtNombreClienteCita().setText(listaClientes.get(j).getNombre_cliente());
                    vistaC.getTxtApellidoClienteCita().setText(listaClientes.get(j).getApellido_cliente());
                    vistaC.getTxtTelefonoClienteCita().setText(listaClientes.get(j).getTelefono());
                }
            }
            vistaC.getDlgCliente().setVisible(false);
        } else {
            JOptionPane.showMessageDialog(vistaC, "No a seleccionado a nigun cliente");
        }
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

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean Selected, boolean hasFocus, int row, int col) {
        super.getTableCellRendererComponent(table, value, Selected, hasFocus, row, col);
        DefaultTableModel tmodel = (DefaultTableModel) vistaC.getTblCitas().getModel();
        JCheckBox check = new JCheckBox();

        if (vistaC.getTblCitas().getValueAt(row, 6).equals(true)) {
            setBackground(Color.getHSBColor(0.210f, 0.50f, 0.8f));

            if (tmodel.getValueAt(row, col).getClass().equals(Boolean.class
            )) {
                check.setSelected(Boolean.parseBoolean(tmodel.getValueAt(row, col).toString()));
                check.setBackground(Color.getHSBColor(0.210f, 0.50f, 0.8f));
                return check;
            }
        } else {
            setBackground(Color.pink);

            if (tmodel.getValueAt(row, col).getClass().equals(Boolean.class
            )) {
                check.setSelected(Boolean.parseBoolean(tmodel.getValueAt(row, col).toString()));
                check.setBackground(Color.pink);
                return check;
            }
        }
        return this;
    }

    private void Imprimir_Citas() {
        ConectionPg connection = new ConectionPg();

        String IdMedico = vistaC.getTxtReporteIdMedico().getText();
        String IdCliente = vistaC.getTxtReporteIdCliente().getText();

        try {
            JasperReport jr = (JasperReport) JRLoader.loadObject(getClass().getResource("/View/Reporte/PV_CitasMedicas.jasper"));

            Map<String, Object> parametros = new HashMap<>();

            parametros.put("IdMedico", IdMedico);
            parametros.put("IdCliente", IdCliente);

            //CARGANDO EL REPORTE DE LA BASE
            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, connection.getCon());
            //VER
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(ControladorCitas.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void AbrirDlgReporte() {
        vistaC.getDlgReporteCitas().setVisible(true);
        vistaC.getDlgReporteCitas().setSize(550, 320);
        vistaC.getDlgReporteCitas().setLocationRelativeTo(null);
    }

    public void EstadoCita() {
        int eleccion = vistaC.getCbEstadoCita().getSelectedIndex();
        boolean estado;
        String cod = vistaC.getTxtIdCitaMedica().getText();
        if (eleccion == 0) {
            estado = false;
        } else {
            estado = true;
        }
        modelC.CitaPendieteRealizada(cod, estado);
        //vistaC.getDlgVista().dispose();
        CargarGeneral();
    }

}
