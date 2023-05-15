package PlataformaOnline.jacaranda.com.comparadores;

import java.util.Comparator;

import PlataformaOnline.jacaranda.com.Serie;

public class ordenaSeriePorAño implements Comparator<Serie>{

	@Override
	public int compare(Serie o1, Serie o2) {
		return o1.getAnno()-o2.getAnno();
	}

}
