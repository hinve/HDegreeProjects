/* El objetivo del proyecto es hacer uso de la clase Teatro y su documentacion
 * para hacer un ejercicio, ademas de crear un metodo que usaremos en el mismo
 * Héctor Pino Montiel
 * 14/01/2025
 * */

package ejercicio1;

import java.nio.channels.UnresolvedAddressException;

import libtarea3.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		// 1. Implementacion de aforo aleatorio
		System.out.println("1.---------------------");
		aforoAleatorio();
		
		// 2. Declarar tres variables referencia
		System.out.println("2.--------------------");
		Teatro var1 = null;
		Teatro var2 = null;
		Teatro var3 = null;
		
		// 3. Instanciar cada una de las 3 variables con aforoAleatorio + excepciones
		System.out.println("3.--------------------");
		try {
			var1 = new Teatro("Teatro 1", aforoAleatorio());
			var2 = new Teatro("Teatro 2", aforoAleatorio());
			var3 = new Teatro("Teatro 3", aforoAleatorio());			
		} catch (IllegalArgumentException excepcion2) {
			System.out.println("Numero incorrecto de aforo 300 - 1000");
		} catch (NullPointerException excepcion3) {
			System.out.println("Nombre incorrecto");
		}
		
		// 4. Mostrar el nombre y el aforo de los teatros
		System.out.println("4.--------------------");
		System.out.printf("%s --- %d\n", var1.getNombreTeatro(), var1.getAforo());
		System.out.printf("%s --- %d\n", var2.getNombreTeatro(), var2.getAforo());
		System.out.printf("%s --- %d\n", var3.getNombreTeatro(), var3.getAforo());
		
		// 5. Obtener numero de entradas vendidas
		System.out.println("5.--------------------");
		System.out.printf("Numero total de entradas vendidas: %d\n", var1.getEntradasVendidas() + var2.getEntradasVendidas() + var3.getEntradasVendidas());
		
		// 6. Declarar e instanciar un teatro por defecto
		System.out.println("6.--------------------");
		Teatro pino = new Teatro();
		
		// 7. Terminar de representar una obra en el teatro pino
		System.out.println("7.--------------------");
		try {
			pino.terminarObra();			
		} catch (IllegalStateException excepcion1) {
			System.out.println("No tiene una obra asignada.");
		}
		
		// 8. Asignar el teatro "El rey leon"
		System.out.println("8.--------------------");
		pino.asignarObra("El Rey Leon");
		pino.llenarTeatro();
		System.out.printf("Numero total de entradas vendidas: %d\n", pino.getEntradasVendidas());
		
		// 9. Devolver 50 entradas del teatro
		System.out.println("9.--------------------");
		pino.devolverEntradas(50);
		System.out.println("Numero de entradas vendidas después de la devolución: " + pino.getEntradasVendidas());
		
		// 10.
		// 10.1 Mostrar numero de teatros creados hasta el momento
		System.out.println("10.1.------------------");
		System.out.println("Numero de teatros creados: " + Teatro.getTeatrosTotales());
		
		// 10.2 Número de obras que se están representando en este momento
		System.out.println("10.2.------------------");
		System.out.println("Número de obras que se están representando en este momento: " + Teatro.getObrasActivas());
	}

	public static int aforoAleatorio() {
		int valor;
		
		// Bucle que llame a Math.random mientras que sea menor de 750, en el momento en el que deja de serlo devuelve un valor entre 750 y 850
		do {
			valor = (int) (Math.random() * 850);
		} while (valor < 750);
		return valor;
	}
}
