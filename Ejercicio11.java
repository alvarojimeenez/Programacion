package com.edu;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		/*
		Realiza un programa que pida números y muestre su cuadrado, repitiendo el
		proceso hasta que se introduzca un número negativo */
		
		int num = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número:");
		num = Integer.valueOf(sc.nextLine());
		while (num>0) {
			num*=num;
			System.out.println("Su cuadrado es "+num);
			System.out.print("Introduce un número:");
			num = Integer.valueOf(sc.nextLine());
			
			}
	}

}
