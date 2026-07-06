package futbol;
import java.util.ArrayList;

public class Mundial {
    private ArrayList<Seleccion> selecciones;

    public Mundial() {
        selecciones = new ArrayList<>();
    }

    public void agregarSeleccion(Seleccion s) {
        selecciones.add(s);
    }

    public Seleccion getSeleccion(int index) {
        return selecciones.get(index);
    }
}