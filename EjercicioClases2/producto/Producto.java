package com.edu.producto;

public class Producto {
	public static final double IVA = 0.20;
	/*
	Crear una clase que represente Producto con las siguientes características:
		• Tienen un código que los identifica de manera única y que se asigna
		automáticamente en el momento de la creación.
		• Guardan la descripción y el precio sin IVA.
		• Todos los productos comparten el mismo IVA (supongamos el 20%), que puede
		variar en función de las decisiones del gobierno.
		La clase Producto debe proporcionar los métodos adecuados:
		• Constructor.
		• Métodos para consulta y modificación de los atributos.
		• Método para calcular el precio de venta del producto que se obtiene sumándole al
		precio el IVA correspondiente.
		Realiza un programa principal que pruebe la clase anterior.
		*/
	
	private int codigo;
	private String descripcion; 
	private int precio_sin_iva; 
	
	
	public Producto(int codigo, String descripcion, int precio_sin_iva) {
		setCodigo(codigo); 
		setDescripcion(descripcion);
		setPrecio_sin_iva(precio_sin_iva);
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public int getPrecio_sin_iva() {
		return precio_sin_iva;
	}


	public void setPrecio_sin_iva(int precio_sin_iva) {
		this.precio_sin_iva = precio_sin_iva;
	}
	
	public double calcular_precio_con_iva() {
		return this.precio_sin_iva+ this.precio_sin_iva* IVA;
	}
	

	@Override
	public String toString() {
		return "El codigo del producto es: "+ codigo+"\nDescripción: " + descripcion + "\nPrecio sin iva: " + precio_sin_iva;
	}
	
	
	
	

}
