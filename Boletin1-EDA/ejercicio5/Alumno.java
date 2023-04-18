package common.collections.ejercicio5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alumno extends Persona {
	
	private LocalDate fecha_nacimiento;
	public final int MAYOR_EDAD = 18;
	
	public Alumno(String nombre, LocalDate fecha_nacimiento) {
		super(nombre);
		this.fecha_nacimiento = fecha_nacimiento;
	}
	@Override
	public void enviarMensajes(Persona destinatario, String texto) throws Exception {
		if (esMayorDeEdad() || destinatario instanceof Profesor) {
			Mensaje m = new Mensaje(this, texto);
			destinatario.recibirMensaje(m);
		}else {
			throw new Exception("Debe tener 18 años o el destinatario ser un profesor");
		}
	}
	
	public boolean esMayorDeEdad() {
		return (int)ChronoUnit.YEARS.between(this.fecha_nacimiento, LocalDate.now())>=MAYOR_EDAD;
	}
	
	
	
	
	
	

}
