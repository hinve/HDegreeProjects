// crear un rectangulo que va a empezar en el (5, 4) y va a tener como base base 4 altura 5

package objetos;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;

public class Rectangulos {
	public static void main(String[] argv) {
		Point puntero = new Point(4, 5);
		Dimension dimensiones = new Dimension(25, 4);
		Rectangle rectangulo1;
		rectangulo1 = new Rectangle();
		imprimirRectangulo(rectangulo1);
		
		rectangulo1.setBounds(4, 5, 5, 4);
		imprimirRectangulo(rectangulo1);
		
		Rectangle rectangulo2 = new Rectangle(4, 5, 5, 10);
		imprimirRectangulo(rectangulo2);
		
		Rectangle rectanguloConsOb = new Rectangle(puntero, dimensiones);
		imprimirRectangulo(rectanguloConsOb);
		
		// Comprobar si un punto existe en el rectangulo
		System.out.println("Contiene: " + rectangulo1.contains(6, 5));
	}
	
	public static void imprimirRectangulo(Rectangle rect) {
	    if (rect != null) {
	        System.out.println("Rectángulo:");
	        System.out.println("  Posición: (" + rect.x + ", " + rect.y + ")");
	        System.out.println("  Ancho: " + rect.width);
	        System.out.println("  Altura: " + rect.height);
	        System.out.println("  Área: " + (rect.width * rect.height));

	        int width = rect.width;
	        int height = rect.height;

	        // Imprimir el rectángulo usando caracteres ASCII
	        for (int i = 0; i < height; i++) {
	            for (int j = 0; j < width; j++) {
	                if (i == 0) { // Primera fila
	                    if (j == 0) {
	                        System.out.print("+"); // Esquina superior izquierda
	                    } else if (j == width - 1) {
	                        System.out.print("+"); // Esquina superior derecha
	                    } else {
	                        System.out.print("-"); // Borde superior
	                    }
	                } else if (i == height - 1) { // Última fila
	                    if (j == 0) {
	                        System.out.print("+"); // Esquina inferior izquierda
	                    } else if (j == width - 1) {
	                        System.out.print("+"); // Esquina inferior derecha
	                    } else {
	                        System.out.print("-"); // Borde inferior
	                    }
	                } else { // Filas intermedias
	                    if (j == 0 || j == width - 1) {
	                        System.out.print("|"); // Bordes verticales
	                    } else {
	                        System.out.print(" "); // Espacio interior
	                    }
	                }
	            }
	            System.out.println(); // Nueva línea después de cada fila
	        }
	    } else {
	        System.out.println("El rectángulo es nulo.");
	    }
	}
}
