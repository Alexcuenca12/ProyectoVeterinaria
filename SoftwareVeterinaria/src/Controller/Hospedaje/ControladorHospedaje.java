package Controller.Hospedaje;

import Controller.Paciente.ImagenTabla;
import Model.Celda.Celda;
import Model.Celda.ModelCelda;
import Model.Guarderia.Guarderia;
import Model.Guarderia.ModelGuarderia;
import Model.Paciente.Paciente;
import View.Hospedaje.VistaHospedaje;
import com.toedter.calendar.JDateChooser;
import java.awt.Image;
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
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;

/**
 *
 * @author Usuario
 */
public class ControladorHospedaje {

    private ModelGuarderia modelo;
    protected VistaHospedaje vista;
    private ModelCelda modelCel;

    //Constructor
    public ControladorHospedaje(ModelGuarderia modelo, VistaHospedaje vista, ModelCelda modelCel) {
        this.modelo = modelo;
        this.vista = vista;
        this.modelCel = modelCel;
        vista.setVisible(true);
        CargarHospedaje();
        cargarCelda();
    }

    private void abrirDlg(int ce) {
        String tittle = "";
        vista.getDialogCelda().setSize(834, 338);
        vista.getDialogCelda().setLocationRelativeTo(vista);
        Generar_Cod();
        vista.getTxt_IDCelda().setEditable(false);
        if (ce == 1) {
            tittle = "Crear nueva Celda";
            vista.getDialogCelda().setName("crear");
            vista.getDialogCelda().setVisible(true);

        } else {
            if (vista.getTblCelda().getSelectedRow() > -1) {
                tittle = "Modificar Celda";
                //cargaMod();
                vista.getDialogCelda().setName("edit");
                vista.getDialogCelda().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(vista, "Seleccion una fila de la tabla");
            }
        }
        vista.getDialogCelda().setTitle(tittle);
    }

