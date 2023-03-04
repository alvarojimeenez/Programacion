package com.edu.jarra;

import java.util.Scanner;

public class Main {
	public static final String MENU = " 		MENÚ JARRA					  "
			+ "\n1. LLenar jarra."
			+ "\n2. Vaciar jarra."
			+ "\n3. Volcar jarra A en B."
			+ "\n4. Volcar jarra B en A."
			+ "\n5. Consultar estado de las jarras."
			+ "\n6. Salir.";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la capacidad de la jarra A: ");
		int capacidadA = Integer.valueOf(sc.nextLine());
		Jarra a = new Jarra(capacidadA, 0);
		System.out.println("Introduzca la capacidad de la jarra B: ");
		int capacidadB = Integer.valueOf(sc.nextLine());
		Jarra b = new Jarra(capacidadB,0);
		int opcion = 1; 
		
		while (opcion!=6) {
			System.out.println(MENU);
			System.out.println("Introduzca una opcion: ");
			opcion = Integer.valueOf(sc.nextLine());
			
			switch (opcion) {
			case 1:
				System.out.println("¿Qué jarra desea llenar?(A/B)");
				String llenar = sc.nextLine().toUpperCase();
				if (llenar.equals("A")) {
					a.llenarJarra();
				}else {
					b.llenarJarra();
				}
				break;
			
			case 2: 
				System.out.println("¿Qué jarra desea vaciar?(A/B)");
				String vaciar = sc.nextLine().toUpperCase();
				if (vaciar.equals("A")) {
					a.vaciarJarra();
				}else {
					b.vaciarJarra();
				}
				break;
			case 3: 
				a.volcarASobreB(b);
				break;
			case 4: 
				b.volcarBSobreA(a);
				break;
			case 5: 
				System.out.println(a);
				System.out.println(b);
				break;
			case 6: 
				System.out.println(a.cantidadAgua( a, b));
				break;
			default:
				break;
			}
		}

	}

}
