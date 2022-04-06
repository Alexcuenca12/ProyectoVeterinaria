/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.CrudServicios;

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
 * @author JOSE DAVID NAULA
 */
public class ModelServicios extends Servicios {

    //CONEXION
    ConectionPg conection = new ConectionPg();
    //CONSTRUCTORES

    public ModelServicios() {
    }

    public ModelServicios(String id_servicio, String descripcion, String nombre_servi, Float costo_servi, boolean habilitado) {
        super(id_servicio, descripcion, nombre_servi, costo_servi, habilitado);
    }

    public List<Servicios> listaServicios(String busqueda) {
        ArrayList<Servicios> listaServicio = new ArrayList<>();
        String sql = "Select * from servicio where id_servicio ilike '%" + busqueda + "%' AND habilitado=true OR nombre_servicio ilike'%" + busqueda + "%' AND habilitado=true";
        ResultSet rs = conection.consulta(sql);
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
            Logger.getLogger(ModelServicios.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean CrearServicio() {
        String sql;
        sql = "INSERT INTO servicio (id_servicio,descripcion,nombre_servicio,costo_servicio,habilitado)";
        sql += "VALUES(?,?,?,?,?)";
        try {
            PreparedStatement ser = conection.getCon().prepareStatement(sql);
            ser.setString(1, getId_servicio());
            ser.setString(2, getDescripcion());
            ser.setString(3, getNombre_servi());
            ser.setFloat(4, getCosto_servi());
            ser.setBoolean(5, true);
            ser.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Servicios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public boolean ModificarServicio() {
        String sql;
        sql = "UPDATE servicio set descripcion= '" + getDescripcion() + "', nombre_servicio= '" + getNombre_servi() + "', costo_servicio= '" + getCosto_servi()
                + "' WHERE id_servicio= '" + getId_servicio() + "';";
        return conection.accion(sql);

    }

    public boolean eliminarServicio(String id_servicio) {
        String sql;
        sql = "update servicio set habilitado=?"
                + "where id_servicio='" + getId_servicio() + "'";
        try {
            PreparedStatement ps = conection.getCon().prepareStatement(sql);
            ps.setBoolean(1, false);
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Servicios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
