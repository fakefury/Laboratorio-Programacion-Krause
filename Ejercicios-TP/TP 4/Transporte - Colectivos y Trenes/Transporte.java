package main;

public class Transporte {
    private int idInterno;
    private int capacidadPasajeros;

    public Transporte(int idInterno, int capacidadPasajeros) {
        this.idInterno = idInterno;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public void arrancar() {
        System.out.println("Unidad " + idInterno + " arrancando...");
    }

    public void frenar() {
        System.out.println("Unidad " + idInterno + " frenando.");
    }
}