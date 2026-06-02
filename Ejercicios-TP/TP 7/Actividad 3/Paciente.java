package hospital;

public class Paciente {

    private String nombre;
    private String dni;
    private int edad;
    private double peso;
    private boolean estaHospitalizado;

    public Paciente(String nombre, String dni,
                    int edad, double peso,
                    boolean estaHospitalizado) {

        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.peso = peso;
        this.estaHospitalizado = estaHospitalizado;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isEstaHospitalizado() {
        return estaHospitalizado;
    }

    public void mostrarPaciente() {

        System.out.println("Nombre: " + nombre +
                " | DNI: " + dni +
                " | Edad: " + edad +
                " | Peso: " + peso +
                " | Hospitalizado: " + estaHospitalizado);
    }
}
