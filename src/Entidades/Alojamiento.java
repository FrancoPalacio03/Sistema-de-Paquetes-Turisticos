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
    private String nombre;
    private int idAlojamiento;
    private LocalDate ingreso;
    private LocalDate salida;
    private boolean estado;
    private String servicio;
    private double importeDiario;
    private Ciudad CiudadDest;

    public Alojamiento() {
    }

    public Alojamiento(String nombre, boolean estado, String servicio, double importeDiario, Ciudad CiudadDest) {
        this.estado = estado;
        this.servicio = servicio;
        this.importeDiario = importeDiario;
        this.CiudadDest = CiudadDest;
        this.nombre=nombre;
    }
    
    public Alojamiento(int id,String nombre, boolean estado, String servicio, double importeDiario, Ciudad CiudadDest) {
        this.estado = estado;
        this.servicio = servicio;
        this.importeDiario = importeDiario;
        this.CiudadDest = CiudadDest;
        this.nombre=nombre;
        this.idAlojamiento=id;
    }
    
    public Alojamiento(int idAlojamiento,String nombre, LocalDate ingreso, LocalDate salida, boolean estado, String servicio, double importeDiario, Ciudad CiudadDest) {
        this.idAlojamiento= idAlojamiento;
        this.ingreso = ingreso;
        this.salida = salida;
        this.estado = estado;
        this.servicio = servicio;
        this.importeDiario = importeDiario;
        this.CiudadDest = CiudadDest;
        this.nombre=nombre;
    }

    public Alojamiento(String nombre,LocalDate ingreso, LocalDate salida, boolean estado, String servicio, double importeDiario, Ciudad CiudadDest) {
        this.ingreso = ingreso;
        this.salida = salida;
        this.estado = estado;
        this.servicio = servicio;
        this.importeDiario = importeDiario;
        this.CiudadDest = CiudadDest;
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public Ciudad getCiudadDest() {
        return CiudadDest;
    }

    public void setCiudadDest(Ciudad CiudadDest) {
        this.CiudadDest = CiudadDest;
    }


    @Override
    public String toString() {
        return this.nombre;
    }
    
    
            
    
}
