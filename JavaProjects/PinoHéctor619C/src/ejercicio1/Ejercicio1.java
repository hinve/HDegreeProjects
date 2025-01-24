/* El objetivo del proyecto es usar la clase Punto para hacer uso de Constructores
 * 17/01/2025
 * */

 package ejercicio1;

 public class Ejercicio1 {
     public static void main(String[] args) {
         Punto primer = new Punto(5, 0);
         Punto segundo = new Punto(10, 10);
         Punto tercero = new Punto(-3, 7);
         
         System.out.println(tercero.getX());
         System.out.println(tercero.getY());
         System.out.println(segundo.getX());
         System.out.println(segundo.getY());
         System.out.println(primer.getX());
         System.out.println(primer.getY());
         primer.setX(2);
         primer.setY(1);
         System.out.println(primer.getX());
         System.out.println(primer.getY());
     }
 
 }
 