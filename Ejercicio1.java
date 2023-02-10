package boletin3.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/* 
		Escribe una función que reciba una cadena de texto y una variable bandera
		(par/impar) e imprima solo los caracteres que se encuentran situados en las
		posiciones pares o impares (según indique la variable bandera).
		Desarrolla el código con un bucle for y después modifica el código para que utilice
		una estructura while y do-while.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una cadena: ");
		String cadena = sc.nextLine();
		System.out.println("Introduzca variable bandera(par/impar): ");
		String bandera = sc.nextLine();

		//System.out.println(obtenerParesEImparesConFor(cadena, bandera));
		//System.out.println(obtenerParesEImparesConWhile(cadena, bandera));
		System.out.println(obtenerParesEImparesConDoWhile(cadena, bandera));
		
	}
	//Bucle for
/*	
	public static String obtenerParesEImparesConFor(String cadena, String bandera) {
		String resultadoPares = "";
		String resultadoImpares = "";
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<cadena.length(); i++) {
			if (i%2==0) {
				resultadoPares+=cadena.charAt(i);
			}else {
				resultadoImpares+=cadena.charAt(i);
			}
		}
		if (cadena!=null && !bandera.equals("par")) {
			sb.append(resultadoImpares);
		}else {
			sb.append(resultadoPares);
		}
		return sb.toString();
	}
	//Bucle while 
	public static String obtenerParesEImparesConWhile(String cadena, String bandera) {
	int i = 0;
	String resultadoPares = "";
	String resultadoImpares = "";
	StringBuilder sb = new StringBuilder();
	while (i<cadena.length()) {
		if (i%2==0) {
			resultadoPares+=cadena.charAt(i);
		}else {
			resultadoImpares+=cadena.charAt(i);
		}
		i++;
	}
	if (cadena!=null && !bandera.equals("par")) {
		sb.append(resultadoImpares);
	}else {
		sb.append(resultadoPares);
	}
	return sb.toString();
	}
	
 */
	//Bucle do-while 
	
	public static String obtenerParesEImparesConDoWhile(String cadena, String bandera) {
		int i = 0;
		String resultadoPares = "";
		String resultadoImpares = "";
		StringBuilder sb = new StringBuilder();
		do {
			if (i%2==0) {
				resultadoPares+=cadena.charAt(i);
			}else {
				resultadoImpares+=cadena.charAt(i);
			}
			i++;
		}while (i<cadena.length());
		
		if (cadena!=null && !bandera.equals("par")) {
			sb.append(resultadoImpares);
		}else {
			sb.append(resultadoPares);
		}
		return sb.toString();
	}
	
	
}
