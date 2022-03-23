
package Model.facturación;

/**
 *
 * @author Usuario
 */
public class DetalleProducto {
  
    private String codigo_detalle;
    private String codigo_producto;
    private int codigo_factura;
    private double cantidad;
    private double total;
    private boolean habilitado;

    public DetalleProducto() {
    }

    public DetalleProducto(String codigo_detalle, String codigo_producto, int codigo_factura, double cantidad, double total, boolean habilitado) {
        this.codigo_detalle = codigo_detalle;
        this.codigo_producto = codigo_producto;
        this.codigo_factura = codigo_factura;
        this.cantidad = cantidad;
        this.total = total;
        this.habilitado = habilitado;
    }
    
    //Getters and setters

    public String getCodigo_detalle() {
        return codigo_detalle;
    }

    public void setCodigo_detalle(String codigo_detalle) {
        this.codigo_detalle = codigo_detalle;
    }

    public String getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(String codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public int getCodigo_factura() {
        return codigo_factura;
    }

    public void setCodigo_factura(int codigo_factura) {
        this.codigo_factura = codigo_factura;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
    
}
