package boletin2.ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		/* 
		Realiza un método llamado toBinary que reciba un número decimal como
		argumento y devuelva un String con el número binario correspondiente.
		*/
		int decimal = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número decimal: ");
		decimal = Integer.valueOf(sc.nextLine());
		System.out.println(toBinary(decimal));
	}
	public static String toBinary(int decimal) {
		String binario ="";
		while (decimal>=2) {
			int resto = decimal%2;
			binario = resto+binario;
			decimal = decimal / 2;
		}
		return decimal + binario;
	}
	

}
