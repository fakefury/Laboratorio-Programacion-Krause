package futbol;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mundial mundial = new Mundial();
        
        DirectorTecnico dtArgentina = new DirectorTecnico("Lionel Scaloni");
        
        System.out.println("--- 1. Creando Selecciones ---");
        try {
            Seleccion arg = new Seleccion("Argentina", "América", 3, 26, "Clasificado", dtArgentina);
            mundial.agregarSeleccion(arg);
            
            Seleccion bra = new Seleccion("Brasil", "América", 0, 23, "Pendiente", null);
            mundial.agregarSeleccion(bra);
            
            Seleccion error = new Seleccion("Inválida", "Europa", 0, 30, "Pendiente", null);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear selección: " + e.getMessage());
        }

        System.out.println("\n--- 2. Consultar selección por posición ---");
        try {
            Seleccion s = mundial.getSelection(5);
            System.out.println(s);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: La posición ingresada no existe en el torneo.");
        } finally {
            System.out.println("Consulta de posiciones finalizada.");
        }

        System.out.println("\n--- 3. Actualizar puntos por teclado ---");
        System.out.print("Ingrese los nuevos puntos para Argentina: ");
        String entrada = scanner.nextLine();
        try {
            int nuevosPuntos = Integer.parseInt(entrada);
            mundial.getSeleccion(0).setPuntos(nuevosPuntos);
            System.out.println("Puntos actualizados correctamente.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Debes ingresar un valor numérico para los puntos.");
        }

        System.out.println("\n--- 4. Consultar datos del DT ---");
        try {
            Seleccion bra = mundial.getSeleccion(1);
            System.out.println("DT de Brasil: " + bra.getDt().getNombre());
        } catch (NullPointerException e) {
            System.out.println("Error: Esta selección no tiene un Director Técnico asignado (Referencia Nula).");
        }

        System.out.println("\n--- 5. Disputar partido ---");
        try {
            Seleccion arg = mundial.getSeleccion(0);
            arg.disputarPartido(9);
        } catch (JugadoresInsuficientesException e) {
            System.out.println("Error personalizado: " + e.getMessage());
        } finally {
            System.out.println("Validación de partido finalizada.");
        }
        
        scanner.close();
    }
}
