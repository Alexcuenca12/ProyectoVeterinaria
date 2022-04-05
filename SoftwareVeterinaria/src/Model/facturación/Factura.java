package Model.facturación;

import java.sql.Date;

/**
 *
 * @author Usuario
 */
public class Factura {

    private String codigo_factura;
    private String codigo_medico;
    private String codigo_cliente;
    private Date fecha;
    private double total_factura;
    private boolean habilitado;

    //Variables para tabla
    private String nomCliente;
    private String nomVeterinario;
    
    //Constructores
    public Factura() {
    }

    public Factura(String codigo_factura, String codigo_medico, String codigo_cliente, Date fecha, double total_factura, boolean habilitado) {
        this.codigo_factura = codigo_factura;
        this.codigo_medico = codigo_medico;
        this.codigo_cliente = codigo_cliente;
        this.fecha = fecha;
        this.total_factura = total_factura;
        this.habilitado = habilitado;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public String getNomVeterinario() {
        return nomVeterinario;
    }

    public void setNomVeterinario(String nomVeterinario) {
        this.nomVeterinario = nomVeterinario;
    }
    
    public double getTotal_factura() {
        return total_factura;
    }

    public void setTotal_factura(double total_factura) {
        this.total_factura = total_factura;
    }

    //Getters and setters
    public String getCodigo_factura() {
        return codigo_factura;
    }

    public void setCodigo_factura(String codigo_factura) {
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
