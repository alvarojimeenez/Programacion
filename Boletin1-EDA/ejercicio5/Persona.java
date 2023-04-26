package common.collections.ejercicio5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class Persona {
	
	private String nombre;
	private List<Mensaje> buzon;
	
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
		this.buzon = new ArrayList<>();
	}
	

	public abstract void enviarMensajes(Persona destinatario, String texto) throws Exception;

	protected void recibirMensaje(Mensaje m) {
		this.buzon.add(m);
	}

	public String getNombre() {
		return nombre;
	}
	
	public String mostrarMensajes() throws Exception {
		if (this.buzon.isEmpty()) {
			throw new Exception("No tiene mensajes para leer");
		}else {
			return this.buzon.toString();
		}
	}
	
	public String mostrarOrdenarPorNombre() {
		Collections.sort(this.buzon);
		return this.buzon.toString();
	}
	
	public void borrarMensajeBuzon(int num_mensaje) throws Exception {
		Iterator<Mensaje> it = buzon.iterator();
		int tmp = -1;
		while (it.hasNext()) {
			Mensaje m = it.next();
			if (m.getNum_mensaje()==num_mensaje) {
				it.remove();
				tmp = 1;
			}
		}
		if (tmp == -1) {
			throw new Exception("No existe ese numero de mensaje");
		}
	}
	
	
	public String buscarMensaje(String frase) throws Exception {
		List<Mensaje> aux = new ArrayList<>();
		Iterator<Mensaje> it = buzon.iterator();
		int tmp = -1;
		while (it.hasNext()) {
			Mensaje m = it.next();
			if (m.getTextoMensaje().contains(frase)) {
				aux.add(m);
				tmp=1;
			}
		}
		if (tmp == -1) {
			throw new Exception("No existe ningún mensaje con esa frase");
		}
		return aux.toString();
	}
	
	
	
	

	
	
	
}
