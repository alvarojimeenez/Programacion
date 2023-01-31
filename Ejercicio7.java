package boletin2.ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*
		Realizar un método llamado segundosEntre que recibirá seis valores enteros, los
		tres primeros representarán la hora, minuto y segundos de la primera hora y los
		otros tres de la segunda hora. Se deberá devolver el número de segundos que hay
		entre la primera hora y la segunda (el valor debe ser siempre en positivo). Si los
		datos no son correctos se deberá devolver -1000.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int hora1 = 0;
		int minuto1 = 0;
		int segundo1 = 0;
		System.out.print("HORA1 --> Ingrese la hora de: ");
		hora1 = Integer.valueOf(sc.nextLine());
		System.out.print("HORA1 --> Ingrese la minutos: ");
		minuto1 = Integer.valueOf(sc.nextLine());
		System.out.print("HORA1 --> Ingrese la segundos: ");
		segundo1 = Integer.valueOf(sc.nextLine());

		
		int hora2 = 0;
		int minuto2 = 0;
		int segundo2 = 0;
		System.out.print("HORA2 --> Ingrese la hora de: ");
		hora2 = Integer.valueOf(sc.nextLine());
		System.out.print("HORA2 --> Ingrese la minutos: ");
		minuto2 = Integer.valueOf(sc.nextLine());
		System.out.print("HORA2 --> Ingrese la segundos: ");
		segundo2 = Integer.valueOf(sc.nextLine());
		
		System.out.println(segundosEntre(hora1, minuto1, segundo1, hora2, minuto2, segundo2));
	

	}
	
	public static int segundosEntre (int hora1, int minuto1, int segundo1, int hora2, int minuto2, int segundo2) {
		int calcularSegundos1 = hora1*3600 + minuto1*60 + segundo1;
		int calcularSegundos2 = hora2*3600 + minuto2*60 + segundo2;
		if ((calcularSegundos1 > calcularSegundos2) && (hora1>=0 && hora1<=23) && (minuto1>=0 && minuto1<=59) && (segundo1>=0 && segundo1<=59) && (hora2>=0 && hora2<=23) && (minuto2>=0 && minuto2<=59) && (segundo2>=0 && segundo2<=60)) {
				return calcularSegundos1 - calcularSegundos2;
		}else {
			return -1000;
		}
	}

}
