package main;

import java.util.ArrayList;
import java.util.List;

public class Cocinero {

    private String nombre;
    private List<Menu> menus;

    public Cocinero(String nombre) {
        this.nombre = nombre;
        this.menus = new ArrayList<>();
    }

    public void añadirMenu(Menu menu) {
        menus.add(menu);
        System.out.println(nombre + " supervisa menú del día: " + menu.diaSemana);
    }
}