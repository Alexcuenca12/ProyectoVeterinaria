/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.CitasMedicas.ControladorCitas;
import Controller.Cliente.ControladorCliente;
import Controller.Cliente.ValidacionesCliente;
import Controller.CrudVeterinario.ControllerVeterinario;
import Controller.CrudVeterinario.ValidacionesVeterinario;
import Controller.Factura.ControladorFactura;
import Controller.Factura.ReporteFacturacion;
import Controller.Factura.ValidacionesFacturacion;
import Controller.Guarderia.ControllerGuarderia;
import Controller.Hospedaje.ControladorHospedaje;
import Controller.Hospedaje.ValidacionesHospedaje;
import Controller.Login.ControllerLogin;
import Controller.Paciente.ControladorPaciente;
import Controller.Paciente.ValidacionesPaciente;
import Controller.Productos.ControladorProductos;
import Controller.Productos.ValidacionesProductos;
import Controller.Revision.ControllerRevision;
import Controller.Revision.ValidacionesRevision;
import Controller.Servicios.ControladorServicios;
import Controller.Servicios.ValidacionesServicions;
import Controller.proveedor.ControllerProveedor;
import Controller.proveedor.ValidacionesProveedor;
import Model.Categorias.ModeloCategoria;
import Model.Celda.ModelCelda;
import Model.CitasMedicas.ModeloCitasMed;
import Model.Clientes.ModeloClientes;
import Model.CrudServicios.ModelServicios;
import Model.Guarderia.ModelGuarderia;
import Model.Login.Login;
import Model.Paciente.ModeloPaciente;
import Model.Productos.ModelProducto;
import Model.Proveedor.ModelProveedor;
import Model.Revision.ModelRevision;
import Model.Veterinario.ModelVeterinario;
import Model.facturación.ModelDetalleProducto;
import Model.facturación.ModelDetalleServicio;
import Model.facturación.ModelFactura;
import View.CitasMedicas.CitasMedicas;
import View.CitasMedicas.Crud_CitasMedicas;
import View.CrudClientes.VistaCrudPersona;
import View.CrudPacientes.VistaCrudPaciente;
import View.CrudProveedor.VistaProveedor;
import View.CrudServicios.VistaServicios;
import View.Facturacion.VistaFacturacion;
import View.Facturacion.VistaRepFacturacion;
import View.Guarderia.VistaGuarderia;
import View.Hospedaje.VistaHospedaje;
import View.MenuPrincipal.LoginVet;
import View.MenuPrincipal.MenuPrincipal;
import View.Productos.VistaCrudProductos;
import View.Revision.ViewCrudRevision;
import View.Veterinario.ViewVeterinario;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ControladorMenuPrincipal1 {

    MenuPrincipal vistaMenu;

    public ControladorMenuPrincipal1(MenuPrincipal vistaMenu) {
        this.vistaMenu = vistaMenu;
        vistaMenu.setVisible(true);
        this.vistaMenu.setLocationRelativeTo(null);
        vistaMenu.setExtendedState(JFrame.MAXIMIZED_BOTH);
        vistaMenu.setTitle("Software Veterinaria");
        Centrar();
        vistaMenu.getIconImage();
    }

    public void iniciaControl() {
        //Cliente
        vistaMenu.getBtnClientes().addActionListener(l -> CrudClientes());
        vistaMenu.getMiClientes().addActionListener(l -> CrudClientes());
        vistaMenu.getBtnClientes().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                BotonAccion(vistaMenu.getBtnClientes(), true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                 BotonAccion(vistaMenu.getBtnClientes(), false);
            }
            
        });
        //Productos
        vistaMenu.getBtnProductos().addActionListener(l -> CrudProductos());
        vistaMenu.getMiProductos().addActionListener(l -> CrudProductos());
        vistaMenu.getBtnProductos().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                BotonAccion(vistaMenu.getBtnProductos(), true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                 BotonAccion(vistaMenu.getBtnProductos(), false);
            }
            
        });
        //Paciente
        vistaMenu.getBtnPacientes().addActionListener(l -> CrudPaciente());
        vistaMenu.getMiPaciente().addActionListener(l -> CrudPaciente());
        vistaMenu.getBtnPacientes().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                BotonAccion(vistaMenu.getBtnPacientes(), true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                 BotonAccion(vistaMenu.getBtnPacientes(), false);
            }
            
        });
        //Facturacion
        vistaMenu.getBtnFacturacion().addActionListener(l -> facturacion());
        vistaMenu.getMiFacturacion().addActionListener(l -> facturacion());
        vistaMenu.getMiRepFacturacion().addActionListener(l -> Repfacturacion());
        vistaMenu.getBtnFacturacion().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                BotonAccion(vistaMenu.getBtnFacturacion(), true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                 BotonAccion(vistaMenu.getBtnFacturacion(), false);
            }
            
        });
        //Hospedaje
