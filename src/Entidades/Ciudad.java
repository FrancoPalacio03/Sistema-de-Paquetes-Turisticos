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
    private Paises pais;
    private Estados provincia;
    private boolean estado;
   
    private String urlImagen;
    
    public Ciudad() {
    }
    public Ciudad(int idCiudad, String nombre, Paises pais, boolean estado, Estados provincia, String urlImagen) {
        this.idCiudad = idCiudad;
        this.nombre = nombre;
        this.pais = pais;
        this.estado = estado;
        this.provincia = provincia;
        this.urlImagen= urlImagen;
    }

    public Ciudad(String nombre, Paises pais, boolean estado, Estados provincia, String urlImagen) {
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

    public Paises getPais() {
        return pais;
    }

    public String getUrlImagen() {
        return urlImagen;
    }
    
    public void setPais(Paises pais) {
        this.pais = pais;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Estados getProvincia() {
        return provincia;
    }

    public void setProvincia(Estados provincia) {
        this.provincia = provincia;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }
    
    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.idCiudad;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ciudad other = (Ciudad) obj;
        return this.idCiudad == other.idCiudad;
    }

    
    
}
