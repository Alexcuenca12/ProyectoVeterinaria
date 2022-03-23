
package Model.facturación;

/**
 *
 * @author Usuario
 */
public class DetalleServicio {
    private String codigo_detalle;
    private String codigo_servicio;
    private int codigo_factura;
    private double cantidad;
    private double total;
    private boolean habilitado;

    public DetalleServicio() {
    }

    public DetalleServicio(String codigo_detalle, String codigo_servicio, int codigo_factura, double cantidad, double total, boolean habilitado) {
        this.codigo_detalle = codigo_detalle;
        this.codigo_servicio = codigo_servicio;
        this.codigo_factura = codigo_factura;
        this.cantidad = cantidad;
        this.total = total;
        this.habilitado = habilitado;
    }
    
    //GETTERS AND SETTERS
    public String getCodigo_detalle() {
        return codigo_detalle;
    }

    public void setCodigo_detalle(String codigo_detalle) {
        this.codigo_detalle = codigo_detalle;
    }

    public String getCodigo_servicio() {
        return codigo_servicio;
    }

    public void setCodigo_servicio(String codigo_servicio) {
        this.codigo_servicio = codigo_servicio;
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
