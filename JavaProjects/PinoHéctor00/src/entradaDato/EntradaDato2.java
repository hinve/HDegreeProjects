 /*
 * El objetivo del proyecto es meter un ejemplo de insertar datos
 * Héctor Pino Montiel
 * 01/10/2024
 */
// nombre, edad, peso y población
package entradaDato;

import java.util.Scanner;

public class EntradaDato2
{
	public static void main(String[] argv)
	{
		 Scanner tecladoLine = new Scanner(System.in);
		 Scanner teclado = new Scanner(System.in);
		 String nombre;
		 byte edad;
		 double peso;
		 String poblacion;
		 
		 System.out.print("¿Cuál es tu nombre?: ");
		 nombre = tecladoLine.nextLine();
		 System.out.print("¿Cuántos años tienes?: ");
		 edad = teclado.nextByte();
		 System.out.print("¿Cuánto pesas?: ");
		 peso = teclado.nextDouble();
		 System.out.print("¿Dónde vives?: ");
		 poblacion = tecladoLine.nextLine();
		 
		 System.out.print("Te llamas " + nombre + " tienes "
		 + edad + " años, pesas " + peso + " kg y vives en " + poblacion);
		 
		 teclado.close();
		 tecladoLine.close();
	}
}
