
package Entidades;


public class Cliente {
    private int id;
    private String correo;
    private String pass;
    private String nombre;
    private String apellido;
    private int dni;
    private Paquete paquete;

    public Cliente() {
    }
    
    public Cliente(int id, String correo, String pass, String nombre, String apellido, int dni, Paquete paquete) {
        this.id = id;
        this.correo = correo;
        this.pass = pass;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.paquete = paquete;
    }

    public Cliente(String correo, String pass, String nombre, String apellido, int dni) {
        this.correo = correo;
        this.pass = pass;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public Cliente(int id, String correo, String pass, String nombre, String apellido, int dni) {
        this.id = id;
        this.correo = correo;
        this.pass = pass;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public int getId() {
        return id;
    }

    public String getCorreo() {
        return correo;
    }

    public String getPass() {
        return pass;
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
        this.id = id;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setPass(String pass) {
        this.pass = pass;
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
        return "Cliente{" + "id=" + id + ", correo=" + correo + ", pass=" + pass + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + '}';
    }
    
    
}
