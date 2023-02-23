package com.edu.rectangulo;

import java.util.Scanner;

public class PrimerRectangulo {

	public static void main(String[] args) {
		Rectangulo rectangulo;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la longitud del rectangulo: ");
		int longitud = Integer.valueOf(sc.nextLine());
		System.out.println("Introduzca el ancho del rectangulo: ");
		int ancho = Integer.valueOf(sc.nextLine());
		rectangulo= new Rectangulo(longitud, ancho);
		System.out.println(rectangulo.getPerimetro());
		System.out.println(rectangulo.getArea());

	}

}
