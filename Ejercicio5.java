package boletin2.ejercicios;

import java.util.Scanner;

public class Ejercicio5 {


	public static void main(String[] args) {
		/*  Realizar un método llamado esMultiplo que recibirá dos números y devuelva True si
			el primer número es múltiplo del segundo.
		*/
		int a=0;
		int b=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca primer numero: ");
		a = Integer.valueOf(sc.nextLine());
		System.out.print("Introduzca segundo número: ");
		b = Integer.valueOf(sc.nextLine());
		
		System.out.println(esMultiplo(a, b));


	}
	
	public static boolean esMultiplo(int a, int b) {
		boolean multiplo = false;
		if (a%b==0) {
			multiplo = true;
		}
		return multiplo;
	}

}
