package main;

public class Canciones {

    private int duracion;
    private String titulo;

    public Canciones(int duracion, String titulo) {
        this.duracion = duracion;
        this.titulo = titulo;
    }

    public void añadirCancion() {
        System.out.println("Añadiendo canción: " + titulo);
    }

    public void quitarCancion() {
        System.out.println("Quitando canción: " + titulo);
    }

    public String getTitulo() {
        return titulo;
    }
}