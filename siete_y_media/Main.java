package siete_y_media;

import java.util.Scanner;


public class Main {
	public static final String MENU = "1. 7 y media"
									+"\n2. Barajar"
									+"\n3. Salir";
	
	public static final String SUBMENU = "1. Dame una carta"
										+ "\n2. Plantarse";
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Baraja española = new Baraja();
		Carta c = new Carta();
		int opcion_menu_principal = 1;
		española.barajar();
		while (opcion_menu_principal!=3) {
			System.out.println(MENU);
			System.out.println("Elija una opción: ");
			opcion_menu_principal = Integer.valueOf(sc.nextLine());
			int opcion_submenu_jugador = 1;
			int opcion_submenu_banca = 1;
			if (opcion_menu_principal==1) {
				española.barajar();
				System.out.println(SUBMENU);
				System.out.println("Elija una opción: ");
				opcion_submenu_jugador = Integer.valueOf(sc.nextLine());
				while (opcion_submenu_jugador!=2) {
					if (opcion_submenu_jugador==1) {
						española.asignarCartaAjugador();
					}
					System.out.println("Tu carta es: " + española.verCartasJugador());
					System.out.println(SUBMENU);
					System.out.println("Elija una opción: ");
					opcion_submenu_jugador = Integer.valueOf(sc.nextLine());
				}
					System.out.println("Turno de la banca");
					española.asignarCartaAbanca();
					System.out.println("Tu carta es: " + española.verCartasBanca());
					System.out.println(SUBMENU);
					System.out.println("Elija una opción: ");
					opcion_submenu_banca = Integer.valueOf(sc.nextLine());
				
				while (opcion_submenu_banca!=2) {
					if (opcion_submenu_banca==1) {
						española.asignarCartaAbanca();
					}
					System.out.println("Tu carta es: " + española.verCartasBanca());
					System.out.println(SUBMENU);
					System.out.println("Elija una opción: ");
					opcion_submenu_banca = Integer.valueOf(sc.nextLine());
					
				}
				
				española.calcularPuntosJugador();
				española.calcularPuntosBanca();
				if (española.puntuacionJugador>española.puntuacionBanca && española.puntuacionJugador<=7.5 && española.puntuacionBanca<=7.5 || española.puntuacionBanca>7.5) {
					System.out.println("PUNTUACIÓN"
									+ "\nJugador: "+ española.puntuacionJugador
									+ "\nBanca: "+ española.puntuacionBanca
									+ "\nGana el jugador.");
				}else if (española.puntuacionJugador == española.puntuacionBanca) {
					System.out.println("PUNTUACIÓN"
									+ "\nJugador: "+ española.puntuacionJugador
									+ "\nBanca: "+ española.puntuacionBanca
									+ "\nEmpate.");
				}else {
					System.out.println("PUNTUACIÓN"
							+ "\nJugador: "+ española.puntuacionJugador
							+ "\nBanca: "+ española.puntuacionBanca
							+ "\nGana la banca.");
				}
			}else if (opcion_menu_principal == 2) {
				española.barajar();
			}else {
				System.out.println("Fin del juego");
			}
				
		}
		

	}

}
