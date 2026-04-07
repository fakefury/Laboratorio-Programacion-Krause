package main;

public class Main {

    public static void main(String[] args) {

        Vendedor v1 = new Vendedor("Pedro");
        Vendedor v2 = new Vendedor("Luis");
        Vendedor v3 = new Vendedor("Ana");

        Vehiculo a1 = new Auto("AAA111", "Toyota");
        Vehiculo a2 = new Auto("BBB222", "Ford");
        Vehiculo m1 = new Moto("CCC333", "Yamaha");
        Vehiculo m2 = new Moto("DDD444", "Honda");
        Vehiculo a3 = new Auto("EEE555", "Chevrolet");
        Vehiculo m3 = new Moto("FFF666", "Suzuki");
        Vehiculo a4 = new Auto("GGG777", "BMW");
        Vehiculo m4 = new Moto("HHH888", "Kawasaki");
        Vehiculo a5 = new Auto("III999", "Audi");
        Vehiculo m5 = new Moto("JJJ000", "Ducati");

        v1.agregarVehiculo(a1);
        v1.agregarVehiculo(m1);
        v1.agregarVehiculo(a2);

        v2.agregarVehiculo(m2);
        v2.agregarVehiculo(a3);
        v2.agregarVehiculo(m3);

        v3.agregarVehiculo(a4);
        v3.agregarVehiculo(m4);
        v3.agregarVehiculo(a5);
        v3.agregarVehiculo(m5);

        v1.mostrarVehiculos();
        v2.mostrarVehiculos();
        v3.mostrarVehiculos();
    }
}





