package main;

import java.util.ArrayList;

public class Socio {

    private String nombre;
    private int nroSocio;
    private ArrayList<Libro> libros;

    public Socio(String nombre, int nroSocio) {
        this.nombre = nombre;
        this.nroSocio = nroSocio;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        if (libros.size() < 3) {
            libros.add(libro);
            libro.prestar(this);
        } else {
            System.out.println("No puede tener más de 3 libros");
        }
    }

    public void mostrarLibros() {
        System.out.println("Libros de " + nombre + ":");
        for (Libro l : libros) {
            System.out.println("- " + l.getTitulo());
        }
    }
}