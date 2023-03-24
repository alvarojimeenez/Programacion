package parking.comparadores;

import java.util.Comparator;

import parking.Vehiculo;

public class MarcaModelo implements Comparator<Vehiculo> {

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		int resultado = 0;
		if (o1!=null && o2!=null) {
			resultado = (o1.getMarca().compareTo(o2.getMarca())==0)? o1.getModelo().compareTo(o2.getModelo())
						: o1.getMarca().compareTo(o2.getMarca());
		}else if (o2==null) {
			resultado = -1; 
		}else {
			resultado = 1;
		}
		return resultado;
	}
	
}
