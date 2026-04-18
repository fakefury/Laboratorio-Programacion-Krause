package main;

public class Main {

    public static void main(String[] args) {

        Colectivos linea60 = new Colectivos(101, 40, 60);
        Colectivos linea152 = new Colectivos(102, 45, 152);
        
        Trenes roca = new Trenes(501, 800, 8);
        Trenes mitre = new Trenes(502, 750, 7);
        
        linea60.arrancar();
        linea60.frenar();
        
        linea152.arrancar();
        linea152.frenar();
        
        roca.arrancar();
        roca.frenar();
        
        mitre.arrancar();
        mitre.frenar();
    }
}


