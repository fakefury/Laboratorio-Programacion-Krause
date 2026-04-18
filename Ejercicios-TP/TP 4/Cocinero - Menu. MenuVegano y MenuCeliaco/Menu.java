package main;

public class Menu {

    public String diaSemana;
    public int caloriasTotales;

    public Menu(String diaSemana, int caloriasTotales) {
        this.diaSemana = diaSemana;
        this.caloriasTotales = caloriasTotales;
    }

    public void mostrarMenu() {
        System.out.println("Día: " + diaSemana + " - Calorías: " + caloriasTotales);
    }
}