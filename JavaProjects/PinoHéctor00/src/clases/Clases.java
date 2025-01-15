package clases;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Clases {
	
	static class Alumno {
		// Atributos de clase
		public static final int NUMERO_MAX_ALU_GRUPO = 20;
		public static final int NUMERO_MIN_ALU_GRUPO = 5;

		// Atributos de clase variables
		private static int numeroAlumnos;
		public static int numeroMaxAlumnos; 
		private static LocalDateTime horaMaxTodos;
		
		// Atributos de objeto
		/*
		 * private final double     capacidadDeposito;     // Capacidad del depósito de combustible del vehículo (en litros)
  			private final String     matricula;             // Matrícula del vehículo
  			private final LocalDate  fechaMatriculacion;    // Fecha de matriculación del vehículo 
  			private final double     consumoMedio;
		 */
		
		// Atributos de objeto variables
		private String dni;
		private String nombre; 
		private String apellidos;
		private LocalDate fechaDeNacimiento;
		private double peso;
		private double altura;
		private boolean esMayorEdadDic;
		private int numHermanos;
		private LocalDateTime horaMax;
		
		public Alumno (String nombre) {
			this.nombre = nombre;
		}
		
		String getNombre() {
			return this.nombre;
		}
	}

	public static void main(String[] args) {
		Alumno estudiante = new Alumno("Antonio");
		System.out.println(estudiante.getNombre());
	}

}
