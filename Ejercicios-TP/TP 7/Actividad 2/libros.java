package biblioteca;

public class libros {

    private String titulo;
    private String isbn;
    private int cantidadPaginas;

    public libros(String titulo, String isbn, int cantidadPaginas) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.cantidadPaginas = cantidadPaginas;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void mostrarLibro() {
        System.out.println("Título: " + titulo +
                           " | ISBN: " + isbn +
                           " | Páginas: " + cantidadPaginas);
    }
}
