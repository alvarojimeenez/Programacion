package boletin2.ejercicios;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		Elabora un programa que codifique una cadena, de tal modo que en el resultado se
		inviertan cada 2 caracteres. Los caracteres intercambiados no pueden volver a
		intercambiarse. Ejemplo:
		Entrada -> Hola mundo
		Salida -> oHalm nuod
		*/
		
		System.out.println(invertirCaracteresPorPares("Hola mundos"));
		
		

	}
	public static String invertirCaracteresPorPares(String original) {
		StringBuilder sb = new StringBuilder();
		
		if (original!=null && !original.isEmpty()) {
			for (int i = 0; i<original.length()-1; i+=2) {
				sb.append(original.charAt(i+1));
				sb.append(original.charAt(i));
			}
			if (original.length()%2!=0) {
				sb.append(original.charAt(original.length()-1));
			}
		}
		
		return sb.toString();
		
	}

}
