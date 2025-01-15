package ejercicio4;

public class Articulo {
    String nombre;
    double precio;
    double iva;
    int cuantosQuedan;
    
    Articulo (String nombre, double precio, double iva, int cuantosQuedan) {
        this.nombre = nombre;
        this.precio = precio;
        this.iva = iva;
        this.cuantosQuedan = cuantosQuedan;
    }
    
    public void mostrarMensaje () {
        System.out.printf("----%s----\nPrecio: %.0f$ - IVA:%.0f%% - PVP:%.1f$\n", this.nombre, this.precio, this.iva, this.precio + this.iva / 10);
    }
}
