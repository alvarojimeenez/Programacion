package main.java.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class Feria {
	
	private Set<Caseta> casetas;
	
	
	public Feria() {
		casetas = new HashSet<>();
	}
	
	public void addCasetas(Set<Caseta> casetas) {
		this.casetas.addAll(casetas);
	}
	
	public String mostrarCasetasDeUnaCalle(String calle) {
		StringBuilder sb = new StringBuilder();
		Iterator<Caseta> it = casetas.iterator();
		
		while (it.hasNext()) {
			Caseta c = it.next();
			if (c.getCalle().equals(calle)) {
				sb.append(c);
			}
		}
		return sb.toString();
	}
	
	public String mostrarCasetasDeTipoFamiliar() {
		StringBuilder sb = new StringBuilder();
		Iterator<Caseta> it = casetas.iterator();
		while (it.hasNext()) {
			Caseta c = it.next();
			if (c.getClase().equals(Clase.FAMILIAR)) {
				sb.append(c);
			}
		}
		return sb.toString();
	}
	
	public String mostrarCasetasDeTipoDistrito() {
		StringBuilder sb = new StringBuilder();
		Iterator<Caseta> it = casetas.iterator();
		while (it.hasNext()) {
			Caseta c = it.next();
			if (c.getClase().equals(Clase.DISTRITO)) {
				sb.append(c);
			}
		}
		return sb.toString();
	}
	
	public String mostrarCasetasNiFamiliarNiDistrito() {
		StringBuilder sb = new StringBuilder();
		Iterator<Caseta> it = casetas.iterator();
		while (it.hasNext()) {
			Caseta c = it.next();
			if (!(c.getClase().equals(Clase.DISTRITO) || c.getClase().equals(Clase.FAMILIAR))) {
				sb.append(c);
			}
		}
		return sb.toString();
	}
	
	public Map<String,Integer> mostrarNumeroDeCasetasDeTipoFamiliar() {
		Map<String,Integer> aux = new HashMap<>();
		for (Caseta c : this.casetas) {
			if (!aux.containsKey(c.getCalle())) {
				aux.put(c.getCalle(), 0);
			}else if (aux.containsKey(c.getCalle()) && c.getClase().equals(Clase.FAMILIAR)){
				aux.put(c.getCalle(),aux.get(c.getCalle())+1);
			}
		}
		return aux;
	}
	
	public Map<String,Integer> mostrarNumeroDeCasetasDeTipoDistrito() {
		Map<String,Integer> aux = new HashMap<>();
		for (Caseta c : this.casetas) {
			if (!aux.containsKey(c.getCalle())) {
				aux.put(c.getCalle(), 0);
			}else if (aux.containsKey(c.getCalle()) && c.getClase().equals(Clase.DISTRITO)){
				aux.put(c.getCalle(),aux.get(c.getCalle())+1);
			}
		}
		return aux;
	}
	
	public void eliminarCaseta(String calle, int numero) throws Exception {
		Iterator<Caseta> it = casetas.iterator();
		while (it.hasNext()) {
			Caseta c = it.next();
			if (c.getCalle().equals(calle) && c.getNumero()==numero) {
				this.casetas.remove(c);
			}else {
				throw new Exception("No existe esa caseta con esa calle y número");
			}
		}
	}

	
	
	
}
