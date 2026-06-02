package biblioteca;

import java.util.ArrayList;

public class biblioteca {

    private ArrayList<libros> libros;

    public biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(libros libro) {
        libros.add(libro);
    }

    public void listarLibros() {
        for (libros libro : libros) {
            libro.mostrarLibro();
        }
    }

    public int cantidadLibros() {
        return libros.size();
    }
}