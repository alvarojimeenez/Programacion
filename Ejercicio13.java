package com.edu;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// Programa que reciba 10 números y nos indique el valor máximo y mínimo.
		int num = 0;
		int menor = Integer.MAX_VALUE;
		int mayor = Integer.MIN_VALUE;
		Scanner sc = new Scanner(System.in);
		for (int i=1; i<10; i++) {
			System.out.print("Escribe un número: ");
			num = Integer.valueOf(sc.nextLine());
			if (num>mayor) {
				mayor = num;
			}
			if (num<menor) {
				menor = num;
			}
		}
		System.out.println("El valor máximo es: "+mayor);
		System.out.println("El valor mínimo es: "+menor);

		
	}

}
