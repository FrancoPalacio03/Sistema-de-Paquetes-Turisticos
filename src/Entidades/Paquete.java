package Entidades;

public class Paquete {
    private int idPaquete;
    private Ciudad origen;
    private Ciudad destino;
    private Alojamiento alojamiento;
    private Pasaje pasaje;
    private Vendedor vendedor;
    
    public Paquete() {
    }

    public Paquete(int idPaquete, Ciudad origen, Ciudad destino, Alojamiento alojamiento, Pasaje pasaje, Vendedor vendedor) {
        this.idPaquete = idPaquete;
        this.origen = origen;
        this.destino = destino;
        this.alojamiento = alojamiento;
        this.pasaje = pasaje;
        this.vendedor = vendedor;
    }

    public Paquete(Ciudad origen, Ciudad destino, Alojamiento alojamiento, Pasaje pasaje, Vendedor vendedor) {
        this.origen = origen;
        this.destino = destino;
        this.alojamiento = alojamiento;
        this.pasaje = pasaje;
        this.vendedor = vendedor;
    }

    public int getIdPaquete() {
        return idPaquete;
    }

    public Ciudad getOrigen() {
        return origen;
    }

    public Ciudad getDestino() {
        return destino;
    }

    public Alojamiento getAlojamiento() {
        return alojamiento;
    }

    public Pasaje getPasaje() {
        return pasaje;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setIdPaquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }

    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }

    public void setDestino(Ciudad destino) {
        this.destino = destino;
    }

    public void setAlojamiento(Alojamiento alojamiento) {
        this.alojamiento = alojamiento;
    }

    public void setPasaje(Pasaje pasaje) {
        this.pasaje = pasaje;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    @Override
    public String toString() {
        return this.idPaquete +" "+ this.destino.toString();
    }
    
    
}
