package Model.Categorias;

import Model.ConectionPg;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class ModeloCategoria extends Categoria {

    ConectionPg conexion = new ConectionPg();
    private String sql;

    public ModeloCategoria() {
    }

    public ModeloCategoria(String id_Categoria, String nombre) {
        super(id_Categoria, nombre);
    }

    //Listar Categorias
    public List<Categoria> ListarCategorias() {
        try {
            sql = "SELECT * FROM CATEGORIA";
            List<Categoria> listCategorias = new ArrayList<Categoria>();
            ResultSet rs = conexion.consulta(sql);
            while (rs.next()) {
                Categoria categoria = new Categoria();
                categoria.setId_Categoria(rs.getString("id_categoria"));
                categoria.setNombre(rs.getString("nombre_categoria"));
                listCategorias.add(categoria);
            }
            rs.close();
            return listCategorias;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCategoria.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    //Metodo para crear categoria
    public boolean crearCategoria() {
        try {
            sql = "INSERT INTO CATEGORIA(id_categoria,nombre_categoria)";
            sql += "VALUES(?,?)";
            PreparedStatement ps = conexion.getCon().prepareStatement(sql);
            ps.setString(1, getId_Categoria());
            ps.setString(2, getNombre());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCategoria.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    //Metodo para editar categoria
    public boolean editarCategoria() {
        try {
            sql = "UPDATE CATEGORIA SET nombre_categoria=? WHERE id_categoria='" + getId_Categoria() + "';";
            PreparedStatement ps = conexion.getCon().prepareStatement(sql);
            ps.setString(1, getNombre());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCategoria.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    //Metodo para eliminar categoria
    public boolean eliminarCategoria(String idCategoria) {
        String sql;
        sql = "DELETE FROM CATEGORIA WHERE id_categoria='" + idCategoria + "';";
        return conexion.accion(sql);
    }

    //Metodo para buscar una categoria 
    public List<Categoria> busquedaCategoria(String objeto) {
        List<Categoria> listCategorias = new ArrayList<Categoria>();
        try {
            sql = "SELECT * FROM CATEGORIA WHERE nombre_categoria ilike '%" + objeto + "%' OR id_categoria ilike '%" + objeto + "%'";

            ResultSet rs = conexion.consulta(sql);
            while (rs.next()) {
                Categoria categoria = new Categoria();
                categoria.setId_Categoria(rs.getString("id_categoria"));
                categoria.setNombre(rs.getString("nombre_categoria"));
                listCategorias.add(categoria);
            }
            rs.close();
            return listCategorias;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCategoria.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}