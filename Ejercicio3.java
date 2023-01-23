package com.edu;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//  Escribir un método que reciba un carácter y devuelva el tipo de carácter que es.
		//	Debe devolver una de los siguientes mensajes según corresponda:
		//	◦ Letra mayúscula
		//	◦ Letra minúscula
		//	◦ Dígito entre 0 y 9
		//	◦ Signo de puntuación
		//	◦ Espacio en blanco
		//	◦ Paréntesis () o llaves {}
		//	◦ Otro carácter
		
		System.out.print("Escriba un carácter: ");
		Scanner sc = new Scanner(System.in);
		char caracter = sc.next().charAt(0);
		
		if (Character.isUpperCase(caracter)) {
			System.out.println("El carácter "+caracter+" es una mayúscula");
		}else if (Character.isLowerCase(caracter)) {
			System.out.println("El carácter "+caracter+" es una minúscula");
		}else if (Character.isDigit(caracter)) {
			System.out.println("El carácter "+caracter+" es un dígito entre 0 y 9");
		}else if (caracter==',' || caracter=='.') {
			System.out.println("El carácter "+caracter+" es un signo de puntuación");
		}else if (Character.isWhitespace(caracter)) {
			System.out.println("El carácter "+caracter+" es un espacio en blanco");
		}else if (caracter=='{' || caracter=='}' || caracter=='(' || caracter==')') {
			System.out.println("El carácter "+caracter+" es una llave o paréntesis");
		}else {
			System.out.println("Es otro caracter");
		}
		
		

	}

}
