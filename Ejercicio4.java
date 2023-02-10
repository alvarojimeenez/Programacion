package boletin3.ejercicios;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		Crea tres funciones cuyo comportamiento sea como el de los métodos de String
		startsWirth, contains y endsWith, pero sin utilizar ninguno de ellos
		*/
		
		System.out.println(contains("hola mundo","ol"));
		System.out.println(contains("hola mundo","prueba"));
		
		System.out.println(startsWith("hola adios", "hol"));
		System.out.println(startsWith("hola adios", "adi"));

		System.out.println(endsWith("es una prueba", "ba"));
		System.out.println(endsWith("es una prueba", "pru"));

	}
	
	
	public static boolean contains(String cadena, String palabra) {
		int contador = 0;
		boolean contiene = false;
		int i = 0;
		while (i<cadena.length() && contador!=palabra.length()){
				if (cadena.charAt(i)==palabra.charAt(contador)) {
					contador++;
				}
				i++;
			}
		if (palabra.length()==contador) {
			contiene = true;
		}
		return contiene;
	}
	public static boolean startsWith(String cadena, String prefijo) {
		int cont=0; 
		boolean empieza = false; 
		int i = 0;
		while (i<prefijo.length()) {
			if (cadena.charAt(i) == prefijo.charAt(cont)) {
				cont++;
			}
			i++;
		}
		if (prefijo.length()==cont) {
			empieza = true;
		}
		return empieza;
	}
	public static boolean endsWith(String cadena, String sufijo) {
		int cont = 0;
		boolean termina = false;
		for (int i = cadena.length()-sufijo.length(); i<cadena.length(); i++) {
				if (cadena.charAt(i)== sufijo.charAt(cont)) {
					cont++;	
				}	
			}
		if (sufijo.length()==cont) {
			termina = true;
		}
		return termina;
	}
}
