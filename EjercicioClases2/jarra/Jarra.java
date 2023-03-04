package com.edu.jarra;

public class Jarra {
	/*
	3. Crear una clase Jarra que utilizaremos para simular algunas de las acciones que
	podemos realizar con una jarra. Cada jarra tiene una determinada capacidad (en litros).
	Además una jarra dispondrá de una cantidad de agua que podrá ir variando a medida que
	realicemos operaciones con ellas. Las jarras se crearán siempre vacías.
	Las acciones que podremos realizar sobre una jarra son:
	• Llenar la jarra por completo desde un grifo.
	• Vaciarla por completo.
	• Volcar el contenido de una jarra en otra.
	Por ejemplo: Disponemos de dos jarras A y B de capacidades 7 y 4 litros
	respectivamente. Podemos llenar la jarra A (no podemos echar menos del total de la
	jarra porque no sabríamos a ciencia cierta cuánta agua tendría). Luego volcar A sobre B
	(no cabe todo por lo que en A quedan 3 litros y B está llena). Ahora vaciar B. Después
	volver a volcar A sobre B. En esta situación, A está vacía y B tiene 3 litros.
	Además se debe guardar en la clase Jarra el total de agua que se ha consumido llenando
	objetos Jarra.
	Realizar un programa que cree dos jarras A y B (solicitando las capacidades por teclado)
	inicialmente vacías. Después se realizará un menú que permita:
	1. Llenar jarra: Se solicitará con la pregunta “¿Qué jarra desea llenar (A/B)?” y
	se llenará la jarra correspondiente.
	2. Vaciar jarra: Se realizará la pregunta “¿Qué jarra desea vaciar (A/ B)?” y se
	vaciará la jarra correspondiente.
	3. Volcar jarra A en B .
	4. Volcar jarra B en A.
	5. Ver estado de las jarras: Se mostrará la capacidad y el agua que contiene, tanto
	para la jarra A como para la B.
	6. Salir: Cuando salga debe mostrarse un mensaje que indique "El total de agua
	que se ha gastado llenando jarras es XXX litros".
	*/
	
	private int capacidadJarra;
	private int cantidadAguaJarra;
	
	
	public Jarra() {
		this.capacidadJarra = capacidadJarra;
		this.cantidadAguaJarra = cantidadAguaJarra;
		
	}
	
	public Jarra(int capacidadJarra, int cantidadAguaJarra) {
		setCapacidadJarra(capacidadJarra);
		setCantidadAguaJarra(cantidadAguaJarra);
		
	}

	public int getCapacidadJarra() {
		return capacidadJarra;
	}

	public void setCapacidadJarra(int capacidadJarra) {
		this.capacidadJarra = capacidadJarra;
	}

	public int getCantidadAguaJarra() {
		return cantidadAguaJarra;
	}

	public void setCantidadAguaJarra(int cantidadAguaJarra) {
		this.cantidadAguaJarra = cantidadAguaJarra;
	}
	
	public void vaciarJarra() {
		cantidadAguaJarra = 0;
	}
	
	public void llenarJarra() {
		cantidadAguaJarra = capacidadJarra;
	}
	
	public void volcarASobreB(Jarra b) {
		int total = cantidadAguaJarra+ b.cantidadAguaJarra;
		if (total>b.capacidadJarra) {
			b.cantidadAguaJarra= b.capacidadJarra;
			cantidadAguaJarra = total - b.cantidadAguaJarra;
		}else {
			cantidadAguaJarra = 0;
			b.cantidadAguaJarra = total;
		}
	}
	
	public void volcarBSobreA(Jarra a) {
		int total = a.cantidadAguaJarra+ cantidadAguaJarra;
		if (total>a.capacidadJarra) {
			a.cantidadAguaJarra= a.capacidadJarra;
			cantidadAguaJarra = total - a.cantidadAguaJarra;
		}else {
			cantidadAguaJarra = 0;
			a.cantidadAguaJarra = total;
		}
	}
	
	public String cantidadAgua(Jarra a, Jarra b) {
		int totalJarraA= a.cantidadAguaJarra++;
		int totalJarraB = b.cantidadAguaJarra++;
		int total = totalJarraA+ totalJarraB;
		return "La cantidad gastada de agua es "+total+" litros";
	}

	@Override
	public String toString() {
		return "Capacidad--> " + capacidadJarra + " Cantidad de agua--> " + cantidadAguaJarra;
	}
	
	
	
	
	

}
