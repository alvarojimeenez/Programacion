package com.edu;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//  Realiza un método que reciba dos números y devuelva True si uno es múltiplo del otro.
		
		int num1 = 0;
		int num2= 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca primer número: ");
		num1 = Integer.valueOf(sc.nextLine());
		
		System.out.print("Introduzca segundo número: ");
		num2 = Integer.valueOf(sc.nextLine());
		
		
		if (num1%num2==0 || num2%num1==0) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		

	}

}
