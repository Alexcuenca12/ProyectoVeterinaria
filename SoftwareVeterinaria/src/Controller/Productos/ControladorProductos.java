package Controller.Productos;

import Controller.Paciente.ControladorPaciente;
import Controller.Revision.ImagenTabla;
import Model.Categorias.Categoria;
import Model.Categorias.ModeloCategoria;
import Model.ConectionPg;
import Model.Productos.ModelProducto;
import Model.Productos.Productos;
import Model.Proveedor.ModelProveedor;
import Model.Proveedor.Proveedor;
import View.Productos.VistaCrudProductos;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
public class ControladorProductos extends Productos {

    boolean imageneditada;
    ModelProducto modelo;
    ModeloCategoria modeloCa;
    VistaCrudProductos vistaP;
    public JFileChooser jfc;

    public ControladorProductos(ModelProducto modelo, ModeloCategoria modeloCa, VistaCrudProductos vistaP) {
        this.modelo = modelo;
        this.modeloCa = modeloCa;
        this.vistaP = vistaP;
        vistaP.setVisible(true);
        CargarProductos();
        cargarCombo(vistaP.getCb_categoria());
        vistaP.getTxtProveedor().setEditable(false);
        vistaP.getBtnOpcionOK().setEnabled(false);
    }

    public void iniciarControl() {

        vistaP.getBtnAgregarP().addActionListener(l -> abrirDialogo(1));
        vistaP.getBtnModificarP().addActionListener(l -> abrirDialogo(2));
        vistaP.getBtnModificarP().addActionListener(l -> SelecionModi());
        vistaP.getBtnCategoria().addActionListener(l -> AbrirDial(1));
        vistaP.getBtnCategoria().addActionListener(l -> AbrirDial(2));
        vistaP.getBtnAceptarP().addActionListener(l -> agregar_modProductos());
        vistaP.getBtn_agregarCate().addActionListener(l -> agregarCategoria());
        vistaP.getBtn_agregarCate().addActionListener(l -> CargarCategoria());
        vistaP.getBtnCategoria().addActionListener(l -> CargarCategoria());
        vistaP.getBtnExaminarP().addActionListener(l -> ExaminarFoto());
        vistaP.getBtnEliminarP().addActionListener(l -> EliminarProducto());
        vistaP.getBtnAgregarProv().addActionListener(l -> AbrirPorveedor());
        vistaP.getBtnCancelarP().addActionListener(l -> vistaP.getDlgCrearProd().dispose());
        //vistaP.getBtnEliminarP().addActionListener(l -> EliminarCategoria());
        vistaP.getBtnImprimirP().addActionListener(l -> Imprimir_Productos());

        //Para cargar la tavla proveedores
        vistaP.getJtproveedor().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Seleccion_proveedor();
            }
        });
        CargarCategoria();

        //Para Cargar la tabla productos
        vistaP.getTxtBuscarP().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                CargarProductos(); //To change body of generated methods, choose Tools | Templates.
            }

        });
        //Para Cargar opciones rapidas
        vistaP.getTblProductos().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                vistaP.getBtnOpcionOK().setEnabled(true);
                cargarOpcionRap();
            }
        });
        vistaP.getBtnOpcionOK().addActionListener(l -> ModCantidad());

        //Para la carga rapida de Filtro Categorias
        //-----------------------------Acciones Categoria---------------------------------
        vistaP.getTxt_FCBusqueda().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                CargarFiltroCategoria(); //To change body of generated methods, choose Tools | Templates.
            }

        });
        vistaP.getBtnFiltroCategoria().addActionListener(l -> AbrirFiltroCategorias());
        vistaP.getBtn_FCSeleccionar().addActionListener(l -> AgregarFiltroCategorias());
        vistaP.getBtn_FCLimpiar().addActionListener(l -> LimpiarFiltroCategorias());
        //---------------------------Ventas---------------------------------------------
        vistaP.getCbFiltroVentas().addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                CargarProductos();
            }
        });
        //-----------------------------------Acciones Proveedor---------------------------
        vistaP.getTxtFiltrobusqProv().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                CargarFiltroProveedores();
            }

        });
        vistaP.getBtnFiltroProveedor().addActionListener(l -> AbrirFiltroProveedores());
        vistaP.getBtn_FPSeleccionar1().addActionListener(l -> AgregarFiltroProveedor());
        vistaP.getBtn_FPLimpiar().addActionListener(l -> LimpiarFiltroProveedor());
    }

    public void abrirDialogo(int ce) {
        imageneditada = false;
        String tittle = "";
        if (ce == 1) {
            Limpiar();
            vistaP.getTxtIdprod().setEditable(true);
            vistaP.getBtnAgregarProv().setVisible(true);
            tittle = "CREAR PRODUCTO";
            vistaP.getDlgCrearProd().setName("CREAR");
            vistaP.getLblTITULO().setText(tittle);
            vistaP.getDlgCrearProd().setVisible(true);
            vistaP.getDlgCrearProd().setSize(800, 530);
            vistaP.getDlgCrearProd().setLocationRelativeTo(vistaP);
            vistaP.getDlgCrearProd().setTitle(tittle);

        } else {
            vistaP.getTxtIdprod().setEditable(false);
            vistaP.getBtnAgregarProv().setVisible(false);

            if (vistaP.getTblProductos().getSelectedRow() > -1) {
                tittle = "EDITAR PRODUCTO";
                vistaP.getDlgCrearProd().setName("EDITAR");
                vistaP.getLblTITULO().setText(tittle);
                vistaP.getDlgCrearProd().setVisible(true);
                vistaP.getDlgCrearProd().setSize(800, 530);
                vistaP.getDlgCrearProd().setLocationRelativeTo(vistaP);
                vistaP.getDlgCrearProd().setTitle(tittle);
            } else {
                JOptionPane.showMessageDialog(vistaP, "Seleccion una fila de la tabla");
            }
        }
        vistaP.getDlgCrearProd().setTitle(tittle);
    }

    private void AbrirDial(int ce) {
        String tittle = "";
        vistaP.getDlgCategoria().setLocationRelativeTo(vistaP);
        if (ce == 1) {
            tittle = "CATEGORIA";
            vistaP.getDlgCrearProd().setName("CREAR");
            vistaP.getjLabel8().setText(tittle);
            vistaP.getDlgCategoria().setVisible(true);
            vistaP.getDlgCategoria().setLocationRelativeTo(null);
            vistaP.getDlgCategoria().setSize(380, 422);
            vistaP.getDlgCategoria().setTitle(tittle);
        }

        vistaP.getDlgCategoria().setTitle(tittle);
    }

    private void CargarProductos() {
        LimpiarTabla();
        vistaP.getTblProductos().setDefaultRenderer(Object.class, new ImagenTabla());
        vistaP.getTblProductos().setRowHeight(100);
        DefaultTableModel tblmodel;
        tblmodel = (DefaultTableModel) vistaP.getTblProductos().getModel();
        tblmodel.setNumRows(0);
        //Filtros
        String criterio = vistaP.getTxtBuscarP().getText();
        String categoria = vistaP.getTxtFiltroCategoria().getText();
        String Proveedor = vistaP.getTxtFiltroProveedor().getText();
        int Ventas = vistaP.getCbFiltroVentas().getSelectedIndex();
        ArrayList<Productos> list = modelo.listarProductos(criterio, categoria, Proveedor, Ventas);
        Holder<Integer> i = new Holder<>(0);
        list.stream().forEach(pac -> {

            //Agregar a la tabla
            tblmodel.addRow(new Object[6]);
            vistaP.getTblProductos().setValueAt(pac.getIdProducto(), i.value, 0);
            vistaP.getTblProductos().setValueAt(pac.getNombreProducto(), i.value, 1);
            vistaP.getTblProductos().setValueAt(pac.getPrecio(), i.value, 2);
            vistaP.getTblProductos().setValueAt(pac.getStock(), i.value, 3);
            vistaP.getTblProductos().setValueAt(pac.getRuc_proveedor(), i.value, 4);
            vistaP.getTblProductos().setValueAt(pac.getIdCategoria(), i.value, 5);
            Image foto = pac.getFoto();
            if (foto != null) {

                Image nimg = foto.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                ImageIcon icono = new ImageIcon(nimg);
                DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
                renderer.setIcon(icono);
                vistaP.getTblProductos().setValueAt(new JLabel(icono), i.value, 6);

            } else {
                vistaP.getTblProductos().setValueAt(null, i.value, 6);
            }
            vistaP.getTblProductos().setValueAt(pac.getVentas(), i.value, 7);
            i.value++;
        });
    }

    public void agregar_modProductos() {
        if (vistaP.getDlgCrearProd().getName().equals("CREAR")) {
            crear();
            //LimpiarTabla();

        } else {
            editar();
            //LimpiarTabla();
        }
    }

    public void crear() {
        String idProducto = vistaP.getTxtIdprod().getText();
        String nomPro = vistaP.getTxtNombreP().getText();
        double prePro = (double) vistaP.getSpPrecioP().getValue();
        int cantidadPro = (int) vistaP.getSpStock().getValue();
        String idCategoria = (String) vistaP.getCb_categoria().getSelectedItem();
        String ruc_proveedor = vistaP.getTxtProveedor().getText();

        ModelProducto modelPro = new ModelProducto();
        modelPro.setIdProducto(idProducto);
        modelPro.setNombreProducto(nomPro);
        modelPro.setPrecio(prePro);
        modelPro.setStock(cantidadPro);
        modelPro.setIdCategoria(idCategoria);
        modelPro.setRuc_proveedor(ruc_proveedor);
        //foto 
        try {
            //Datos de la clase persona del modeloPersona
            FileInputStream img = new FileInputStream(jfc.getSelectedFile());
            int largo = (int) jfc.getSelectedFile().length();
            modelPro.setImg(img);
            modelPro.setLargo(largo);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ControladorProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (modelPro.crearProducto()) {
            JOptionPane.showMessageDialog(vistaP, "Productos creado satisfactoriamente");
            vistaP.getDlgCrearProd().setVisible(false);
            CargarProductos();
        } else {
            JOptionPane.showMessageDialog(vistaP, "No se pudo crear el producto");
        }

    }

    private void editar() {
        String idProducto = vistaP.getTxtIdprod().getText();
        String nomPro = vistaP.getTxtNombreP().getText();
        System.out.println(vistaP.getSpPrecioP().getValue());
        double prePro = (double) vistaP.getSpPrecioP().getValue();
        int cantidadPro = (int) vistaP.getSpStock().getValue();
        String idCategoria = (String) vistaP.getCb_categoria().getSelectedItem();
        String ruc_proveedor = vistaP.getTxtProveedor().getText();

        ModelProducto modelPro = new ModelProducto();
        modelPro.setIdProducto(idProducto);
        modelPro.setNombreProducto(nomPro);
        modelPro.setPrecio(prePro);
        modelPro.setStock(cantidadPro);
        modelPro.setIdCategoria(idCategoria);
        modelPro.setRuc_proveedor(ruc_proveedor);
        //foto 
        if (imageneditada) {
            try {
                //Datos de la clase persona del modeloPersona
                FileInputStream img = new FileInputStream(jfc.getSelectedFile());
                int largo = (int) jfc.getSelectedFile().length();
                modelPro.setImg(img);
                modelPro.setLargo(largo);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ControladorProductos.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (modelPro.editarProducto2()) {
                JOptionPane.showMessageDialog(vistaP, "Productos acutalizado satisfactoriamente");
                vistaP.getDlgCrearProd().setVisible(false);
                CargarProductos();
            } else {
                JOptionPane.showMessageDialog(vistaP, "No se pudo actualizar el producto");
            }
        } else {
            if (modelPro.editarProductoSinImagen()) {
                JOptionPane.showMessageDialog(vistaP, "Productos acutalizado satisfactoriamente");
                vistaP.getDlgCrearProd().setVisible(false);
                CargarProductos();
            } else {
                JOptionPane.showMessageDialog(vistaP, "No se pudo actualizar el producto");
            }
        }

    }

    private void ExaminarFoto() {
        imageneditada = true;
        jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int estado = jfc.showOpenDialog(vistaP);
        if (estado == JFileChooser.APPROVE_OPTION) {
            try {
                Image imagen = ImageIO.read(jfc.getSelectedFile()).getScaledInstance(
                        vistaP.getLblFoto().getWidth(),
                        vistaP.getLblFoto().getHeight(),
                        Image.SCALE_DEFAULT);

                Icon icono = new ImageIcon(imagen);
                vistaP.getLblFoto().setIcon(icono);
                vistaP.getLblFoto().updateUI();

            } catch (IOException ex) {
                Logger.getLogger(ControladorPaciente.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void SelecionModi() {
        vistaP.getTblProductos().setDefaultRenderer(Object.class, new ImagenTabla());
        vistaP.getTblProductos().setRowHeight(100);

        int selecc = vistaP.getTblProductos().getSelectedRow();
        if (selecc != -1) {
            String ver = vistaP.getTblProductos().getValueAt(selecc, 0).toString();
            List<Productos> tablaMas = modelo.listarProductos2();
            for (int j = 0; j < tablaMas.size(); j++) {
                if (tablaMas.get(j).getIdProducto().equals(ver)) {
                    vistaP.getTxtIdprod().setText(tablaMas.get(j).getIdProducto());
                    vistaP.getCb_categoria().setSelectedItem(tablaMas.get(j).getIdCategoria());
                    vistaP.getTxtNombreP().setText(tablaMas.get(j).getNombreProducto());
                    vistaP.getSpPrecioP().setValue(tablaMas.get(j).getPrecio());
                    vistaP.getSpStock().setValue(tablaMas.get(j).getStock());
                    vistaP.getTxtProveedor().setText(tablaMas.get(j).getRuc_proveedor());
                    if (tablaMas.get(j).getFoto() == null) {
                        vistaP.getLblFoto().setIcon(null);
                    } else {
                        Image in = tablaMas.get(j).getFoto();
                        Image img = in.getScaledInstance(133, 147, Image.SCALE_SMOOTH);
                        Icon icono = new ImageIcon(img);
                        vistaP.getLblFoto().setIcon(icono);
                    }

                }
            }
            vistaP.getDlgCrearProd().setVisible(false);
        } else {
            //JOptionPane.showMessageDialog(vistaM, "No a seleccionado a niguna mascota");
        }
    }

    public void CargarCategoria() {
        DefaultTableModel tblmodel;
        tblmodel = (DefaultTableModel) vistaP.getTblCategoria().getModel();
        tblmodel.setNumRows(0);
        String dato = vistaP.getTxt_IdCate().getText();
        List<Categoria> list = modeloCa.ListarCategoriasLogico(dato);
        Holder<Integer> i = new Holder<>(0);
        list.stream().forEach(pac -> {

            //Agregar a la tabla
            tblmodel.addRow(new Object[2]);
            vistaP.getTblCategoria().setValueAt(pac.getId_Categoria(), i.value, 0);
            vistaP.getTblCategoria().setValueAt(pac.getNombre(), i.value, 1);

            i.value++;

        });

    }

    public void Limpiar() {
        vistaP.getTxtIdprod().setText("");
        vistaP.getCb_categoria().setSelectedIndex(0);
        vistaP.getTxtNombreP().setText("");
        vistaP.getSpPrecioP().setValue(1);
        vistaP.getSpStock().setValue(1);
        vistaP.getTxtProveedor().setText("");
    }

    public void agregarCategoria() {

        String idCategoria = vistaP.getTxt_IdCate().getText();
        String nomCategoria = vistaP.getTxt_nomCate().getText();

        ModeloCategoria modelCateg = new ModeloCategoria();
        modelCateg.setId_Categoria(idCategoria);
        modelCateg.setNombre(nomCategoria);

        if (modelCateg.crearCategoria()) {
            cargarCombo(vistaP.getCb_categoria());
            JOptionPane.showMessageDialog(vistaP, "Categoria creada satisfactoriamente");
            vistaP.getDlgCategoria().dispose();

        } else {
            JOptionPane.showMessageDialog(vistaP, "No se pudo crear la categoria");
        }

    }

    public void EliminarProducto() {
        ModelProducto modelProducto = new ModelProducto();
        int fila = vistaP.getTblProductos().getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(vistaP, "Por favor, seleccione una fila");
        } else {
            String idProducto = vistaP.getTblProductos().getValueAt(fila, 0).toString();
            modelProducto.eliminarProducto(idProducto);
            JOptionPane.showMessageDialog(vistaP, "Producto Eliminado");
        }
    }

    public void EliminarCategoria() {
        ModeloCategoria modelCategoria = new ModeloCategoria();
        int fila = vistaP.getTblCategoria().getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(vistaP, "Por favor, seleccione una fila");
        } else {
            String idCategoria = vistaP.getTblProductos().getValueAt(fila, 0).toString();
            modelCategoria.eliminarCategoria(idCategoria);
            JOptionPane.showMessageDialog(vistaP, "Categoria Eliminado");
        }
    }

    public void cargarCombo(JComboBox cb_categoria) {
        vistaP.getCb_categoria().removeAllItems();
        ConectionPg metodoCombo = new ConectionPg();
        java.sql.Connection conectar = null;
        String sql = "Select id_categoria FROM categoria WHERE habilitado = true ORDER BY id_categoria ASC";
        try {
            conectar = metodoCombo.getCon();
            PreparedStatement pst = conectar.prepareStatement(sql);
            ResultSet result = pst.executeQuery();

            cb_categoria.addItem("Seleccione una opcion");
            while (result.next()) {
                cb_categoria.addItem(result.getString("id_categoria"));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    //Limpiar Tabla
    public void LimpiarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) vistaP.getTblProductos().getModel();
        int a = vistaP.getTblProductos().getRowCount() - 1;
        int i;
        for (i = a; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    //Metodos del DLG Proveedores
    private void AbrirPorveedor() {
        vistaP.getDlgProveedores().setVisible(true);
        vistaP.getDlgProveedores().setLocationRelativeTo(null);
        vistaP.getDlgProveedores().setSize(699, 318);
        Cargar_proveedores();
    }

    private void Cargar_proveedores() {
        DefaultTableModel tblmodel;
        tblmodel = (DefaultTableModel) vistaP.getJtproveedor().getModel();
        tblmodel.setNumRows(0);
        String valor = vistaP.getTxtbusqProv().getText();
        ModelProveedor modelProveedor = new ModelProveedor();
        ArrayList<Proveedor> list = modelProveedor.listProveedores(valor);
        Holder<Integer> i = new Holder<>(0);
        list.stream().forEach(prov -> {
            tblmodel.addRow(new Object[8]);
            vistaP.getJtproveedor().setValueAt(prov.getRuc_proveedor(), i.value, 0);
            vistaP.getJtproveedor().setValueAt(prov.getNombre(), i.value, 1);
            vistaP.getJtproveedor().setValueAt(prov.getApellido(), i.value, 2);
            vistaP.getJtproveedor().setValueAt(prov.getTelefono(), i.value, 3);
            vistaP.getJtproveedor().setValueAt(prov.getDirecccion(), i.value, 4);
            vistaP.getJtproveedor().setValueAt(prov.getDescripcion(), i.value, 5);
            vistaP.getJtproveedor().setValueAt(prov.getEmpresa(), i.value, 6);
            vistaP.getJtproveedor().setValueAt(prov.getCorreo(), i.value, 7);

            i.value++;

        });
    }

    private void Seleccion_proveedor() {
        if (vistaP.getJtproveedor().getSelectedRow() > -1) {
            String ruc_proveedor = vistaP.getJtproveedor().getValueAt(vistaP.getJtproveedor().getSelectedRow(), 0).toString();
            vistaP.getTxtProveedor().setText(ruc_proveedor);
            vistaP.getDlgProveedores().dispose();
        }

    }

    //--------------------------OPCIONES RAPIDAS---------------------------------
    public void cargarOpcionRap() {
        int selecc = vistaP.getTblProductos().getSelectedRow();
        vistaP.getTblProductos().getValueAt(selecc, 0).toString();
        vistaP.getSpOpcionCantidad().setValue(vistaP.getTblProductos().getValueAt(selecc, 3));
        vistaP.getTxtOpcionProd().setText(vistaP.getTblProductos().getValueAt(selecc, 0).toString());
    }

    public void ModCantidad() {
        int cantidad = (int) vistaP.getSpOpcionCantidad().getValue();
        String id = vistaP.getTxtOpcionProd().getText();
        if (modelo.editarCantidad(id, cantidad)) {
            JOptionPane.showMessageDialog(null, "Operacion exitosa");
            vistaP.getSpOpcionCantidad().setValue(0);
            vistaP.getTxtOpcionProd().setText("");
            vistaP.getTblProductos().clearSelection();
            CargarProductos();
            vistaP.getBtnOpcionOK().setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
        }
    }

    //------------------------------------FILTROS-----------------------------
    public void CargarFiltroCategoria() {
        DefaultTableModel tblmodel;
        tblmodel = (DefaultTableModel) vistaP.getTblFiltroCategoria().getModel();
        tblmodel.setNumRows(0);

        String objeto = vistaP.getTxt_FCBusqueda().getText();
        List<Categoria> list = modeloCa.busquedaCategoria(objeto);
        Holder<Integer> i = new Holder<>(0);
        list.stream().forEach(pac -> {

            //Agregar a la tabla
            tblmodel.addRow(new Object[2]);
            vistaP.getTblFiltroCategoria().setValueAt(pac.getId_Categoria(), i.value, 0);
            vistaP.getTblFiltroCategoria().setValueAt(pac.getNombre(), i.value, 1);

            i.value++;

        });

    }

    private void AbrirFiltroCategorias() {
        String tittle = "";
        vistaP.getDlgFiltrosCategoria().setLocationRelativeTo(vistaP);
        tittle = "CATEGORIA";
        vistaP.getDlgFiltrosCategoria().setName("CREAR");
        vistaP.getDlgFiltrosCategoria().setVisible(true);
        vistaP.getDlgFiltrosCategoria().setSize(530, 350);
        vistaP.getDlgFiltrosCategoria().setLocationRelativeTo(null);
        vistaP.getDlgFiltrosCategoria().setTitle(tittle);
        CargarFiltroCategoria();
    }

    private void AgregarFiltroCategorias() {
        int seleccion = vistaP.getTblFiltroCategoria().getSelectedRow();
        if (seleccion == -1) {
            JOptionPane.showMessageDialog(vistaP, "Por favor, seleccione una fila");
        } else {
            String Categoria = vistaP.getTblFiltroCategoria().getValueAt(seleccion, 0).toString();
            vistaP.getTxtFiltroCategoria().setText(Categoria);
            CargarProductos();
            vistaP.getDlgFiltrosCategoria().setVisible(false);
        }
    }

    private void LimpiarFiltroCategorias() {
        vistaP.getTxtFiltroCategoria().setText("");
        CargarProductos();
        vistaP.getDlgFiltrosCategoria().setVisible(false);
    }

    //----------------------------------
    public void CargarFiltroProveedores() {
        DefaultTableModel tblmodel;
        tblmodel = (DefaultTableModel) vistaP.getJtFiltroproveedor().getModel();
        tblmodel.setNumRows(0);
        String valor = vistaP.getTxtFiltrobusqProv().getText();
        ModelProveedor modelProveedor = new ModelProveedor();
        ArrayList<Proveedor> list = modelProveedor.listProveedores(valor);
        Holder<Integer> i = new Holder<>(0);
        list.stream().forEach(prov -> {
            tblmodel.addRow(new Object[8]);
            vistaP.getJtFiltroproveedor().setValueAt(prov.getRuc_proveedor(), i.value, 0);
            vistaP.getJtFiltroproveedor().setValueAt(prov.getNombre(), i.value, 1);
            vistaP.getJtFiltroproveedor().setValueAt(prov.getApellido(), i.value, 2);
            vistaP.getJtFiltroproveedor().setValueAt(prov.getTelefono(), i.value, 3);
            vistaP.getJtFiltroproveedor().setValueAt(prov.getDirecccion(), i.value, 4);
            vistaP.getJtFiltroproveedor().setValueAt(prov.getDescripcion(), i.value, 5);
            vistaP.getJtFiltroproveedor().setValueAt(prov.getEmpresa(), i.value, 6);
            vistaP.getJtFiltroproveedor().setValueAt(prov.getCorreo(), i.value, 7);

            i.value++;

        });

    }

    private void AbrirFiltroProveedores() {
        String tittle = "";
        vistaP.getDlgFiltrosProveedores().setLocationRelativeTo(vistaP);
        tittle = "Proveedores";
        vistaP.getDlgFiltrosProveedores().setSize(739, 340);
        vistaP.getDlgFiltrosProveedores().setLocationRelativeTo(null);
        vistaP.getDlgFiltrosProveedores().setVisible(true);
        vistaP.getDlgFiltrosProveedores().setTitle(tittle);
        CargarFiltroProveedores();
    }

    private void AgregarFiltroProveedor() {
        int seleccion = vistaP.getJtFiltroproveedor().getSelectedRow();
        if (seleccion == -1) {
            JOptionPane.showMessageDialog(vistaP, "Por favor, seleccione una fila");
        } else {
            String Proveedor = vistaP.getJtFiltroproveedor().getValueAt(seleccion, 0).toString();
            vistaP.getTxtFiltroProveedor().setText(Proveedor);
            CargarProductos();
            vistaP.getDlgFiltrosProveedores().setVisible(false);
        }
    }

    private void LimpiarFiltroProveedor() {
        vistaP.getTxtFiltroProveedor().setText("");
        CargarProductos();
        vistaP.getDlgFiltrosProveedores().setVisible(false);
    }

    private void Imprimir_Productos() {
        ConectionPg connection = new ConectionPg();

        try {
            JasperReport jr = (JasperReport) JRLoader.loadObject(getClass().getResource("/View/Reporte/PV_Productos.jasper"));
            //CARGANDO EL REPORTE DE LA BASE
            JasperPrint jp = JasperFillManager.fillReport(jr, null, connection.getCon());
            //VER
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(ControladorProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
