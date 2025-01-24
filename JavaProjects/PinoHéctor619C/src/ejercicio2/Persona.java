package ejercicio2;

class Persona {
	private String dni;
	private String nombre;
	private String apellidos;
	private byte edad;

	public Persona (String dni, String nombre, String apellidos, byte edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
	public static String aString(Persona Persona) {
		String cadena;
		cadena = Persona.nombre + " " + Persona.apellidos + " con dni " + Persona.dni + " tiene " + Persona.edad + " años.";
		return cadena;
	}

	public String getNombre () {
		String str;
		str = new String(nombre);
		return str;
	}

	public String getApellidos () {
		String str;
		str = new String(apellidos);
		return str;
	}

	public byte getEdad () {
		return edad;
	}

	public void setDni (String dni) {
		this.dni = dni;
	}

	public void setNombre (String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos (String apellidos) {
		this.apellidos = apellidos;
	}

	public void setEdad (byte edad) {
		this.edad = edad;
	}
}
