package boletin2.ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		/*
		 Realizar un método llamado minimoComunMultiplo que reciba dos números y
		calcule el mínimo común múltiplo de dos números. Con el máximo común divisor de
		una pareja de números podemos obtener fácilmente el mínimo común múltiplo de
		dicha pareja. El mínimo común múltiplo de dos números es igual al producto de los
		números dividido entre su máximo común divisor. Por ejemplo, el máximo común
		divisor de 24 y 36 es 12, por tanto el mínimo común múltiplo de 24 y 36 es
		(24×36)/12=72.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int a = Integer.valueOf(sc.nextLine());
		System.out.print("Introduce otro número: ");
		int b = Integer.valueOf(sc.nextLine());
		
		System.out.println("El mínimo común múltiplo es "+(a*b)/greaterCommonDivisor(a, b));

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
