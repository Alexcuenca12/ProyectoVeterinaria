
package Model.CitasMedicas;

import Controller.Login.ControllerLogin;
import Model.ConectionPg;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class ModeloCitasMed extends CitasMedicas{
    ConectionPg conexion=new ConectionPg();
    String sql;

    public ModeloCitasMed(String codigoCita, String codigoMedico, String codigoCliente, Date fechaSolicitud, Date fechaCita, String horaCita, boolean habilitado) {
        super(codigoCita, codigoMedico, codigoCliente, fechaSolicitud, fechaCita, horaCita, habilitado);
    }
    
    //METODO PARA LISTAR Y BUSCAR LOGICO
    public ArrayList<CitasMedicas> ListCitas(String objeto,String usuario){
        ArrayList<CitasMedicas> lista=new ArrayList<>();
        //Variable del medico ingresado en el login.
        usuario=ControllerLogin.Usuario;
        try {
            sql="select * from cita_medica where id_cita ilike '%"+objeto+"%' and habilitado=true or id_medico_cita ilike or '%"+usuario+"%' "
                    + "and habilitado=true or id_cliente_cita ilike '%"+objeto+"%' and habilitado=true";
            ResultSet rs=conexion.consulta(sql);
            while (rs.next()) {
                CitasMedicas citas=new CitasMedicas();
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
    
    //METODO PARA BUSCAR POR PARAMETROS DE 2 FECHAS DESDE-HASTA 
    public ArrayList<CitasMedicas> ListCitasFechas(String fecha1,String fecha2){
        ArrayList<CitasMedicas> lista=new ArrayList<>();
        try {
            sql="select * from cita_medica where fecha_solicitud between " + "'" + fecha1 + "'" + " and " + "'" + fecha2 + "'" + " and habilitado=true";
            ResultSet rs=conexion.consulta(sql);
            while (rs.next()) {
                CitasMedicas citas=new CitasMedicas();
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
    public boolean CrearCita(){
        try {
            sql="insert into cita_medica(id_cita,id_medico_cita,id_cliente_cita,fecha_solicitud,fecha_cita,hora_cita,habilitado)";
            sql+="values(?,?,?,?,?,?,?)";
            
            PreparedStatement ps=conexion.getCon().prepareStatement(sql);
            ps.setString(1, getCodigoCita());
            ps.setString(2, getCodigoMedico());
            ps.setString(3, getCodigoCliente());
            ps.setDate(4, getFechaSolicitud());
            ps.setDate(5, getFechaCita());
            ps.setString(6, getHoraCita());
            ps.setBoolean(7, true);
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCitasMed.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    //METODO PARA MODIFICAR LA CITA
    public boolean ModificarCita(){
        try {
            sql="update cita_medica set fecha_solicitud=?, fecha_cita=?, hora_cita=?";
            sql+="where id_cita='"+getCodigoCita()+"'";
            PreparedStatement ps=conexion.getCon().prepareStatement(sql);
            ps.setDate(1, getFechaSolicitud());
            ps.setDate(2, getFechaCita());
            ps.setString(3, getHoraCita());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCitasMed.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    //METODO ELIMINADO LOGICO
    public boolean EliminarCita(){
        try {
            sql="update cita_medica set habilitado=?";
            sql+="where id_cita='"+getCodigoCita()+"'";
            
            PreparedStatement ps=conexion.getCon().prepareStatement(sql);
            ps.setBoolean(1, false);
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCitasMed.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
}
