package common.collections.ejercicio8.comparator;

import java.util.Comparator;

import common.collections.ejercicio8.Alumno;

public class ordenarPorNombre implements Comparator<Alumno>{

	@Override
	public int compare(Alumno o1, Alumno o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}
	
	

}
