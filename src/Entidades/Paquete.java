
package Entidades;


public class Paquete {
    private int idPaquete;
    private Cuidad origen;
    private Cuidad destino;
    private Alojamiento alojamiento;
    private Pasaje pasaje;

    public Paquete(int idPaquete, Cuidad origen, Cuidad destino, Alojamiento alojamiento, Pasaje pasaje) {
        this.idPaquete = idPaquete;
        this.origen = origen;
        this.destino = destino;
        this.alojamiento = alojamiento;
        this.pasaje = pasaje;
    }

    public Paquete(Cuidad origen, Cuidad destino, Alojamiento alojamiento, Pasaje pasaje) {
        this.origen = origen;
        this.destino = destino;
        this.alojamiento = alojamiento;
        this.pasaje = pasaje;
    }

    public int getIdPaquete() {
        return idPaquete;
    }

    public Cuidad getOrigen() {
        return origen;
    }

    public Cuidad getDestino() {
        return destino;
    }

    public Alojamiento getAlojamiento() {
        return alojamiento;
    }

    public Pasaje getPasaje() {
        return pasaje;
    }

    public void setIdPaquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }

    public void setOrigen(Cuidad origen) {
        this.origen = origen;
    }

    public void setDestino(Cuidad destino) {
        this.destino = destino;
    }

    public void setAlojamiento(Alojamiento alojamiento) {
        this.alojamiento = alojamiento;
    }

    public void setPasaje(Pasaje pasaje) {
        this.pasaje = pasaje;
    }
    
    
}
