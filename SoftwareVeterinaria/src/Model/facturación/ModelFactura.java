package Model.facturación;

import Model.Clientes.Clientes;
import Model.ConectionPg;
import Model.CrudServicios.Servicios;
import Model.Productos.ModelProducto;
import Model.Productos.Productos;
import Model.Veterinario.Veterinario;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

/**
 *
 * @author Usuario
 */
public class ModelFactura extends Factura {

    ConectionPg conexion = new ConectionPg();
    private String sql;
    private byte[] bytea;
    public static List<Productos> listaProductos = new ArrayList<Productos>();

    public ModelFactura() {
    }

    public ModelFactura(int codigo_factura, String codigo_medico, String codigo_cliente, Date fecha, boolean habilitado) {
        super(codigo_factura, codigo_medico, codigo_cliente, fecha, habilitado);
    }

    //METODOS PARA EL APARTADO DE FACTURACIÓN
    public List<Factura> listarFacturas() {
        List<Factura> listafacturas = new ArrayList<>();
        sql = "SELECT * FROM FACTURA";
        ResultSet rs = conexion.consulta(sql);
        try {
            while (rs.next()) {
                Factura factura = new Factura();
                factura.setCodigo_factura(rs.getInt("id_factura"));
                factura.setCodigo_medico(rs.getString("id_medico_factura"));
                factura.setCodigo_cliente(rs.getString("id_cliente_factura"));
                factura.setFecha(rs.getDate("fecha_atencion"));
//                factura.setHabilitado(rs.getBoolean("habilitado"));
                listafacturas.add(factura);
            }
            rs.close();
            return listafacturas;
        } catch (SQLException ex) {
            Logger.getLogger(ModelFactura.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    //CREAR LA FACTURA
    public boolean CrearFactura() {
        try {
            sql = "INSERT INTO FACTURA(id_factura,id_medico_factura,id_cliente_factura,fecha_atencion)";
            sql += "VALUES (?,?,?,?)";
            PreparedStatement ps = conexion.getCon().prepareStatement(sql);
            ps.setInt(1, getCodigo_factura());
            ps.setString(2, getCodigo_medico());
            ps.setString(3, getCodigo_cliente());
            ps.setDate(4, getFecha());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ModelFactura.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean EliminarFactura(int idFactura) {

        sql = "DELETE FROM FACTURA WHERE id_factura='" + idFactura + "';";
        return conexion.accion(sql);
    }

    //METODOS DE CLIENTES
    public ArrayList<Clientes> ListarClientes() {
        ArrayList<Clientes> lista = new ArrayList<>();

        try {
            //Sentencia
            String sql = "Select * from clientes";
            ResultSet rs = conexion.consulta(sql);
            while (rs.next()) {
                Clientes cli = new Clientes();
                cli.setId_cliente(rs.getString("id_cliente"));
                cli.setNombre_cliente(rs.getString("nombre_cliente"));
                cli.setApellido_cliente(rs.getString("apellido_cliente"));
                cli.setFechanacimiento(rs.getDate("fechanacimiento"));
                cli.setTelefono(rs.getString("telefono"));
                cli.setEmail(rs.getString("email"));
                cli.setDireccion_cliente(rs.getString("direccion_cliente"));
                cli.setFechaingreso(rs.getDate("fechaingreso"));
                lista.add(cli);
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ModelFactura.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    //Metodo para buscar cliente
    public ArrayList<Clientes> buscarCliente(String busqueda) {
        ArrayList<Clientes> lista = new ArrayList<>();
        try {
            //Sentencia
            String sql = "select * from clientes where nombre_cliente like'" + busqueda + "%'";
            ResultSet rs = conexion.consulta(sql);
            while (rs.next()) {
                Clientes cli = new Clientes();
                cli.setId_cliente(rs.getString("id_cliente"));
                cli.setNombre_cliente(rs.getString("nombre_cliente"));
                cli.setApellido_cliente(rs.getString("apellido_cliente"));
                cli.setFechanacimiento(rs.getDate("fechanacimiento"));
                cli.setTelefono(rs.getString("telefono"));
                cli.setEmail(rs.getString("email"));
                cli.setDireccion_cliente(rs.getString("direccion_cliente"));
                cli.setFechaingreso(rs.getDate("fechaingreso"));
                lista.add(cli);
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ModelFactura.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    //METODOS DE PRODUCTOS
    public List<Productos> listarProductos() {
        sql = "SELECT * FROM PRODUCTOS";
        ResultSet rs = conexion.consulta(sql);
        try {
            while (rs.next()) {
                Productos producto = new Productos();
                producto.setIdProducto(rs.getString("id_producto"));
                producto.setIdCategoria(rs.getString("id_categoria_p"));
                producto.setNombreProducto(rs.getString("nombre_producto"));
                producto.setPrecio(rs.getDouble("precio_producto"));
                producto.setStock(rs.getInt("stock_producto"));
                bytea = rs.getBytes("foto_pro");
                if (bytea != null) {
                    try {
                        producto.setFoto(ObtenerFoto(bytea));
                    } catch (IOException ex) {
                        Logger.getLogger(ModelProducto.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                listaProductos.add(producto);
            }
            rs.close();
            return listaProductos;
        } catch (SQLException ex) {
            Logger.getLogger(ModelFactura.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    //Metodo para obtener imagen
    private Image ObtenerFoto(byte[] bytes) throws IOException {
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        Iterator it = ImageIO.getImageReadersByFormatName("jpeg");
        ImageReader reader = (ImageReader) it.next();
        Object source = bis;
        ImageInputStream iis = ImageIO.createImageInputStream(source);
        reader.setInput(iis, true);
        ImageReadParam param = reader.getDefaultReadParam();
        param.setSourceSubsampling(1, 1, 0, 0);
        return reader.read(0, param);
    }

    public Productos CodigosProducto(int idproducto) {
        try {
            Productos producto = new Productos();
            sql = "SELECT * FROM PRODUCTOS WHERE id_producto='" + idproducto + "'";
            ResultSet rs = conexion.consulta(sql);
            while (rs.next()) {
                producto.setIdProducto(rs.getString(1));
                producto.setStock(rs.getInt(5));
            }
            rs.close();
            return producto;
        } catch (SQLException ex) {
            Logger.getLogger(ModelFactura.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    //Metodo para buscar un producto
    public List<Productos> busquedaProductos(String objeto) {

        try {
            List<Productos> listaPro = new ArrayList<>();
            sql = "SELECT * FROM PRODUCTOS WHERE UPPER (nombre_producto) like UPPER('%" + objeto + "%')";
            ResultSet rs = conexion.consulta(sql);
            while (rs.next()) {
                Productos producto = new Productos();
                producto.setIdProducto(rs.getString("id_producto"));
                producto.setIdCategoria(rs.getString("id_categoria_p"));
                producto.setNombreProducto(rs.getString("nombre_producto"));
                producto.setPrecio(rs.getDouble("precio_producto"));
                producto.setStock(rs.getInt("stock_producto"));
                bytea = rs.getBytes("foto_pro");
                if (bytea != null) {
                    try {
                        producto.setFoto(ObtenerFoto(bytea));
                    } catch (IOException ex) {
                        Logger.getLogger(ModelProducto.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                listaPro.add(producto);
            }
            rs.close();
            return listaPro;
        } catch (SQLException ex) {
            Logger.getLogger(ModelProducto.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public ArrayList<Servicios> busquedaServicio(String criterio) {
        try {
            ArrayList<Servicios> listaservicio = new ArrayList<>();
            String sql = "SELECT * FROM servicio WHERE UPPER (nombre_servicio) like UPPER ('%" + criterio + "%')";
            ResultSet rs = conexion.consulta(sql);

            while (rs.next()) {
                Servicios servicio = new Servicios();
                servicio.setId_servicio(rs.getString("id_servicio"));
                servicio.setNombre_servi(rs.getString("nombre_servicio"));
                servicio.setCosto_servi(rs.getFloat("costo_servicio"));
                servicio.setDescripcion(rs.getString("descripcion"));
                listaservicio.add(servicio);
            }
            rs.close();
            return listaservicio;
        } catch (SQLException ex) {
            Logger.getLogger(ModelFactura.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    //Metodo para actualizar Stock
    public boolean ActualizarStock(int cantidad, int idproducto) {
        try {
            sql = "UPDATE PRODUCTOS set stock_producto=? where id_producto=?";
            PreparedStatement ps = conexion.getCon().prepareStatement(sql);
            ps.setInt(1, cantidad);
            ps.setInt(2, idproducto);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ModelFactura.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    //METODOS PARA SERVICIOS
    public List<Servicios> listarServicios() {
        ArrayList<Servicios> listaServicio = new ArrayList<Servicios>();
        String sql = "SELECT * FROM SERVICIO";
        ResultSet rs = conexion.consulta(sql);
        try {
            while (rs.next()) {
                Servicios servicios = new Servicios();
                servicios.setId_servicio(rs.getString("id_servicio"));
                servicios.setDescripcion(rs.getString("descripcion"));
                servicios.setNombre_servi(rs.getString("nombre_servicio"));
                servicios.setCosto_servi(rs.getFloat("costo_servicio"));
                listaServicio.add(servicios);
            }
            rs.close();
            return listaServicio;
        } catch (SQLException ex) {
            Logger.getLogger(ModelFactura.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public ArrayList<Veterinario> ListVeterinario() {
        ArrayList<Veterinario> lista = new ArrayList<>();

        try {
            //Sentencia
            String sql = "Select * from veterinario";
            ResultSet rs = conexion.consulta(sql);
            while (rs.next()) {
                Veterinario vet = new Veterinario();
                vet.setid_medico(rs.getString("id_medico"));
                vet.setNombre_medico(rs.getString("nombre_medico"));
                vet.setApellido_medico(rs.getString("apellido_medico"));
                vet.setDireccion_medico(rs.getString("direccion_medico"));
                vet.setEspecialidad(rs.getString("especialidad"));

                lista.add(vet);
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(Veterinario.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public ArrayList<Veterinario> listVet_busqueda(String busqueda) {
        ArrayList<Veterinario> lista = new ArrayList<>();

        try {
            //Sentencia
            String sql = "Select * from veterinario where nombre_medico like'" + busqueda + "%'";
            ResultSet rs = conexion.consulta(sql);
            while (rs.next()) {
                Veterinario vet = new Veterinario();
                vet.setid_medico(rs.getString("id_medico"));
                vet.setNombre_medico(rs.getString("nombre_medico"));
                vet.setApellido_medico(rs.getString("apellido_medico"));
                vet.setDireccion_medico(rs.getString("direccion_medico"));
                vet.setEspecialidad(rs.getString("especialidad"));
                vet.setContraseña(rs.getString("contra"));
                lista.add(vet);
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(Veterinario.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
}
