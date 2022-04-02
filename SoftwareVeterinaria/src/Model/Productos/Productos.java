
package Model.Productos;

import java.awt.Image;
import java.io.FileInputStream;

public class Productos {
   //variables
    private String idProducto;
    private String idCategoria;
    private String nombreProducto;
    private double precio;
    private int stock;
    private String ruc_proveedor;
    private boolean habilitado;
    
    //Foto
    private Image foto;
    private FileInputStream img;
    private int largo;
    
    //Constructores vacio y full
    private int ventas;
    public Productos() {
    }

    public Productos(String idProducto, String idCategoria, String nombreProducto, double precio, int stock, String ruc_proveedor, boolean habilitado, Image foto, FileInputStream img, int largo) {
        this.idProducto = idProducto;
        this.idCategoria = idCategoria;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.stock = stock;
        this.ruc_proveedor = ruc_proveedor;
        this.habilitado = habilitado;
        this.foto = foto;
        this.img = img;
        this.largo = largo;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }
    
    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
    
    public String getRuc_proveedor() {    
        return ruc_proveedor;
    }

    //Getters y setters
    public void setRuc_proveedor(String ruc_proveedor) {
        this.ruc_proveedor = ruc_proveedor;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Image getFoto() {
        return foto;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }

    public FileInputStream getImg() {
        return img;
    }

    public void setImg(FileInputStream img) {
        this.img = img;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
    
    }
