package PlataformaOnline.jacaranda.com.comparadores;

import java.util.Comparator;

import PlataformaOnline.jacaranda.com.Temporada;

public class ordenaPorNotaMedia implements Comparator<Temporada>{

	@Override
	public int compare(Temporada o1, Temporada o2) {
		return (int) (o1.getNotaMedia()-o2.getNotaMedia());
	}

}
