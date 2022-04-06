/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Clientes;

import Model.ConectionPg;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author Edison
 */
public class ModeloClientes extends Clientes {

    ConectionPg conexion = new ConectionPg();
    String sql;

    public ModeloClientes() {
    }
    
    public ModeloClientes(String id_cliente, String nombre_cliente, String apellido_cliente, Date fechanacimiento, String telefono, String email, String direccion_cliente, Date fechaingreso, boolean habilitado) {
        super(id_cliente, nombre_cliente, apellido_cliente, fechanacimiento, telefono, email, direccion_cliente, fechaingreso, habilitado);
    }

    public ArrayList<Clientes> ListClient(String valor) {
        ArrayList<Clientes> lista = new ArrayList<>();

        try {
            //Sentencia
            String sql = "Select * from clientes where id_cliente ilike '%" + valor + "%' and habilitado=true OR nombre_cliente ilike '%" + valor + "%' and habilitado=true";
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
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public boolean CrearClientes() {
        String sql;
        sql = "Insert into clientes(id_cliente, nombre_cliente, apellido_cliente, fechanacimiento, telefono, email, direccion_cliente, fechaingreso,habilitado)";
        sql += "values(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conexion.getCon().prepareStatement(sql);
            ps.setString(1, getId_cliente());
            ps.setString(2, getNombre_cliente());
            ps.setString(3, getApellido_cliente());
            ps.setDate(4, getFechanacimiento());
            ps.setString(5, getTelefono());
            ps.setString(6, getEmail());
            ps.setString(7, getDireccion_cliente());
            ps.setDate(8, getFechaingreso());
            ps.setBoolean(9, true);
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean ModificarClientes() {
        String sql;
        sql = "update clientes set  nombre_cliente=?, apellido_cliente=?, fechanacimiento=?, telefono=?, email=?, direccion_cliente=?, fechaingreso=?"
                + "where id_cliente='" + getId_cliente() + "'";
        try {
            PreparedStatement ps = conexion.getCon().prepareStatement(sql);
            ps.setString(1, getNombre_cliente());
            ps.setString(2, getApellido_cliente());
            ps.setDate(3, getFechanacimiento());
            ps.setString(4, getTelefono());
            ps.setString(5, getEmail());
            ps.setString(6, getDireccion_cliente());
            ps.setDate(7, getFechaingreso());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean EliminaClientes() {

        String sql = "update clientes set habilitado=?"
                + "where id_cliente='" + getId_cliente() + "'";
        try {
            PreparedStatement ps = conexion.getCon().prepareStatement(sql);
            ps.setBoolean(1, false);
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloClientes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public ArrayList<Clientes> ListClient_B(String x) {
        ArrayList<Clientes> lista = new ArrayList<>();

        if (x.equalsIgnoreCase("")) {
            sql = "select * from clientes";
        } else if (x.equalsIgnoreCase(x)) {
            sql = "SELECT * FROM clientes WHERE UPPER (nombre_cliente) like UPPER ('%" + x + "%')or  UPPER (id_cliente) like UPPER ('%" + x + "%')";
        }
        try {
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
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

}
