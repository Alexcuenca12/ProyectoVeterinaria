
package Model.facturación;

import java.sql.Date;



/**
 *
 * @author Usuario
 */
public class Factura {
    
    private int codigo_factura;
    private String codigo_medico;
    private String codigo_cliente;
    private Date  fecha;
    private boolean habilitado;
    
    //Constructores

    public Factura() {
    }

    public Factura(int codigo_factura, String codigo_medico, String codigo_cliente, Date fecha, boolean habilitado) {
        this.codigo_factura = codigo_factura;
        this.codigo_medico = codigo_medico;
        this.codigo_cliente = codigo_cliente;
        this.fecha = fecha;
        this.habilitado = habilitado;
    }
    
    //Getters and setters

    public int getCodigo_factura() {
        return codigo_factura;
    }

    public void setCodigo_factura(int codigo_factura) {
        this.codigo_factura = codigo_factura;
    }

    public String getCodigo_medico() {
        return codigo_medico;
    }

    public void setCodigo_medico(String codigo_medico) {
        this.codigo_medico = codigo_medico;
    }

    public String getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(String codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
    
}
