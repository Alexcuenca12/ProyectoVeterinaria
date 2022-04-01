/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Guarderia;

import java.sql.Date;

/**
 *
 * @author Edison
 */
public class Guarderia {
    private int id_hospedaje;
    private String id_mascota;
    private String id_celda;
    private Date fecha_ingreso;
    private Date fecha_salida;
    private boolean estado;

    public Guarderia(int id_hospedaje, String id_mascota, String id_celda, Date fecha_ingreso, Date fecha_salida, boolean estado) {
        this.id_hospedaje = id_hospedaje;
        this.id_mascota = id_mascota;
        this.id_celda = id_celda;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_salida = fecha_salida;
        this.estado = estado;
    }
    public Guarderia(){
        
    }

    public int getId_hospedaje() {
        return id_hospedaje;
    }

    public void setId_hospedaje(int id_hospedaje) {
        this.id_hospedaje = id_hospedaje;
    }

    public String getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(String id_mascota) {
        this.id_mascota = id_mascota;
    }

    public String getId_celda() {
        return id_celda;
    }

    public void setId_celda(String id_celda) {
        this.id_celda = id_celda;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}