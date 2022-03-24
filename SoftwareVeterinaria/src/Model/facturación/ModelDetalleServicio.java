
package Model.facturación;

import Model.ConectionPg;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class ModelDetalleServicio extends DetalleServicio{
    
    ConectionPg conexion=new ConectionPg();
    private String sql;

    public ModelDetalleServicio() {
    }

    public ModelDetalleServicio(int codigo_detalle, String codigo_servicio, int codigo_factura, double cantidad, double total, boolean habilitado) {
        super(codigo_detalle, codigo_servicio, codigo_factura, cantidad, total, habilitado);
    }
    
    //CREACION DETALLE 
    public boolean CrearDetalleSer(){
        try {
            sql="INSERT INTO DETALLE_SERVICIOS (id_detalle_s,id_servicio_ds,id_factura_ds,cantidad_s,total_detalle_servicio)";
            sql+="VALUES (?,?,?,?,?)";
            PreparedStatement ps=conexion.getCon().prepareStatement(sql);
            ps.setInt(1, getCodigo_detalle());
            ps.setString(2, getCodigo_servicio());
            ps.setInt(3, getCodigo_factura());
            ps.setDouble(4, getCantidad());
            ps.setDouble(5, getTotal());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ModelDetalleServicio.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
}
