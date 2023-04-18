package common.collections.ejercicio4;

import java.time.LocalDateTime;

public class PaginaWeb {
	
	private String nombrePaginaWeb;
	private String url; 
	private LocalDateTime fecha_visita;
	
	public PaginaWeb(String nombrePaginaWeb) {
		super();
		this.nombrePaginaWeb = nombrePaginaWeb;
		this.getUrl();
		this.fecha_visita = LocalDateTime.now();
	}
	
	

	public LocalDateTime getFecha_visita() {
		return fecha_visita;
	}



	public String getNombrePaginaWeb() {
		return nombrePaginaWeb;
	}



	public String getUrl() {
		return "www."+this.nombrePaginaWeb+".com";
	}



	@Override
	public String toString() {
		return nombrePaginaWeb + ", url: " + getUrl() + ", fecha visita: " + fecha_visita;
	}
	
	
	
	
}
