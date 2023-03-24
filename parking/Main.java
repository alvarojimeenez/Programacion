package parking;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Parking p = new Parking();
		p.meterVehiculoToParking(new Vehiculo("Seat", "León", "4669 BLL", Combustible.GASOIL, LocalDateTime.of(2023, 2, 28, 5, 30), TipoVehiculo.AUTOMOVIL));
		p.meterVehiculoToParking(new Vehiculo("Citroen", "Berlingo", "4669 GHJ", Combustible.GASOLINA, LocalDateTime.of(2022, 5, 29, 4, 30), TipoVehiculo.TRANSPORTECOLECTIVO));
		p.meterVehiculoToParking(new Vehiculo("Volswagen", "Polo", "3478 GFR", Combustible.HIBRIDO, LocalDateTime.of(2012, 2, 6, 23, 30), TipoVehiculo.AUTOMOVIL));
		p.meterVehiculoToParking(new Vehiculo("Renault", "Clio", "2345 SDF", Combustible.ELECTRICO, LocalDateTime.of(2008, 2, 28, 21, 30), TipoVehiculo.AUTOMOVIL));
		
		System.out.println(p.mostrarVehiculosOrdenadosPorFecha());
		
		System.out.println(p.mostrarVehiculosOrdenadosPorMarcaYModelo());
		
		System.out.println(p.mostrarVehiculosOrdenadosPorTipoYCombustible());
		
		System.out.println(p.mostrarVehiculosOrdenadosPorMatricula());
	}

}
