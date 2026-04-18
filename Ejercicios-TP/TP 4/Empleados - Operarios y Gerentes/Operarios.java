package main;

public class Operarios extends Empleados {

    public int valorHoraExtra;

    public Operarios(String legajo, int sueldoBase, int valorHoraExtra) {
        super(legajo, sueldoBase);
        this.valorHoraExtra = valorHoraExtra;
    }

    public void mostrar() {
        System.out.println("Operario -> Legajo: " + legajo + 
                           " - Sueldo: " + sueldoBase + 
                           " - Hora Extra: " + valorHoraExtra);
    }
}