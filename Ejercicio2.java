package boletin2.ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {
		/* 
		Realiza un programa que pida un número por teclado y que después muestre ese
		número al revés.

		 */
		
		String cadena = "123";
		String cadenaReves = "";
		for (int contador=cadena.length()-1; contador>=0; contador--) {
			cadenaReves+=cadena.charAt(contador);
		}
		System.out.println(cadenaReves);
		
		
		
	}

}
