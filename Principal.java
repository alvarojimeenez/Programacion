package com.edu;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int edad = 0; 
		
		System.out.println("¿Cuantos años tienes? ");
		
		Scanner sc = new Scanner(System.in);
		edad = Integer.valueOf(sc.nextLine());
		
		if (edad<18) {
			System.out.println("Eres menor de edad");
		}
		else if (0<=edad || edad<=65) {
			System.out.println("Demasiado joven");
		}
		else {
			System.out.println("Eres mayor de edad");
			System.out.println("Puedes sacarte el carnet de conducir");
		}
	}
	
	

}
