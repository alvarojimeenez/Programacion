package common.collections.ejercicio8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;
import java.util.Collections;
public class Alumno implements Comparable<Alumno> {

	private String nombre;
	private String dni;
	private int edad; 
	private char sexo; 
	private String ciudad;
	private static final int MAYOR_EDAD = 18;
	private Map<String, List<Character>> alumnos;

	public Alumno(String nombre, String dni, int edad, char sexo, String ciudad) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad; 
		this.sexo = sexo; 
		this.ciudad = ciudad;
		alumnos = new HashMap<>();
	}
	
	public int getEdad() {
		return edad;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	public String getCiudad() {
		return ciudad;
	}

	public boolean esMayorDeEdad() {
		boolean mayor = false;
		if (this.edad>=MAYOR_EDAD) {
			mayor = true;
		}
		return mayor;
	}
	

	public boolean esMasculino() {
		boolean masculino = false; 
		if (sexo == 'H') {
			masculino = true;
		}
		return masculino;
	}

	@Override
	public String toString() {
		return "Nombre-->" + nombre + ", DNI-->" + dni + " Edad-->" +edad;
	}
	
	public boolean equals (Object obj) {
		boolean sonIguales = this == obj;
		if (!sonIguales && obj!=null && obj instanceof Alumno) {
			Alumno casteado = (Alumno) obj;
			sonIguales = this.dni.equals(casteado.dni);
		}
		return sonIguales;
	}

	@Override
	public int compareTo(Alumno o) {
		int resultado;
		if (this.edad>o.edad) {
		      resultado = 1;
		    }else if (this.edad<o.edad) {
		      resultado = -1;
		    }else {
		      resultado = 0;
		    }
		return resultado;
	}

}
