package boletin3.ejercicios;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*
		Realizar una función que busque una palabra escondida dentro de un texto. Por
		ejemplo, si la cadena es “shybaoxlna” y la palabra que queremos buscar es “hola”,
		entonces si se encontrará y deberá devolver True, en caso contrario deberá devolver
		False. Las letras de la palabra escondida deben aparecer en el orden correcto en la
		cadena que la oculta:
		shybaoxlna ⇒ hola: True
		soybahxlna ⇒ hola: False
		*/
		
		System.out.println(buscarPalabraEscondida("hola","shybaoxlna"));
		
	}
	
	public static boolean buscarPalabraEscondida(String escondida, String cadena) {
		boolean encontrada = false; 
		int cont1 = 0;
		int cont2 = 0;
		while (cont1<cadena.length()) {
			if (cont2<escondida.length() && escondida.charAt(cont2)==cadena.charAt(cont1)) {
				cont2++;
			}
			cont1++;
		}
		if (cont2==escondida.length()) {
			encontrada = true;
		}
		return encontrada;
	}
}
