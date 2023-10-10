/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author diakz
 */
public class Paises {
    
    private int id;
    private String paisnombre;

    public Paises() {
    }

    public Paises(int id, String paisnombre) {
        this.id = id;
        this.paisnombre = paisnombre;
    }

    public Paises(String paisnombre) {
        this.paisnombre = paisnombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPaisnombre() {
        return paisnombre;
    }

    public void setPaisnombre(String paisnombre) {
        this.paisnombre = paisnombre;
    }

    @Override
    public String toString() {
        return paisnombre;
    }
    
}
