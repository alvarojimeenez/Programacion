package alquiler.vehiculos;

public class Coche extends Vehiculo {
	
	private Combustible tipoCombustible;
	
	public Coche(String matricula, Gama gama, Combustible tipoCombustible) {
		super(matricula, gama);
		this.tipoCombustible = tipoCombustible;
	}

	@Override
	public double calcularPrecioAlquiler(String matricula, int numDias) {
		return (this.getPrecio_base()+this.tipoCombustible.getPrecioCombustiblePorDia())*numDias;
	}
	
	
}
