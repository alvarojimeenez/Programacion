package boletin2.ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		/*
		Realiza un método llamado toDecimal que reciba un String con un valor numérico
		en binario como argumento y devuelva un número con el número decimal
		correspondiente.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un numero binario: ");
		String binario = sc.nextLine();
		System.out.println(toDecimal(binario));
		
	}
	
	public static int toDecimal(String binario) {
		int posicion = 0;
		int decimal = 0;
		for (int i = binario.length()-1; i>=0; i--) {
			if (binario.charAt(i) == '1') {
				decimal = decimal+(int)Math.pow(2, posicion) ;
			}
			posicion+=1;		
		}
		return decimal;
		
		
	}
	

}
