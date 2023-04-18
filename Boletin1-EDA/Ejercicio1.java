package common.collections;

import java.util.Arrays;

public class Ejercicio1 {

	protected static <T> T[] reverse(T[] original) {
		T[] copia = original.clone();
		for (int i = 0; i < copia.length; i++) {
			copia[i] = original[original.length - 1 - i];
		}
		return copia;
	}

	public static void main(String[] args) {
		Integer[] numero = { 1, 5, 7 };
		System.out.println(Arrays.toString(reverse(numero)));

		String[] nombres = { "Alvaro", "Antonio", "Fran", "Rafa" };
		System.out.println(Arrays.toString(reverse(nombres)));
	}

}
