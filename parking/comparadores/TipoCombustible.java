package parking.comparadores;

import java.util.Comparator;

import parking.Vehiculo;

public class TipoCombustible implements Comparator<Vehiculo> {

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		int resultado = 0;
		if (o1!=null && o2!=null) {
			resultado = (o1.getTipoVehiculo().compareTo(o2.getTipoVehiculo())==0) ? o1.getCombustible().compareTo(o2.getCombustible()) : o1.getTipoVehiculo().compareTo(o2.getTipoVehiculo());
		}else if (o2 == null) {
			resultado = -1; 
		}else {
			resultado = 1;
		}
		return resultado;
	}
	
	
	
	
}
