package common.collections.mock.exam;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	
	
	
	
}
