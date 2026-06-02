package productos;

import java.util.ArrayList;

public class inventario {

    private ArrayList<producto> productos;

    public inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(producto p) {
        productos.add(p);
    }

    public void listarProductos() {
        for (producto p : productos) {
            p.mostrarProducto();
        }
    }

    public int cantidadProductos() {
        return productos.size();
    }
}