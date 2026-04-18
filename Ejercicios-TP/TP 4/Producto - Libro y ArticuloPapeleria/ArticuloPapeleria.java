package main;

public class ArticuloPapeleria extends Producto {

    private String tipoMaterial;

    public ArticuloPapeleria(int codigo, int precio, String tipoMaterial) {
        super(codigo, precio);
        this.tipoMaterial = tipoMaterial;
    }

    public void calcularPrecioFinal() {
        System.out.println("Articulo -> Codigo: " + codigo + 
                           " - Precio final: " + getPrecio() + 
                           " - Material: " + tipoMaterial);
    }
}