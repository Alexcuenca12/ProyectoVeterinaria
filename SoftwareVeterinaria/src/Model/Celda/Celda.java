/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Celda;

/**
 *
 * @author Usuario
 */
public class Celda {

    private String id_celda;
    private Double costo_celda;
    private String ubicacion_celda;
    private boolean habilitado;
    private boolean estado;
    public Celda() {
    }

    public Celda(String id_celda, Double costo_celda, String ubicacion_celda, boolean habilitado, boolean estado) {
        this.id_celda = id_celda;
        this.costo_celda = costo_celda;
        this.ubicacion_celda = ubicacion_celda;
        this.habilitado = habilitado;
        this.estado = estado;
    }
    
    
    
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    

    /**
     * @return the id_celda
     */
    public String getId_celda() {
        return id_celda;
    }

    /**
     * @param id_celda the id_celda to set
     */
    public void setId_celda(String id_celda) {
        this.id_celda = id_celda;
    }

    /**
     * @return the costo_celda
     */
    public Double getCosto_celda() {
        return costo_celda;
    }

    /**
     * @param costo_celda the costo_celda to set
     */
    public void setCosto_celda(Double costo_celda) {
        this.costo_celda = costo_celda;
    }

    /**
     * @return the ubicacion_celda
     */
    public String getUbicacion_celda() {
        return ubicacion_celda;
    }

    /**
     * @param ubicacion_celda the ubicacion_celda to set
     */
    public void setUbicacion_celda(String ubicacion_celda) {
        this.ubicacion_celda = ubicacion_celda;
    }

    /**
     * @return the habilitado
     */
    public boolean isHabilitado() {
        return habilitado;
    }

    /**
     * @param habilitado the habilitado to set
     */
    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

}
