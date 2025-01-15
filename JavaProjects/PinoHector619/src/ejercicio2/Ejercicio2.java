package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Persona Jose = new Persona();
		Persona Manuel = new Persona();
		
		System.out.println("Registro 1/2");
		System.out.print("Dame tu dni: ");
		Jose.dni = teclado.nextLine();
		System.out.print("Dame tu nombre: ");
		Jose.nombre = teclado.nextLine();
		System.out.print("Dame tus apellidos: ");
		Jose.apellidos = teclado.nextLine();
		System.out.print("Dame tu edad: ");
		Jose.edad = teclado.nextByte();
		
		teclado.nextLine(); // ------------------------------ \\
		
		System.out.println("Registro 2/2");
		System.out.print("Dame tu dni: ");
		Manuel.dni = teclado.nextLine();
		System.out.print("Dame tu nombre: ");
		Manuel.nombre = teclado.nextLine();
		System.out.print("Dame tus apellidos: ");
		Manuel.apellidos = teclado.nextLine();
		System.out.print("Dame tu edad: ");
		Manuel.edad = teclado.nextByte();
		
		System.out.printf("La edad de %s es %d\n", Jose.nombre, Jose.edad);
		System.out.printf("El apellido de %s es %s\n", Manuel.nombre, Manuel.apellidos);
		
		System.out.println(Persona.aString(Jose));
		System.out.println(Persona.aString(Manuel));
		teclado.close();
	}

}
