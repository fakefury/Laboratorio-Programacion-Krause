package main;

public class Main {

    public static void main(String[] args) {

        Playlist rock = new Playlist("Linkin Park", "Aerosmith");
        Playlist pop = new Playlist("Sombr", "JVKE");

        Canciones c1 = new Canciones(180, "Leave Out All The Rest");
        Canciones c2 = new Canciones(200, "Back To Friends");
        Canciones c3 = new Canciones(240, "Her");

        rock.crearPlaylist();
        pop.crearPlaylist();

        rock.añadirCancion();
        rock.añadirCancion();

        pop.añadirCancion();
        pop.añadirCancion();

        rock.quitarCancion();

        rock.eliminarPlaylist();
        pop.eliminarPlaylist();
    }
}




