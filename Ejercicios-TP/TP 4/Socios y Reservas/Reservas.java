package main;
public class Reserva {

	private String fecha;
	private String tipoDeporte;
	
	public Reserva(String fecha, String tipoDeporte) {
		this.fecha = fecha;
		this.tipoDeporte = tipoDeporte;
	}
	
	public void reservar() {
		System.out.println("Reservando: " + fecha);
	}
	
	public void cancelar() {
	System.out.println("Cancelando: " + fecha);	
	}
	
}
