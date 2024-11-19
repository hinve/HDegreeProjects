package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] argv) {
		Scanner teclado = new Scanner(System.in);
		String nombre;
		String primerApellido;
		byte diaNac;
		byte mesNac;
		String anoNac;
		String genero;
		
		System.out.print("Nombre: ");
		nombre = teclado.nextLine();
		System.out.print("Primer apellido: ");
		primerApellido = teclado.nextLine();
		System.out.print("Día de nacimiento: ");
		diaNac = teclado.nextByte();
		System.out.print("Mes de nacimiento: ");
		mesNac = teclado.nextByte();
		teclado.nextLine();
		System.out.print("Año de nacimiento: ");
		anoNac = teclado.nextLine();
		System.out.print("Género: ");
		genero = teclado.nextLine();
		
		System.out.println("Su id es: ");
		System.out.print(anoNac.charAt(2));
		System.out.print(anoNac.charAt(3));
		System.out.print(genero.charAt(0));
		System.out.print(nombre.charAt(nombre.length() -1));
		System.out.print(primerApellido.charAt(primerApellido.length() -3));
		System.out.print(primerApellido.charAt(primerApellido.length() -2));
		System.out.print(primerApellido.charAt(primerApellido.length() -1));
	}
}
