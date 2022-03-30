
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
    
    //Foto
    private Image foto;
    private FileInputStream img;
    private int largo;
    
    //Constructores vacio y full

    public Productos() {
    }

    public Productos(String idProducto, String idCategoria, String nombreProducto, double precio, int stock, String ruc_proveedor, Image foto, FileInputStream img, int largo) {
        this.idProducto = idProducto;
        this.idCategoria = idCategoria;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.stock = stock;
        this.ruc_proveedor = ruc_proveedor;
        this.foto = foto;
        this.img = img;
        this.largo = largo;
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
