package common.collections.mock.exam;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Historial {
	
	private Map<LocalDate, Combinacion> sorteos;

	public Historial() {
		super();
		this.sorteos = new HashMap<>();
	}
	
	public void addSorteo(LocalDate fecha, Combinacion c) throws Exception {
		if (fecha == null || c == null) { 
			throw new HistorialException("Datos no válidos");
		}else {
			sorteos.put(fecha, c);
		}
	}
	
	public void addSorteo(int dia, int mes, int agnio, Combinacion c) throws Exception {
		LocalDate fecha = LocalDate.of(dia, mes, agnio);
		if (fecha == null || c == null) { 
			throw new HistorialException("Datos no válidos");
		}else {
			sorteos.put(fecha, c);
		}
	}
	
	public boolean actualizarSorteo(LocalDate fecha, Combinacion c) {
		boolean actualizado = false;
		if (this.sorteos.containsKey(fecha) ) {
			this.sorteos.put(fecha, c);
			actualizado = true;
		}
		return actualizado;
	}
	
	public boolean actualizarSorteo(int dia, int mes, int agnio, Combinacion c) {
		LocalDate fecha = LocalDate.of(dia, mes, agnio);
		boolean actualizado = false;
		if (this.sorteos.containsKey(fecha) ) {
			this.sorteos.put(fecha, c);
			actualizado = true;
		}
		return actualizado; 
	}
	
	public boolean borrarSorteo(LocalDate fecha) {
		boolean borrado = false;
		if (this.sorteos.containsKey(fecha)) {
			this.sorteos.remove(fecha);
			borrado = true;
		}
		return borrado;
	}
	
	public List<String> listarSorteosDesdeFecha(LocalDate fecha) {
		List<String> aux = new ArrayList<>();
		for (LocalDate f : this.sorteos.keySet()) {
			if (f.isAfter(fecha)) {
				aux.add(sorteos.get(f).toString());
			}
		}
		return aux;
	}
	
	public List<String> mostrarHistorico() {
		List<String> aux = new ArrayList<>();
		for (LocalDate f : this.sorteos.keySet()) {
			aux.add(sorteos.get(f).toString());
		}
		return aux;
	}
	
	public Map<String, Integer> comprobarAciertos(LocalDate fecha, Combinacion c) {
		Map<String, Integer> aux = new HashMap<>();
		for (LocalDate f : this.sorteos.keySet()) {
			if (fecha.equals(f)) {
				aux.put(sorteos.get(f).toString(), sorteos.get(f).comprobarCombinacion(c));
			}
		}
		return aux;
	}
	
	public Map<LocalDate,Combinacion> mostrarMapaHistorico() {
		return this.sorteos;
	}
	
	public Set<Integer> mostrarNumeroMasRepetido() {
		Map<Integer,Integer> map = numerosRepetidos();
		
		int contador = 0;
		Set<Integer> repetidos = new HashSet<>();
		for (Integer n : map.keySet()) {
			if (map.get(n)==contador) {
				repetidos.add(n);
				
			}else if (map.get(n)>contador) {
				contador = map.get(n);
				repetidos.clear();
				repetidos.add(n);
			}
			}
		return repetidos;
		}
		
	public Set<Integer> mostrarEstrellaMasRepetida() {
		Map<Integer,Integer> map = estrellasRepetidas();
		
		int contador = 0;
		Set<Integer> repetidos = new HashSet<>();
		for (Integer n : map.keySet()) {
			if (map.get(n)==contador) {
				repetidos.add(n);
				
			}else if (map.get(n)>contador) {
				contador = map.get(n);
				repetidos.clear();
				repetidos.add(n);
			}
			}
		return repetidos;
		}
		

	protected Map<Integer, Integer> numerosRepetidos() {
		Map<Integer,Integer> mapa = new HashMap<>();
		for (LocalDate f: this.sorteos.keySet()) {
			for (Integer n : this.sorteos.get(f).getNumeros()) {
				if (!mapa.containsKey(n)) {
					mapa.put(n, 0);	
				}
				mapa.put(n, mapa.get(n)+1);
			}
		}
		return mapa;
	}
	
	protected Map<Integer, Integer> estrellasRepetidas() {
		Map<Integer,Integer> mapa = new HashMap<>();
		for (LocalDate f: this.sorteos.keySet()) {
			for (Integer e : this.sorteos.get(f).getEstrellas()) {
				if (!mapa.containsKey(e)) {
					mapa.put(e, 0);	
				}
				mapa.put(e, mapa.get(e)+1);
			}
		}
		return mapa;
	}
	
	public int maximoNumeroAciertos(Combinacion c) {
		int contador = 0;
		for (LocalDate f : this.sorteos.keySet()) {
			contador = this.sorteos.get(f).comprobarCombinacion(c);
		}
		return contador;
	}
	
	
	
	
}
