package main;

public class Colectivos extends Transporte {
    public int numeroLinea;

    public Colectivos(int idInterno, int capacidadPasajeros, int numeroLinea) {
        super(idInterno, capacidadPasajeros);
        this.numeroLinea = numeroLinea;
    }
}
