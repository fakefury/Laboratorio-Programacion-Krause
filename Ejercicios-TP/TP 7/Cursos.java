package main;

import java.util.ArrayList;

public class Curso {

    private String nombre;
    private ArrayList<Estudiante> alumnos;

    public Curso(String nombre) {
        this.nombre = nombre;
        this.alumnos = new ArrayList<>();
    }

    public void inscribir(Estudiante e) {
        alumnos.add(e);
        System.out.println(e.getNombre() + " fue inscripto al curso " + nombre);
    }

    public void darDeBaja(int indice) {
        alumnos.remove(indice);
        System.out.println("Alumno eliminado del curso.");
    }

    public void listarAlumnos() {
        for (Estudiante e : alumnos) {
            e.mostrarFicha();
        }
    }

    public int cantidadAlumnos() {
        return alumnos.size();
    }
}