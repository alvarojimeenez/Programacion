package boletin2.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/* 
			Diseña una función que, dada una cadena de entrada, comprueba si es una
			contraseña fuerte o no. Se considera que una contraseña es fuerte si contiene 8 o
			más caracteres, y entre ellos al menos hay una mayúscula, una minúscula, un signo
			de puntuación y al menos un dígito.
		*/
			
		Scanner sc = new Scanner(System.in);
		
		String contrasenia = "";
		System.out.print("Ingresa una contraseña: ");
		contrasenia= sc.nextLine();		
		
		System.out.println(contraseñaFuerte(contrasenia));
		
		
	}
	
	public static boolean contraseñaFuerte(String contrasenia) {
		
		// cadena = 8 caracteres o más
		// minimo 1 mayuscula, una minuscula, un signo de puntuacion y al menos un numero.
		
		//cadena.length()>=8 
		if (contrasenia.length()>=8) {
			
			boolean minuscula = false;
			boolean mayuscula = false;
			boolean numero = false;
			boolean signoPuntuacion = false; 
			char caracter;

			for (int i=0; i<contrasenia.length(); i++) {
				caracter = contrasenia.charAt(i);
				
				if (Character.isUpperCase(caracter)) {
					mayuscula = true;
				}
				if (Character.isLowerCase(caracter)) {
					minuscula = true; 
				}
				if (Character.isDigit(caracter)) {
					numero = true;
				}
				if (caracter==',' || caracter=='.') {
					signoPuntuacion = true;
				}
			}
			
			if (mayuscula && minuscula && numero && signoPuntuacion) {
				return true;
			}else {
				return false;
			}
			
		}else {
			return false;
		}
		
		
	}
	

}
