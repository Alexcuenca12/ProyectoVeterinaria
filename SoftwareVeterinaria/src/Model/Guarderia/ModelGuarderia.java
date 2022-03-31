/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Guarderia;

import Model.ConectionPg;
import Model.Paciente.ModeloPaciente;
import static Model.Paciente.ModeloPaciente.listPacientes;
import Model.Paciente.Paciente;
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
 * @author Edison
 */
public class ModelGuarderia extends Guarderia{
    private String sql;
    private byte[] bytea;
    ConectionPg conexion = new ConectionPg();
    public static List<Guarderia> listaGuarderia = new ArrayList<Guarderia>();

    public ModelGuarderia() {   
    }

    public ModelGuarderia(String sql, int id_hospedaje, String id_mascota, String id_celda, Date fecha_ingreso, Date fecha_salida, boolean estado) {
        super(id_hospedaje, id_mascota, id_celda, fecha_ingreso, fecha_salida, estado);
        this.sql = sql;
    }
    
    public List<Guarderia> listarGuarderia() {
        try {
            sql = "SELECT * FROM hospedaje";
            try (ResultSet rs = conexion.consulta(sql)) {
                while (rs.next()) {
                    Guarderia guarderia = new Guarderia();
                    guarderia.setId_hospedaje(rs.getInt("id_hospedaje"));
                    guarderia.setId_mascota(rs.getString("id_mascota_hospedaje"));
                    guarderia.setId_celda(rs.getString("id_celda_hospedaje"));
                    guarderia.setFecha_ingreso(rs.getDate("fecha_ingreso_hospedaje"));
                    guarderia.setFecha_salida(rs.getDate("fecha_salida_hospedaje"));
                    guarderia.setEstado(rs.getBoolean("estado"));
                    listaGuarderia.add(guarderia);
                }
            }
            return listaGuarderia;
        } catch (SQLException ex) {
            Logger.getLogger(ModelGuarderia.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public boolean CrearGuarderia() {
        try {
            sql = "INSERT INTO HOSPEDAJE(id_hospedaje,id_mascota_hospedaje,id_celda_hospedaje,fecha_ingreso_hospedaje,"
                    + "fecha_salida_hospedaje,estado)";
            sql += "VALUES(?,?,?,?,?,?)";
            PreparedStatement ps = conexion.getCon().prepareStatement(sql);
            ps.setInt(1, getId_hospedaje());
            ps.setString(2, getId_mascota());
            ps.setString(3, getId_celda());
            ps.setDate(4, getFecha_ingreso());
            ps.setDate(5, getFecha_salida());
            ps.setBoolean(6, isEstado());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ModelGuarderia.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean editarGuarderia() {
        try {
            sql = "UPDATE HOSPEDAJE SET fecha_ingreso_hospedaje=?,fecha_salida_hospedaje=?,estado=?"
                    + "WHERE id_hospedaje='" + getId_hospedaje() + "';";
            sql += "VALUES(?,?,?)";
            PreparedStatement ps = conexion.getCon().prepareStatement(sql);
            ps.setDate(1, getFecha_ingreso());
            ps.setDate(2, getFecha_salida());
            ps.setBoolean(3, isEstado());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ModelGuarderia.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean eliminarGuarderia(String idGuarderia) {
        sql = "DELETE FROM Hospedaje WHERE id_hospedaje='" + idGuarderia + "';";
        return conexion.accion(sql);
    }
    
    public List<Guarderia> busqueda(String objeto) {
        try {
            if (objeto.equals("")) {
                sql = "SELECT * FROM HOSPEDAJE";
            } else if (objeto.equals(objeto)) {
                sql = "SELECT * FROM WHERE UPPER(id_mascota_hospedaje) LIKE UPPER ('" + objeto + "') OR UPPER(id_celda_hospedaje) LIKE UPPER ('" + objeto + "')";
            }

            ResultSet rs = conexion.consulta(sql);

            while (rs.next()) {
                Guarderia guarderia = new Guarderia();
                guarderia.setId_hospedaje(rs.getInt("id_hospedaje"));
                guarderia.setId_mascota(rs.getString("id_mascota_hospedaje"));
                guarderia.setId_celda(rs.getString("id_celda_hospedaje"));
                guarderia.setFecha_ingreso(rs.getDate("fecha_ingreso_hospedaje"));
                guarderia.setFecha_salida(rs.getDate("fecha_salida_hospedaje"));
                guarderia.setEstado(rs.getBoolean(null));
                listaGuarderia.add(guarderia);
            }
            rs.close();
            return listaGuarderia;
        } catch (SQLException ex) {
            Logger.getLogger(ModelGuarderia.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public ArrayList<Paciente> listarPacientes() {
        sql = "SELECT * FROM MASCOTA";
        ResultSet rs = conexion.consulta(sql);
        try {
            while (rs.next()) {
                Paciente paciente = new Paciente();
                paciente.setId_mascota(rs.getString("id_mascota"));
                paciente.setId_cliente_m(rs.getString("id_cliente_m"));
                paciente.setNombre_mascota(rs.getString("nombre_mascota"));
                paciente.setRaza_mascota(rs.getString("raza_mascota"));
                paciente.setSexo_mascota(rs.getString("sexo_mascota"));
                paciente.setEspecie_mascota(rs.getString("especie_mascota"));
                paciente.setColor_mascota(rs.getString("color_mascota"));
                paciente.setFecha_nacimiento_mascota(rs.getDate("fecha_nacimiento_mascota"));
                paciente.setFecha_ingreso_mascota(rs.getDate("fecha_ingreso_mascota"));
                bytea = rs.getBytes("foto_mas");

                if (bytea != null) {
                    try {
                        paciente.setFoto(ObtenerFoto(bytea));
                    } catch (IOException ex) {
                        Logger.getLogger(ModeloPaciente.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                listPacientes.add(paciente);
            }
            rs.close();
            return listPacientes;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPaciente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
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
}
