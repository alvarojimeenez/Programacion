package com.edu.complejo;

public class Complejo {
	
	private double parteReal;
	private double parteImaginaria;
	
	public Complejo(double parteReal, double parteImaginaria) {
		super();
		this.parteReal = parteReal;
		this.parteImaginaria = parteImaginaria;
		
	}
	public Complejo() {
		
	}

	public double getParteReal() {
		return parteReal;
	}

	public void setParteReal(double parteReal) {
		this.parteReal = parteReal;
	}

	public double getParteImaginaria() {
		return parteImaginaria;
	}

	public void setParteImaginaria(double parteImaginaria) {
		this.parteImaginaria = parteImaginaria;
	}
	
	// sumar = (a+b)+(c+d)= a+c + b+d
	// restar = (a+b)-(c+d)= a-c - b-d
	
	public Complejo Sumar(Complejo a, Complejo b) {
		Complejo c = new Complejo();   // inicializar constructor
		
		c.parteReal = a.parteReal + b.parteReal;
		c.parteImaginaria = a.parteImaginaria + b.parteImaginaria;
		return c;
	}
	
	public Complejo Restar(Complejo a, Complejo b) {
		Complejo c = new Complejo();   // inicializar constructor
		
		c.parteReal = a.parteReal - b.parteReal;
		c.parteImaginaria = a.parteImaginaria - b.parteImaginaria;
		return c;
	}
	public void Resultado() {
		System.out.println("("+parteReal+","+parteImaginaria+"i)");
	}
	
	public String Iguales(Complejo a, Complejo b) {
		String mensaje = "";
		if ((a.parteReal== b.parteReal) & (a.parteImaginaria == b.parteImaginaria)) {
			mensaje = "Son iguales";
		}else {
			mensaje = "Son distintos";
		}
		return mensaje;
	}
	
	@Override
	public String toString() {
		return "El resultado de la operacion es " + parteReal + "+" + parteImaginaria + "i";
	}
	

	
	
	
}
