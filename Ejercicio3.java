package boletin3.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*
		Diseña un programa que cuente el número de veces que aparece una palabra en
		una cadena de texto.
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca una frase: ");
		String cadena = sc.nextLine();
		System.out.print("Introduzca una palabra: ");
		String palabra = sc.nextLine();
		System.out.println(contarNumeroVeces(palabra, cadena));

	}
	
	public static int contarNumeroVeces(String palabra, String cadena) {
		int contador = 0;
		int contadorPalabras = 0;
		for (int i = 0; i<cadena.length(); i++) {
			if (cadena.charAt(i)==palabra.charAt(contador)) {
				contador++;
				if (palabra.length()==contador) {
					contadorPalabras++;
					contador = 0;
			}
		}else {
			contador = 0;
		}
		}
		return contadorPalabras;
	}

}
