package main.java;

import java.util.Set;

import main.java.model.Caseta;
import main.java.model.Feria;
import main.java.xml.reader.CasetaXML;

public class PrincipalCaseta {

	public static void main(String[] args) {
		
		Set<Caseta> casetas = new CasetaXML().cargarDatos("./files/casetaferia.xml");
		
	/*	for (Caseta c : casetas) {
			System.out.println(c);
		}*/
		
		Feria f = new Feria();
		f.addCasetas(casetas);
		System.out.println(f.mostrarCasetasDeUnaCalle("PASCUAL MARQUEZ"));
		System.out.println(f.mostrarCasetasDeTipoDistrito());
		System.out.println(f.mostrarCasetasDeTipoFamiliar());
		System.out.println(f.mostrarCasetasNiFamiliarNiDistrito());
		System.out.println(f.mostrarNumeroDeCasetasDeTipoDistrito());
		System.out.println(f.mostrarNumeroDeCasetasDeTipoFamiliar());
		try {
			f.eliminarCaseta("PASCUAL MARQUEZ", 10);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
