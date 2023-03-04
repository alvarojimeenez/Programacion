package com.edu.linea;

public class Linea {
	
	
	private Punto puntoA;
	private Punto puntoB;
	
	
	public Linea() {
		this.puntoA = new Punto();
		this.puntoB = new Punto();
	}
	public Linea(Punto puntoA, Punto puntoB) {
		this.puntoA = puntoA;
		this.puntoB = puntoB;
	}
	
	public void moverDerecha (double desplazamiento) {
		this.puntoA.moverDerecha(desplazamiento);
		this.puntoB.moverDerecha(desplazamiento);
	}
	
	public void moverIzquierda (double desplazamiento) {
		moverDerecha(-desplazamiento);
	}
	
	public void subir(double desplazamiento) {
		this.puntoA.subir(desplazamiento);
		this.puntoB.subir(desplazamiento);
	}
	public void bajar(double desplazamiento) {
		subir(-desplazamiento);
	}
	@Override
	public String toString() {
		return "Linea [("+ this.puntoA +"),(" + this.puntoB + ")]";
	}
	
	
	
}
