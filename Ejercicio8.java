package boletin3.ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		/*
		Diseñar una función que reciba como parámetro tres cadenas, la primera será una
		frase y deberá buscar si existe la palabra que recibe como segundo parámetro y
		reemplazarla por la tercera
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca una frase: ");
		String frase = sc.nextLine();
		System.out.print("Introduzca la palabra a buscar: ");
		String buscada = sc.nextLine();
		System.out.print("Introduzca la palabra a reemplazar: ");
		String reemplazar = sc.nextLine();
		
		System.out.println(reemplazarPalabra(frase, buscada, reemplazar));

	}
	
	public static String reemplazarPalabra(String frase, String buscada, String reemplazar) {
		int cont1 = 0; 
		int cont2 = 0;
		String frase_final = "";
		if (Ejercicio7.buscarPalabraEscondida(buscada, frase)) {
			frase_final = frase.replace(buscada, reemplazar);
		}
		return frase_final;
	}

}
