package com.edu;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		/* Realiza un programa que pida números hasta que se teclee uno negativo y muestre
		   cuántos números se han introducido. */
		
		int num = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número:");
		num = Integer.valueOf(sc.nextLine());
		int i = 0;
		while (num>0) {
			i+=1;
			System.out.print("Introduce un número:");
			num = Integer.valueOf(sc.nextLine());
			}
		System.out.println("Se han introducido "+i+" numeros positivos");

	}

}
