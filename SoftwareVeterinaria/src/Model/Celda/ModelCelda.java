package Model.Celda;

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
public class ModelCelda extends Celda {

    ConectionPg conexion = new ConectionPg();
    private String sql;

    public ModelCelda() {

    }

    public ModelCelda(String sql) {
        this.sql = sql;
    }

    public ModelCelda(String sql, String id_celda, Double costo_celda, String ubicacion_celda, boolean habilitado, boolean estado) {
        super(id_celda, costo_celda, ubicacion_celda, habilitado, estado);
        this.sql = sql;
    }

    
    //Listar Celda
    public List<Celda> ListarCelda(String busqueda) {
        try {
            sql = "SELECT * FROM CELDA WHERE id_celda ilike'%"+busqueda+"%' and HABILITADO = TRUE";
            List<Celda> listCelda = new ArrayList<>();
            ResultSet rs = conexion.consulta(sql);
            while (rs.next()) {
                Celda celda = new Celda();
                celda.setId_celda(rs.getString("id_celda"));
                celda.setCosto_celda(rs.getDouble("costo_celda"));
                celda.setUbicacion_celda(rs.getString("ubicacion_celda"));
                celda.setEstado(rs.getBoolean("estado"));
                listCelda.add(celda);
            }
            rs.close();
            return listCelda;
        } catch (SQLException ex) {
            Logger.getLogger(ModelCelda.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
     public List<Celda> ListarCelda2() {
        try {
            sql = "SELECT * FROM CELDA";
            List<Celda> listCelda = new ArrayList<>();
            ResultSet rs = conexion.consulta(sql);
            while (rs.next()) {
                Celda celda = new Celda();
                celda.setId_celda(rs.getString("id_celda"));
                celda.setCosto_celda(rs.getDouble("costo_celda"));
                celda.setUbicacion_celda(rs.getString("ubicacion_celda"));
                celda.setEstado(rs.getBoolean("estado"));
                listCelda.add(celda);
            }
            rs.close();
            return listCelda;
        } catch (SQLException ex) {
            Logger.getLogger(ModelCelda.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    //Metodo para crear celda
    public boolean crearCelda() {
        try {
            sql = "INSERT INTO CELDA (id_celda,costo_celda,ubicacion_celda,habilitado,estado)";
            sql += "VALUES(?,?,?,?,?)";
            PreparedStatement ps = conexion.getCon().prepareStatement(sql);
            ps.setString(1, getId_celda());
            ps.setDouble(2, getCosto_celda());
            ps.setString(3, getUbicacion_celda());
            ps.setBoolean(4, true);
            ps.setBoolean(5, isEstado());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ModelCelda.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    //Metodo para editar celdas
    public boolean editarCelda() {
        try {
            sql = "UPDATE CELDA SET costo_celda=?,ubicacion_celda=? WHERE id_celda='" + getId_celda() + "';";
            PreparedStatement ps = conexion.getCon().prepareStatement(sql);
            ps.setDouble(1, getCosto_celda());
            ps.setString(2, getUbicacion_celda());
            ps.setBoolean(3, isEstado());
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ModelCelda.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public boolean CambiarEstado(String idCelda, boolean estado) {
        String sql;
        sql = "UPDATE CELDA SET estado=? WHERE id_celda='" + idCelda + "';";
        try {
            PreparedStatement ps = conexion.getCon().prepareStatement(sql);
            ps.setBoolean(1, estado);
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ModelCelda.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    //Metodo para eliminar celda
    public boolean eliminarCelda(String idCelda) {
        String sql;
        sql = "UPDATE CELDA SET habilitado=? WHERE id_celda='" + idCelda + "';";
        try {
            PreparedStatement ps = conexion.getCon().prepareStatement(sql);
            ps.setBoolean(1, false);
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ModelCelda.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }


}
