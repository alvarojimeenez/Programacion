package parking.comparadores;

import java.util.Comparator;

import parking.Vehiculo;

public class Matricula implements Comparator<Vehiculo>{

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		return o1.getMatricula().compareTo(o2.getMatricula());
	}
	

}
