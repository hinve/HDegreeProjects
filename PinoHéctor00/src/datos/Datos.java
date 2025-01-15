//pedir datos de personas hasta que IMC hasta que sea 0 el input

package datos;

import java.util.Scanner;

public class Datos {
	public static void main(String[] argv) {
		Scanner teclado = new Scanner(System.in);
		double peso;
		double altura;
		double imc;
		
		imc = 0;
		do {
			System.out.print("Introduce el peso en kg: ");
			peso = teclado.nextDouble();
			System.out.print("Introduce la altura en cm: ");
			altura = teclado.nextDouble();
			if(peso != 0 || altura != 0) {
				imc = peso / Math.pow(altura / 100, 2);
				System.out.println("Para un peso de " + peso + " y una altura de " + altura / 100 + " metros:");
				System.out.println("El índice de masa corporal es de: " + imc);
				if(imc < 16) {
					System.out.println("Criterio de ingreso en hospital.");		
				}
				else if(imc >= 16 && imc <= 17) {
					System.out.println("Infrapeso.");
				}
				else if(imc >= 17 && imc <= 18) {
					System.out.println("Bajo peso.");
				}
				else if(imc >= 18 && imc <= 25) {
					System.out.println("Peso normal (saludable).");
				}
				else if(imc >= 25 && imc <= 30) {
					System.out.println("Sobrepeso (obesidad de grado I).");
				}
				else if(imc >= 30 && imc <= 35) {
					System.out.println("Sobrepeso crónico (obesidad de grado II).");
				}
				else if(imc >= 35 && imc <= 40) {
					System.out.println("Obesidad premórbida (obesidad de grado III).");
				}
				else if(imc > 40) {
					System.out.println("Obesidad mórbida (obesidad de grado IV).");
				}
			}
		} while(peso != 0 && altura != 0);
		teclado.close();
	}
}
