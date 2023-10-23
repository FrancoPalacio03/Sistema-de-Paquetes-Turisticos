/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Entidades;

/**
 *
 * @author franc
 */
public enum TipoTransporte {
    Avion(100000),
    Tren(50000),
    Autobus(70000);

    private final double importe;

    TipoTransporte(double importe) {
        this.importe = importe;
    }

    public double getImporte() {
        return importe;
    }
}
