package mock.exam;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*
		Un teclado electrónico emite una de las siete notas musicales cada vez que se pulsa la tecla
		adecuada. Al pulsar cada tecla el instrumento calcula la frecuencia en Hercios (Hz) de la nota
		asociada y emite el sonido correspondiente.
		
		Elabora una función que reciba el string de la tecla que se ha pulsado en mayúsculas o
		minúsculas (do, re, mi, etc.) y devuelva la frecuencia que le corresponde.
		Por ejemplo, si se pulsa la tecla Mi devuelve 659,26.
		- Amplía la función anterior para que además de la nota, reciba un parámetro de tipo boolean
		de forma que si se pasa un valor true es que se ha pulsado la que es de tipo sostenido,en
		cuyo caso la frecuencia será la original por 1,03 y si recibe false, deberá devolver la
		frecuencia según la tabla anterior.
		Por ejemplo, Mi sostenido (Mi
		#
		) = 659,26*1,03=685,63, Mi normal = 659,26
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca una tecla: ");
		String tecla = sc.nextLine().toLowerCase();
		System.out.print("¿Es sostenido?(true/false): ");
		boolean sostenido = sc.nextBoolean();
		System.out.println(devolverFrecuencia(tecla));
		System.out.println(obtenerSostenido(tecla, sostenido));
		
	}
		public static final double DO = 523.25;
		public static final double RE = 587.33;
		public static final double MI = 659.26;
		public static final double FA = 698.46;
		public static final double SOL = 783.99;
		public static final double LA = 880;
		public static final double SI = 987.77;
		public static final double SOSTENIDO = 1.03;

		public static double devolverFrecuencia(String tecla) {
			double mensaje = 0;
			switch (tecla) {
			case "do":
				mensaje = DO;
				break;
			case "re":
				mensaje = RE;
				break;
			case "mi":
				mensaje = MI;
				break;
			case "fa":
				mensaje = FA;
				break;
			case "sol":
				mensaje = SOL;
				break;
			case "la":
				mensaje = LA;
				break;
			case "si":
				mensaje = SI;
				break;
			}
			return mensaje;
		}
		
		public static double obtenerSostenido(String tecla, boolean sostenido) {
			double resultado = 0;
			if (sostenido==false) {
				resultado = devolverFrecuencia(tecla);
			}
			else {
				resultado = devolverFrecuencia(tecla)*SOSTENIDO;
			}
			return resultado;
		}

}
