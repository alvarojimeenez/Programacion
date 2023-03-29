package blocNotas;

import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		
		
		try {
			Nota n = new NotaAlarma("hola", LocalDateTime.of(2022, 10, 1, 12, 34), false);
			Nota n1 = new NotaAlarma("Despierta ya", LocalDateTime.of(2015, 10, 1, 12, 34), false);
			Nota n2 = new NotaAlarma("Despierta jose juan", LocalDateTime.of(2001, 10, 1, 12, 34), true);
			Bloc b = new Bloc("Nuevo bloc");
			b.addNotas(n);
			b.addNotas(n1);
			b.addNotas(n2);
			System.out.println(b);
			System.out.println("----------------------");
			System.out.println(b.ordenaBloc());
			System.out.println(n.equals(n1));
		} catch (NotaAlarmaException e) {
			e.printStackTrace();
		}
		
		
		

	}

}
