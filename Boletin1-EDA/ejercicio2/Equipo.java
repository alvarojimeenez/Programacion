package common.collections.ejercicio2;

import java.util.HashSet;
import java.util.Set;

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

	@Override
	public String toString() {
		return "Equipo: " + nombreEquipo 
			 + "\nAlumnos: " + grupoAlumnos ;
	}
	
	
	
}
