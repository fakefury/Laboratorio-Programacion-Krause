package main;

public class Main {

    public static void main(String[] args) {

        Socio s1 = new Socio("Alex", 1);
        Socio s2 = new Socio("Alan", 2);
        Socio s3 = new Socio("Alice", 3);

        Libro l1 = new Libro("111", "Java");
        Libro l2 = new Libro("222", "POO");
        Libro l3 = new Libro("333", "Bases de Datos");
        Libro l4 = new Libro("444", "Redes");
        Libro l5 = new Libro("555", "Algoritmos");

        s1.agregarLibro(l1);
        s1.agregarLibro(l2);
        s2.agregarLibro(l3);
        s3.agregarLibro(l4);
        s3.agregarLibro(l5);

        s1.mostrarLibros();
        s2.mostrarLibros();
        s3.mostrarLibros();
    }
}






