package common.collections.ejercicio6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Palabra {
	
	private String nombrePalabra; 
	private String significado;
	private Map<String, Set<String>> diccionario;
	
	public Palabra(String nombrePalabra) {
		super();
		this.nombrePalabra = nombrePalabra;
		this.significado = significado;
		this.diccionario = new HashMap<>();
	}
	
	public void agregarPalabra(String nombrePalabra, String significado) {
		diccionario.put(nombrePalabra, new HashSet<>());
		diccionario.get(nombrePalabra).add(significado);
	}
	
	public String buscarPalabra(String nombrePalabra) {
		StringBuilder sb = new StringBuilder();
		if (diccionario.containsKey(nombrePalabra)) {
			sb.append(diccionario.get(nombrePalabra));
		}
		return sb.toString();
	}
	
	public void borrarPalabra(String palabra) {
		if (diccionario.containsKey(palabra)) {
			diccionario.remove(palabra).remove(this.significado);
		}
	}

	public Map<String, Set<String>> listarPalabrasQueEmpiecenPorUnaCadena(String cadena) {
		Map<String, Set<String>> listaOrdenada = new TreeMap<>();
		for (String d : diccionario.keySet()) {
			if (d.startsWith(cadena)) {
				listaOrdenada.put(d, diccionario.get(d));
			}
		}
		return listaOrdenada;
	}

	@Override
	public String toString() {
		return "Diccionario: "
				+ diccionario + "]";
	}
	
	
}
