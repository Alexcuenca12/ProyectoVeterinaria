
package Model.Proveedor;

import Model.ConectionPg;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModelProveedor extends Proveedor{
    ConectionPg cpg= new ConectionPg();

    public ModelProveedor() {
    }

    public ModelProveedor(String ruc_proveedor, String nombre, String apellido, String telefono, String direcccion, String descripcion, String empresa, String correo, boolean habilitado) {
        super(ruc_proveedor, nombre, apellido, telefono, direcccion, descripcion, empresa, correo, habilitado);
    }
    
     public ArrayList<Proveedor> listProveedores(String busqueda) {
        ArrayList<Proveedor> lista = new ArrayList<>();

        try {
            //Sentencia
            String sql = "Select * from Proveedor where ruc_proveedor like UPPER('%" + busqueda + "%') and habilitado=true";
            ResultSet rs = cpg.consulta(sql);
            while (rs.next()) {
                Proveedor prov = new Proveedor();
                prov.setApellido(rs.getString("apellido"));
                prov.setCorreo(rs.getString("correo"));
                prov.setDescripcion(rs.getString("descripcion"));
                prov.setDirecccion(rs.getString("direccion"));
                prov.setEmpresa(rs.getString("empresa"));
                prov.setNombre(rs.getString("nombre"));
                prov.setRuc_proveedor(rs.getString("ruc_proveedor"));
                prov.setTelefono(rs.getString("telefono"));
                lista.add(prov);
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public boolean CrearProveedor() {
        String sql;
        sql = "Insert into Proveedor(ruc_proveedor, nombre, apellido, telefono, direcccion, descripcion, empresa, correo, habilitado)";
        sql += "values(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = cpg.getCon().prepareStatement(sql);
            ps.setString(1, getRuc_proveedor());
            ps.setString(2, getNombre());
            ps.setString(3, getApellido());
            ps.setString(4, getTelefono());
            ps.setString(5, getDirecccion());
            ps.setString(6, getDescripcion());
            ps.setString(7, getEmpresa());
            ps.setString(8, getCorreo());
            ps.setBoolean(9, true);
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public boolean ActualizarProveedor() {
        String sql;
        sql = "update proveedor set nombre=?, apellido=?, telefono=?, direcccion=?, descripcion=?, empresa=?, correo=?"
                + "where ruc_proveedor='" + getRuc_proveedor() + "'";
        try {
            PreparedStatement ps = cpg.getCon().prepareStatement(sql);
            ps.setString(1, getNombre());
            ps.setString(2, getApellido());
            ps.setString(3, getTelefono());
            ps.setString(4, getDirecccion());
            ps.setString(5, getDescripcion());
            ps.setString(6, getEmpresa());
            ps.setString(7, getCorreo());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean EliminaProveedor() {
        String sql;
        sql = "update proveedor set habilitado=?"
                + "where ruc_proveedor='" + getRuc_proveedor() + "'";
        try {
            PreparedStatement ps = cpg.getCon().prepareStatement(sql);
            ps.setBoolean(1, false);
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
