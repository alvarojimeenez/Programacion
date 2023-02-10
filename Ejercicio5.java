package boletin3.ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*
		Diseña una función llamada esPalindromo que reciba una cadena de caracteres y
		determine si constituye un palíndromo o no. Una palabra es un palíndromo si puede
		leerse del mismo modo de izquierda a derecha que de derecha a izquierda. Obvia
		los espacios en blanco y caracteres separadores, así como tildes, etc.
		Ejemplos de palíndromos: ‘Ligar es ser ágil’, ‘Somos o no somos’.
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba una cadena: ");
		String cadena = sc.nextLine().toLowerCase();
		System.out.print(esPalindromo(cadena));
		

	}
	public static boolean esPalindromo(String cadena) {
		int i = 0;
		int contador = 0;
		boolean palindromo = false;
		String cadena_nueva = cadena.replace(" ","").replace("á","a").replace("é","e").replace("í","i").replace("ó","o").replace("ú","u");
		for (int j = cadena_nueva.length()-1; j>=0;) {
			while (i<cadena_nueva.length()) {
				if (cadena_nueva.charAt(i)==cadena_nueva.charAt(j)) {
					contador++;
				}
				i++;	
				j--;
			}
		}
		if (contador==cadena_nueva.length()) {
			palindromo = true;
		}
		return palindromo;
	}

}
