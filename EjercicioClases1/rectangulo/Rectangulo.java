package com.edu.rectangulo;

public class Rectangulo {
	
	
	/* 
	Crear una clase Rectangulo con los atributos longitud y ancho, cada uno con un
	valor predeterminado igual a 1. Proporcionar los métodos set y get para los
	atributos longitud y ancho respectivamente. El método set debe verificar que
	longitud y ancho contengan números reales mayores que cero y menores que
	20. Además, proporcionar métodos que calculen el perímetro y el área del
	rectángulo.
	Escribir un método main que solicite los datos de un rectángulo y muestre cual es
	su área y su perímetro. Probar a introducir un dato incorrecto (mayor o igual que
	20).
	 */
	
	
	private double longitud;
	private double ancho;
	
	public Rectangulo() {
		this.longitud = 1;
		this.ancho = 1;
	}
	
	public Rectangulo(double longitud, double ancho) {
		this();
		setLongitud(longitud);
		setAncho(ancho);
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		if(longitud > 0 && longitud < 20) {
			this.longitud = longitud;
		}else {
			System.out.println("La longitud debe ser mayor que 0 y menor que 20");
		}
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		if(ancho > 0 && ancho < 20) {
			this.ancho = ancho;
		}else {
			System.out.println("El ancho debe ser mayor que 0 y menor que 20");
		}
	}
	
	public double getPerimetro() {
		return (longitud*2)+(ancho*2);
	}
	
	public double getArea() {
		return (longitud*ancho);
	}
	
	
	
}
