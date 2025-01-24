/* El objetivo del proyecto es usar la clase Articulo para hacer uso de Constructores y Excepciones
 * 17/01/2025
 * */

package ejercicio4;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		Articulo articulo;
		
		try {
			articulo = new Articulo("Camiseta", 10, 100, -1);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			articulo = new Articulo("Pijama", 10, 21, 4);
			System.out.println("Se han tomado valores por defecto. (nombre: Pijama, precio: 10, iva: 21, cuantosQuedan: 4)");
		}
		articulo.mostrarMensaje();
	}

}
