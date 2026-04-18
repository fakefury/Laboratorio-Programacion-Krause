package main;

public class Socios {
	
	private int nroSocio;
	private String nombre;

	private List<Reserva> reservas;
	
	Public Socios(int nroSocio, String nombre) {
		this.nroSocio = nroSocio;
		this.nombre = nombre;
		this.reservas = new ArrayList<>();
	}
	
	public void añadirReserva(Reserva reserva) {
		reservas.add(reserva);
		System.out.println(nombre + "Reservo para: " + reserva.fecha);
	}
	public String getReserva() {
		return reserva;
	}
	public void setReserva(String reserva) {
		this.reserva = reserva;
	}
}
