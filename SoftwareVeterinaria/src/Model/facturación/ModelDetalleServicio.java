package Model.facturación;

import Model.ConectionPg;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class ModelDetalleServicio extends DetalleServicio {

    ConectionPg conexion = new ConectionPg();
    private String sql;

    public ModelDetalleServicio() {
    }

    public ModelDetalleServicio(String codigo_detalle, String codigo_servicio, String codigo_factura, String descripcion, double total, boolean habilitado) {
        super(codigo_detalle, codigo_servicio, codigo_factura, descripcion, total, habilitado);
    }

    //CREACION DETALLE 
    public boolean CrearDetalleSer() {
        try {
            sql = "INSERT INTO DETALLE_SERVICIOS (id_detalle_s,id_servicio_ds,id_factura_ds,total_detalle_servicio,habilidato ,descripcion)";
            sql += "VALUES (?,?,?,?,?,?)";
            PreparedStatement ps = conexion.getCon().prepareStatement(sql);
            ps.setString(1, getCodigo_detalle());
            ps.setString(2, getCodigo_servicio());
            ps.setString(3, getCodigo_factura());
            ps.setDouble(4, getTotal());
            ps.setBoolean(5, true);
            ps.setString(6, getDescripcion());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ModelDetalleServicio.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public String codigoDetalle() {
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection con = conexion.getCon();
            // Preparamos la consulta
            String sql = "SELECT COUNT(id_detalle_s) as id_detalle_s FROM detalle_servicios";
            // Traemos los datos de la bd
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            // Cargamos los resultados
            if (rs.next()) {
                String idservicio = rs.getString("id_detalle_s");
                return idservicio;
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(ModelDetalleProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
