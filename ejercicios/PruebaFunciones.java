package boletinTestUnit.ejercicios;

public class PruebaFunciones {
	
	public static boolean buscarPalabraEscondida(String escondida, String cadena) {
		boolean encontrada = false;
		int cont1 = 0;
		int cont2 = 0;
		while (cont1 < cadena.length()) {
			if (cont2 < escondida.length() && escondida.charAt(cont2) == cadena.charAt(cont1)) {
				cont2++;
			}
			cont1++;
		}
		if (cont2 == escondida.length()) {
			encontrada = true;
		}
		return encontrada;
	}
	
	public static int contarNumeroVeces(String palabra, String cadena) {
		int contador = 0;
		int contadorPalabras = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == palabra.charAt(contador)) {
				contador++;
				if (palabra.length() == contador) {
					contadorPalabras++;
					contador = 0;
				}
			} else {
				contador = 0;
			}
		}
		return contadorPalabras;
	}
}
