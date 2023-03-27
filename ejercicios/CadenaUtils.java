package boletinTestUnit.ejercicios;

public class CadenaUtils {
	
	public String toMayusculas(String cadena) {
		return cadena.toUpperCase();
	}
	
	public String toMinusculas(String cadena) {
		return cadena.toLowerCase();
	}
	
	public boolean estaEnMayusculas(String cadena) {
		boolean mayusculas = false; 
		int contador = 0;
		String cadena_sin_espacios = cadena.replace(" ", "");
		for (int i = 0; i<cadena_sin_espacios.length(); i++) {
			if (Character.isUpperCase(cadena_sin_espacios.charAt(i))) {
				contador++;
			}
		}
		if (cadena_sin_espacios.length()==contador) {
			mayusculas= true;
		}
		return mayusculas;
	}
	
	public boolean estaEnMinusculas(String cadena) {
		boolean minusculas = false; 
		int contador = 0;
		String cadena_sin_espacios = cadena.replace(" ", "");
		for (int i = 0; i<cadena_sin_espacios.length(); i++) {
			if (Character.isLowerCase(cadena_sin_espacios.charAt(i))) {
				contador++;
			}
		}
		if (cadena_sin_espacios.length()==contador) {
			minusculas= true;
		}
		return minusculas;
	}
	
	public boolean esCapicua(String num) {
		boolean capicua = false;
		int contador = 0;
		for (int i=0; i<num.length(); ) {
			for (int j = num.length()-1; j>=0; j--) {
				if (num.charAt(i)== num.charAt(j)) {
						contador++;
				}
				i++;
			}
			
		}
		if (contador==num.length()) {
			capicua = true;
		}
		return capicua;
	}
	
	public boolean esPalindromo(String cadena) {
		int i = 0;
		int contador = 0;
		boolean palindromo = false;
		String cadena_nueva = cadena.replace(" ","").replace("á","a").replace("é","e").replace("í","i").replace("ó","o").replace("ú","u");
		for (int j = cadena_nueva.length()-1; j>=0;) {
			while (i<cadena_nueva.length()) {
				if (cadena_nueva.charAt(i)==cadena_nueva.charAt(j)) {
					contador++;
				}
				i++;	
				j--;
			}
		}
		if (contador==cadena_nueva.length()) {
			palindromo = true;
		}
		return palindromo;
	}
	
	public boolean esDecimal(String num) {
		boolean decimal = false; 
		for (int i = 0; i<num.length(); i++) {
			if (num.charAt(i) == '.' || num.charAt(i) == ',') {
				decimal = true;
			}
		}
		return decimal;
	}
	
	public boolean esEntero(String num) {
		boolean entero = true; 
		for (int i = 0; i<num.length(); i++) {
			if (num.charAt(i) == '.' || num.charAt(i) == ',') {
				entero = false;
			}
		}
		return entero;
	}
	
	
}
