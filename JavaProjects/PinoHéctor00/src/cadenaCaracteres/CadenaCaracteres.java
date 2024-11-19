// pedir nombre
// calcular el len
// letra por la que empieza su nombre y la ultima
package cadenaCaracteres;

import java.util.Scanner;

public class CadenaCaracteres
{
	public static void main(String[] argv)
	{
		Scanner teclado = new Scanner(System.in);
		String nombre;
		
		System.out.print("Escribe tu nombre: ");
		nombre = teclado.nextLine();
		
		System.out.println("Tu nombre tiene " + nombre.length() + " letras.");
		System.out.println("La primera letra es: " + nombre.charAt(0) + " y la última es "
				+ nombre.charAt(nombre.length() - 1) + ".");
		
		teclado.close();
	}
}
