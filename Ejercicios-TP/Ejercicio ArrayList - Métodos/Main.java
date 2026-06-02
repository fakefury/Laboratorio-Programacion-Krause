package main;

public class Main {

    public static void main(String[] args) {

        Curso curso = new Curso("5°2°");

        Estudiante est1 = new Estudiante("Lucas Pérez", "45111222", 8.5);
        Estudiante est2 = new Estudiante("María Gómez", "44222333", 7.2);
        Estudiante est3 = new Estudiante("Sofía López", "43999888", 9.1);

        curso.inscribir(est1);
        curso.inscribir(est2);
        curso.inscribir(est3);

        System.out.println("Cantidad de alumnos: " + curso.cantidadAlumnos());

        curso.darDeBaja(1);

        System.out.println("\nAlumnos restantes:");
        curso.listarAlumnos();
    }
}



