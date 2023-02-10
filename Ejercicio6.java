package boletin3.ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*
		Haciendo uso de la función anterior crea una función esCapicúa que acepte
		números tanto enteros como decimales
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número entero o decimal: ");
		String cadena = sc.nextLine();
		System.out.println(Ejercicio5.esPalindromo(cadena.replace(",","").replace(".","")));

	}
}
