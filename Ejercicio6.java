package boletin2.ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*
		Realizar un método llamado horaMayor que recibirá seis valores enteres, los tres
		primeros representarán la hora, minuto y segundos de la primera hora y los otros
		tres de la segunda hora. Se deberá devolver un 1 si la primera hora es mayor que la
		segunda, un 2 si la segunda hora es mayor que la primera, un 0 si son iguales y un
		-1000 si los datos no son correctos.
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

		System.out.println(horaMayor(hora1, minuto1, segundo1, hora2, minuto2, segundo2));

		
		
		
	}
	
	public static int horaMayor(int hora1, int minuto1, int segundos1, int hora2, int minuto2, int segundos2) {
		if ((hora1>=0 && hora1<=23) && (minuto1>=0 && minuto1<=59) && (segundos1>=0 && segundos1<=59) && (hora2>=0 && hora2<=23) && (minuto2>=0 && minuto2<=59) && (segundos2>=0 && segundos2<=60)) {
			if ((hora1>hora2) || (hora1==hora2 && minuto1>minuto2) || (hora1==hora2 && minuto1==minuto2 && segundos1>segundos2)) {
				return 1;
			}else if ((hora2>hora1) || (hora1==hora2 && minuto2>minuto1) || (hora2==hora1 && minuto2==minuto1 && segundos2>segundos1)){
				return 2;
			}else {
				return 0;
			}
		}else {
			return -1000;
		}
	}

}
