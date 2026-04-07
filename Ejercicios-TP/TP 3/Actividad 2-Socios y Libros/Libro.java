package main;

public class Libro {

    private String isbn;
    private String titulo;
    private Socio socio; // quien lo tiene

    public Libro(String isbn, String titulo) {
        this.isbn = isbn;
        this.titulo = titulo;
    }

    public void prestar(Socio socio) {
        this.socio = socio;
    }

    public String getTitulo() {
        return titulo;
    }
}