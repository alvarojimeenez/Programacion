package siete_y_media;

import java.util.Arrays;

public class Baraja {
	
	protected int numCartas; 
	protected int siguiente=0;
	protected Carta[] carta;
	
	//Atributos que he creado a parte para el juego entre jugador y banca.
	private Carta[] jugador = new Carta[20];
	private Carta[] banca = new Carta[20];
	private int contadorCartasJugador;
	private int contadorCartasBanca;
	public double puntuacionJugador;
	public double puntuacionBanca;
	
		
	
	public Baraja() {
		this.numCartas = numCartas;
		this.siguiente = siguiente;
		this.carta = new Carta[40];
		for (Palo p : Palo.values()) {
			for (int i = 1; i<13; i++) {
				if (i!=8 && i!=9) {
					this.carta[siguiente] = new Carta(i, p);
					this.siguiente++;
				}
			}
		}
	}
	
	public void barajar() {
		this.siguiente = 0;
		Carta c = new Carta();
		for (int i = 0; i<carta.length; i++) {
			this.siguiente = (int) (Math.random()*(0+40));
			c = carta[i];
			carta[i] = carta[this.siguiente];
			carta[this.siguiente] = c;
		}
	}
	
	public Carta getSiguiente() {
		Carta c = new Carta();
		if (this.siguiente == 40) {
			System.out.println("No hay más cartas");
		}else {
			c = carta[this.siguiente];
			this.siguiente++;
		}
		return c;
	}
	
	public void asignarCartaAjugador() {
		jugador[contadorCartasJugador]= getSiguiente();
		contadorCartasJugador++;
	}
	
	public void asignarCartaAbanca() {
		banca[contadorCartasBanca]=getSiguiente();
		contadorCartasBanca++;
	}
	
	public String verCartasJugador() {
		StringBuilder sb = new StringBuilder();
		for (Carta c : jugador) {
			if (c!=null) {
				sb.append(c+", ");
			}
		}
		return sb.toString();
	}
	
	public String verCartasBanca() {
		StringBuilder sb = new StringBuilder();
		for (Carta c : banca) {
			if (c!=null) {
				sb.append(c+", ");
			}
		}
		return sb.toString();
	}
	
	public void calcularPuntosJugador() {
		for (Carta c : jugador) {
			if (c!=null) {
				puntuacionJugador=c.getValor();
			}
		}
	}
	
	public void calcularPuntosBanca() {
		for (Carta c : banca) {
			if (c!=null) {
				puntuacionBanca+=c.getValor();
			}
		}
	}

	@Override
	public String toString() {
		return Arrays.toString(carta);
	}

	
	
	

	
	
	

}

