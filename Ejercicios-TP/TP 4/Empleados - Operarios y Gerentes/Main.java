package main;

public class Main {

    public static void main(String[] args) {

        Operarios op1 = new Operarios("Alex Kim", 50000, 200);
        Operarios op2 = new Operarios("Kratos God", 55000, 250);

        Gerentes ge1 = new Gerentes("Joey Morrell", 100000, 30000);
        Gerentes ge2 = new Gerentes("Armando Jaleo", 120000, 40000);

        op1.mostrar();
        op2.mostrar();

        ge1.mostrar();
        ge2.mostrar();
    }
}