    public void iniciarControl() {
        vista.getBtnAgregar().addActionListener(l -> abrirDialogo(1));
        vista.getBtnEditar().addActionListener(l -> abrirDialogo(2));
        vista.getBtnEliminar().addActionListener(l -> eliminarHospedaje());
        vista.getBtnAceptar().addActionListener(l -> crear_editar());
        vista.getBtnBuscarMascota().addActionListener(l -> CargarMascota());
        vista.getBtnAñadir().addActionListener(l -> agregarMascota());
        vista.getBtnBuscarCelda().addActionListener(l -> abrirDlg(1));
        vista.getBtn_AgregarCel().addActionListener(l -> crearEditarCelda());
        vista.getBtn_AgregarT().addActionListener(l -> agregarCelda());

//        vista.getBtnBuscarMascota().addActionListener(l->abriDialogox(1));
        vista.getTxt_Buscar().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                cargarCelda();
            }
        });

        vista.getTxtBuscarH().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                CargarHospedaje();
            }
        });
    }

    public void CargarMascota() {
        vista.getDialogMascota().setSize(973, 388);
        vista.getDialogMascota().setLocationRelativeTo(vista);
        vista.getDialogMascota().setVisible(true);
        vista.getTabla_Mascotas().setDefaultRenderer(Object.class, new ImagenTabla());
        vista.getTabla_Mascotas().setRowHeight(100);

        //Enlace de la tabla con el metodo de las etiquetas
        DefaultTableModel tblmodel;
        tblmodel = (DefaultTableModel) vista.getTabla_Mascotas().getModel();
        tblmodel.setNumRows(0);

        String dato = vista.getTxtBuscar().getText();
        List<Paciente> list = modelo.listarPacientes(dato);
        Holder<Integer> i = new Holder<>(0);
        list.stream().forEach(pac -> {
            //Para calcular la edad de la persona
            Period edad = Period.between(pac.getFecha_nacimiento_mascota().toLocalDate(), LocalDate.now());
            //Agregar a la tabla
            tblmodel.addRow(new Object[10]);
            vista.getTabla_Mascotas().setValueAt(pac.getId_mascota(), i.value, 0);
            vista.getTabla_Mascotas().setValueAt(pac.getId_cliente_m(), i.value, 1);
            vista.getTabla_Mascotas().setValueAt(pac.getNombre_mascota(), i.value, 2);
            vista.getTabla_Mascotas().setValueAt(pac.getSexo_mascota(), i.value, 3);
            vista.getTabla_Mascotas().setValueAt(pac.getEspecie_mascota(), i.value, 4);
            vista.getTabla_Mascotas().setValueAt(pac.getRaza_mascota(), i.value, 5);
            vista.getTabla_Mascotas().setValueAt(pac.getColor_mascota(), i.value, 6);
            vista.getTabla_Mascotas().setValueAt(edad.getYears(), i.value, 7);
            vista.getTabla_Mascotas().setValueAt(pac.getFecha_ingreso_mascota(), i.value, 8);
            Image foto = pac.getFoto();
            if (foto != null) {

                Image nimg = foto.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                ImageIcon icono = new ImageIcon(nimg);
                DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
                renderer.setIcon(icono);
                vista.getTabla_Mascotas().setValueAt(new JLabel(icono), i.value, 9);

            } else {
                vista.getTabla_Mascotas().setValueAt(null, i.value, 9);
            }
            i.value++;

        });

    }

    public void agregarMascota() {
        boolean encontrada;
        int selecc = vista.getTabla_Mascotas().getSelectedRow();
        if (selecc != -1) {
            String ver = vista.getTabla_Mascotas().getValueAt(selecc, 0).toString();
            String dato = vista.getTxtBuscar().getText();
            List<Paciente> tablaMas = modelo.listarPacientes(dato);
            for (int j = 0; j < tablaMas.size(); j++) {
                if (tablaMas.get(j).getId_mascota().equals(ver)) {
                    vista.getTxtCodMascota().setText(tablaMas.get(j).getId_mascota());
                    vista.getTxtNombreMas().setText(tablaMas.get(j).getNombre_mascota());
                    vista.getTxtSexo().setText(tablaMas.get(j).getSexo_mascota());
                    vista.getTxtEspecie().setText(tablaMas.get(j).getEspecie_mascota());
                    vista.getTxtRaza().setText(tablaMas.get(j).getRaza_mascota());
                    vista.getTxtEdad().setText(String.valueOf(CalcularEdad(tablaMas.get(j).getFecha_nacimiento_mascota())));
                    if (tablaMas.get(j).getFoto() == null) {
                        vista.getLblFoto().setIcon(null);
                    } else {
                        Image in = tablaMas.get(j).getFoto();
                        Image img = in.getScaledInstance(133, 147, Image.SCALE_SMOOTH);
                        Icon icono = new ImageIcon(img);
                        vista.getLblFoto().setIcon(icono);
                    }
                }
            }
            vista.getDialogMascota().setVisible(false);
        } else {
            //JOptionPane.showMessageDialog(vistaM, "No a seleccionado a niguna mascota");
        }
    }

    public void CargarHospedaje() {
        DefaultTableModel tablamodel = (DefaultTableModel) vista.getTabla_hospedaje().getModel();
        tablamodel.setNumRows(0);
        String valor = vista.getTxtBuscarH().getText();
        List<Guarderia> listaHospedaje = modelo.listarGuarderia(valor);
        listaHospedaje.stream().forEach(hosp -> {
            String[] filas = {String.valueOf(hosp.getId_hospedaje()), hosp.getId_mascota(), hosp.getId_celda(),
                String.valueOf(hosp.getFecha_ingreso()), String.valueOf(hosp.getFecha_salida())};
            tablamodel.addRow(filas);
        });
    }

    public void abrirDialogo(int num) {
        codigo_celda = "";
        if (num == 1) {
            Crear();
        } else {
            Editar();
        }
        vista.getDlgHospedaje().setSize(900, 620);
        vista.getDlgHospedaje().setLocationRelativeTo(null);
    }

    public void Crear() {
        vista.getDlgHospedaje().setVisible(true);
        vista.getDlgHospedaje().setName("crear");
        vista.getTxtCodMascota().setEditable(false);
        vista.getTxtCodHospedaje().setEditable(false);
        vista.getTxtCodCelda().setEditable(false);
        vista.getTxtCodHospedaje().setText(String.valueOf(modelo.codigoHospedaje()));
        vista.getTxtNombreMas().setText("");
        vista.getTxtRaza().setText("");
        vista.getTxtSexo().setText("");
        vista.getTxtEspecie().setText("");
        vista.getTxtEdad().setText("");
        vista.getLblFoto().setIcon(null);
        vista.getTxtCodigoCelda().setText("");
        vista.getTxtUbicacion().setText("");
        vista.getTxtCosto().setText("");
//        vista.getTxtCodHospedaje().setText("");
        vista.getTxtCodMascota().setText("");
        vista.getTxtCodCelda().setText("");
        vista.getFechaIngreso().setDate(null);
        vista.getFechaSalida().setDate(null);
        //RADIOS BUTONS
    }

    public void Editar() {
        vista.getTxtCodMascota().setEditable(false);
        vista.getTxtCodHospedaje().setEditable(false);
        vista.getTxtCodCelda().setEditable(false);
        vista.getDlgHospedaje().setName("editar");
        boolean encontrado;
        int fila = vista.getTabla_hospedaje().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(vista, "Debes seleccionar una fila");
        } else {

            vista.getDlgHospedaje().setVisible(true);
            //MOSTRAR LOS DATOS DE HOSPEDAJE
            String identificador = vista.getTabla_hospedaje().getValueAt(fila, 0).toString();
            List<Guarderia> listaHospedaje = modelo.listarGuarderia(identificador);
            for (int i = 0; i < listaHospedaje.size(); i++) {
                if (String.valueOf(listaHospedaje.get(i).getId_hospedaje()).equals(identificador)) {
                    vista.getTxtCodHospedaje().setText(String.valueOf(listaHospedaje.get(i).getId_hospedaje()));
                    vista.getTxtCodMascota().setText(listaHospedaje.get(i).getId_mascota());
                    vista.getTxtCodCelda().setText(listaHospedaje.get(i).getId_celda());
                    vista.getFechaIngreso().setDate(listaHospedaje.get(i).getFecha_ingreso());
                    vista.getFechaSalida().setDate(listaHospedaje.get(i).getFecha_salida());
                }
            }
            //MOSTRAR LOS DATOS DE LA MASCOTA
            String identificador2 = vista.getTabla_hospedaje().getValueAt(fila, 1).toString();
            String dato = vista.getTxtBuscar().getText();
            List<Paciente> listaMascotas = modelo.listarPacientes(dato);
            for (int i = 0; i < listaMascotas.size(); i++) {
                if (listaMascotas.get(i).getId_mascota().equals(identificador2)) {
                    vista.getTxtNombreMas().setText(listaMascotas.get(i).getNombre_mascota());
                    vista.getTxtRaza().setText(listaMascotas.get(i).getRaza_mascota());
                    vista.getTxtEspecie().setText(listaMascotas.get(i).getEspecie_mascota());
                    vista.getTxtSexo().setText(listaMascotas.get(i).getSexo_mascota());
                    int edad = CalcularEdad(listaMascotas.get(i).getFecha_nacimiento_mascota());
                    vista.getTxtEdad().setText("" + edad);
                    if (listaMascotas.get(i).getFoto() != null) {
                        Image foto = listaMascotas.get(i).getFoto();
                        Image newimagen = foto.getScaledInstance(100, 100, Image.SCALE_SMOOTH); //dar dimensiones a la foto
                        ImageIcon icono = new ImageIcon(newimagen);
                        vista.getLblFoto().setIcon(icono);
                    } else {
                        vista.getLblFoto().setIcon(null);
                    }
                }
            }
            //MOSTRAR LOS DATOS DE LA CELDA
            List<Celda> list = modelCel.ListarCelda2();
            Holder<Integer> i = new Holder<>(0);
            list.stream().forEach(prov -> {
                vista.getTxtCodigoCelda().setText(prov.getId_celda());
                codigo_celda = prov.getId_celda();
                vista.getTxtUbicacion().setText(prov.getUbicacion_celda());
                vista.getTxtCosto().setText(String.valueOf(prov.getCosto_celda()));
                i.value++;

            });
        }
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

    public void crear_editar() {
        if (vista.getDlgHospedaje().getName() == "crear") {
            CrearHospedaje();

        } else {
            EditarHospedaje();
        }
    }

    public void CrearHospedaje() {

        String codigoH = vista.getTxtCodHospedaje().getText();
        String codMascota = vista.getTxtCodMascota().getText();
        String codCelda = vista.getTxtCodCelda().getText();
        String fechaIngreso = getFecha(vista.getFechaIngreso());
        String fechaSalida = getFecha(vista.getFechaSalida());

        if (vista.getTxtCodHospedaje().getText().isEmpty() || codMascota.isEmpty() || codCelda.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Porfavor llenar todos los campos");
        } else {
            ModelGuarderia hospedaje = new ModelGuarderia();
            hospedaje.setId_hospedaje(codigoH);
            hospedaje.setId_mascota(codMascota);
            hospedaje.setId_celda(codCelda);
            hospedaje.setFecha_ingreso(Date.valueOf(fechaIngreso));
            hospedaje.setFecha_salida(Date.valueOf(fechaSalida));
            if (hospedaje.CrearGuarderia()) {
                modelCel.CambiarEstado(codCelda, true);
                JOptionPane.showMessageDialog(vista, "El hospedaje se creo satisfactoriamente");
                vista.getDlgHospedaje().setVisible(false);
                LimpiarTabla();
                CargarHospedaje();
                cargarCelda();
                vista.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(vista, "Error no se pudo crear el hospedaje");
            }

        }
    }

    String codigo_celda;

    public void EditarHospedaje() {
        vista.getBtnBuscarCelda().setEnabled(false);
        vista.getBtnBuscarMascota().setEnabled(true);
        String codigoH = vista.getTxtCodHospedaje().getText();
        String codMascota = vista.getTxtCodMascota().getText();
        String codCelda = vista.getTxtCodCelda().getText();
        String fechaIngreso = getFecha(vista.getFechaIngreso());
        String fechaSalida = getFecha(vista.getFechaSalida());

        if (vista.getTxtCodHospedaje().getText().isEmpty() || codMascota.isEmpty() || codCelda.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Porfavor llenar todos los campos");
        } else {
            ModelGuarderia hospedaje = new ModelGuarderia();
            hospedaje.setId_hospedaje(codigoH);
            hospedaje.setId_mascota(codMascota);
            hospedaje.setId_celda(codCelda);
            hospedaje.setFecha_ingreso(Date.valueOf(fechaIngreso));
            hospedaje.setFecha_salida(Date.valueOf(fechaSalida));
            if (hospedaje.editarGuarderia()) {
                if (!codigo_celda.equals(codCelda)) {
                    modelCel.CambiarEstado(codCelda, true);
                    modelCel.CambiarEstado(codigo_celda, false);
                }

                JOptionPane.showMessageDialog(vista, "El hospedaje se modifico satisfactoriamente");
                vista.getDlgHospedaje().setVisible(false);
                LimpiarTabla();
                CargarHospedaje();
                cargarCelda();
                vista.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(vista, "Error no se pudo modificar el hospedaje");
            }
        }
    }
    //Metodo de radioButton estado

    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

    public String getFecha(JDateChooser jd) {
        if (jd.getDate() != null) {
            return formato.format(jd.getDate());
        } else {
            return null;
        }
    }

    public void eliminarHospedaje() {
        if (vista.getTabla_hospedaje().getSelectedRow() > -1) {
            ModelGuarderia hosp = new ModelGuarderia();
            String codigo = vista.getTabla_hospedaje().getValueAt(vista.getTabla_hospedaje().getSelectedRow(), 0).toString();
            String celda = vista.getTabla_hospedaje().getValueAt(vista.getTabla_hospedaje().getSelectedRow(), 2).toString();
            hosp.setId_hospedaje(codigo);
            if (hosp.eliminarGuarderia()) {
                JOptionPane.showMessageDialog(vista, "El registro a sido eliminado");
                modelCel.CambiarEstado(celda, false);
//                LimpiarTabla();
                CargarHospedaje();
                cargarCelda();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro");
            }
        } else {
            JOptionPane.showMessageDialog(vista, "Seleccion una fila de la tabla");
        }
    }

 

    public void LimpiarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) vista.getTabla_hospedaje().getModel();
        int a = vista.getTabla_hospedaje().getRowCount() - 1;
        int i;
        for (i = a; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    //Metodo de busqueda
    public void ImprimirReporte() {

    }

    public void cargarCelda() {
        DefaultTableModel tblmodel;
        tblmodel = (DefaultTableModel) vista.getTblCelda().getModel();
        tblmodel.setNumRows(0);
        String valor = vista.getTxt_Buscar().getText();
        List<Celda> list = modelCel.ListarCelda(valor);
        Holder<Integer> i = new Holder<>(0);
        list.stream().forEach(prov -> {
            tblmodel.addRow(new Object[4]);
            vista.getTblCelda().setValueAt(prov.getId_celda(), i.value, 0);
            vista.getTblCelda().setValueAt(prov.getCosto_celda(), i.value, 1);
            vista.getTblCelda().setValueAt(prov.getUbicacion_celda(), i.value, 2);
            vista.getTblCelda().setValueAt(prov.isEstado(), i.value, 3);
            i.value++;

        });
    }

    private void crearEditarCelda() {
        if (vista.getDialogCelda().getName().equals("crear")) {

            String idCelda = vista.getTxt_IDCelda().getText();
            Double costoCelda = (Double) vista.getSpCostoCelda().getValue();
            String ubicacionCel = vista.getTxt_UbiCelda().getText();

            ModelCelda celda = new ModelCelda();
            celda.setId_celda(idCelda);
            celda.setCosto_celda(costoCelda);
            celda.setUbicacion_celda(ubicacionCel);
            celda.setEstado(false);
            if (celda.crearCelda()) {
                vista.getDialogCelda().setVisible(false);
                JOptionPane.showMessageDialog(vista, "Exito en la operacion");
                limpiarCelda();
                cargarCelda();
            } else {
                JOptionPane.showMessageDialog(vista, "Error en la operacion");
            }
        }
    }

    public void editarCelda() {

        String idCelda = vista.getTxt_IDCelda().getText();
        Double costoCelda = (Double) vista.getSpCostoCelda().getValue();
        String ubicacionCel = vista.getTxt_UbiCelda().getText();

        ModelCelda celda = new ModelCelda();
        celda.setId_celda(idCelda);
        celda.setCosto_celda(costoCelda);
        celda.setUbicacion_celda(ubicacionCel);

        if (celda.editarCelda()) {
            //vista.getDialogCelda().setVisible(false);
            JOptionPane.showMessageDialog(vista, "Exito en la operacion");
            limpiarCelda();
            cargarCelda();
        } else {
            JOptionPane.showMessageDialog(vista, "Error en la operacion");
        }

    }

    public void agregarCelda() {
        boolean encontrada;
        int selecc = vista.getTblCelda().getSelectedRow();
        if (vista.getTblCelda().getValueAt(selecc, 3).equals(true)) {
            JOptionPane.showMessageDialog(null, "La celda esta ocupada");
        } else {
            if (selecc != -1) {
                String ver = vista.getTblCelda().getValueAt(selecc, 0).toString();
                List<Celda> tablaCelda = modelCel.ListarCelda(ver);
                for (int j = 0; j < tablaCelda.size(); j++) {
                    if (tablaCelda.get(j).getId_celda().equals(ver)) {
                        vista.getTxtCodCelda().setText(tablaCelda.get(j).getId_celda());
                        vista.getTxtCodigoCelda().setText(tablaCelda.get(j).getId_celda());
                        vista.getTxtCosto().setText("" + tablaCelda.get(j).getCosto_celda());
                        vista.getTxtUbicacion().setText(tablaCelda.get(j).getUbicacion_celda());
                    }
                }
                vista.getDialogCelda().setVisible(false);
            } else {
                //JOptionPane.showMessageDialog(vistaM, "No a seleccionado a niguna mascota");
            }
        }
    }

    private void delete() {
        if (vista.getTblCelda().getSelectedRow() > -1) {
            ModelCelda celda = new ModelCelda();
            String idCelda = vista.getTblCelda().getValueAt(vista.getTblCelda().getSelectedRow(), 0).toString();
            celda.setId_celda(idCelda);
            if (celda.eliminarCelda(idCelda)) {
                JOptionPane.showMessageDialog(vista, "Exito en la operacion");
                cargarCelda();
                limpiarCelda();
            } else {
                JOptionPane.showMessageDialog(vista, "Error en la operacion");
            }
        } else {
            JOptionPane.showMessageDialog(vista, "Seleccion una fila de la tabla");
        }
    }

    public void limpiarCelda() {
        vista.getTxt_IDCelda().setText("");
        vista.getSpCostoCelda().setValue(0);
        vista.getTxt_UbiCelda().setText("");
    }

    public void Generar_Cod() {
        Random rnd = new Random();
        String codigos = "0123456789ABCDEFGHIJKLMNOPQRS";
        String contenedor = "Cel_";
        int m = 0, pos = 0, num;
        while (m < 1) {
            pos = (int) (rnd.nextDouble() * codigos.length() - 1 + 0);
            num = (int) (rnd.nextDouble() * 9999 + 1000);
            contenedor = contenedor + codigos.charAt(pos) + num;
            pos = (int) (rnd.nextDouble() * codigos.length() - 1 + 0);
            contenedor = contenedor + codigos.charAt(pos);
            vista.getTxt_IDCelda().setText(contenedor);

            contenedor = "";
            m++;
        }
    }
}
