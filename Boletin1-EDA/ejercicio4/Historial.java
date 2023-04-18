package common.collections.ejercicio4;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Historial {
	
	private List<PaginaWeb> paginas;
	
	public Historial() {
		super();
		this.paginas = new ArrayList<>(); 
	}

	public List<PaginaWeb> consultarHistorialCompleto() {
		return this.paginas;
	}
	
	public List<PaginaWeb> consultarHistorialDeUnDia(LocalDateTime fecha) {
		List<PaginaWeb> aux = new ArrayList<>();
		if (this.paginas.contains(fecha)) {
			aux.addAll(this.paginas);
		}
		return aux;
	}
	
	public void nuevaConsulta(PaginaWeb p) {
		this.paginas.add(p);	
	}
	
	public void borrarHistorialCompleto() {
		this.paginas.clear();
	}
	
	public void borrarVisitasDeUnaPagina(String nombrePaginaWeb) {
		Iterator<PaginaWeb> iterator = paginas.iterator();
		while (iterator.hasNext()) {
			PaginaWeb p = iterator.next();
			if (p.getNombrePaginaWeb().equals(nombrePaginaWeb)){
				iterator.remove();
			}
		}
	}

	@Override
	public String toString() {
		return "HISTORIAL -->" + this.paginas;
	}
	
	
}
