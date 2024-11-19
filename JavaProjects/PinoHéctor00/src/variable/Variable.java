package variable;

public class Variable 
{
	public static void main(String[] argv)
	{
		int edad, anioNacimiento;
		double peso, altura;
		String nombre, poblacion;
		
		edad = 23;
		anioNacimiento = 2001;
		System.out.println("La edad es: " + edad);
		System.out.println("El año de nacimiento es: " + anioNacimiento);		
		
		peso = 100.8;
		altura = 1.86;
		System.out.println("El peso es: " + peso + " kg");
		System.out.println("Mide: " + altura + " cm");
		
		nombre = "Héctor Pino Montiel";
		poblacion = "Cártama";
		System.out.println("Se llama: " + nombre);
		System.out.println("Vive en: " + poblacion);
	}
}
