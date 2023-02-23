package com.edu.cafe;

import java.util.Scanner;

public class Cafetera {
	public static final String MENU = " 		CAMERA CAFÉ					  "
									+ "\n1. Servir café solo."
									+ "\n2. Servir leche."
									+ "\n3. Servir café con leche."
									+ "\n4. Consultar estado de la máquina."
									+ "\n5. Apagar la máquina y salir.";
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Maquina maquina;
		System.out.println("Introduzca monedero inicial para la máquina: ");
		double monedero = Double.valueOf(sc.nextLine());
		maquina = new Maquina(monedero, 50, 50, 80);
		
		boolean salir = false; 
		int opcion;
		while (!salir) {
			System.out.println(MENU);
			System.out.println("Elija una opción: ");
			opcion = Integer.valueOf(sc.nextLine());
			
			switch (opcion) {
				case 1: 
					System.out.println("¿Cuánto dinero va a introducir? ");
					double saldo = Double.valueOf(sc.nextLine());
					System.out.println(maquina.servirCafe(saldo)); 
					break;
				case 2: 
					System.out.println("¿Cuánto dinero va a introducir? ");
					saldo = Double.valueOf(sc.nextLine());
					System.out.println(maquina.servirLeche(saldo));
					break;
				case 3: 
					System.out.println("¿Cuánto dinero va a introducir? ");
					saldo = Double.valueOf(sc.nextLine());
					System.out.println(maquina.servirCafeConLeche(saldo));
					break;
				case 4: 
					System.out.println(maquina.toString());
					break;
				case 5: 
					System.out.println("Apagando máquina...");
					salir = true; 
					break;
			}
			
		}
		
	}

}
