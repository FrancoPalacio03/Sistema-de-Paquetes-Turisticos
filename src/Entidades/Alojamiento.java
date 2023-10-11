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
    private int idAlojamiento;
    private LocalDate ingreso;
    private LocalDate salida;
    private boolean estado;
    private String servicio;
    private double importeDiario;
    private String CiudadDest;

    public Alojamiento() {
    }

    public Alojamiento(int idAlojamiento, LocalDate ingreso, LocalDate salida, boolean estado, String servicio, double importeDiario, String CiudadDest) {
        this.idAlojamiento= idAlojamiento;
        this.ingreso = ingreso;
        this.salida = salida;
        this.estado = estado;
        this.servicio = servicio;
        this.importeDiario = importeDiario;
        this.CiudadDest = CiudadDest;
    }

    public Alojamiento(LocalDate ingreso, LocalDate salida, boolean estado, String servicio, double importeDiario, String CiudadDest) {
        this.ingreso = ingreso;
        this.salida = salida;
        this.estado = estado;
        this.servicio = servicio;
        this.importeDiario = importeDiario;
        this.CiudadDest = CiudadDest;
    }

    public int getIdAlojamiento() {
        return idAlojamiento;
    }

    public void setIdAlojamiento(int idAlojamiento) {
        this.idAlojamiento = idAlojamiento;
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

    public double getImporteDiario() {
        return importeDiario;
    }

    public void setImporteDiario(double importeDiario) {
        this.importeDiario = importeDiario;
    }

    public String getCiudadDest() {
        return CiudadDest;
    }

    public void setCiudadDest(String CiudadDest) {
        this.CiudadDest = CiudadDest;
    }

 

    @Override
    public String toString() {
        return "Alojamiento{" + "idPaquete=" + idAlojamiento + ", ingreso=" + ingreso + ", salida=" + salida + ", estado=" + estado + ", servicio=" + servicio + ", imorteDiario=" + importeDiario + ", CiudadDest=" + CiudadDest + '}';
    }
    
    
            
    
}
