/* El objetivo del proyecto es usar la clase Persona del ejercicio anterior para hacer
 * uso de Constructores
 * Héctor Pino Montiel
 * 17/01/2025
 * */

 package ejercicio2;

 import java.util.Scanner;
 
 public class Ejercicio2 {
	 public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
		 
		 System.out.println("Registro 1/2");
		 System.out.print("Dame tu dni: ");
		 String dni = teclado.nextLine();
		 System.out.print("Dame tu nombre: ");
		 String nombre = teclado.nextLine();
		 System.out.print("Dame tus apellidos: ");
		 String apellidos = teclado.nextLine();
		 System.out.print("Dame tu edad: ");
		 byte edad = teclado.nextByte();
		 
		 Persona Jose = new Persona(dni, nombre, apellidos, edad);
 
		 teclado.nextLine(); // ------------------------------ \\
		 
		 System.out.println("Registro 2/2");
		 System.out.print("Dame tu dni: ");
		 dni = teclado.nextLine();
		 System.out.print("Dame tu nombre: ");
		 nombre = teclado.nextLine();
		 System.out.print("Dame tus apellidos: ");
		 apellidos = teclado.nextLine();
		 System.out.print("Dame tu edad: ");
		 edad = teclado.nextByte();
		 
		 Persona Manuel = new Persona(dni, nombre, apellidos, edad);
 
		 System.out.printf("La edad de %s es %d\n", Jose.getNombre(), Jose.getEdad());
		 System.out.printf("El apellido de %s es %s\n", Manuel.getNombre(), Manuel.getApellidos());
		 
		 System.out.println(Persona.aString(Jose));
		 System.out.println(Persona.aString(Manuel));
		 teclado.close();
	 }
 
 }
 