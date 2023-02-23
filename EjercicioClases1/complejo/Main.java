package com.edu.complejo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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
		System.out.println("El resultado de la resta es "+complejo.Restar(num2, num1));
		
		num1.Resultado();
		
		System.out.println(complejo.Iguales(num1, num2));

	}

}
