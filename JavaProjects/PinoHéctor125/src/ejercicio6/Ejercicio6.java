package ejercicio6;

public class Ejercicio6 {
	public static void main(String[] argv) {
		int i;
		int j;
		int k;
		int altura;

		altura = 5; // Puedes probar los números que quieras a partir de 100 ya empieza a dar
					// problemas no se porque
		i = 1;

		while (i++ <= altura) {
			j = i;
			while (j++ < altura * 2) {
				System.out.print(" ");
			}
			k = 1;
			while (k++ < (2 * i - 2)) {
				if (i == altura || k == i || k == (2 * i - 1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
