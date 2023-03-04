package com.edu.futbol;

public class Equipo {
	
	private String nombre_equipo;
	private int num_goles;
	private String estadio;
	private String ciudad;
	public int partidosGanados=0;
	
	
	public Equipo() {
		super();
	}
	
	public Equipo(String nombre_equipo, int num_goles, String estadio, String ciudad) {
		this.nombre_equipo=nombre_equipo;
		this.num_goles=num_goles;
		this.estadio=estadio;
		this.ciudad=ciudad;
		
	
		
	
	}

	public int getNum_goles() {
		return num_goles;
	}

	public void setNum_goles(int num_goles) {
		this.num_goles = num_goles;
	}

	public int getPartidosGanados() {
		return partidosGanados;
	}

	public String getNombre_equipo() {
		return nombre_equipo;
	}

	public String getEstadio() {
		return estadio;
	}

	public String getCiudad() {
		return ciudad;
	}

	
	
	
}
