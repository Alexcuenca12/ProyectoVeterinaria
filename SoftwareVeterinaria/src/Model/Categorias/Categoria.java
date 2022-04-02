/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Categorias;

/**
 *
 * @author 
 */
public class Categoria {
    //Variables
   private String id_Categoria;
   private String nombre;
   private boolean habilitado;

    //Constructor vacio y full
    public Categoria() {
    }

    public Categoria(String id_Categoria, String nombre, boolean habilitado) {
        this.id_Categoria = id_Categoria;
        this.nombre = nombre;
        this.habilitado = habilitado;
    }
    
    public boolean isHabilitado() {
        return habilitado;    
    }

    //Getters and setters
    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public String getId_Categoria() {
        return id_Categoria;
    }

    public void setId_Categoria(String id_Categoria) {
        this.id_Categoria = id_Categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
   
   }
