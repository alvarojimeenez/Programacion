package alquiler.vehiculos;

public class Microbus extends Vehiculo{
	
	private int numPlazas;
	private static final double PRECIO_POR_ASIENTO = 5;
	
	public Microbus(String matricula, Gama gama, int numPlazas) {
		super(matricula, gama);
		this.numPlazas = numPlazas;
	}

	@Override
	public double calcularPrecioAlquiler(String matricula, int numDias) {
		return this.getPrecio_base()*numDias+this.numPlazas*PRECIO_POR_ASIENTO;
	}

}
