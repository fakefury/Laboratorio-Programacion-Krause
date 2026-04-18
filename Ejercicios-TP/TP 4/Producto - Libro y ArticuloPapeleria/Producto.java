package main;

public abstract class Producto {

    protected int codigo;
    private int precio;

    public Producto(int codigo, int precio) {
        this.codigo = codigo;
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public abstract void calcularPrecioFinal();
}