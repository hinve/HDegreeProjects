package ejercicio3;

public class Ejercicio3 {
	public static void main(String[] argv) {
		Rectangulo figura1 = new Rectangulo(0, 0, 5, 5);
		Rectangulo figura2 = new Rectangulo(7, 9, 2, 3);
		
		System.out.println("--------------------------------------------------------");
		System.out.printf("Figura 1\n");
		System.out.printf("x1: %d\n", figura1.x1);
		System.out.printf("x2: %d\n", figura1.x2);
		System.out.printf("y1: %d\n", figura1.y1);
		System.out.printf("y2: %d\n", figura1.y2);
		System.out.printf("El perímetro de la primera figura es %d y el área es %d\n", (figura1.x1 + figura1.x2 + figura1.y1 + figura1.y2), (figura1.x1 * figura1.y1));
		System.out.printf("Figura 2\n");
		System.out.printf("x1: %d\n", figura2.x1);
		System.out.printf("x2: %d\n", figura2.x2);
		System.out.printf("y1: %d\n", figura2.y1);
		System.out.printf("y2: %d\n", figura2.y2);
		System.out.printf("El perímetro de la segunda figura es %d y el área es %d\n", (figura2.x1 + figura2.x2 + figura2.y1 + figura2.y2), (figura2.x1 * figura2.y1));
		
		// Modificar sus coordenadas
		figura1.x2 = 3;
		figura2.x1 = 1;
		figura1.x1 = 12;
		figura2.y2 = 15;
		System.out.println("--------------------------------------------------------");
		System.out.printf("Nuevas coordenadas\n");
		System.out.printf("Figura 1\n");
		System.out.printf("x1: %d\n", figura1.x1);
		System.out.printf("x2: %d\n", figura1.x2);
		System.out.printf("y1: %d\n", figura1.y1);
		System.out.printf("y2: %d\n", figura1.y2);
		System.out.printf("El perímetro de la primera figura es %d y el área es %d\n", (figura1.x1 + figura1.x2 + figura1.y1 + figura1.y2), (figura1.x1 * figura1.y1));
		System.out.printf("Figura 2\n");
		System.out.printf("x1: %d\n", figura2.x1);
		System.out.printf("x2: %d\n", figura2.x2);
		System.out.printf("y1: %d\n", figura2.y1);
		System.out.printf("y2: %d\n", figura2.y2);
		System.out.printf("El perímetro de la segunda figura es %d y el área es %d\n", (figura2.x1 + figura2.x2 + figura2.y1 + figura2.y2), (figura2.x1 * figura2.y1));
		System.out.println("--------------------------------------------------------");
	}
}
