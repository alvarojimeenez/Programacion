package common.collections.entrega17Abril;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("Alvaro", "Rios", Genero.MASCULINO);
		Persona p2 = new Persona("Raul", "Fernandez", Genero.NEUTRO);
		Persona p3 = new Persona("Marta", "Lopez", Genero.FEMENINO);
		Persona p4 = new Persona("Antonio", "Hernandez", Genero.MASCULINO);
		Persona p5 = new Persona("Jose", "Jimenez", Genero.DESCONOCIDO);
		
		Set<Persona> p = new HashSet<>();
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		p.add(p5);
		
		Mapeando m = new Mapeando();
		
		
		System.out.println(m.mapearPersonasPorGenero(p));
		
		System.out.println(m.contarNumeros(m.generarNumerosAleatorios(20)));
	}

}
