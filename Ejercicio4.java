package com.edu;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		 /*
		 Calcular las calificaciones de un alumno con un método que reciba la nota de la
		 parte práctica, la nota de los problemas y la parte teórica. La nota final se calcula
		 según el siguiente criterio: la parte práctica vale el 10%; la parte de problemas vale
		 el 50% y la parte teórica el 40%. Las notas deben estar entre 0 y 10, si no lo están,
		 deberá devolver un mensaje de error.
		 Realiza el método que calcule la media de tres notas y te devuelva la nota del
		 boletín (insuficiente, suficiente, bien, notable o sobresaliente). */

		int nota1 = 0;
		int nota2 = 0;
		int nota3 = 0;

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nota práctica: ");
		nota1 = Integer.valueOf(sc.nextLine());
		
		System.out.print("Nota problemas: ");
		nota2 = Integer.valueOf(sc.nextLine());
		
		System.out.print("Nota de teoría: ");
		nota3 = Integer.valueOf(sc.nextLine());
		
		double nota_final = nota1*0.10+nota2*0.50+nota3*0.40;
		
		if ((nota1 <=10 && nota1>=0) && (nota2 <=10 && nota2>=0)&&(nota3 <=10 && nota3>=0)) {
			System.out.println("La nota final es "+nota_final);
			if (nota_final>=5 && nota_final<6) {
				System.out.println("Tienes un suficiente");
			}else if (nota_final>=6 && nota_final<7) {
				System.out.println("Tienes un bien");
			}else if (nota_final>=7 && nota_final<9) {
				System.out.println("Tienes un notable");
			}else if (nota_final>=9 && nota_final<=10) {
				System.out.println("Tienes un sobresaliente");
			}else {
				System.out.println("Tienes un insuficiente");
			}
		}else {
			System.out.println("Es un error");
		}
		
	}

}
