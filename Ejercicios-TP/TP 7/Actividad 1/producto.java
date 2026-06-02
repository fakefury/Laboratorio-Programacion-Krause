package productos;

public class producto {

    private String nombre;
    private String codigo;
    private double precio;

    public producto(String nombre, String codigo, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
    }

    public void mostrarProducto() {
        System.out.println("Nombre: " + nombre +
                           " | Código: " + codigo +
                           " | Precio: $" + precio);
    }
}
