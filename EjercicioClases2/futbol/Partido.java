package com.edu.futbol;

public class Partido {
	
	private int jornada;
	private char quiniela;
	private Equipo local;
	private Equipo visitante;
	
	public Partido() {
		this.local= new Equipo();
		this.visitante = new Equipo();
	}
	public Partido(int jornada, char quiniela, Equipo local, Equipo visitante) {
		this.local= local;
		this.visitante = visitante;
		this.quiniela=quiniela;
		this.jornada=jornada;
	}
	
	public void ponerResultado(String resultado) {
		String [] part = resultado.split("-");
		String part1 = part[0];
		String part2 = part[1];
		this.local.setNum_goles(Integer.valueOf(part1));
		this.visitante.setNum_goles(Integer.valueOf(part2));
		if (Integer.valueOf(part1)>Integer.valueOf(part2)) {
			this.local.partidosGanados++;
			this.quiniela = '1';
		}else if (Integer.valueOf(part1)>Integer.valueOf(part2)){
			this.visitante.partidosGanados++;
			this.quiniela = '2';
		}else {
			this.quiniela = 'X';
		}
		
	}
	@Override
	public String toString() {
		return "Partido entre equipo local: " +this.local.getNombre_equipo()+ " y el equipo visitante: " +this.visitante.getNombre_equipo()
		+ "\nJugado en el estadio " + this.local.getEstadio()+" de la ciudad de " + this.local.getCiudad()
		+ "\nFinalizado con " +this.local.getNum_goles()+" goles del equipo local y " +this.visitante.getNum_goles()+ " goles de equipo visitante. Resultado quiniela= " + this.quiniela ;
	}
	
	public void cadena() {
		System.out.println("Partido entre el equipo local "+this.local.getNombre_equipo() +" y el equipo visitante " + this.visitante.getNombre_equipo()+" todavia no se ha jugado."); 
	}
	
	
	
	
}
