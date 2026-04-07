package main;

public class Gato extends Animal {

    public Gato(String nombre, String fechaNacimiento) {
        super(nombre, fechaNacimiento);
    }

    public void maullar() {
        System.out.println(getNombre() + " está maullando");
    }
}
