package main;

public class Libro extends Producto {

    private String autor;

    public Libro(int codigo, int precio, String autor) {
        super(codigo, precio);
        this.autor = autor;
    }

    public void calcularPrecioFinal() {
        System.out.println("Libro -> Codigo: " + codigo + 
                           " - Precio final: " + getPrecio() + 
                           " - Autor: " + autor);
    }
}