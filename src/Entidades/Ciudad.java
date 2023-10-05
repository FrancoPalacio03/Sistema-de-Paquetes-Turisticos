/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Beatriz
 */
public class Ciudad {
    
    private int idCiudad;
    private String nombre;
    private String pais;
    private boolean estado;
    private String provincia;
    private String urlImagen;
    
    public Ciudad() {
    }
    public Ciudad(int idCiudad, String nombre, String pais, boolean estado, String provincia, String urlImagen) {
        this.idCiudad = idCiudad;
        this.nombre = nombre;
        this.pais = pais;
        this.estado = estado;
        this.provincia = provincia;
        this.urlImagen= urlImagen;
    }

    public Ciudad(String nombre, String pais, boolean estado, String provincia, String urlImagen) {
        this.nombre = nombre;
        this.pais = pais;
        this.estado = estado;
        this.provincia = provincia;
        this.urlImagen= urlImagen;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public String getUrlImagen() {
        return urlImagen;
    }
    
    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }
    
    @Override
    public String toString() {
        return "Ciudad{" + "idCiudad=" + idCiudad + ", nombre=" + nombre + ", pais=" + pais + ", estado=" + estado + ", provincia=" + provincia + '}';
    }

    
    
}
