package main;

public class Main {

    public static void main(String[] args) {

        HerramientaElectrica taladro = new HerramientaElectrica(1, "Bosch", 230);
        HerramientaManual martillo = new HerramientaManual(2, "Stanley", "Empuñadura de goma");
        HerramientaElectrica soldador = new HerramientaElectrica(3, "Telwin", 250);
        HerramientaManual destornillador = new HerramientaManual(4, "Gedore", "Empuñadura de plastico");
        HerramientaManual lima = new HerramientaManual(5, "Pferd", "Empuñadura de goma");
        
        martillo.usar();
        martillo.devolver();

        taladro.usar();
        taladro.devolver();
        taladro.conectar();
        
        soldador.usar();
        soldador.devolver();
        soldador.conectar();
        
        destornillador.usar();
        destornillador.devolver();
        
        lima.usar();
        lima.devolver();
        
        
        
    }
}







