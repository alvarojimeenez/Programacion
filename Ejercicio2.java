package mock.exam;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*
		La frecuencia cardíaca máxima recomendada durante la realización de práctica deportiva tipo cardio
		no debe exceder el 85% de la frecuencia cardíaca máxima (FCM). Esta última se calcula restando la
		edad de la persona a 220. Elabora una función o método que reciba un valor entero que será el año
		actual y una cadena con la fecha de nacimiento de una persona (formato dd/mm/yyyy) y devuelva un
		número real que será la frecuencia cardíaca máxima recomendada durante un ejercicio de tipo cardio
		(para el cálculo de la edad no se contempla ni el mes ni el día, es decir, si alguién nació en el 2000 y
		estamos en el año 2022, consideraremos que tiene 22 años).
		Realizar un programa principal que solicite el año actual y la fecha de nacimiento en el formato
		especificado y que muestre la frecuencia cardíaca máxima por pantalla. NO es necesario validar los
		datos, pensamos que el usuario siempre lo introduce como debe.
		*/
		
		final int FCM = 220;
		final double FRECUENCIA_RECOMENDADA = 0.85;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el año actual: ");
		int agnio = Integer.valueOf(sc.nextLine());
		System.out.print("Introduzca su fecha de nacimiento(dd/mm/yyyy): ");
		String fecha_de_nacimiento = sc.nextLine();
		System.out.println(obtenerFrecuenciaCardiaca(agnio, fecha_de_nacimiento, FCM, FRECUENCIA_RECOMENDADA));

	}
	
	public static double obtenerFrecuenciaCardiaca(int agnio, String fecha_de_nacimiento, int FCM, double FRECUENCIA_RECOMENDADA) {
		fecha_de_nacimiento = fecha_de_nacimiento.substring(6,10);
		int nacimiento = Integer.parseInt(fecha_de_nacimiento);
		int edad = agnio - nacimiento; 
		double frecuencia = (FCM-edad)*FRECUENCIA_RECOMENDADA;
		return frecuencia;
	}

}
