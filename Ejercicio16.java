package com.edu;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		/*
		Pedir 10 valores numéricos que representan el salario mensual de 10 empleados.
		Mostrar su suma y cuantos hay mayores de 1000€. */
		int salario = 0;
		int i = 0;
		int suma = 0;
		int cont = 0;
		while (i<10) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Introduce el salario: ");
			salario = Integer.valueOf(sc.nextLine());
			i++;
			suma+=salario;
			if (salario>1000) {
				cont+=1;
		}
		}
		System.out.println("La suma de los salarios son: "+suma);
		System.out.println("Hay "+cont+" salarios que superan los 1000€.");
	}

}
