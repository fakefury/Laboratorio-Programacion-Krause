package main;

public class Gerentes extends Empleados {

    public int bonoResponsabilidad;

    public Gerentes(String legajo, int sueldoBase, int bonoResponsabilidad) {
        super(legajo, sueldoBase);
        this.bonoResponsabilidad = bonoResponsabilidad;
    }

    public void mostrar() {
        System.out.println("Gerente -> Legajo: " + legajo + 
                           " - Sueldo: " + sueldoBase + 
                           " - Bono: " + bonoResponsabilidad);
    }
}