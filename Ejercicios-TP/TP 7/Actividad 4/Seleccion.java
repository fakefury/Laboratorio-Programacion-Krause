package fifa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Seleccion {

    private ArrayList<Jugador> jugadores;

    public Seleccion() {
        jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador j) {
        jugadores.add(j);
    }

    public void eliminarJugador(String nombre) {

        jugadores.removeIf(
                j -> j.getNombre().equalsIgnoreCase(nombre)
        );
    }

    public void buscarPorPosicion(String posicion) {

        for (Jugador j : jugadores) {

            if (j.getPosicion().equalsIgnoreCase(posicion)) {
                System.out.println(j);
            }
        }
    }

    public void mostrarConvocados() {

        for (Jugador j : jugadores) {

            if (j.isConvocado()) {
                System.out.println(j);
            }
        }
    }

    public void mostrarNoConvocados() {

        for (Jugador j : jugadores) {

            if (!j.isConvocado()) {
                System.out.println(j);
            }
        }
    }

    public Jugador jugadorMasJoven() {

        Jugador joven = jugadores.get(0);

        for (Jugador j : jugadores) {

            if (j.getEdad() < joven.getEdad()) {
                joven = j;
            }
        }

        return joven;
    }

    public Jugador jugadorMasVeterano() {

        Jugador veterano = jugadores.get(0);

        for (Jugador j : jugadores) {

            if (j.getEdad() > veterano.getEdad()) {
                veterano = j;
            }
        }

        return veterano;
    }

    public void buscarPorEquipo(String equipo) {

        for (Jugador j : jugadores) {

            if (j.getEquipo().equalsIgnoreCase(equipo)) {
                System.out.println(j);
            }
        }
    }

    public void ordenarPorEdad() {

        Collections.sort(
            jugadores,
            Comparator.comparingInt(Jugador::getEdad)
        );
    }

    public void contarPorPosicion() {

        int arqueros = 0;
        int defensores = 0;
        int mediocampistas = 0;
        int delanteros = 0;

        for (Jugador j : jugadores) {

            switch (j.getPosicion()) {

                case "Arquero":
                    arqueros++;
                    break;

                case "Defensor":
                    defensores++;
                    break;

                case "Mediocampista":
                    mediocampistas++;
                    break;

                case "Delantero":
                    delanteros++;
                    break;
            }
        }

        System.out.println("Arqueros: " + arqueros);
        System.out.println("Defensores: " + defensores);
        System.out.println("Mediocampistas: " + mediocampistas);
        System.out.println("Delanteros: " + delanteros);
    }

    public boolean estaConvocado(String nombre) {

        for (Jugador j : jugadores) {

            if (j.getNombre().equalsIgnoreCase(nombre)) {
                return j.isConvocado();
            }
        }

        return false;
    }

    public double promedioEdad() {

        int suma = 0;

        for (Jugador j : jugadores) {
            suma += j.getEdad();
        }

        return (double) suma / jugadores.size();
    }
}
