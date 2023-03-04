package com.edu.futbol;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("A punto de comenzar el partido de hoy");
		System.out.println("Equipo local: ");
		String eqLocal = sc.nextLine();	
		System.out.println("Equipo visitante: ");
		String eqVisitante = sc.nextLine();
		while (eqLocal.equals(eqVisitante)) {
			System.out.println("Equipo local: ");
			eqLocal = sc.nextLine();	
			System.out.println("Equipo visitante: ");
			eqVisitante = sc.nextLine();
		}
		Equipo local = new Equipo(eqLocal, 0, "Benito Villamarin", "Sevilla"); // creando equipo local
		Equipo visitante = new Equipo(eqVisitante, 0, "Sanchez Pizjuan", "Sevilla"); // creando equipo visitante
		Partido partido = new Partido(3, 'X',local , visitante); // creando partido
		
		System.out.println("¿Quieres que empiece el partido?(S/N)");
		String empezar = sc.nextLine().toUpperCase();
		if (empezar.equals("S")) {
			System.out.println("EMPEZANDO PARTIDO");
			System.out.println("Introduzca un resultado: ");
			String resultado = sc.nextLine();
			partido.ponerResultado(resultado);
			System.out.println(partido);	
			System.out.println("FIN DE LA JORNADA DE HOY");
		}else {
			partido.cadena();
			System.out.println("¿Quieres que empiece ya?(S/N)");
			empezar = sc.nextLine().toUpperCase();
			if (empezar.equals("S")) {
				System.out.println("EMPEZANDO PARTIDO");
				partido.ponerResultado("3-1");
				System.out.println(partido);	
				System.out.println("FIN DE LA JORNADA DE HOY");
			}
		}
		

	}

}
