package com.edu.mock.exam;

public class Vino {
	
	private String nombreVino;
	private double graduacion;
	
	public Vino(String nombreVino) {
		this.nombreVino = nombreVino;
	}
	
	public Vino(String nombreVino, double graduacion) {
		this(nombreVino);
		this.graduacion=graduacion;
	}

	public String getNombreVino() {
		return nombreVino;
	}

	public double getGraduacion() {
		return graduacion;
	}
	
	public boolean equals(Object obj) {
		boolean sonIguales = this==obj;
		
		if (!sonIguales && obj!=null && obj instanceof Vino) {
			Vino casteado = (Vino) obj;
			sonIguales = this.nombreVino!= null && casteado.nombreVino!= null && this.nombreVino.equals(casteado.nombreVino);
		}
		return sonIguales;
	}

}
