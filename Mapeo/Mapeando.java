package common.collections.entrega17Abril;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

public class Mapeando {

	/**
	 * Recibe una colección de personas y las agrupa por género
	 * @param personas
	 * @return Mapa con la colección de personas clasificadas por género
	 */
	public Map mapearPersonasPorGenero(Collection<Persona> personas) {
		Map<Genero, Set<Persona>> persona = new HashMap<>();
		for (Persona p : personas) {
			if (persona.containsKey(p.getGenero())) {
				persona.get(p.getGenero()).add(p);
			}else {
				persona.put(p.getGenero(), new HashSet<>());
				persona.get(p.getGenero()).add(p);
			}
		}
		return persona;
	}

	
	
	/**
	 * Recibe una colección de números y cuenta cuantas ocurrencias hay de cada uno de ellos
	 * creando un mapa en el que aparece cada número junto a su frecuencia de aparición 
	 * @param numeros
	 * @return Tabla de frecuencias de los números facilitados
	 */
	public Map<Integer, Integer> contarNumeros(Collection<Integer> numeros){
		Map<Integer, Integer> numero = new HashMap<>();
		int contador = 0;
		for (Integer n : numeros) {
			for (Integer i : numeros) {
				if (n==i) {
					contador++;
				}
			}
			numero.put(n, contador);
		}
		return numero;
	}
	
	
	/**
	 * Genera una lista de números aleatorios entre 0 y 20 del tamaño indicado
	 * @param size tamaño de la lista
	 * @return lista de size números aleatorios
	 */
	public static Collection<Integer> generarNumerosAleatorios(int size){
		List<Integer> numeros = new ArrayList<>() {{
			for(int i=0; i<size; i++) {
				add(new Random().nextInt(0, 20));
			}
		}};
		
		return numeros;
	}
}
