package parking;

import java.util.Arrays;

import parking.comparadores.MarcaModelo;
import parking.comparadores.Matricula;
import parking.comparadores.TipoCombustible;

public class Parking {
	
	private Vehiculo [] vehiculo;
	private static final int CAPACIDAD=4;
	
	
	public Parking() {
		super();
		this.vehiculo = new Vehiculo[CAPACIDAD];
	}
	
	public boolean meterVehiculoToParking(Vehiculo v) {
		boolean aparcar = false;
		for (int i = 0; !aparcar && i<vehiculo.length; i++) {
			if (vehiculo[i]== null) {
				this.vehiculo[i] = v;
				aparcar = true;
			}
		}
		return aparcar;
	}
	
	
	public Vehiculo sacarVehiculo(String matricula) {
		return null;
	}
	
	public String mostrarVehiculosOrdenadosPorFecha() {
		Arrays.sort(vehiculo);
		return Arrays.toString(vehiculo);
	}
	
	public String mostrarVehiculosOrdenadosPorMarcaYModelo() {
		Arrays.sort(vehiculo, new MarcaModelo());
		return Arrays.toString(vehiculo);
	}

	public String mostrarVehiculosOrdenadosPorTipoYCombustible() {
		Arrays.sort(vehiculo, new TipoCombustible());
		return Arrays.toString(vehiculo);
	}
	
	public String mostrarVehiculosOrdenadosPorMatricula() {
		Arrays.sort(vehiculo, new Matricula());
		return Arrays.toString(vehiculo);
	}

	@Override
	public String toString() {
		return Arrays.toString(vehiculo);
	}
	
	

}
