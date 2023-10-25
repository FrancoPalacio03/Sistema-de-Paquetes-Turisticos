
package Entidades;


public class Cliente {
    private int idCliente;
    private String correo;
    private String nombre;
    private String apellido;
    private int dni;
    private Paquete paquete;

    public Cliente() {
    }
    
    public Cliente(int idCliente, String correo, String nombre, String apellido, int dni, Paquete paquete) {
        this.idCliente = idCliente;
        this.correo = correo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.paquete = paquete;
    }

    public Cliente(String correo, String nombre, String apellido, int dni, Paquete paquete) {
        this.correo = correo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.paquete = paquete;
    }

    public Cliente(int idCliente, String correo, String nombre, String apellido, int dni) {
        this.idCliente = idCliente;
        this.correo = correo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public Cliente(String correo, String nombre, String apellido, int dni) {
        this.correo = correo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public int getId() {
        return idCliente;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void setId(int id) {
        this.idCliente = id;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    @Override
    public String toString() {
        return nombre+" "+apellido;
    }
    
    
}
