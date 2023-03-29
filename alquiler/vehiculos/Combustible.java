package alquiler.vehiculos;

public enum Combustible {
	GASOLINA(3.5),DIESEL(2);
	
	private double precioCombustiblePorDia;

	private Combustible(double precioCombustiblePorDia) {
		this.precioCombustiblePorDia = precioCombustiblePorDia;
	}

	public double getPrecioCombustiblePorDia() {
		return precioCombustiblePorDia;
	}
	
	
}
