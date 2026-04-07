package main;

public class Main {

    public static void main(String[] args) {

        Veterinario vet1 = new Veterinario("Chong");
        Veterinario vet2 = new Veterinario("Sung");
        Veterinario vet3 = new Veterinario("Kim");

        Animal comun = new Perro("Firulais", "01/01/2020");

        Animal a1 = new Gato("Goku", "02/02/2021");
        Animal a2 = new Perro("Pelusa", "03/03/2019");
        Animal a3 = new Gato("Fefe", "04/04/2022");
        Animal a4 = new Perro("Porotita", "05/05/2018");

        vet1.agregarAnimal(comun);
        vet1.agregarAnimal(a1);

        vet2.agregarAnimal(comun);
        vet2.agregarAnimal(a2);

        vet3.agregarAnimal(comun);
        vet3.agregarAnimal(a3);
        vet3.agregarAnimal(a4);

        vet1.mostrarAnimales();
        vet2.mostrarAnimales();
        vet3.mostrarAnimales();
    }
}





