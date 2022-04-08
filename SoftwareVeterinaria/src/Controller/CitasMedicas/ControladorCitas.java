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
import Model.Veterinario.Veterinario;
import View.CitasMedicas.Crud_CitasMedicas;
import com.toedter.calendar.JDateChooser;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;

/**
 *
 * @author Usuario
 */
public class ControladorCitas {

    ModeloCitasMed modelC;
    Crud_CitasMedicas vistaC;

    public ControladorCitas(ModeloCitasMed modelC, Crud_CitasMedicas vistaC) {
        this.modelC = modelC;
        this.vistaC = vistaC;
        vistaC.setVisible(true);
        cargarCita();
        CargarCliente();
        CargarVeterinario();
        vistaC.getTxtIdCita().setEditable(false);
    }

    public void iniciarControl() {

        //Dialogo
        vistaC.getBtnCrearCita().addActionListener(l -> abrirDialogo(1));
        vistaC.getBtnModificarCita().addActionListener(l -> abrirDialogo(2));
        vistaC.getBttAgregarClienteCita().addActionListener(l -> abrirDlg(1));
        vistaC.getBttAgregarMedicoCita().addActionListener(l -> abrirDlg(2));
        //Creacion
        vistaC.getBtnAceptarCita().addActionListener(l -> CrearEditCitas());
        //vistaC.getBtnEliminarCita().addActionListener(l -> EliminarCita());
        vistaC.getBtnCancelarCita().addActionListener(l -> Cancelar());
        //Agregar datos externos 
        vistaC.getBtnAgregarVeterinario().addActionListener(l -> agregarVeterinario());
        vistaC.getBtnAgregarCliente().addActionListener(l -> agregarCliente());

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
    }

    public void abrirDialogo(int num) {
        String titulo;
        if (num == 1) {
            titulo = "Crear Cita";
            vistaC.getDlgAgregar().setName("Crear Cita");
            vistaC.getDlgAgregar().setSize(880, 500);
            vistaC.getDlgAgregar().setLocationRelativeTo(null);
            vistaC.getDlgAgregar().setVisible(true);
            vistaC.getTxtIdCita().setText(modelC.codigoCita());
        } else {
            titulo = "Editar Cita";
            vistaC.getDlgAgregar().setName("Editar Cita");

            vistaC.getTxtIdCita().setEditable(false);
            vistaC.getDlgAgregar().setSize(880, 389);
            vistaC.getDlgAgregar().setLocationRelativeTo(null);
            vistaC.getDlgAgregar().setVisible(true);

        }

        vistaC.getDlgAgregar().setTitle(titulo);

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

    private void CrearEditCitas() {
        if (vistaC.getDlgAgregar().getName().equals("Crear")) {
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

            if (citas.CrearCita()) {
                vistaC.getDlgAgregar().setVisible(false);
                JOptionPane.showMessageDialog(vistaC, "Exito en la operacion");

            } else {
                JOptionPane.showMessageDialog(vistaC, "Error en la operacion");
            }
        } else {

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
            } else {
                JOptionPane.showMessageDialog(vistaC, "Error en la operacion");
            }
        }

    }
    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

    public String getFecha(JDateChooser jd) {
        if (jd.getDate() != null) {
            return formato.format(jd.getDate());
        } else {
            return null;
        }
    }

    public void cargarCita() {

        //Enlace de la tabla con el metodo de las etiquetas
        DefaultTableModel tblmodel;
        tblmodel = (DefaultTableModel) vistaC.getTblCitasMedicas().getModel();
        tblmodel.setNumRows(0);
        String valor = vistaC.getTxtBuscarCita().getText();
        ArrayList<CitasMedicas> tablaCita = modelC.ListCitas(valor, ControllerLogin.Usuario);
        Holder<Integer> i = new Holder<>(0);
        tablaCita.stream().forEach(cita -> {
            //Agregar a la tabla
            tblmodel.addRow(new Object[5]);
            vistaC.getTblCitasMedicas().setValueAt(cita.getCodigoCita(), i.value, 0);
            vistaC.getTblCitasMedicas().setValueAt(cita.getCodigoMedico(), i.value, 1);
            vistaC.getTblCitasMedicas().setValueAt(cita.getCodigoCliente(), i.value, 2);
            vistaC.getTblCitasMedicas().setValueAt(cita.getFechaSolicitud(), i.value, 3);
            vistaC.getTblCitasMedicas().setValueAt(cita.getHoraCita(), i.value, 4);
            vistaC.getTblCitasMedicas().setValueAt(cita.getEstado(), i.value, 5);
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

    public void CargarCliente() {
        DefaultTableModel tablamodel = (DefaultTableModel) vistaC.getTblAgregarCliente().getModel();
        tablamodel.setNumRows(0);
        String valor = vistaC.getTxtBuscarCliente().getText();
        List<Clientes> listaClientes = modelC.ListClient(valor);
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

    public void Cancelar() {
        vistaC.getDlgAgregar().dispose();
    }

}
