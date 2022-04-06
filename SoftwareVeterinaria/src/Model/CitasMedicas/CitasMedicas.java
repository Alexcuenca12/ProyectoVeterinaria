/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.CitasMedicas;

import java.sql.Date;

/**
 *
 * @author Usuario
 */
public class CitasMedicas {
   
    //Atributos 
    private String codigoCita;
    private String codigoMedico;
    private String codigoCliente;
    private Date fechaSolicitud;
    private Date fechaCita;
    private String horaCita;
    private boolean habilitado;
    
    //COnstructor
    
    public CitasMedicas() {
    }

    public CitasMedicas(String codigoCita, String codigoMedico, String codigoCliente, Date fechaSolicitud, Date fechaCita, String horaCita, boolean habilitado) {
        this.codigoCita = codigoCita;
        this.codigoMedico = codigoMedico;
        this.codigoCliente = codigoCliente;
        this.fechaSolicitud = fechaSolicitud;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
        this.habilitado = habilitado;
    }

    public String getCodigoCita() {
        return codigoCita;
    }

    public void setCodigoCita(String codigoCita) {
        this.codigoCita = codigoCita;
    }

    public String getCodigoMedico() {
        return codigoMedico;
    }

    public void setCodigoMedico(String codigoMedico) {
        this.codigoMedico = codigoMedico;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public Date getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(String horaCita) {
        this.horaCita = horaCita;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
    
}
