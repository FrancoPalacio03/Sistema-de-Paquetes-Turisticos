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
<<<<<<< Updated upstream
    AvionNacional(100000),
    AvionInternacional(300000),
    Tren(50000),
    Autobus(70000);

=======
    AvionaCordoba(100000),
    TrenaCordoba(50000),
    AutobusaCordoba(70000),
    AvionaMendoza(150000),
    TrenaMendoza(75000),
    AutobusaMendoza(90000),
    AvionaSalta(120000),
    TrenaaSalta(65000),
    AutobusaSalta(85000),
    AvionaFloripa(200000),
    AutobusaFloripa(12000),
    AvionaSanLuis(50000),
    TrenaSanLuis(9000),
    AutobusaSanLuis(19000),
    AvionaMiami(430000);
>>>>>>> Stashed changes
    private final double importe;

    TipoTransporte(double importe) {
        this.importe = importe;
    }

    public double getImporte() {
        return importe;
    }
}
