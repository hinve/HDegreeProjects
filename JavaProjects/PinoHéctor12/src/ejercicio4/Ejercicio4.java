/* El objetivo del proyecto es aprender a trabajar con listas enumeradas
 * Héctor Pino Montiel
 * 02/10/2024
 * */

package ejercicio4;

public class Ejercicio4
{
	public enum SizeBebidas {PEQUEÑA, MEDIANA, GRANDE, EXTRAGRANDE};
	
	public static void main(String[] argv)
	{
		SizeBebidas cafe;
		SizeBebidas zumo;
		SizeBebidas cocaCola;
		SizeBebidas fanta;
		
		cafe = SizeBebidas.PEQUEÑA;
		zumo = SizeBebidas.MEDIANA;
		cocaCola = SizeBebidas.GRANDE;
		fanta = SizeBebidas.EXTRAGRANDE;
		
		System.out.println("Su café será del tamaño: " + cafe);
		System.out.println("Su zumo será del tamaño: " + zumo);
		System.out.println("Su Coca-Cola será del tamaño: " + cocaCola);
		System.out.println("Su Fanta será del tamaño: " + fanta);
	}
}
