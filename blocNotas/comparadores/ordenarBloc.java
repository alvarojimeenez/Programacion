package blocNotas.comparadores;

import java.util.Comparator;

import blocNotas.Bloc;
import blocNotas.Nota;

public class ordenarBloc implements Comparator<Nota> {

	@Override
	public int compare(Nota o1, Nota o2) {
		return o1.getFechaCreacion().compareTo(o2.getFechaCreacion());
	}

	
	
	
}
