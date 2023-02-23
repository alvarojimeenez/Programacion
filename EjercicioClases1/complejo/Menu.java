package com.edu.complejo;

import java.util.Scanner;

public class Menu {

	public static String MENU = "CALCULADORA DE NUMEROS COMPLEJOS"
								+"\n1.Sumar complejos"
								+"\n2.Restar complejos"
								+"\n3. Salir";
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		
		while (opcion!=3) {
			
			System.out.println(MENU);
			System.out.println("Introduzca una opción: ");
			opcion = Integer.valueOf(sc.nextLine());
			
			
			switch (opcion) {
				case 1:
					System.out.println("Introduzca parte real del primer número: ");
					double a = Double.valueOf(sc.nextLine());
					System.out.println("Introduzca parte imaginaria del primer número: ");
					double b = Double.valueOf(sc.nextLine());
					System.out.println("Introduzca parte real del segundo número: ");
					double c = Double.valueOf(sc.nextLine());
					System.out.println("Introduzca parte imaginaria del segundo número: ");
					double d = Double.valueOf(sc.nextLine());
					Complejo num1 = new Complejo(a, b);
					Complejo num2 = new Complejo(c, d);
					Complejo complejo = new Complejo();
					
					System.out.println(complejo.Sumar(num1, num2));
					break;
				case 2: 
					System.out.println("Introduzca parte real del primer número: ");
					a = Double.valueOf(sc.nextLine());
					System.out.println("Introduzca parte imaginaria del primer número: ");
					b = Double.valueOf(sc.nextLine());
					System.out.println("Introduzca parte real del segundo número: ");
					c = Double.valueOf(sc.nextLine());
					System.out.println("Introduzca parte imaginaria del segundo número: ");
					d = Double.valueOf(sc.nextLine());
					num1 = new Complejo(a, b);
					num2 = new Complejo(c, d);
					complejo = new Complejo();
					
					System.out.println(complejo.Restar(num2, num1));
					break;
				
			}
		}
	}

}
