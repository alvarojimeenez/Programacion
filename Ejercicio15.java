package com.edu;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		/*
		Crea un programa que permita sumar N números. El usuario decide cuándo termina
		de introducir números al indicar la palabra ‘fin’. */
	
		String num = "";
		int suma = 0;
		System.out.print("Introduzca un número: ");
		Scanner sc = new Scanner(System.in);
		num = (sc.nextLine());
		
		while (!(num.equals("fin"))) {
			int num1 = Integer.valueOf(num);
			suma=suma+num1;
			Scanner sc1 = new Scanner(System.in);
			System.out.print("Introduzca un número: ");
			num = new Scanner(System.in).nextLine();		}
		
		System.out.println("La suma es: "+suma);
	}

}
