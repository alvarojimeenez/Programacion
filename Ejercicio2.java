package com.edu;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Escribe un método que reciba por parámetro el día de la semana (Lunes, Martes,
		//Miércoles, etc) y devuelva qué asignatura toca a primera hora ese día
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el dia de la semana: ");
		String dia = sc.nextLine();
		
		switch (dia) {
		case "Lunes": {
			System.out.println("A primera toca entorno de desarrollo");
			break;
		}case "Martes": {
			System.out.println("A primera toca fol");
			break;
		}case "Miercoles","Viernes": {
			System.out.println("A primera toca sistemas informáticos");
			break;
		}case "Jueves": {
			System.out.println("A primera toca base de datos");
			break;
		}default: 
			System.out.println("El dia introducido no es correcto");
		}
		

		
}
}
