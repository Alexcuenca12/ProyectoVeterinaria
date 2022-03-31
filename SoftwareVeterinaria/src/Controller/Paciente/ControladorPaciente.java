package Controller.Paciente;

import Model.Clientes.Clientes;
import Model.Clientes.ModeloClientes;
import Model.Paciente.ModeloPaciente;
import Model.Paciente.Paciente;
import View.CrudPacientes.VistaCrudPaciente;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import static java.lang.Math.abs;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;

public class ControladorPaciente {

    ModeloPaciente model;
    VistaCrudPaciente vista;
    public JFileChooser jfc;

    public ControladorPaciente(ModeloPaciente model, VistaCrudPaciente vista) {
        this.model = model;
        this.vista = vista;
        vista.setVisible(true);
        CargarPac();
        
    }

    public void iniciaControl() {
        vista.getBtnIngresar().addActionListener(l -> AbrirDialogo(1));
        vista.getBtnEditar().addActionListener(l -> AbrirDialogo(2));
        vista.getBtnAceptar().addActionListener(l -> CrearEditMasc());
        vista.getBtnExaminar().addActionListener(l -> ExaminarFoto());
        vista.getBtnRemover().addActionListener(l -> EliminarPac());
        vista.getBtnBuscar_Cli().addActionListener(l -> CargarCliente());
        vista.getBtnBuscar_Cli().addActionListener(l -> AbrirDial(1));
        vista.getBttAgregarCli().addActionListener(l -> agregarCliente());
        vista.getTxtBuscar().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                CargarPac();
            }
        });
        vista.getBtnCancelar().addActionListener(l -> LimpiarDlg());
    }

    private void AbrirDial(int ce) {
        String tittle = "";
        vista.getDlgCliente().setLocationRelativeTo(vista);
        if (ce == 1) {
            tittle = "CLIENTES";
            vista.getDlgCliente().setName("CLIENTES");
            vista.getLblTitulo().setText(tittle);
            vista.getDlgCliente().setVisible(true);
            vista.getDlgCliente().setLocationRelativeTo(vista);
            vista.getDlgCliente().setSize(744, 360);
            vista.getDlgCliente().setTitle(tittle);
        }
    }

    private void AbrirDialogo(int ce) {
        String tittle = "";
        vista.getDlgPacientes().setLocationRelativeTo(vista);
        if (ce == 1) {
            LimpiarDlg();
            tittle = "Crear Paciente";
            vista.getRbMacho().setSelected(true);
            vista.getDlgPacientes().setName("CREAR PACIENTE");
            vista.getLblTitulo().setText(tittle);
            vista.getDlgPacientes().setVisible(true);
            vista.getDlgPacientes().setSize(1200, 650);
                vista.getDlgPacientes().setLocationRelativeTo(null);
            vista.getDlgPacientes().setTitle(tittle);

        } else {
            if (vista.getTabla_Pacientes().getSelectedRow() > -1) {
                tittle = "Editar Paciente";
                LimpiarDlg();
                vista.getRbMacho().setSelected(true);
                vista.getDlgPacientes().setName("EDITAR PACIENTE");
                vista.getLblTitulo().setText(tittle);
                vista.getDlgPacientes().setVisible(true);
                vista.getDlgPacientes().setSize(1200, 650);
                vista.getDlgPacientes().setLocationRelativeTo(null);
                vista.getDlgPacientes().setTitle(tittle);
                Infomod();
            } else {
                JOptionPane.showMessageDialog(vista, "Seleccion una fila de la tabla");
            }
        }
        vista.getDlgPacientes().setTitle(tittle);
    }

    private void CrearEditMasc() {
        if (vista.getDlgPacientes().getName().equals("CREAR PACIENTE")) {
            //Insertar
            vista.getTxtcodigo().setEnabled(true);
            String id_mascota = vista.getTxtcodigo().getText();
            String id_cliente_m = vista.getTxtcedula().getText();
            String nombre_mascota = vista.getTxtNombre().getText();
            String raza_mascota = vista.getTxtRaza().getText();
            String sexo_mascota;
            if (vista.getRbMacho().isSelected()) {
                sexo_mascota = "M";
            } else {
                sexo_mascota = "H";
            }
            String especie_mascota = vista.getCbEspecie().getSelectedItem().toString();
            String color_mascota = vista.getTxtColor().getText();
            int añoN = abs(1900 - vista.getDtNacimiento().getCalendar().get(Calendar.YEAR));
            int mesN = vista.getDtNacimiento().getCalendar().get(Calendar.MONTH);
            int diaN = vista.getDtNacimiento().getCalendar().get(Calendar.DAY_OF_MONTH);
            Date fecha_nacimiento_mascota = new Date(añoN, mesN, diaN);
            int añoI = abs(1900 - vista.getDtIngreso().getCalendar().get(Calendar.YEAR));
            int mesI = vista.getDtIngreso().getCalendar().get(Calendar.MONTH);
            int diaI = vista.getDtIngreso().getCalendar().get(Calendar.DAY_OF_MONTH);
            Date fecha_ingreso_mascota = new Date(añoI, mesI, diaI);

            ModeloPaciente paciente = new ModeloPaciente();

            paciente.setId_mascota(id_mascota);
            paciente.setColor_mascota(color_mascota);
            paciente.setEspecie_mascota(especie_mascota);
            paciente.setFecha_ingreso_mascota(fecha_nacimiento_mascota);
            paciente.setFecha_nacimiento_mascota(fecha_ingreso_mascota);
            paciente.setId_cliente_m(id_cliente_m);
            paciente.setNombre_mascota(nombre_mascota);
            paciente.setRaza_mascota(raza_mascota);
            paciente.setSexo_mascota(sexo_mascota);

            try {
                //Foto
                FileInputStream img = new FileInputStream(jfc.getSelectedFile());
                int largo = (int) jfc.getSelectedFile().length();
                paciente.setImg(img);
                paciente.setLargo(largo);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ControladorPaciente.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (paciente.crearPaciente()) {
                vista.getDlgPacientes().setVisible(false);
                JOptionPane.showMessageDialog(vista, "Exito en la operacion");
                LimpiarDlg();
                CargarPac();
            } else {
                JOptionPane.showMessageDialog(vista, "Error en la operacion");
            }
        } else {

            vista.getTxtcodigo().setEnabled(true);
            String id_mascota = vista.getTxtcodigo().getText();
            String id_cliente_m = vista.getTxtcedula().getText();
            String nombre_mascota = vista.getTxtNombre().getText();
            String raza_mascota = vista.getTxtRaza().getText();
            String sexo_mascota;
            if (vista.getRbMacho().isSelected()) {
                sexo_mascota = "M";
            } else {
                sexo_mascota = "H";
            }
            String especie_mascota = vista.getCbEspecie().getSelectedItem().toString();
            String color_mascota = vista.getTxtColor().getText();
            int añoN = abs(1900 - vista.getDtNacimiento().getCalendar().get(Calendar.YEAR));
            int mesN = vista.getDtNacimiento().getCalendar().get(Calendar.MONTH);
            int diaN = vista.getDtNacimiento().getCalendar().get(Calendar.DAY_OF_MONTH);
            Date fecha_nacimiento_mascota = new Date(añoN, mesN, diaN);
            int añoI = abs(1900 - vista.getDtIngreso().getCalendar().get(Calendar.YEAR));
            int mesI = vista.getDtIngreso().getCalendar().get(Calendar.MONTH);
            int diaI = vista.getDtIngreso().getCalendar().get(Calendar.DAY_OF_MONTH);
            Date fecha_ingreso_mascota = new Date(añoI, mesI, diaI);

            ModeloPaciente paciente = new ModeloPaciente();

            paciente.setId_mascota(id_mascota);
            paciente.setColor_mascota(color_mascota);
            paciente.setEspecie_mascota(especie_mascota);
            paciente.setFecha_ingreso_mascota(fecha_nacimiento_mascota);
            paciente.setFecha_nacimiento_mascota(fecha_ingreso_mascota);
            paciente.setId_cliente_m(id_cliente_m);
            paciente.setNombre_mascota(nombre_mascota);
            paciente.setRaza_mascota(raza_mascota);
            paciente.setSexo_mascota(sexo_mascota);

            try {
                //Foto
                FileInputStream img = new FileInputStream(jfc.getSelectedFile());
                int largo = (int) jfc.getSelectedFile().length();
                paciente.setImg(img);
                paciente.setLargo(largo);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ControladorPaciente.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (paciente.editarPaciente()) {
                vista.getDlgPacientes().setVisible(false);
                LimpiarDlg();
                CargarPac();
                JOptionPane.showMessageDialog(vista, "Exito en la operacion");
            } else {
                JOptionPane.showMessageDialog(vista, "Error en la operacion");
            }

        }
    }

    private void ExaminarFoto() {
        jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int estado = jfc.showOpenDialog(vista);
        if (estado == JFileChooser.APPROVE_OPTION) {
            try {
                Image imagen = ImageIO.read(jfc.getSelectedFile()).getScaledInstance(
                        vista.getLblFoto().getWidth(),
                        vista.getLblFoto().getHeight(),
                        Image.SCALE_DEFAULT);

                Icon icono = new ImageIcon(imagen);
                vista.getLblFoto().setIcon(icono);
                vista.getLblFoto().updateUI();
            } catch (IOException ex) {
                Logger.getLogger(ControladorPaciente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void Infomod() {
        ArrayList<Paciente> list = model.busquedaPacienteID(vista.getTabla_Pacientes().getValueAt(vista.getTabla_Pacientes().getSelectedRow(), 0).toString());
        vista.getTxtcodigo().setEnabled(false);
        list.stream().forEach(masc -> {
            try {
                vista.getTxtcodigo().setText("" + masc.getId_mascota());
                vista.getTxtNombre().setText(masc.getNombre_mascota());
                vista.getTxtRaza().setText(masc.getRaza_mascota());
                vista.getTxtcedula().setText(masc.getId_cliente_m());
                vista.getTxtColor().setText(masc.getColor_mascota());
                vista.getCbEspecie().setSelectedItem(masc.getEspecie_mascota());
                if (masc.getSexo_mascota().equalsIgnoreCase("m")) {
                    vista.getRbMacho().setSelected(true);
                } else {
                    vista.getRbHembra().setSelected(true);
                }
                vista.getDtIngreso().setDate(masc.getFecha_nacimiento_mascota());
                vista.getDtNacimiento().setDate(masc.getFecha_ingreso_mascota());
                Image foto = masc.getFoto();
                if (foto != null) {
                    Image nimg = foto.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                    ImageIcon icon = new ImageIcon(nimg);
                    DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
                    renderer.setIcon(icon);
                    vista.getLblFoto().setIcon(icon);
                } else {
                    vista.getLblFoto().setIcon(null);
                }

            } catch (Exception e) {
                System.out.println(e);
            }

        });
        //Para cargar la info del cliente
        ModeloClientes modelCli = new ModeloClientes();
        ArrayList<Clientes> listCli = modelCli.ListClient_B(vista.getTabla_Pacientes().getValueAt(vista.getTabla_Pacientes().getSelectedRow(), 1).toString());
        listCli.stream().forEach(cli -> {
            vista.getTxtcedula().setText(cli.getId_cliente());
            vista.getTxtNombreD().setText(cli.getNombre_cliente());
            vista.getTxtApellidoD().setText(cli.getApellido_cliente());
            int edad = CalcularEdad(cli.getFechanacimiento());
            vista.getTxtEdadD().setText("" + edad);
            vista.getTxtTelefonoD().setText(cli.getTelefono());
            vista.getTxtEmaiD().setText(cli.getEmail());
            vista.getTxtDireccionD().setText(cli.getDireccion_cliente());
        });
    }

    private void LimpiarDlg() {
        vista.getButtonGroup1().clearSelection();
        vista.getTxtcodigo().setText("");
        vista.getTxtNombre().setText("");
        vista.getTxtRaza().setText("");
        vista.getTxtcedula().setText("");
        vista.getTxtColor().setText("");
        vista.getCbEspecie().setSelectedIndex(0);
        vista.getDtIngreso().setDate(new java.util.Date(fechaActual()));
        vista.getDtNacimiento().setDate(new java.util.Date(fechaActual()));
        vista.getLblFoto().setIcon(new ImageIcon("imagenesProyecto/BLANCO.PNG"));
        vista.getDlgPacientes().dispose();
    }

    private void EliminarPac() {
        if (vista.getTabla_Pacientes().getSelectedRow() > -1) {
            ModeloPaciente paciente = new ModeloPaciente();
            String id_mascota = vista.getTabla_Pacientes().getValueAt(vista.getTabla_Pacientes().getSelectedRow(), 0).toString();
            if (paciente.eliminarPaciente(id_mascota)) {
                JOptionPane.showMessageDialog(vista, "Exito en la operacion");
                CargarPac();
            } else {
                JOptionPane.showMessageDialog(vista, "Error en la operacion");
            }
        } else {
            JOptionPane.showMessageDialog(vista, "Seleccion una fila de la tabla");
        }
    }

    private void CargarPac() {
        //Enlace de la tabla con el metodo de las etiquetas
        DefaultTableModel tblmodel;
        vista.getTabla_Pacientes().setDefaultRenderer(Object.class, new ImagenTabla());
        vista.getTabla_Pacientes().setRowHeight(100);
        tblmodel = (DefaultTableModel) vista.getTabla_Pacientes().getModel();
        tblmodel.setNumRows(0);
        String valor = vista.getTxtBuscar().getText();
        ArrayList<Paciente> list = model.busquedaPaciente(valor);
        Holder<Integer> i = new Holder<>(0);
        list.stream().forEach(pac -> {
            //Para calcular la edad de la persona
            Period edad = Period.between(pac.getFecha_nacimiento_mascota().toLocalDate(), LocalDate.now());
            //Agregar a la tabla
            tblmodel.addRow(new Object[9]);
            vista.getTabla_Pacientes().setValueAt(pac.getId_mascota(), i.value, 0);
            vista.getTabla_Pacientes().setValueAt(pac.getId_cliente_m(), i.value, 1);
            vista.getTabla_Pacientes().setValueAt(pac.getNombre_mascota(), i.value, 2);
            vista.getTabla_Pacientes().setValueAt(pac.getRaza_mascota(), i.value, 3);
            vista.getTabla_Pacientes().setValueAt(pac.getSexo_mascota(), i.value, 4);
            vista.getTabla_Pacientes().setValueAt(pac.getEspecie_mascota(), i.value, 5);
            vista.getTabla_Pacientes().setValueAt(pac.getColor_mascota(), i.value, 6);
            vista.getTabla_Pacientes().setValueAt(edad.getYears(), i.value, 7);
            vista.getTabla_Pacientes().setValueAt(pac.getFecha_ingreso_mascota(), i.value, 8);
            Image foto = pac.getFoto();
            if (foto != null) {
                Image nimg = foto.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                ImageIcon icon = new ImageIcon(nimg);
                DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
                renderer.setIcon(icon);
                JLabel label = new JLabel(icon);
                vista.getTabla_Pacientes().setValueAt(label, i.value, 9);
            } else {
                vista.getTabla_Pacientes().setValueAt(null, i.value, 9);
            }
            i.value++;

        });
    }

    public void CargarCliente() {
        vista.getTablacliente().setDefaultRenderer(Object.class, new ImagenTabla());
        vista.getTablacliente().setRowHeight(100);

        DefaultTableModel tablamodel = (DefaultTableModel) vista.getTablacliente().getModel();
        tablamodel.setNumRows(0);
        List<Clientes> listaClientes = model.ListClient();
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

        int selecc = vista.getTablacliente().getSelectedRow();
        if (selecc != -1) {
            String ver = vista.getTablacliente().getValueAt(selecc, 0).toString();
            List<Clientes> tablaMas = model.ListClient();
            for (int j = 0; j < tablaMas.size(); j++) {
                if (tablaMas.get(j).getId_cliente().equals(ver)) {
                    vista.getTxtcedula().setText(tablaMas.get(j).getId_cliente());
                    vista.getTxtNombreD().setText(tablaMas.get(j).getNombre_cliente());
                    vista.getTxtApellidoD().setText(tablaMas.get(j).getApellido_cliente());
                    vista.getTxtEdadD().setText(String.valueOf(CalcularEdad(tablaMas.get(j).getFechanacimiento())));
                    vista.getTxtTelefonoD().setText(tablaMas.get(j).getTelefono());
                    vista.getTxtEmaiD().setText(tablaMas.get(j).getEmail());
                    vista.getTxtDireccionD().setText(tablaMas.get(j).getDireccion_cliente());
                }
            }
            vista.getDlgCliente().setVisible(false);
        } else {
            JOptionPane.showMessageDialog(vista, "No a seleccionado a nigun cliente");
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
}
