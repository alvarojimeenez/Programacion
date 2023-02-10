package boletin3.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*
		Un número es divisible por 3 si la suma de todas sus cifras reducidas a una cifra es
		igual a 0, 3, 6 ó 9.
		Por ejemplo, 156 ⇒ 1+5+6=12 ⇒ 1+2 = 3 es divisible,
		pero 157 ⇒ 1+5+7 =13 ⇒ 1+3 =4 no lo es.
		Elabora un programa que compruebe la divisibilidad por 3 según este algoritmo. El
		programa debe comprobar que el número facilitado es válido.
		*/
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un numero: ");
		int numero = Integer.valueOf(sc.nextLine());
		System.out.println(esDivisiblePor3(numero));
	}

	public static StringBuilder esDivisiblePor3(int numero) {
		StringBuilder sb = new StringBuilder();
		int sumaCifras=0;
		int sumaTotal = 0;
		if (numero>0) {
			while (numero>0) {
				sumaCifras+=numero%10;
				numero/=10;
			}
			while (sumaCifras!=0) {
				sumaTotal+=sumaCifras%10;
				sumaCifras/=10;
			}		
			if (sumaTotal%3==0) {
				sb.append("Es divisible.");
			}else {
				sb.append("No es divisible.");
			}
		} else {
			System.out.println("Introduzca un número válido.");
		}
		
	return sb; 
	}

}
