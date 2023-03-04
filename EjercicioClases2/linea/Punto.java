package com.edu.linea;

public class Punto {
	
	private double x;
	private double y;
	
	public Punto() {
		this.x=0;
		this.y=0;
		
	}
	
	public Punto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void moverDerecha(double desplazamiento) {
		this.x+=desplazamiento;
	}
	public void subir(double desplazamiento) {
		this.y+=desplazamiento;
	}

	@Override
	public String toString() {
		return  this.x +"," + this.y;
	}
	
	
}
