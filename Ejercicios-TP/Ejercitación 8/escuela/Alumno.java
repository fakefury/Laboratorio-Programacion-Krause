package escuela;

public class Alumno {
    private String dni;
    private String nombreApellido;
    private String curso;
    private int inasistencias;
    private String estadoAcademico;
    private Tutor tutor;

    public Alumno(String dni, String nombreApellido, String curso, int inasistencias, String estadoAcademico, Tutor tutor) {
        this.dni = dni;
        this.nombreApellido = nombreApellido;
        this.curso = curso;
        this.inasistencias = validarInasistencias(inasistencias);
        this.estadoAcademico = estadoAcademico;
        this.tutor = tutor;
    }

    private int validarInasistencias(int cant) {
        if (cant < 0) {
            throw new IllegalArgumentException("La cantidad de inasistencias no puede ser negativa.");
        }
        return cant;
    }

    public void registrarInasistencias(int nuevasInasistencias) {
        if (nuevasInasistencias < 0) {
            throw new IllegalArgumentException("No se pueden registrar inasistencias negativas.");
        }
        this.inasistencias += nuevasInasistencias;
    }
    
    public Tutor getTutor() {
        return tutor;
    }

    public void operacionAcademicaEspecial(int limiteInasistencias) throws AlumnoLibreException {
        if (this.inasistencias > limiteInasistencias) {
            this.estadoAcademico = "Libre";
            throw new AlumnoLibreException("Operación denegada. El alumno " + nombreApellido + " superó el límite y está en estado LIBRE.");
        }
        System.out.println("Operación académica realizada con éxito para: " + nombreApellido);
    }

    @Override
    public String toString() {
        return "Alumno: " + nombreApellido + " | DNI: " + dni + " | Faltas: " + inasistencias;
    }
}
