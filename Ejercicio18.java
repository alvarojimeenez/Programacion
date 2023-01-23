package com.edu;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		/* Realizar un método llamado calcularAreaCirculo que devuelva el área de un círculo
		 y otro llamado calcularLongitudCirculo que devuelva su longitud. */
		
		final double PI = 3.1416;
		
		float radio = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el radio: ");
		radio = Float.valueOf(sc.nextLine());
		
		System.out.println("El area del circulo es: "+PI*(radio*radio));
		System.out.println("La longitud del circulo es: "+2*PI*radio);
		
	}
		
		

}