//        vistaMenu.getBtnHospedaje().addActionListener(l -> guarderia());
        vistaMenu.getBtnHospedaje().addActionListener(l -> CrudHospedajes());
        vistaMenu.getMiHospedaje().addActionListener(l -> CrudHospedajes());
        vistaMenu.getBtnHospedaje().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                BotonAccion(vistaMenu.getBtnHospedaje(), true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                 BotonAccion(vistaMenu.getBtnHospedaje(), false);
            }
            
        });
        //Servicios
        vistaMenu.getBtnServicios().addActionListener(l -> CrudServicios());
        vistaMenu.getMiServicios().addActionListener(l -> CrudServicios());
        vistaMenu.getBtnServicios().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                BotonAccion(vistaMenu.getBtnServicios(), true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                 BotonAccion(vistaMenu.getBtnServicios(), false);
            }
            
        });
        //Veterinario
        vistaMenu.getMiVeterinario().addActionListener(l -> CrudVeterinario());
        //Revision
        vistaMenu.getBtnRevision().addActionListener(l -> CrudRevicion());
        vistaMenu.getMiRevicion().addActionListener(l -> CrudRevicion());
        vistaMenu.getBtnRevision().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                BotonAccion(vistaMenu.getBtnRevision(), true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                 BotonAccion(vistaMenu.getBtnRevision(), false);
            }
            
        });
        //Proveedores
        vistaMenu.getMiProveedores().addActionListener(l -> CrudProveedores());
        //Citas Medicas
        vistaMenu.getBtnCitas().addActionListener(l -> CitasMedicas());
        vistaMenu.getBtnCitas().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                BotonAccion(vistaMenu.getBtnCitas(), true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                 BotonAccion(vistaMenu.getBtnCitas(), false);
            }
            
        });
        //Cerrar sesion
        vistaMenu.getMiCerrarSes().addActionListener(l -> CerrarSes());
        vistaMenu.getBtnSalir().addActionListener(l -> CerrarSes());
        vistaMenu.getBtnSalir().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                BotonAccion(vistaMenu.getBtnSalir(), true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                 BotonAccion(vistaMenu.getBtnSalir(), false);
            }
            
        });
        
        //Opciones Rapidas
        vistaMenu.getJmOpciones().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Deslizar();
            }

        });
    }

    private void Centrar() {
        //Centro del JDesktop
        int xDesktop = vistaMenu.getjDesktop().getX() / 2;
        int yDesktop = vistaMenu.getjDesktop().getY() / 2;
        vistaMenu.getjLabel4().setLocation(xDesktop, yDesktop);
        vistaMenu.getjLabel4().setHorizontalAlignment(JLabel.CENTER);

    }

    private void Deslizar() {
        int posicion = vistaMenu.getPnlMenu().getX();
        if (posicion > -1) {
            Animacion.Animacion.mover_izquierda(0, -264, 2, 2, vistaMenu.getPnlMenu());
            vistaMenu.getjSplitPane2().setDividerLocation(0);
        } else {
            Animacion.Animacion.mover_derecha(-264, 0, 2, 2, vistaMenu.getPnlMenu());
            vistaMenu.getjSplitPane2().setDividerLocation(200);
        }
        Centrar();
    }

    public void CrudClientes() {
        ModeloClientes modeloClientes = new ModeloClientes();
        VistaCrudPersona vistaClientes = new VistaCrudPersona();
        if (ControlaInstancia(vistaClientes)) {
            vistaMenu.getjDesktop().add(vistaClientes);
            vistaClientes.setLocation((vistaMenu.getjDesktop().getWidth() - vistaClientes.getWidth()) / 2, (vistaMenu.getjDesktop().getHeight() - vistaClientes.getHeight()) / 2);
            ControladorCliente controlador = new ValidacionesCliente(modeloClientes, vistaClientes);
            controlador.iniciarControl();
        }
    }

    public void CrudProductos() {
        ModelProducto modeloProductos = new ModelProducto();
        VistaCrudProductos vistaProductos = new VistaCrudProductos();
        ModeloCategoria modeloCategoria = new ModeloCategoria();
        if (ControlaInstancia(vistaProductos)) {
            vistaMenu.getjDesktop().add(vistaProductos);
            vistaProductos.setLocation((vistaMenu.getjDesktop().getWidth() - vistaProductos.getWidth()) / 2, (vistaMenu.getjDesktop().getHeight() - vistaProductos.getHeight()) / 2);
            ControladorProductos controladorProductos = new ValidacionesProductos(modeloProductos, modeloCategoria, vistaProductos);
            controladorProductos.iniciarControl();
        }
    }

    public void CrudVeterinario() {
        ModelVeterinario modelVeterinario = new ModelVeterinario();
        ViewVeterinario viewVeterinario = new ViewVeterinario();
        if (ControlaInstancia(viewVeterinario)) {
            vistaMenu.getjDesktop().add(viewVeterinario);
            viewVeterinario.setLocation((vistaMenu.getjDesktop().getWidth() - viewVeterinario.getWidth()) / 2, (vistaMenu.getjDesktop().getHeight() - viewVeterinario.getHeight()) / 2);
            ControllerVeterinario controllerVet = new ValidacionesVeterinario(modelVeterinario, viewVeterinario);
            controllerVet.iniciarControl();
        }
    }

    public void CrudPaciente() {
        ModeloPaciente modeloPaciente = new ModeloPaciente();
        VistaCrudPaciente crudPaciente = new VistaCrudPaciente();
        if (ControlaInstancia(crudPaciente)) {
            vistaMenu.getjDesktop().add(crudPaciente);
            crudPaciente.setLocation((vistaMenu.getjDesktop().getWidth() - crudPaciente.getWidth()) / 2, (vistaMenu.getjDesktop().getHeight() - crudPaciente.getHeight()) / 2);
            ControladorPaciente controladorPaciente = new ValidacionesPaciente(modeloPaciente, crudPaciente);
            controladorPaciente.iniciaControl();
        }
    }

    public void CrudRevicion() {
        ModelRevision modelRevision = new ModelRevision();
        ViewCrudRevision crudRevision = new ViewCrudRevision();
        if (ControlaInstancia(crudRevision)) {
            vistaMenu.getjDesktop().add(crudRevision);
            crudRevision.setLocation((vistaMenu.getjDesktop().getWidth() - crudRevision.getWidth()) / 2, (vistaMenu.getjDesktop().getHeight() - crudRevision.getHeight()) / 2);
            ControllerRevision controllerRevision = new ValidacionesRevision(modelRevision, crudRevision);
            controllerRevision.iniciarControl();
        }
    }

    public void CrudServicios() {

        ModelServicios modeloServicios = new ModelServicios();
        VistaServicios vistaServicios = new VistaServicios();
        if (ControlaInstancia(vistaServicios)) {
            vistaMenu.getjDesktop().add(vistaServicios);
            vistaServicios.setLocation((vistaMenu.getjDesktop().getWidth() - vistaServicios.getWidth()) / 2, (vistaMenu.getjDesktop().getHeight() - vistaServicios.getHeight()) / 2);
            ControladorServicios controladorservi = new ValidacionesServicions(modeloServicios, vistaServicios);
            controladorservi.iniciaControl();
        }
    }

    private void CrudProveedores() {
        ModelProveedor modelProveedor = new ModelProveedor();
        VistaProveedor vistaProveedor = new VistaProveedor();
        if (ControlaInstancia(vistaProveedor)) {
            vistaMenu.getjDesktop().add(vistaProveedor);
            vistaProveedor.setLocation((vistaMenu.getjDesktop().getWidth() - vistaProveedor.getWidth()) / 2, (vistaMenu.getjDesktop().getHeight() - vistaProveedor.getHeight()) / 2);
            ControllerProveedor controllerProveedor = new ValidacionesProveedor(modelProveedor, vistaProveedor);
            controllerProveedor.IniciaControl();
        }
    }

    private void CrudHospedajes() {
        ModelGuarderia modeloHospedaje = new ModelGuarderia();
        VistaHospedaje vistaHospedaje = new VistaHospedaje();
        ModelCelda modelCelda = new ModelCelda();
        if (ControlaInstancia(vistaHospedaje)) {
            vistaMenu.getjDesktop().add(vistaHospedaje);
            vistaHospedaje.setLocation((vistaMenu.getjDesktop().getWidth() - vistaHospedaje.getWidth()) / 2, (vistaMenu.getjDesktop().getHeight() - vistaHospedaje.getHeight()) / 2);
            ControladorHospedaje controladorHospedaje = new ValidacionesHospedaje(modeloHospedaje, vistaHospedaje, modelCelda);
            controladorHospedaje.iniciarControl();
        }
    }

    private void facturacion() {
        ModelFactura modelFactura = new ModelFactura();
        ModelDetalleProducto modeloDeta_P = new ModelDetalleProducto();
        ModelDetalleServicio modeloDeta_S = new ModelDetalleServicio();
        VistaFacturacion vistaFactura = new VistaFacturacion();
        if (ControlaInstancia(vistaFactura)) {
            vistaMenu.getjDesktop().add(vistaFactura);
            vistaFactura.setLocation((vistaMenu.getjDesktop().getWidth() - vistaFactura.getWidth()) / 2, (vistaMenu.getjDesktop().getHeight() - vistaFactura.getHeight()) / 2);
            ControladorFactura controladorFac = new ValidacionesFacturacion(modelFactura, vistaFactura);
            controladorFac.iniciaControl();
        }
    }

    private void Repfacturacion() {
        ModelFactura modelFactura = new ModelFactura();
        VistaRepFacturacion vistaRpFactura = new VistaRepFacturacion();
        vistaMenu.getjDesktop().add(vistaRpFactura);
        vistaRpFactura.setLocation((vistaMenu.getjDesktop().getWidth() - vistaRpFactura.getWidth()) / 2, (vistaMenu.getjDesktop().getHeight() - vistaRpFactura.getHeight()) / 2);
        ReporteFacturacion controladorFac = new ReporteFacturacion(modelFactura, vistaRpFactura);
        controladorFac.iniciaControl();

    }

    private void guarderia() {
        ModelGuarderia modelGuarderia = new ModelGuarderia();
        VistaGuarderia vistaGuarderia = new VistaGuarderia();
        if (ControlaInstancia(vistaGuarderia)) {
            vistaMenu.getjDesktop().add(vistaGuarderia);
            vistaGuarderia.setLocation((vistaMenu.getjDesktop().getWidth() - vistaGuarderia.getWidth()) / 2, (vistaMenu.getjDesktop().getHeight() - vistaGuarderia.getHeight()) / 2);
            ControllerGuarderia controladorGuar = new ControllerGuarderia(modelGuarderia, vistaGuarderia);
            controladorGuar.iniciarControl();
        }
    }

    private void CitasMedicas() {

        //Crear controlador de vistas 
        ModeloCitasMed modelCitas = new ModeloCitasMed();
        Crud_CitasMedicas vistaCita = new Crud_CitasMedicas();
        if (ControlaInstancia(vistaCita)) {
            vistaMenu.getjDesktop().add(vistaCita);
            vistaCita.setLocation((vistaMenu.getjDesktop().getWidth() - vistaCita.getWidth()) / 2, (vistaMenu.getjDesktop().getHeight() - vistaCita.getHeight()) / 2);
            ControladorCitas controladorGuar = new ControladorCitas(modelCitas, vistaCita);
            controladorGuar.iniciarControl();
        }

    }

    private void CerrarSes() {
        LoginVet vistaLog = new LoginVet();
        Login modelLog = new Login();
        ControllerLogin controladorLogin = new ControllerLogin(vistaLog, modelLog);
        controladorLogin.IniciarControl();
        vistaMenu.dispose();
    }

    public boolean ControlaInstancia(JInternalFrame inter) {

        boolean mostrar = true;
        String Nombre = inter.getTitle();
        for (int a = 0; a < vistaMenu.getjDesktop().getComponentCount(); a++) {     // verificar si es instancia de algun componente que ya este en el jdesktoppane
            if (inter.getClass().isInstance(vistaMenu.getjDesktop().getComponent(a))) {
                JOptionPane.showMessageDialog(vistaMenu.getjDesktop(), "La ventana ya está abierta");
                mostrar = false;

            }
        }
        return mostrar;
    }
    
    Color colorb;
    public void BotonAccion(JButton boton, boolean Adentro){
        
        if (Adentro){
            colorb=boton.getBackground();
            boton.setBackground(new Color(102,102,102));
            boton.setContentAreaFilled(true);
        }else{
            boton.setBackground(colorb);
            boton.setContentAreaFilled(false);
        }
    }
    
}
