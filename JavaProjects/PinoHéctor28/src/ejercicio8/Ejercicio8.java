/* El objetivo del proyecto es usar las condiciones if / else y bucles
 * Héctor Pino Montiel
 * 16/10/2024
 * */

package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] argv) {
		Scanner teclado = new Scanner(System.in);
		String nombre;
		String apellidos;
		byte edad;
		int rutas;
		int distanciaUlt;
		int distancia;
		int numPart;
		String ciudad;
		int distMedia;
		int distMax;
		String ciudadRutaMasLarga = null;

		distMax = 0;
		distMedia = 0;
		System.out.println("Nombre: ");
		nombre = teclado.nextLine();
		System.out.println("Apellidos: ");
		apellidos = teclado.nextLine();
		System.out.println("Edad: ");
		edad = teclado.nextByte();
		System.out.println("Número de rutas: ");
		rutas = teclado.nextInt();
		System.out.println("Distancia de última ruta: ");
		distanciaUlt = teclado.nextInt();

		if (edad > 17 && edad < 45) { // si edad esta entre 17 y 45
			for (int i = 0; i < 5; i++) {
				System.out.printf("Ruta número %d:\n", i + 1);
				System.out.println("Distancia: ");
				distancia = teclado.nextInt();
				System.out.println("Número de participantes: ");
				numPart = teclado.nextInt();
				teclado.nextLine();
				System.out.println("Ciudad: ");
				ciudad = teclado.nextLine();
				distMedia += distancia;
				if (distMax < distancia) { // if para saber cual de las rutas tiene mayor distancia
					distMax = distancia;
					ciudadRutaMasLarga = ciudad;
				}
			}
			System.out.println("---------------------------------------------------------");
			System.out.println("Nombre: " + nombre);
			System.out.println("Edad: " + edad);
			System.out.println("Número de rutas realizadas: " + rutas);
			System.out.println("");
			System.out.println("Distancia media (5 últimas rutas): " + distMedia);
			System.out.println("Ciudad de la ruta más larga: " + ciudadRutaMasLarga);
			System.out.println("---------------------------------------------------------");
		} else {
			System.out.println("Esa edad no es correcta");
		}
		teclado.close();
	}
}
