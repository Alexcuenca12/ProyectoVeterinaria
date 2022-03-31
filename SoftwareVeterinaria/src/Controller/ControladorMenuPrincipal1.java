/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Cliente.ControladorCliente;
import Controller.Cliente.ValidacionesCliente;
import Controller.CrudVeterinario.ControllerVeterinario;
import Controller.Factura.ControladorFactura;
import Controller.Login.ControllerLogin;
import Controller.Paciente.ControladorPaciente;
import Controller.Paciente.ValidacionesPaciente;
import Controller.Productos.ControladorProductos;
import Controller.Revision.ControllerRevision;
import Controller.Servicios.ControladorServicios;
import Controller.proveedor.ControllerProveedor;
import Model.Categorias.ModeloCategoria;
import Model.Clientes.ModeloClientes;
import Model.CrudServicios.ModelServicios;
import Model.Login.Login;
import Model.Paciente.ModeloPaciente;
import Model.Productos.ModelProducto;
import Model.Proveedor.ModelProveedor;
import Model.Revision.ModelRevision;
import Model.Veterinario.ModelVeterinario;
import Model.facturación.ModelDetalleProducto;
import Model.facturación.ModelDetalleServicio;
import Model.facturación.ModelFactura;
import View.CrudClientes.VistaCrudPersona;
import View.CrudPacientes.VistaCrudPaciente;
import View.CrudProveedor.VistaProveedor;
import View.CrudServicios.VistaServicios;
import View.Facturacion.VistaFacturacion;
import View.MenuPrincipal.LoginVet;
import View.MenuPrincipal.MenuPrincipal;
import View.Productos.VistaCrudProductos;
import View.Revision.ViewCrudRevision;
import View.Veterinario.ViewVeterinario;
import javax.swing.JFrame;

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
    }

    public void iniciaControl() {
        //Cliente
        vistaMenu.getBtnClientes().addActionListener(l -> CrudClientes());
        vistaMenu.getMiClientes().addActionListener(l -> CrudClientes());
        //Productos
        vistaMenu.getBtnProductos().addActionListener(l -> CrudProductos());
        vistaMenu.getMiProductos();
        //Paciente
        vistaMenu.getBtnPacientes().addActionListener(l -> CrudPaciente());
        vistaMenu.getMiPaciente().addActionListener(l -> CrudPaciente());
        //Facturacion
        vistaMenu.getBtnFacturacion().addActionListener(l -> facturacion());
        //Hospedaje
        //vistaMenu.getBtnHospedaje().addActionListener(l -> Crud());
        //Servicios
        vistaMenu.getBtnServicios().addActionListener(l -> CrudServicios());
        vistaMenu.getMiServicios().addActionListener(l -> CrudServicios());
        //Veterinario
        vistaMenu.getBtnVeterinarios().addActionListener(l -> CrudVeterinario());
        vistaMenu.getMiVeterinario().addActionListener(l -> CrudVeterinario());
        //Revision
        vistaMenu.getBtnRevision().addActionListener(l -> CrudRevicion());
        //Proveedores
        vistaMenu.getMiProveedores().addActionListener(l -> CrudProveedores());
        
        //Cerrar sesion
        vistaMenu.getMiCerrarSes().addActionListener(l -> CerrarSes());
    }

    public void CrudClientes() {
        ModeloClientes modeloClientes = new ModeloClientes();
        VistaCrudPersona vistaClientes = new VistaCrudPersona();
        vistaMenu.getjDesktop().add(vistaClientes);
        ControladorCliente controlador = new ValidacionesCliente(modeloClientes, vistaClientes);
        controlador.iniciarControl();
    }

    public void CrudProductos() {
        ModelProducto modeloProductos = new ModelProducto();
        VistaCrudProductos vistaProductos = new VistaCrudProductos();
        ModeloCategoria modeloCategoria = new ModeloCategoria();
        vistaMenu.getjDesktop().add(vistaProductos);
        ControladorProductos controladorProductos = new ControladorProductos(modeloProductos, modeloCategoria, vistaProductos);
        controladorProductos.iniciarControl();
    }

    public void CrudVeterinario() {
        ModelVeterinario modelVeterinario = new ModelVeterinario();
        ViewVeterinario viewVeterinario = new ViewVeterinario();
        vistaMenu.getjDesktop().add(viewVeterinario);
        ControllerVeterinario controllerVet = new ControllerVeterinario(modelVeterinario, viewVeterinario);
        controllerVet.iniciarControl();
    }

    public void CrudPaciente() {
        ModeloPaciente modeloPaciente = new ModeloPaciente();
        VistaCrudPaciente crudPaciente = new VistaCrudPaciente();
        vistaMenu.getjDesktop().add(crudPaciente);
        ControladorPaciente controladorPaciente = new ValidacionesPaciente(modeloPaciente, crudPaciente);
        controladorPaciente.iniciaControl();
    }

    public void CrudRevicion() {
        ModelRevision modelRevision = new ModelRevision();
        ViewCrudRevision crudRevision = new ViewCrudRevision();
        vistaMenu.getjDesktop().add(crudRevision);
        ControllerRevision controllerRevision = new ControllerRevision(modelRevision, crudRevision);
        controllerRevision.iniciarControl();
    }

    public void CrudServicios() {
        ModelProducto modeloProductos = new ModelProducto();
        VistaCrudProductos vistaProductos = new VistaCrudProductos();
        vistaMenu.getjDesktop().add(vistaProductos);
        //ControladorProductos controladorProductos = new ControladorProductos(modeloProductos, vistaProductos);
        ///controladorProductos.iniciaControl2();

        ModelServicios modeloServicios = new ModelServicios();
        VistaServicios vistaServicios = new VistaServicios();
        vistaMenu.getjDesktop().add(vistaServicios);
        ControladorServicios controladorservi = new ControladorServicios(modeloServicios, vistaServicios);
        controladorservi.iniciaControl();
    }

    public void CrudRevision() {
        ModelRevision modeloRevision = new ModelRevision();
        ViewCrudRevision vistaRevision = new ViewCrudRevision();
        vistaMenu.getjDesktop().add(vistaRevision);
        ControllerRevision controladorRevision = new ControllerRevision(modeloRevision, vistaRevision);
        controladorRevision.iniciarControl();
    }

    private void CrudProveedores() {
        ModelProveedor modelProveedor = new ModelProveedor();
        VistaProveedor vistaProveedor = new VistaProveedor();
        vistaMenu.getjDesktop().add(vistaProveedor);
        ControllerProveedor controllerProveedor = new ControllerProveedor(modelProveedor, vistaProveedor);
        controllerProveedor.IniciaControl();
    }

    private void facturacion() {
        ModelFactura modelFactura = new ModelFactura();
        ModelDetalleProducto modeloDeta_P = new ModelDetalleProducto();
        ModelDetalleServicio modeloDeta_S = new ModelDetalleServicio();
        VistaFacturacion vistaFactura = new VistaFacturacion();
        vistaMenu.getjDesktop().add(vistaFactura);
        ControladorFactura controladorFac = new ControladorFactura(modelFactura, vistaFactura);
        controladorFac.iniciaControl();
    }

    private void CerrarSes() {
        LoginVet vistaLog = new LoginVet();
        Login modelLog = new Login();
        ControllerLogin controladorLogin = new ControllerLogin(vistaLog, modelLog);
        controladorLogin.IniciarControl();
        vistaMenu.dispose();
    }

}
