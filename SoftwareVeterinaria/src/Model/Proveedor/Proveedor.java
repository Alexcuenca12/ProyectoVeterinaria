package Model.Proveedor;

public class Proveedor {

    private String ruc_proveedor;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direcccion;
    private String descripcion;
    private String empresa;
    private String correo;
    private boolean habilitado;

    public Proveedor() {
    }

    public Proveedor(String ruc_proveedor, String nombre, String apellido, String telefono, String direcccion, String descripcion, String empresa, String correo, boolean habilitado) {
        this.ruc_proveedor = ruc_proveedor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direcccion = direcccion;
        this.descripcion = descripcion;
        this.empresa = empresa;
        this.correo = correo;
        this.habilitado = habilitado;
    }

    public String getRuc_proveedor() {
        return ruc_proveedor;
    }

    public void setRuc_proveedor(String ruc_proveedor) {
        this.ruc_proveedor = ruc_proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDirecccion() {
        return direcccion;
    }

    public void setDirecccion(String direcccion) {
        this.direcccion = direcccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
    
    
    
}
