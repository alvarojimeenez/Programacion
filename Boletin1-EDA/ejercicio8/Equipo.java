package common.collections.ejercicio8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import common.collections.ejercicio8.comparator.ordenarPorNombre;

public class Equipo<T>{
	
	private String nombreEquipo;
	private Set<Alumno> grupoAlumnos;
	
	public Equipo(String nombreEquipo) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.grupoAlumnos = new HashSet<>();
	}
	
	public void addAlumno(Alumno alumno) throws EquipoException {
		if (grupoAlumnos.contains(alumno)) {
			throw new EquipoException("Ya existe ese alumno");
		}else {
			grupoAlumnos.add(alumno);
		}
	}
	
	public void deleteAlumno(Alumno alumno) throws EquipoException {
		if (!grupoAlumnos.contains(alumno)) {
			throw new EquipoException("No existe ese alumno");
		}else {
			grupoAlumnos.remove(alumno);
		}
	}
	
	public boolean perteneceEquipo(Alumno alumno) {
		boolean pertenece = false;
		if (grupoAlumnos.contains(alumno)) {
			pertenece = true;
		}
		return pertenece;
	}
	
	public Set<Alumno> mostrarPersonasEquipo() {
		return grupoAlumnos;
	}
	
	public Set<Object> unionEquipoA(Equipo<T> b) {
		Set<Object> unionEquipoAConB = new HashSet<>();
		unionEquipoAConB.addAll(this.grupoAlumnos);
		unionEquipoAConB.addAll(b.grupoAlumnos);
		return unionEquipoAConB;
	}
	
	public Set<Alumno> unionJugadoresComun(Set<T> b) {
		Set<Alumno> aux = new HashSet<>();
		aux = this.grupoAlumnos;
		aux.retainAll(b);
		return aux;
	}
	
	//AMPLIACIÓN
	
	public String listaJugadoresSexoMasculinoMayorEdad() {
		List<Alumno> listaJugadores = new ArrayList<>();
		Iterator<Alumno> iterator = this.grupoAlumnos.iterator();
		while (iterator.hasNext()) {
			Alumno a = iterator.next();
			if (a.esMayorDeEdad() && a.esMasculino()) {
				listaJugadores.add(a);
				Collections.sort(listaJugadores);
			}
		}
		return listaJugadores.toString();
	}	
	public boolean esFemeninoElEquipo() {
		boolean esFemenino = false; 
		Iterator<Alumno> iterator = this.grupoAlumnos.iterator();
		int contadorMujeres = 0;
		while (iterator.hasNext()) {
			Alumno a = iterator.next();
			if (!a.esMasculino()) {
				contadorMujeres++;
			}
		}
		if (contadorMujeres==this.grupoAlumnos.size()) {
			esFemenino = true;
		}
		return esFemenino;
	}
	
	public int numeroJugadoresSexoFemeninoMayorEdad() {
		Iterator<Alumno> iterator = this.grupoAlumnos.iterator();
		int contadorJugadoras = 0;
		while (iterator.hasNext()) {
			Alumno a = iterator.next();
			if (a.esMayorDeEdad() && !a.esMasculino()) {
				contadorJugadoras++;
			}
		}
		return contadorJugadoras;
	}
	
	public int edadMayor() {
		Iterator<Alumno> iterator = this.grupoAlumnos.iterator();
		int mayor = 0;
		while (iterator.hasNext()) {
			Alumno a = iterator.next();
			if (a.esMayorDeEdad() && !a.esMasculino() && a.getEdad()>mayor) {
				mayor = a.getEdad();
			}
		}
		return mayor;
	}
	
	public Set<String> devolverDniHombresMenores() {
		Iterator<Alumno> iterator = this.grupoAlumnos.iterator();
		Set<String> dni = new HashSet<>(); 
		while (iterator.hasNext()) {
			Alumno a = iterator.next();
			if (!a.esMayorDeEdad() && a.esMasculino()) {
				dni.add(a.getDni());
			}
		}
		return dni;
	}
	
	public List<String> listaNombreJugadoras() {
		Iterator<Alumno> iterator = this.grupoAlumnos.iterator();
		List<String> nombres = new ArrayList<>(); 
		while (iterator.hasNext()) {
			Alumno a = iterator.next();
			if (!a.esMasculino()) {
				nombres.add(a.getNombre());
				Collections.sort(nombres);
			}
		}
		return nombres;
	}
	
	public boolean hayJugadoraMayorDeEdad() {
		boolean existeJugadora = false;
		Iterator<Alumno> iterator = this.grupoAlumnos.iterator();
		while (iterator.hasNext()) {
			Alumno a = iterator.next();
			if (!a.esMasculino() && a.esMayorDeEdad()) {
				existeJugadora = true;
			}
		}
		return existeJugadora;
	}
	
	public int numeroCiudadesDiferentes() {
		Iterator<Alumno> iterator = this.grupoAlumnos.iterator();
		Set<String> ciudades = new HashSet<>();
		while (iterator.hasNext()) {
			Alumno a = iterator.next();
			ciudades.add(a.getCiudad());
		}
		return ciudades.size();
	}

	@Override
	public String toString() {
		return "Equipo: " + nombreEquipo 
			 + "\nAlumnos: " + grupoAlumnos ;
	}
	
	
	
}
