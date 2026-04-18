package main;

public class Trenes extends Transporte {
    public int cantidadVagones;

    public Trenes(int idInterno, int capacidadPasajeros, int cantidadVagones) {
        super(idInterno, capacidadPasajeros);
        this.cantidadVagones = cantidadVagones;
    }
}
