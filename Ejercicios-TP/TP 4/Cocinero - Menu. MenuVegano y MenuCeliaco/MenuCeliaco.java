package main;

public class MenuCeliaco extends Menu {

    public String certificadoSinTACC;

    public MenuCeliaco(String diaSemana, int caloriasTotales, String certificadoSinTACC) {
        super(diaSemana, caloriasTotales);
        this.certificadoSinTACC = certificadoSinTACC;
    }

    public void mostrarMenu() {
        System.out.println("Menu Celiaco -> Día: " + diaSemana +
                           " - Calorías: " + caloriasTotales +
                           " - Certificado: " + certificadoSinTACC);
    }
}