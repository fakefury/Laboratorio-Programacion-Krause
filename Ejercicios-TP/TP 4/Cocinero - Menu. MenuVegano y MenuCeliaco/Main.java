package main;

public class Main {

    public static void main(String[] args) {

        MenuVegano veg1 = new MenuVegano("Lunes", 1200, 50);
        MenuVegano veg2 = new MenuVegano("Martes", 1300, 60);

        MenuCeliaco cel1 = new MenuCeliaco("Miércoles", 1400, true);
        MenuCeliaco cel2 = new MenuCeliaco("Jueves", 1500, true);

        Cocinero cocinero1 = new Cocinero("Juan");
        Cocinero cocinero2 = new Cocinero("Pedro");

        cocinero1.añadirMenu();
        cocinero1.añadirMenu();

        cocinero2.añadirMenu();
        cocinero2.añadirMenu();

        veg1.mostrarMenu();
        veg2.mostrarMenu();
        cel1.mostrarMenu();
        cel2.mostrarMenu();
    }
}



