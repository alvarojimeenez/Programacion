package boletin3.ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*
		El cifrado César es un tipo de cifrado por sustitución en el que una letra del alfabeto
		es sustituida por otra que se encuentra situada en el abecedario
		(abcdefghijklmnñopqrstuvwxyz) un número dado de posiciones desde la primera,
		como puede observarse en la siguiente imagen:
		Así, por ejemplo, la palabra CASADO, con un cifrado de tres posiciones pasaría a
		ser FDVDGR.
		
		a. Realiza una función que cifre un carácter según el cifrado César y un
		desplazamiento dado.
		
		b. Elabora una función que, haciendo uso de la anterior, reciba una palabra y un
		número fijo de posiciones y la codifique según este algoritmo.
		
		c. Diseña otra función que reciba dos palabras y compruebe si son equivalentes
		según este tipo de cifrado e indique el nivel de sustitución utilizado, es decir,
		si cifrando una de ellas podemos obtener la otra.
		
		Ej: Si recibe CASADO y FDVDGR debe indicar que son equivalentes
		y utilizan un nivel de codificación 3
		Si recibe CASADO y AAAABD debe indicar que no son equivalentes.
		El programa no debe distinguir entre mayúsculas y minúsculas.
		*/
		
		final String ABECEDARIO = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca una cadena: ");
		String cadena = sc.nextLine().toUpperCase();
		System.out.print("Introduzca el desplazamiento: ");
		int desplazamiento = Integer.valueOf(sc.nextLine());
		System.out.println(cifrarCaracter('X', 3, ABECEDARIO));
		System.out.println(cifradoCesar(cadena, desplazamiento, ABECEDARIO));
		System.out.println(sonEquivalentes("CASADO", "FDVDGR", ABECEDARIO));
		*/
		System.out.println(sonEquivalentes("ALVARO", "EOZEVS", ABECEDARIO));
	}
	
	public static char cifrarCaracter(char caracter,int desplazamiento, String ABECEDARIO) {
		int posicion = ABECEDARIO.indexOf(caracter);
		return ABECEDARIO.charAt((posicion+desplazamiento)% ABECEDARIO.length());
		
	}
	public static String cifradoCesar(String cadena, int desplazamiento, String ABECEDARIO) {
		StringBuilder sb = new StringBuilder(); 
		char c ;
		for (int i=0; i<cadena.length(); i++) {
			c = cadena.charAt(i);
			int posicion = ABECEDARIO.indexOf(c);
			if (posicion!=-1) {
				sb.append(ABECEDARIO.charAt((posicion+desplazamiento)%ABECEDARIO.length()));
			}else {
				sb.append(c);
			}
		}
		return sb.toString();
	}
	
	public static int sonEquivalentes(String palabra, String otraPalabra, String ABECEDARIO) {
		int desplazamiento = 0;
		boolean equivalentes = false;
		while (!equivalentes && desplazamiento<=ABECEDARIO.length()) {
			if (cifradoCesar(palabra, desplazamiento, ABECEDARIO).equals(otraPalabra)) {
				equivalentes = true;
			}
			desplazamiento++;
		}
		return equivalentes? desplazamiento-1: -1;
	}
	
	
	

}
