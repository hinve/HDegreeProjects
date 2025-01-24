package ejercicio4;

public class Articulo {
    String nombre;
    double precio;
    double iva;
    int cuantosQuedan;
    
    Articulo (String nombre, double precio, double iva, int cuantosQuedan) {
        if(iva < 0 || iva > 100) {
            throw new IllegalArgumentException("⚠️  El IVA no puede ser negativo ni mayor a 100.⚠️");
        } else if (cuantosQuedan < 0) {
            throw new IllegalArgumentException("⚠️  La cantidad de artículos no puede ser negativa.⚠️");
        } else if (precio < 0) {
            throw new IllegalArgumentException("⚠️  El precio no puede ser negativo.⚠️");
        } else if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("⚠️  El nombre no puede estar vacío.⚠️");
        } else if (nombre.length() > 50) {
            throw new IllegalArgumentException("⚠️  El nombre no puede tener más de 50 caracteres.⚠️");
        }
        this.nombre = nombre;
        this.precio = precio;
        this.iva = iva;
        this.cuantosQuedan = cuantosQuedan;
    }
    
    public void mostrarMensaje () {
        System.out.printf("----%s----\nPrecio: %.0f$ - IVA:%.0f%% - PVP:%.1f$\n", this.nombre, this.precio, this.iva, this.precio + this.iva / 10);
    }
}