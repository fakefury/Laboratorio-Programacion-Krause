package actividadModelo;

public class Main {

    public static void main(String[] args) {
        String[][] datosCantantes = {
            {"Taylor Swift", "Pop", "1500000", "18", "Tree Paine"},
            {"Bad Bunny", "Reggaeton", "RECHAZADO", "12", "Noah Assad"},
            {"Coldplay", "Rock", "1200000", "3", "Phil Harvey"},       
            {"Duki", "Trap", "500000", "14", null}                   
        };

       
        for (int i = 0; i < datosCantantes.length; i++) {
            String[] fila = datosCantantes[i];
            System.out.println("\n[Procesando Artista " + (i + 1) + "]: " + fila[0]);
            
            Cantante cantante = null;

            try {
             
                String nombre = fila[0];
                String genero = fila[1];
                int cachetSolicitado = Integer.parseInt(fila[2]); 
                int canciones = Integer.parseInt(fila[3]);
                String manager = fila[4];

                cantante = new Cantante(nombre, genero, cachetSolicitado, canciones, manager);
                System.out.println("-> Registro de objeto exitoso.");
                System.out.println("-> Consultando datos del representante: " + cantante.getManager().toUpperCase());
                
                realizarSoundcheck(cantante); 
                cantante.asignarEscenario("Escenario Principal Norte");

            } catch (NumberFormatException e) {
                System.out.println("[ERROR] Formato numérico inválido al procesar el cachet del artista.");
            } catch (NullPointerException e) {
                System.out.println("[ERROR CAPTURADO] La aplicación evitó un colapso: Se intentó operar sobre una referencia de Manager nula.");
            } catch (EspectaculoCortoException e) {
                System.out.println("[EXCEPCIÓN DE SHOW] Controlado: " + e.getMessage());
            } finally {
             
                System.out.println("-> Finalizada la evaluación técnica del índice: " + i);
            }
        }

        try {
            System.out.println("Intentando liquidar honorarios con un porcentaje de impuesto inválido (120%):");
            Cantante artistaPrueba = new Cantante("Artista X", "Indie", 10000, 10, "Manager X");
            artistaPrueba.liquidarHonorarios(120.0);
        } catch (IllegalArgumentException e) {
            System.out.println("[CAPTURADA CORRECTAMENTE] " + e.getMessage());
        }

        System.out.println("\n--- Ejecución del Festival terminada de manera controlada y limpia ---");
    }

   
    public static void realizarSoundcheck(Cantante artista) throws EspectaculoCortoException {
        if (artista.getCantCanciones() < 5) {
            throw new EspectaculoCortoException("El show de '" + artista.getNombre() + "' tiene solo " 
                    + artista.getCantCanciones() + " canciones programadas. No cumple con el mínimo de 5.");
        }
        System.out.println("-> Soundcheck APROBADO satisfactoriamente.");
    }
}
