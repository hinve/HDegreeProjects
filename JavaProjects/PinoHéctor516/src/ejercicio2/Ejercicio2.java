/* El objetivo del proyecto es
 * Héctor Pino Montiel
 * 04/12/2024
 * */

package ejercicio2;

import libtarea3.Dado;

public class Ejercicio2 {

	public static void main(String[] args) {
		System.out.println("LANZANDO LOS DADOS");
		System.out.println("------------------");
		System.out.println();
		System.out.println("1.-CONSULTA INICIAL DE VALORES GLOBALES");
		System.out.println("---------------------------------------");
		System.out.println();
		System.out.printf("Número total de lanzamientos llevados a cabo hasta el momento: %d\n", Dado.getNumeroLanzamientosGlobal());					
		System.out.printf("Número total de dados creados hasta el momento: %d\n", Dado.getNumeroDadosCreados());
		try {
			System.out.printf("Número de veces que se ha obtenido 1: %d\n", Dado.getNumeroVecesCaraGlobal(1));
			System.out.printf("Número de veces que se ha obtenido 2: %d\n", Dado.getNumeroVecesCaraGlobal(2));
			System.out.printf("Número de veces que se ha obtenido 3: %d\n", Dado.getNumeroVecesCaraGlobal(3));
			System.out.printf("Número de veces que se ha obtenido 4: %d\n", Dado.getNumeroVecesCaraGlobal(4));
		} catch (IllegalArgumentException excepcion1) {
			System.out.println(excepcion1.getMessage());
		}
		System.out.println("\n2.- CREACIÓN Y LANZAMIENTO DE DADOS");
		System.out.println("-----------------------------------");
		System.out.println();
		int numAleatorio;
			for(int i = 1; i < 11; i++) {
				try {
					numAleatorio = (int)(Math.random() * 8) + 1;
					System.out.printf("Intento %d: Intentando crear un dado de %d caras.\n", i, numAleatorio);
					Dado dado = new Dado(numAleatorio);
					System.out.printf("Lo lanzamos %d veces: ", numAleatorio);
					for(int j = 0; j < numAleatorio; j++) {
						System.out.print(dado.lanzar() + " ");
					}
				System.out.printf("\nSuma total de lanzamientos: %d", dado.getSumaPuntuacionHistorica());
				System.out.println();
				} catch(IllegalArgumentException excepcion2) {
					System.out.println(excepcion2.getMessage());
				}
			}			
		System.out.println("\n3.- ANALISIS DE RESULTADOS FINALES");
		System.out.println("----------------------------------");
		System.out.println();
		System.out.printf("Número total de lanzamientos llevados a cabo hasta el momento: %d\n", Dado.getNumeroLanzamientosGlobal());					
		System.out.printf("Número total de dados creados hasta el momento: %d\n", Dado.getNumeroDadosCreados());
		try {
			System.out.printf("Número de veces que se ha obtenido 1: %d\n", Dado.getNumeroVecesCaraGlobal(1));
			System.out.printf("Número de veces que se ha obtenido 2: %d\n", Dado.getNumeroVecesCaraGlobal(2));
			System.out.printf("Número de veces que se ha obtenido 3: %d\n", Dado.getNumeroVecesCaraGlobal(3));
			System.out.printf("Número de veces que se ha obtenido 4: %d\n", Dado.getNumeroVecesCaraGlobal(4));
		} catch (IllegalArgumentException excepcion1) {
			System.out.println(excepcion1.getMessage());
		}
	}

}
