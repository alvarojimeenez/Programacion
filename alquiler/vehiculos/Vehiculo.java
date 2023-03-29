package alquiler.vehiculos;

public abstract class Vehiculo {
	
	private String matricula;
	private Gama gama;
	private double precio_base;
	
	public Vehiculo(String matricula, Gama gama) {
		this.matricula = matricula; 
		this.gama = gama;
		this.precio_base = this.gama.getPrecio();
	}
	
	
	public abstract double calcularPrecioAlquiler(String matricula, int numDias);


	public double getPrecio_base() {
		return this.precio_base;
	}


	public String getMatricula() {
		return matricula;
	}

	
	
	
	
}
