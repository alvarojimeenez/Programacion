package common.collections.mock.exam;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		try {
			Historial h = new Historial();
			Combinacion boleto = new Combinacion(12, 34, 44, 1, 3, 10, 7);
			Combinacion boleto2 = new Combinacion(4, 7, 5, 6, 34, 2, 5);
			Combinacion ganadora = new Combinacion(12, 2, 5, 16, 25, 6, 7);
			System.out.println(boleto.comprobarCombinacion(ganadora));
			System.out.println("---------------------------");
			h.addSorteo(LocalDate.of(2020, 10, 20), ganadora);
			h.addSorteo(LocalDate.of(2023, 10, 25), boleto2);
			h.addSorteo(LocalDate.of(2021, 2, 12), boleto);
			System.out.println(h.mostrarHistorico());
			System.out.println("---------------------------");
			System.out.println(h.actualizarSorteo(LocalDate.of(2020, 10, 20), boleto));
			System.out.println(h.mostrarHistorico());
			System.out.println("----------------------------");
			System.out.println(h.borrarSorteo(LocalDate.of(2020, 10, 20)));
			System.out.println(h.mostrarHistorico());
			System.out.println("-----------------------");
			System.out.println(h.listarSorteosDesdeFecha(LocalDate.of(2021, 1, 20)));
			System.out.println("--------------------------");
			System.out.println(h.comprobarAciertos(LocalDate.of(2021, 2, 12), ganadora));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
