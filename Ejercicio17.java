package com.edu;

public class Ejercicio17 {

	public static void main(String[] args) {
		/*
		Escribe un programa que muestre los N primeros términos de la serie de Fibonacci.
		El primer término de la serie de Fibonacci es 1, el segundo es 1 y el resto se calcula
		sumando los dos anteriores, por lo que tendríamos que los términos son 1, 1, 2, 3, 5,
		8, 13, 21, 34, 55, 89, 144.
		 */
		
		int i=1;
		int cont1 = 0;
		int cont2 = 1;
		int suma = 1;
		
		while (i<10) {
			suma = cont1+ cont2;
			cont1=cont2;
			cont2=suma;
			i++;
			System.out.println(cont1+suma);
		}
	}

}
