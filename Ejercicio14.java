package com.edu;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		/*
		Realiza un programa que vaya pidiendo números hasta que se introduzca un
		número negativo y nos diga cuántos números se han introducido, la media de los
		impares y el mayor de los pares. El número negativo sólo se utiliza para indicar el
		final de la introducción de datos pero no se incluye en el cómputo. */
		
		int num =1;
		int i = 0;
		int sumaI = 0;
		int cont = 0;
		int mayor = num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número:");
		num = Integer.valueOf(sc.nextLine());
		while (num>0) {
			i+=1;
			if (num%2!=0) {
				sumaI+=num;
				cont++;
			}else {
				if (num>mayor) {
					mayor = num;
				}
			}
			System.out.print("Introduce un número:");
			num = Integer.valueOf(sc.nextLine());
			}
		
		System.out.println("Se han introducido "+i+" numeros positivos");
		System.out.println("La media de los numeros impares es "+sumaI/cont);
		System.out.println("El numero mayor de los pares es "+mayor);

		
		
	}

}
