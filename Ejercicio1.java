package boletin2.ejercicios;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		Realizar un método llamado numeroSolucionesEcuacionSegundoGrado que reciba
		los coeficientes de una ecuación de segundo grado y devuelva el número de
		soluciones que tiene. Si los argumentos no son válidos (el primer coeficiente tiene
		que ser distinto de cero) debe devolver un -1.

		 */
		int a=1, b=4, c=1;
		System.out.println(numeroSolucionesEcuacionSegundoGrado(a, b, c));
	
	}
	
	
	public static double numeroSolucionesEcuacionSegundoGrado(int a, int b, int c) {
		String mensaje = "";
		// Math.pow(b, 2)-4*a*c>0 tiene 2 soluciones
		// Math.pow(b, 2)-4*a*c=0 tiene 1 solución
		// Math.pow(b, 2)-4*a*c tiene 2 soluciones
		double valorNulo = Math.pow(b, 2)-4*a*c;
		int resultado = 0;
		if (a!=0) {
			if (valorNulo<0) {
				 resultado = 0;
			}else if (valorNulo>0) {
				 resultado = 2;
			}
			
		}else {
			 resultado = -1;
		}
		return resultado;
	}

}
