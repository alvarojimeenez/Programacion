package boletin2.ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*
		Realiza un método llamado gcd (greaterCommonDivisor) que recibirá dos números y
		devuelva el máximo común divisor según el algoritmo de Euclides.
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int a = Integer.valueOf(sc.nextLine());
		System.out.print("Introduce otro número: ");
		int b = Integer.valueOf(sc.nextLine());
		
		System.out.println("El máximo común divisor es "+greaterCommonDivisor(a, b));

	}
	
	public static int greaterCommonDivisor(int a, int b) {
		while (b>0) {
			int r = a%b;
			a = b;
			b=r;			
		}
	return a;
	}

}
