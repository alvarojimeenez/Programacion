package com.edu;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		//  Realiza un programa que sume los 100 números siguientes a un número entero y
		// positivo introducido por teclado. Se debe comprobar que el dato introducido es
		// correcto (que es un número positivo).
		
		int num = 0;
		int suma = 0;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número:");
		num = Integer.valueOf(sc.nextLine());
		do {
			if (num>=0) {
			i++;
			suma+=num;
			}
			
		}
			while (i<100);
		System.out.println("La suma total es "+suma);
	}

}
