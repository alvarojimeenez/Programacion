package com.edu.mock.exam;

public class Plato {
	
	private String nombre;
	private double precio; 
	private static double iva = 0.21;
	private Vino vinoRecomendado;
	
	public Plato() {
		super();
	}
	
	public Plato(String nombre) {
		this.nombre=nombre;
	}
	
	public Plato(String nombre, double precio) {
		this(nombre);
		this.precio=precio;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecioBase() {
		return precio>0? this.precio: -1;
	}
	
	public double getPrecioVentaPublico() {
		return precio + precio * iva;
	}
	
	public String getVinoRecomendado() {
		String mensaje = "";
		if (this.vinoRecomendado!=null) {
			mensaje = this.vinoRecomendado.toString();
		}else {
			mensaje = "Sin recomendaciones para el vino";
		}
		return mensaje;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void incrementaPrecio(double incremento) {
		this.precio+=incremento;
	}

	public void setVinoRecomendado(Vino vinoRecomendado) {
		this.vinoRecomendado = vinoRecomendado;
	}
	
	public void setVinoRecomendado(String nombre, double graduacion) {
		setVinoRecomendado(new Vino(nombre, graduacion));
	}
	
	public double getGradosVinosRecomendado() {
		return this.vinoRecomendado!= null? this.vinoRecomendado.getGraduacion(): 0.0;
	}
	
	public double getIva() {
		return iva;
	}
	
	public boolean equals(Object obj) {
		boolean sonIguales = this==obj;
		
		if (!sonIguales && obj!=null && obj instanceof Plato) {
			Plato casteado = (Plato) obj;
			sonIguales = this.nombre!= null && casteado.nombre!= null && this.nombre.equals(casteado.nombre);
		}
		return sonIguales;
	}

	@Override
	public String toString() {
			return "Plato de " + nombre + " tiene un precio base de " + precio + " y un precio para el publico de " + getPrecioVentaPublico()+
			"\n"+ getVinoRecomendado() ;	
		
	}
	
	

	
	
	
	
	

}
