package main;

public class Empleados {

    protected String legajo;
    protected int sueldoBase;

    public Empleados(String legajo, int sueldoBase) {
        this.legajo = legajo;
        this.sueldoBase = sueldoBase;
    }

    public void mostrar() {
        System.out.println("Legajo: " + legajo + " - Sueldo Base: " + sueldoBase);
    }
}