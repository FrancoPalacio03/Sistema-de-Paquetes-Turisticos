/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author diakz
 */
public class Estados {
    private int id;
    private int ubicacionpaisid;
    private String estadonombre;

    public Estados() {
    }

    public Estados(int ubicacionpaisid, String estadonombre) {
        this.ubicacionpaisid = ubicacionpaisid;
        this.estadonombre = estadonombre;
    }

    public Estados(int id, int ubicacionpaisid, String estadonombre) {
        this.id = id;
        this.ubicacionpaisid = ubicacionpaisid;
        this.estadonombre = estadonombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUbicacionpaisid() {
        return ubicacionpaisid;
    }

    public void setUbicacionpaisid(int ubicacionpaisid) {
        this.ubicacionpaisid = ubicacionpaisid;
    }

    public String getEstadonombre() {
        return estadonombre;
    }

    public void setEstadonombre(String estadonombre) {
        this.estadonombre = estadonombre;
    }

    @Override
    public String toString() {
        return "Estados{" + "id=" + id + ", ubicacionpaisid=" + ubicacionpaisid + ", estadonombre=" + estadonombre + '}';
    }
    
}
