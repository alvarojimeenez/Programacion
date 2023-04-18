package common.collections.ejercicio5;

import java.time.LocalDateTime;

public class Mensaje implements Comparable<Mensaje>{
	
	private Persona nombreRemitente; 
	private String textoMensaje; 
	private LocalDateTime fecha_y_hora;
	private static int num_mensaje=1;
	
	public Mensaje(Persona nombreRemitente, String textoMensaje) throws Exception {
		super();
		if (nombreRemitente==null || textoMensaje == null) {
			throw new Exception("El nombre del remitente o texto no puede ser nulo");
		}
		this.nombreRemitente = nombreRemitente;			
		this.textoMensaje = textoMensaje;
		this.fecha_y_hora = LocalDateTime.now();
		
		
	}

	@Override
	public String toString() {
		return "\nMensaje "+ getNum_mensaje() +"\nDe: " +nombreRemitente.getNombre() + "\nTexto: " + textoMensaje + "\nFecha y hora: "
				+ fecha_y_hora;
	}

	public int getNum_mensaje() {
		return num_mensaje++;
	}

	@Override
	public int compareTo(Mensaje o) {
		return this.nombreRemitente.getNombre().compareTo(o.nombreRemitente.getNombre());
	}

	public String getTextoMensaje() {
		return textoMensaje;
	}

	
	
	
	
	
	
}
