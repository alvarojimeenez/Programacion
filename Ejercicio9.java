package com.edu;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Método que pida 5 números e imprima si alguno es múltiplo de 3
		
		int num = 0;
		int i = 0;
		while (i<5) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Introduce un número:");
			num = Integer.valueOf(sc.nextLine());
			i++;
			if (num%3==0) {
				System.out.println(num+" es multiplo de 3.");
			}
		}
	}

}
