package Entidades;

public class Vendedor {

    private int id;
    private String correo;
    private String pass;
    private String nombre;
    private String apellido;
    private int dni;
    private int cont;
    private boolean estado;

    public Vendedor() {
        this.cont = 0;
    }

    public Vendedor(int id, String correo, String pass, String nombre, String apellido, int dni, int cont, boolean estado) {
        this.id = id;
        this.correo = correo;
        this.pass = pass;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cont = cont;
        this.estado = estado;
    }

    public Vendedor(String correo, String pass, String nombre, String apellido, int dni, boolean estado) {
        this.correo = correo;
        this.pass = pass;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cont = 0;
        this.estado = estado;
    }

    public Vendedor(int id,String correo, String nombre, String apellido, int dni, boolean estado, int cont) {
        this.id = id;
        this.correo = correo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cont = 0;
        this.estado = estado;
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

    public int getCont() {
        return cont;
    }

    public boolean getEstado() {
        return this.estado;
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

    public void setCont(int cont) {
        this.cont = cont;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return nombre+" "+" "+apellido;
    }

}
