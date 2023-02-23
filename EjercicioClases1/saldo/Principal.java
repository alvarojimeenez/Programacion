package com.edu.saldo;

import java.util.Scanner;

public class Principal {
	
	public static final String MENU = " 		BIENVENIDO A LA CAIXA					  "
									+ "\n¿Que desea realizar?"
									+ "\n1. Hacer un reintegro, se pedirá la cantidad a retirar."
									+ "\n2. Hacer un ingreso, se pedirá la cantidad a ingresar."
									+ "\n3. Consultar el saldo y el número de reintegros e ingresos realizados."
									+ "\n4. Finalizar las operaciones.";

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Cuenta cuenta;
		System.out.print("Introduzca un saldo inicial: ");
		double saldo = Integer.valueOf(sc.nextLine());
		cuenta = new Cuenta(saldo, 0, 0);
		boolean salir = false;
		int opcion;
		while (!salir) {
			System.out.println(MENU);
			System.out.print("Elija una opcion: ");
			opcion = Integer.valueOf(sc.nextLine());
			
			switch (opcion) {
			case 1: 
				System.out.println("Introduzca la cantidad a retirar: ");
				double reintegro = Double.valueOf(sc.nextLine());
				cuenta.realizarReintegro(reintegro);
				break; 
			case 2: 
				System.out.println("Introduzca la cantidad a ingresar: ");
				double ingreso = Double.valueOf(sc.nextLine());
				cuenta.realizarIngreso(ingreso);
				break; 
			case 3: 
				System.out.println(cuenta.toString());; 
				break;
			case 4:
					System.out.print("¿Desea salir?(S/N)");
					String confirmacion = sc.nextLine().toUpperCase();
					while (!(confirmacion.equals("S") || confirmacion.equals("N"))) {
						System.out.print("Opción no válida. Introduzca S o N: ");
						confirmacion = sc.nextLine().toUpperCase();
					}
					if (confirmacion.equals("S")) {
						salir = true;
						System.out.println("EL saldo actual es "+cuenta.getSaldo()+"€");
						break;
					}else {
						break;
					}
			default: 
				System.out.println("La opción introducida es incorrecta.");
				
			}
				
			
			
		}

	}

}
