package com.edu;

import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {
		 
		
		System.out.println("Mes del año: ");
		System.out.println("Año: ");
		
		Scanner sc = new Scanner(System.in);
		Integer mes = sc.nextInt();
		Integer agnio = sc.nextInt();
		
		if (mes==1 || mes ==3 || mes==5 || mes==7 || mes==8 || mes== 10 || mes==12) {
			System.out.println("Tiene 31 días");
		}
		else if (mes==4 || mes==6 || mes==9 || mes==11) {
			System.out.println("Tiene 30 días");
		}
		else if (mes==2) {
			if (agnio % 4 == 0 && (agnio % 100 != 0 || agnio % 400 == 0)) {
				System.out.println("Tiene 29 días");
			}
			else {
				System.out.println("Tiene 28 días");
			}
		}	
		}
		
		
		

	}


