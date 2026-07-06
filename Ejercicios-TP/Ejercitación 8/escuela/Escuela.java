package escuela;

import java.util.ArrayList;

public class Escuela {
    private ArrayList<Alumno> alumnos;
    public final int LIMITE_FALTAS = 15;

    public Escuela() {
        alumnos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno a) {
        alumnos.add(a);
    }

    public Alumno getAlumno(int index) {
        return alumnos.get(index);
    }
}
