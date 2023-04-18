package common.collections.ejercicio5;


public class Profesor extends Persona {

	public Profesor(String nombre) {
		super(nombre);
	}

	@Override
	public void enviarMensajes(Persona destinatario, String texto) throws Exception {
		Mensaje m = new Mensaje(this,texto);
		destinatario.recibirMensaje(m);
		
	}

	

}
