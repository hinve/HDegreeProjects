package operadoresRelacionales;

public class OperadoresRelacionales 
{
	public static void main(String[] argv)
	{
		int x1=10, x2=5, x3=0;
		char c1='F', c2='S';
		
		System.out.println("x1 es igual a x2: " 
				+ (x1 == x2));
		System.out.println("c1 es distinto a c2: " 
				+ (c1 != c2));
		System.out.println("x1 está entre 10 y 100: " 
				+ (x1 > 10 && x1 < 100));
		System.out.println("x2 no está entre 10 y 100: " 
				+ (x2 < 10 || x2 > 100));
		System.out.println("x3 no está entre 10 y 100: " 
				+ (x3 < 10 || x3 > 100));
		System.out.println("x1 es mayor que x2 y c1 es igual a c2: " 
				+ ((x1 > x2) && (c1 == c2)));
		System.out.println("x1 es menor o igual que 7 y c2 es igual a c1: " 
				+ (x1 <= 7 && c2 == c1));
		System.out.println("c2 es distinto de 'A' y x2 es mayor que 0: " 
				+ (c2 != 'A' && x2 > 0));
		System.out.println("c2 es anterior alfabéticamente a c1: "
				+ (c2 < c1));
		System.out.println("ni x3 es mayor que x1, ni c2 es distinto a c1: "
				+ (!(x3 > x1) && !(c2 != c1)));
		System.out.println("no se cumple que x3 es menor que x1: "
				+ (!(x3 < x1)));
		System.out.println("x2 no está entre x3 y x1, o c2 es igual a c1: "
				+ ((x2 < x3 && x2 > x1) || c2 == c1));
		System.out.println("x3 no está entre x2 y x1: "
				+ (x3 < x2 && x3 > x1));
	}
}
