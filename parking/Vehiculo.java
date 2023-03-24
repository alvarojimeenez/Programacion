package parking;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Vehiculo implements Comparable<Vehiculo> {
	public static final int LONGITUD_MAXIMA_MATRICULA = 8;
	
	private String marca; 
	private String modelo;
	private String matricula;
	private Combustible combustible;
	private LocalDateTime fecha_entrada;
	private TipoVehiculo tipoVehiculo;
	
	public Vehiculo() {
		this.marca = marca; 
		this.modelo = modelo;
		this.matricula = matricula;
		this.combustible = combustible;
		this.tipoVehiculo = tipoVehiculo;
	}
	
	

	public Vehiculo(String marca, String modelo, String matricula, Combustible combustible, LocalDateTime fecha_entrada,
			TipoVehiculo tipoVehiculo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.fecha_entrada = fecha_entrada;
		this.combustible = combustible;
		
		this.tipoVehiculo = tipoVehiculo;
	}



	public String getMatricula() {
		String mensaje = "";
		if (esMatriculaCorrecta(matricula)) {
			mensaje = matricula;
		}else {
			mensaje = "La matricula introducida es incorrecta";
		}
		return mensaje;
	}
	
	public boolean esMatriculaCorrecta(String matricula) {
		boolean son_numeros = false; 
		boolean son_letras = false;
		String[] parts = matricula.split(" ");
		String part1 = parts[0]; 
		String part2 = parts[1];
		int contadorNumeros = 0;
		int contadorLetras = 0;
		if (matricula.length()==LONGITUD_MAXIMA_MATRICULA) {
			for (int i=0; i<part1.length(); i++) {
				char c = part1.charAt(i);
				if (Character.isDigit(c)) {
					contadorNumeros++;
				}
			}
			if (contadorNumeros==part1.length()) {
				son_numeros = true;
			}
			for (int i=0; i<part2.length(); i++) {
				char c = part2.charAt(i);
				if (Character.isLetter(c)) {
					contadorLetras++;
				}
			}
			if (contadorLetras==part2.length()) {
				son_letras = true;
			}
		}
		return son_numeros && son_letras; 
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public Combustible getCombustible() {
		return combustible;
	}

	public LocalDateTime getFecha_entrada() {
		return fecha_entrada;
	}

	public TipoVehiculo getTipoVehiculo() {
		return tipoVehiculo;
	}

	

	@Override
	public String toString() {
		return tipoVehiculo + " " + marca + " " + modelo + " con matricula "
				+ matricula + " y combustible " + combustible + " con fecha de entrada " + this.fecha_entrada+"\n";
	}



	@Override
	public int compareTo(Vehiculo v) {
		return (int) this.fecha_entrada.compareTo(v.fecha_entrada);
	}
	
	
	
	
	
	
}
