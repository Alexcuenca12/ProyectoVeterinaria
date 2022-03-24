
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
public class ModelDetalleProducto extends DetalleProducto {
    
    ConectionPg conexion=new ConectionPg();
    private String sql;

    public ModelDetalleProducto() {
    }

    public ModelDetalleProducto(int codigo_detalle, String codigo_producto, int codigo_factura, double cantidad, double total, boolean habilitado) {
        super(codigo_detalle, codigo_producto, codigo_factura, cantidad, total, habilitado);
    }
    
    //CREACION DETALLE 
    public boolean CrearDetalleProd(){
        try {
            sql="INSERT INTO DETALLE_PRODUCTO (id_detalle_p,id_producto_d,id_factura_d,cantidad_p,total_detalle_producto)";
            sql+="VALUES (?,?,?,?,?)";
            PreparedStatement ps=conexion.getCon().prepareStatement(sql);
            ps.setInt(1, getCodigo_detalle());
            ps.setString(2, getCodigo_producto());
            ps.setInt(3, getCodigo_factura());
            ps.setDouble(4, getCantidad());
            ps.setDouble(5, getTotal());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ModelDetalleProducto.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
}
