package metodos;

public class Metodos {

	public static void main(String[] args) {
		int numero = transformarAInt(notasAleatorias(20, 100));
		System.out.printf("%d", numero);
	}

	// notas aleatorias entre 0 y 10
	public static double notasAleatorias(int numMin, int numMax) {
		double numero = Math.random() * numMax;
		while(numero < numMin) {
			numero = Math.random() * numMax;
		}
		return numero;
	}

	// poner nota aleatoria entera
	public static int transformarAInt(double numero) {
		return (int) Math.ceil(numero);
	}
}
