package main;

public class Main {

    public static void main(String[] args) {

        Operarios op1 = new Operarios("OP001", 50000, 200);
        Operarios op2 = new Operarios("OP002", 55000, 250);

        Gerentes ge1 = new Gerentes("GE001", 100000, 30000);
        Gerentes ge2 = new Gerentes("GE002", 120000, 40000);

        op1.mostrar();
        op2.mostrar();

        ge1.mostrar();
        ge2.mostrar();
    }
}




