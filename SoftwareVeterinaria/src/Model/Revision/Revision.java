/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Revision;

import java.sql.Date;

/**
 *
 * @author Usuario
 */
public class Revision {
    //Variables
    private String idRevision;
    private String idMedico;
    private String idMascota; 
    private String nombreMascota;
    private Date fecha_revision; 
    private String descripcion;
    private String enfermedad;
    private boolean habilitado;
    
    //Constructor vacio y full

    public Revision() {
    }

    public Revision(String idRevision, String idMedico, String idMascota, String nombreMascota, Date fecha_revision, String descripcion, String enfermedad, boolean habilitado) {
        this.idRevision = idRevision;
        this.idMedico = idMedico;
        this.idMascota = idMascota;
        this.nombreMascota = nombreMascota;
        this.fecha_revision = fecha_revision;
        this.descripcion = descripcion;
        this.enfermedad = enfermedad;
        this.habilitado = habilitado;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    //Getters and setters
    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public String getIdRevision() {
        return idRevision;
    }

    public void setIdRevision(String idRevision) {
        this.idRevision = idRevision;
    }

    public String getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(String idMedico) {
        this.idMedico = idMedico;
    }

    public String getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(String idMascota) {
        this.idMascota = idMascota;
    }

    public Date getFecha_revision() {
        return fecha_revision;
    }

    public void setFecha_revision(Date fecha_revision) {
        this.fecha_revision = fecha_revision;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }
    
    
    
}
