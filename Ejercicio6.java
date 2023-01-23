package com.edu;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Programar un sistema de calefacción-refrigeración que compruebe en función del
		// día y el mes, la estación en la que estamos y dependiendo de la estación programe
		// la temperatura: Invierno→19º, Primavera→20º, Verano→24º, Otoño→19º.
		// El método deberá recibir como parámetro el mes y el día actual y devolver los
		// grados a los que deberemos programar el sistema.
		
		int dia = 0;
		int mes = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce dia: ");
		dia = Integer.valueOf(sc.nextLine());
		
		System.out.print("Introduce el mes: ");
		mes = Integer.valueOf(sc.nextLine());
		
		
		if (((dia>=20 && dia <=31) && mes==3) || ((dia>=1 && dia<=30) && mes==4) || ((dia>=1 && dia<=31) && mes==5) || ((dia>=1 && dia<21) && mes==6)) {
			System.out.println("Es primavera y tendríamos que programar el sistema a 20º"); 
		}else if (((dia>=21 && dia <=30) && mes==6) || ((dia>=1 && dia<=31) && mes==7) || ((dia>=1 && dia<=31) && mes==8) || ((dia>=1 && dia<23) && mes==9)) {
			System.out.println("Es verano y tendríamos que programar el sistema a 24º");
		}else if (((dia>=23 && dia <=30) && mes==9) || ((dia>=1 && dia<=31) && mes==10) || ((dia>=1 && dia<=30) && mes==11) || ((dia>=1 && dia<21) && mes==12)) {
			System.out.println("Es otoño y tendríamos que programar el sistema a 19º");
		}else if (((dia>=21 && dia <=31) && mes==12) || ((dia>=1 && dia<=31) && mes==1) || ((dia>=1 && dia<=28) && mes==2) || ((dia>=1 && dia<19) && mes==3)) {
			System.out.println("Es invierno y tendríamos que programar el sistema a 19º");
		}
		

	}

}
