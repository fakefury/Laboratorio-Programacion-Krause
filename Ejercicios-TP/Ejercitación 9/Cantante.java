package actividadModelo;

public class Cantante implements Contratable{
private String nombre;
private String generoMusical;
private int cachetSolicitado;
private int cantCanciones;
private String manager;
private String escenarioAsignado;

public Cantante(String nombre, String generoMusical, int cachetSolicitado, int cantCanciones, String manager) {
	this.nombre = nombre;
	this.generoMusical = generoMusical;
	this.cachetSolicitado = cachetSolicitado;
	this.cantCanciones = cantCanciones;
	this.manager = manager;
	this.escenarioAsignado = "No asignado";
	}

public String getNombre() {return nombre;}
public String getGeneroMusical() {return generoMusical;}
public int getCachetSolicitado() {return cachetSolicitado;}
public int getCantCanciones() {return cantCanciones;}
public String getManager() { return manager;}
public String getEscenarioAsignado() {return escenarioAsignado;}

@Override
public void liquidarHonorarios(double impuestos) throws IllegalArgumentException {
	if (impuestos < 0 || impuestos > 100) {
		throw new IllegalArgumentException("El porcentaje no esta entre 0 y 100 porciento");
	}
}
@Override
public void asignarEscenario(String nombreEscenario) throws NullPointerException {
	if (nombreEscenario == null) {
		throw new NullPointerException("No puede ser nulo el nombre del escenario");
		}
	}

@Override
public String toString() {
    return String.format("%-15s | %-10s | Cachet: $%7d | Canciones: %2d | Manager: %s | Escenario: %s",
            nombre, generoMusical, cachetSolicitado, cantCanciones, (manager != null ? manager : "Sin Manager"), escenarioAsignado);
	}
}

