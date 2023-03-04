package com.edu.linea;

import java.util.Scanner;
public class Main {
	public static final String MENU = "			MENÚ			" 
									+ "\n1. Mover línea"
									+ "\n2. Mostrar línea"
									+ "\n3. Salir";
	public static final String SUBMENU = "		MOVER LÍNEA		"
									+ "\nA-Arriba"
									+ "\nB-Abajo"
									+ "\nI-Izquierda"
									+ "\nD-Derecha";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Punto p1 = new Punto(6, 7);
		Punto p2 = new Punto(8, 2);
		Linea linea = new Linea(p1, p2);
		
		
		String opcion = "1";
		
		while (!(opcion.equals("3"))) {
			System.out.println(MENU);
			System.out.println("Elija una opción: ");
			opcion = sc.nextLine().toUpperCase(); 
			switch (opcion) {
			case "1":
				System.out.println(SUBMENU);
				System.out.println("Elija una opción: ");
				opcion = sc.nextLine().toUpperCase(); 
				System.out.println("Elije el desplazamiento");
				int desplazamiento = Integer.valueOf(sc.nextLine());
				switch (opcion) {
				case "A":
					linea.subir(desplazamiento);
					break;
				case "B":
					linea.bajar(desplazamiento);
					break;
				case "I":
					linea.moverIzquierda(desplazamiento);
					break;
				case "D":
					linea.moverDerecha(desplazamiento);
					break;
				default:
					System.out.println("No es una opción correcta.");
					break;
				}
			case "2": 
				System.out.println(linea);
				break;
			case "3":
				System.out.println("Fin del programa");
				break;
			default:
				System.out.println("La opción escogida no es correcta.");
				break;
			}
			
		}
		
	}

}
