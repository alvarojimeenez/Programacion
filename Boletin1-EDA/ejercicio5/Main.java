package common.collections.ejercicio5;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Persona p1 = new Profesor("José Manuel");
		Persona p2 = new Alumno("Alvaro", LocalDate.of(1999, 10, 5));
		Persona p3 = new Profesor("Carlos");
		
		try {
			p1.enviarMensajes(p2, "Hola");
			p1.enviarMensajes(p2, "Adios");
			p3.enviarMensajes(p2, "Bienvenido");
			p1.enviarMensajes(p2, "Buenos días");
			p1.enviarMensajes(p2, "Hoy es viernes");
			p2.enviarMensajes(p1, "Hola Jose Manuel");
			System.out.println(p2.buscarMensaje("Bienvenido"));
			//System.out.println(p2.mostrarMensajes());
			//p2.borrarMensajeBuzon(20);
			//System.out.println(p2.mostrarMensajes());
			//System.out.println("------------------");
			//System.out.println(p1.mostrarOrdenarPorNombre());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
