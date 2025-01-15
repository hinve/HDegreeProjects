package ejercicio2;

class Persona {
	String dni;
	String nombre;
	String apellidos;
	byte edad;
	
	public static String aString(Persona Persona) {
		String cadena;
		cadena = Persona.nombre + " " + Persona.apellidos + " con dni " + Persona.dni + " tiene " + Persona.edad + " años.";
		return cadena;
	}
}
