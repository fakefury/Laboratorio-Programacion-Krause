package futbol;

public class Seleccion {
    private String nombre;
    private String continent;
    private int puntos;
    private int jugConv;
    private String estadoClasificacion;
    private DirectorTecnico dt;

    public Seleccion(String nombre, String continente, int puntos, int jugConv, String estadoClasificacion, DirectorTecnico dt) {
        this.nombre = nombre;
        this.continent = continente;
        this.puntos = puntos;
        this.jugConv = validarJugConv(jugConv);
        this.estadoClasificacion = estadoClasificacion;
        this.dt = dt;
    }

    private int validarJugConv(int cant) {
        if (cant < 1 || cant > 26) {
            throw new IllegalArgumentException("INVÁLIDA LA CANT DE JUGADORES");
        }
        return cant;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public DirectorTecnico getDt() {
        return dt;
    }

    public void disputarPartido(int jugadoresHabilitados) throws JugadoresInsuficientesException {
        if (jugadoresHabilitados < 11) {
            throw new JugadoresInsuficientesException("La selección " + nombre + " tiene menos de 11 jugadores habilitados. No puede jugar.");
        }
        System.out.println("La selección " + nombre + " está disputando el partido con " + jugadoresHabilitados + " jugadores.");
    }

    @Override
    public String toString() {
        return "Selección: " + nombre + " | Continente: " + continent + " | Puntos: " + puntos + " | Convocados: " + jugConv;
    }
}