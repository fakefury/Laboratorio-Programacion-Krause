package main;

public class Main {

    public static void main(String[] args) {

        Libro libro1 = new Libro(1, 5000, "Cortázar");
        Libro libro2 = new Libro(2, 6500, "Borges");

        ArticuloPapeleria art1 = new ArticuloPapeleria(3, 1500, "Plastico");
        ArticuloPapeleria art2 = new ArticuloPapeleria(4, 2000, "Madera");

        libro1.calcularPrecioFinal();
        libro2.calcularPrecioFinal();

        art1.calcularPrecioFinal();
        art2.calcularPrecioFinal();
    }
}





