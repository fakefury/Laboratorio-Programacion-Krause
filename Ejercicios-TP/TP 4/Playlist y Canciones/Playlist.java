package main;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private String nombre;
    private String genero;

    private List<Canciones> canciones;

    public Playlist(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
        this.canciones = new ArrayList<>();
    }

    public void crearPlaylist() {
        System.out.println("Creando playlist: " + nombre);
    }

    public void eliminarPlaylist() {
        System.out.println("Eliminando playlist: " + nombre);
    }

    public void añadirCancion(Canciones cancion) {
        canciones.add(cancion);
        System.out.println("Se añadió: " + cancion.getTitulo());
    }

    public void quitarCancion(Canciones cancion) {
        canciones.remove(cancion);
        System.out.println("Se quitó: " + cancion.getTitulo());
    }
}