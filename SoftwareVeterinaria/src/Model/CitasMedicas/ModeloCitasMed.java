package Model.CitasMedicas;

import Controller.Login.ControllerLogin;
import Model.Clientes.Clientes;
import Model.ConectionPg;
import Model.Veterinario.Veterinario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class ModeloCitasMed extends CitasMedicas {

    ConectionPg conexion = new ConectionPg();
    String sql;

    public ModeloCitasMed() {
    }

    public ModeloCitasMed(String codigoCita, String codigoMedico, String codigoCliente, Date fechaSolicitud, Date fechaCita, String horaCita, boolean habilitado, boolean estado) {
        super(codigoCita, codigoMedico, codigoCliente, fechaSolicitud, fechaCita, horaCita, habilitado, estado);
    }

    //METODO PARA LISTAR Y BUSCAR LOGICO
    public ArrayList<CitasMedicas> ListCitas(String objeto, String usuario) {
        ArrayList<CitasMedicas> lista = new ArrayList<>();
        //Variable del medico ingresado en el login.
        usuario = ControllerLogin.Usuario;
        try {
            sql = "select * from cita_medica where id_cita ilike '%" + objeto + "%' and habilitado=true or id_medico_cita ilike '%" + usuario + "%' "
                    + "and habilitado=true or id_cliente_cita ilike '%" + objeto + "%' and habilitado=true";
            ResultSet rs = conexion.consulta(sql);
            while (rs.next()) {
                CitasMedicas citas = new CitasMedicas();
                citas.setCodigoCita(rs.getString("id_cita"));
                citas.setCodigoMedico(rs.getString("id_medico_cita"));
                citas.setCodigoCliente(rs.getString("id_cliente_cita"));
                citas.setFechaSolicitud(rs.getDate("fecha_solicitud"));
                citas.setFechaCita(rs.getDate("fecha_cita"));
                citas.setHoraCita(rs.getString("hora_cita"));
                citas.setEstado(rs.getBoolean("estado"));
                lista.add(citas);
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCitasMed.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    //METODO PARA BUSCAR POR PARAMETROS DE 2 FECHAS DESDE-HASTA 
    public ArrayList<CitasMedicas> ListCitasFechas(String fecha1, String fecha2) {
        ArrayList<CitasMedicas> lista = new ArrayList<>();
        try {
            sql = "select * from cita_medica where fecha_cita between " + "'" + fecha1 + "'" + " and " + "'" + fecha2 + "'" + " and habilitado=true";
            ResultSet rs = conexion.consulta(sql);
            while (rs.next()) {
                CitasMedicas citas = new CitasMedicas();
                citas.setCodigoCita(rs.getString("id_cita"));
                citas.setCodigoMedico(rs.getString("id_medico_cita"));
                citas.setCodigoCliente(rs.getString("id_cliente_cita"));
                citas.setFechaSolicitud(rs.getDate("fecha_solicitud"));
                citas.setFechaCita(rs.getDate("fecha_cita"));
                citas.setHoraCita(rs.getString("hora_cita"));
                lista.add(citas);
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCitasMed.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    //METODO PARA CREAR LA CITA
    public boolean CrearCita() {
        try {
            sql = "insert into cita_medica(id_cita,id_medico_cita,id_cliente_cita,fecha_solicitud,fecha_cita,habilitado,hora_cita,estado)";
            sql += "values(?,?,?,?,?,?,?,?)";

            PreparedStatement ps = conexion.getCon().prepareStatement(sql);
            ps.setString(1, getCodigoCita());
            ps.setString(2, getCodigoMedico());
            ps.setString(3, getCodigoCliente());
            ps.setDate(4, Date.valueOf(fechaActual()));
            ps.setDate(5, getFechaCita());
            ps.setBoolean(6, true);
            ps.setString(7, getHoraCita());
            ps.setBoolean(8, true);
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCitasMed.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    //metodo para mostrar la fecha de hoy
    public static String fechaActual() {
        java.util.Date fecha = new java.util.Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("YYYY-MM-dd");
        return formatofecha.format(fecha);
    }

    //METODO PARA MODIFICAR LA CITA
    public boolean ModificarCita() {
        try {
            sql = "update cita_medica set  fecha_cita=?, hora_cita=?";
            sql += "where id_cita='" + getCodigoCita() + "'";
            PreparedStatement ps = conexion.getCon().prepareStatement(sql);
            ps.setDate(1, getFechaCita());
            ps.setString(2, getHoraCita());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCitasMed.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    //Metodo para eliminar una revision
    public boolean eliminarCita(String idCita) {
        String sql;
        sql = "UPDATE CITA_MEDICA set HABILITADO=?"
                + "where id_cita='" + idCita + "'";
        try {
            PreparedStatement ps = conexion.getCon().prepareStatement(sql);
            ps.setBoolean(1, false);
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCitasMed.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public ArrayList<Veterinario> ListVet_completa(String busqueda) {
        ArrayList<Veterinario> lista = new ArrayList<>();

        try {
            //Sentencia
            String sql = "Select * from veterinario where id_medico like '%" + busqueda + "%' and habilitado=true or nombre_medico ilike '%" + busqueda + "%' and habilitado=true";
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

    public String codigoCita() {
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection con = conexion.getCon();
            // Preparamos la consulta
            String sql = "SELECT COUNT(id_cita) as id_cita FROM cita_medica";
            // Traemos los datos de la bd
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            // Cargamos los resultados
            if (rs.next()) {
                String idCita = rs.getString("id_cita");
                return idCita;
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCitasMed.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    //Metodos 
    public List<CitasMedicas> listarCitasLogico(String fecha) {
        try {
            sql = "SELECT * FROM CITA_MEDICA WHERE fecha_cita = " + "'" + fecha + "'" + "and habilitado=true";
            ResultSet rs = conexion.consulta(sql);
            List<CitasMedicas> listCita = new ArrayList<>();

            while (rs.next()) {
                CitasMedicas citas = new CitasMedicas();
                citas.setCodigoCita(rs.getString("id_cita"));
                citas.setCodigoMedico(rs.getString("id_medico_cita"));
                citas.setCodigoCliente(rs.getString("id_cliente_cita"));
                citas.setFechaSolicitud(rs.getDate("fecha_solicitud"));
                citas.setFechaCita(rs.getDate("fecha_cita"));
                citas.setHoraCita(rs.getString("hora_cita"));
                listCita.add(citas);
            }
            rs.close();
            return listCita;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCitasMed.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
