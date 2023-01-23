package com.edu;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Método que pida 15 números y realice su suma.
		
		int i = 0;
		int num = 0;
		int suma = 0;
		while (i<15) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Introduce un número:");
			num = Integer.valueOf(sc.nextLine());
			i++;
			suma+=num;
		}
		System.out.println("La suma total es "+suma);
	}

}
