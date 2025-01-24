/* El objetivo del proyecto es usar la clase Rectangulo para hacer uso de Constructores y Excepciones
 * Héctor Pino Montiel
 * 17/01/2025
 * */

package ejercicio3;

public class Ejercicio3 {
    public static void main(String[] argv) {
        Rectangulo figura1;
        Rectangulo figura2;

        try {
            figura1 = new Rectangulo(0, 0, 5, 5);
        } catch (IllegalArgumentException excepcion1) {
            System.out.println("Error al crear figura1: " + excepcion1.getMessage());
            figura1 = new Rectangulo(0,10, 0, 10);
            System.out.println("--------------------------------------------------------");
            System.out.println("Toma valores por defecto");
        }


        try {
            figura2 = new Rectangulo(7, 9, 2, 3);
        } catch (IllegalArgumentException excepcion2) {
            System.out.println("Error al crear figura2: " + excepcion2.getMessage());
            figura2 = new Rectangulo(0, 10, 0, 10);
            System.out.println("Eres un petardo te pongo valores por defecto");
        }


        System.out.println("--------------------------------------------------------");
        System.out.printf("Figura 1\n");
        System.out.printf("x1: %d\n", figura1.x1);
        System.out.printf("x2: %d\n", figura1.x2);
        System.out.printf("y1: %d\n", figura1.y1);
        System.out.printf("y2: %d\n", figura1.y2);
        System.out.printf("El perímetro de la primera figura es %d y el área es %d\n", 
            2 * (figura1.x2 - figura1.x1 + figura1.y2 - figura1.y1), 
            (figura1.x2 - figura1.x1) * (figura1.y2 - figura1.y1));

        System.out.println("--------------------------------------------------------");
        System.out.printf("Figura 2\n");
        System.out.printf("x1: %d\n", figura2.x1);
        System.out.printf("x2: %d\n", figura2.x2);
        System.out.printf("y1: %d\n", figura2.y1);
        System.out.printf("y2: %d\n", figura2.y2);
        System.out.printf("El perímetro de la segunda figura es %d y el área es %d\n", 
            2 * (figura2.x2 - figura2.x1 + figura2.y2 - figura2.y1), 
            (figura2.x2 - figura2.x1) * (figura2.y2 - figura2.y1));
    }
}