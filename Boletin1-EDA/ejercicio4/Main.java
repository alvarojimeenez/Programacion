package common.collections.ejercicio4;

import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		PaginaWeb p = new PaginaWeb("google");
		PaginaWeb z = new PaginaWeb("marca");
		PaginaWeb a = new PaginaWeb("amazon");
		
		Historial h = new Historial();
		h.nuevaConsulta(p);
		h.nuevaConsulta(z);
		h.nuevaConsulta(z);
		h.nuevaConsulta(a);
		h.nuevaConsulta(p);
		h.nuevaConsulta(a);
		System.out.println(h);
		h.borrarVisitasDeUnaPagina("google");
		System.out.println(h);
		System.out.println("-----------------------");
		System.out.println(h.consultarHistorialDeUnDia(LocalDateTime.of(2023, 4, 12, 19, 27)));
		h.borrarHistorialCompleto();
		System.out.println(h);
	}

}
