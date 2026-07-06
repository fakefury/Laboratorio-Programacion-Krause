package escuela;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Escuela escuela = new Escuela();
        
        Tutor tutorCarlos = new Tutor("Marta Perez");
        
        System.out.println("--- 1. Creando Alumnos ---");
        try {
            Alumno a1 = new Alumno("12345678", "Carlos Torres", "5to A", 10, "Regular", tutorCarlos);
            escuela.agregarAlumno(a1);
            
            Alumno a2 = new Alumno("87654321", "Lucia Gómez", "3ro B", 18, "Regular", null);
            escuela.agregarAlumno(a2);
            
            Alumno aError = new Alumno("11111111", "Error", "1ro A", -5, "Regular", null);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear alumno: " + e.getMessage());
        }

        System.out.println("\n--- 2. Consultar alumno por posición ---");
        try {
            Alumno a = escuela.getAlumno(10);
            System.out.println(a);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: La posición ingresada no corresponde a ningún alumno registrado.");
        } finally {
            System.out.println("Consulta en base de datos finalizada.");
        }

        System.out.println("\n--- 3. Registrar inasistencias ---");
        System.out.print("Ingrese la cantidad de nuevas inasistencias para Carlos: ");
        String inputFaltas = scanner.nextLine();
        try {
            int faltas = Integer.parseInt(inputFaltas);
            escuela.getAlumno(0).registrarInasistencias(faltas);
            System.out.println("Inasistencias actualizadas.");
        } catch (NumberFormatException e) {
            System.out.println("Error: El valor ingresado para inasistencias debe ser un número entero.");
        }

        System.out.println("\n--- 4. Consultar datos del Tutor ---");
        try {
            Alumno lucia = escuela.getAlumno(1);
            System.out.println("Tutor de Lucía: " + lucia.getTutor().getNombreApellido());
        } catch (NullPointerException e) {
            System.out.println("Error: Este alumno no tiene un tutor asignado (Referencia Nula).");
        }

        System.out.println("\n--- 5. Operación Académica Especial ---");
        try {
            Alumno lucia = escuela.getAlumno(1);
            lucia.operacionAcademicaEspecial(escuela.LIMITE_FALTAS);
        } catch (AlumnoLibreException e) {
            System.out.println("Error personalizado: " + e.getMessage());
        } finally {
            System.out.println("Proceso de validación académica terminado.");
        }
        
        scanner.close();
    }
}
