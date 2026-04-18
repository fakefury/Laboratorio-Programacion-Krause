package main;

public class MenuVegano extends Menu {

    public int proteinaVegetal;

    public MenuVegano(String diaSemana, int caloriasTotales, int proteinaVegetal) {
        super(diaSemana, caloriasTotales);
        this.proteinaVegetal = proteinaVegetal;
    }

    public void mostrarMenu() {
        System.out.println("Menu Vegano -> Día: " + diaSemana +
                           " - Calorías: " + caloriasTotales +
                           " - Proteína: " + proteinaVegetal);
    }
}