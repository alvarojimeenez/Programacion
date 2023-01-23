package com.edu;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*
		Codifica las siguientes secuencias numéricas haciendo uso de estructuras: i) for, ii)
		while, iii) do-while en cada una de ellas:
			a. Crea un método que muestre los números del 1 al 100
			b. Repite el ejercicio anterior, pero en formato descendente, es decir, del 100 al 1.
			c. Crea un programa que calcule y escriba los números múltiplos de 5 de 0 a 100.
			d. Escribe los números del 320 al 160, contando de 20 en 20 hacia atrás. */
		
		//a. Crea un método que muestre los números del 1 al 100
		
		System.out.println("Apartado A con for");
		for (int i=1; i<=100; i++) {
			System.out.println(i);
		}
		
		System.out.println("Apartado A con while");
		int i = 1;
		while (i<=100) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("Apartado A con do-while");
		int numero = 1;
		do {
			System.out.println(numero++);
		}while (numero<=100);
		
		// b. Repite el ejercicio anterior, pero en formato descendente, es decir, del 100 al 1.
		
		
			System.out.println("Apartado B con for");
			for (int t=100; t>1; t--) {
				System.out.println(t);
			}
			
			System.out.println("Apartado B con while");
			int t = 100;
			while (t>=1) {
				System.out.println(t);
				t--;
			}
			
			System.out.println("Apartado B con do-while");
			int num = 101;
			do {
				System.out.println(num-=1);
			}while (num>1);
		
			
			
		// c. Crea un programa que calcule y escriba los números múltiplos de 5 de 0 a 100.
			
			System.out.println("Apartado C con for");
			for (int d=0; d<=100; d++) {
				if (d%5==0) {
					System.out.println(d);
				}
			}
			
			System.out.println("Apartado C con while");
			int d = 1;
			while (d<=100) {
				if (d%5==0) {
					System.out.println(d);
				}
				d++;
			}
			
			System.out.println("Apartado C con do-while");
			int num1 = 0;
			do {
				System.out.println(num1+=5);
			}while (num1<100);
			
		// d. Escribe los números del 320 al 160, contando de 20 en 20 hacia atrás.
			
			System.out.println("Apartado D con for");
			for (int cont=320; cont>=160; cont-=20) {
				System.out.println(cont);
			}
			
			System.out.println("Apartado D con while");
			int cont = 320;
			while (cont>=160) {
				System.out.println(cont);
				cont-=20;
			}
			
			System.out.println("Apartado D con do-while");
			int contador = 320;
			do {
				System.out.println(contador-=20);
			}while (contador>160);
			
	}

}
