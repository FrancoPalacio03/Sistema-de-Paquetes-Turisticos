/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;/**
 *
 * @author Yo
 */
public class Alojamiento {
    private int idPaquete;
    LocalDate ingreso;
    LocalDate salida;
    boolean estado;
    String servicio;
    double imorteDiario;
    Ciudad CiudadDest;

    public Alojamiento() {
    }

    public Alojamiento(int idPaquete, LocalDate ingreso, LocalDate salida, boolean estado, String servicio, double imorteDiario, Ciudad CiudadDest) {
        this.idPaquete = idPaquete;
        this.ingreso = ingreso;
        this.salida = salida;
        this.estado = estado;
        this.servicio = servicio;
        this.imorteDiario = imorteDiario;
        this.CiudadDest = CiudadDest;
    }

    public Alojamiento(LocalDate ingreso, LocalDate salida, boolean estado, String servicio, double imorteDiario, Ciudad CiudadDest) {
        this.ingreso = ingreso;
        this.salida = salida;
        this.estado = estado;
        this.servicio = servicio;
        this.imorteDiario = imorteDiario;
        this.CiudadDest = CiudadDest;
    }

    public int getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }

    public LocalDate getIngreso() {
        return ingreso;
    }

    public void setIngreso(LocalDate ingreso) {
        this.ingreso = ingreso;
    }

    public LocalDate getSalida() {
        return salida;
    }

    public void setSalida(LocalDate salida) {
        this.salida = salida;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public double getImorteDiario() {
        return imorteDiario;
    }

    public void setImorteDiario(double imorteDiario) {
        this.imorteDiario = imorteDiario;
    }

    public Ciudad getCiudadDest() {
        return CiudadDest;
    }

    public void setCiudadDest(Ciudad CiudadDest) {
        this.CiudadDest = CiudadDest;
    }

    @Override
    public String toString() {
        return "Alojamiento{" + "idPaquete=" + idPaquete + ", ingreso=" + ingreso + ", salida=" + salida + ", estado=" + estado + ", servicio=" + servicio + ", imorteDiario=" + imorteDiario + ", CiudadDest=" + CiudadDest + '}';
    }
    
    
            
    
}
