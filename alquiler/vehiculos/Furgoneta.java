package alquiler.vehiculos;

public class Furgoneta extends Vehiculo{
	
	private static final double PMA= 250;
	
	public Furgoneta(String matricula, Gama gama) {
		super(matricula, gama);
	}

	@Override
	public double calcularPrecioAlquiler(String matricula, int numDias) {
		return this.getPrecio_base()*numDias+ (0.5*PMA);
	}
	

	
}
