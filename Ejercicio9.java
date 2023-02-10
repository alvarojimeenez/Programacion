package boletin3.ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		/*
		Escribir una función que devuelva el número de palabras, frases y párrafos que
		existen en una cadena de texto que recibe como parámetro. Ten en cuenta que entre
		dos palabras puede haber más de un blanco, las frases se separan por puntos y los
		párrafos por saltos de línea.
		*/
		
		System.out.println(contarPalabras("     hola, esto es un ejemplo      "));
		System.out.println(contarFrases("Hola mundo. Esto es un ejemplo. De aaaa. Ejemplo"));
		System.out.println(contarParrafos("Mi texto con\nun salto\nde línea"));


	}
	
	public static int contarPalabras(String cadena) {
		int contador = 1;
		int posicion = 0;
		cadena = cadena.trim();
		if (cadena.isEmpty()) {
			contador = 0;
		}else {
			posicion = cadena.indexOf(" ");
			while (posicion!=-1) {
				contador++;
				posicion = cadena.indexOf(" ", posicion+1);
			}
		}
		return contador;
	}
	
	public static int contarFrases(String cadena) {
		int contador = 1;
		int posicion = 0; 
		if (cadena.isEmpty()) {
			contador = 0;
		}else {
			
			posicion = cadena.indexOf(".", posicion+1);
			while (posicion!=-1) {
				contador ++;
				posicion = cadena.indexOf(".", posicion+1);
			}
		}
		return contador;
	}
	public static int contarParrafos(String cadena) {
		int contador = 1;
		int posicion = 0; 
		if (cadena.isEmpty()) {
			contador = 0;
		}else {
			
			posicion = cadena.indexOf("\n", posicion+1);
			while (posicion!=-1) {
				contador ++;
				posicion = cadena.indexOf("\n", posicion+1);
			}
	}
		return contador;
	}
}


