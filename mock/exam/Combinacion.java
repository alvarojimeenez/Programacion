package common.collections.mock.exam;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Combinacion {
	
	protected static final int VALOR_MINIMO = 1;
	protected static final int VALOR_MAXIMO_NUMEROS = 50;
	protected static final int VALOR_MAXIMO_ESTRELLAS = 12;
	protected static final int TOTAL_NUMEROS = 5;
	protected static final int TOTAL_ESTRELLAS = 2;
	private Collection<Integer> numeros;
	private Collection<Integer> estrellas;
	
	
	public Combinacion (int num1, int num2, int num3, int num4, int num5, int estr1, int estr2) throws Exception {
		this.numeros = new HashSet<>();
		this.numeros.add(num1);
		this.numeros.add(num2);
		this.numeros.add(num3);
		this.numeros.add(num4);
		this.numeros.add(num5);
		this.estrellas = new HashSet<>();
		this.estrellas.add(estr1);
		this.estrellas.add(estr2);
		for (int n : this.numeros ) {
			for (int e : this.estrellas) {
				if (!(n>=VALOR_MINIMO || n<=VALOR_MAXIMO_NUMEROS) && this.numeros.size()!=TOTAL_NUMEROS && 
				   (!(e>=VALOR_MINIMO || e<=VALOR_MAXIMO_ESTRELLAS) && this.estrellas.size()!=TOTAL_ESTRELLAS) ) {
					throw new CombinacionException("Los valores introducidos no son válidos.");
				}
			}	
		}
	}
	
	public Collection<Integer> mostrar() {
		return this.numeros;
	}
	public Combinacion(Set<Integer> numeros, Set<Integer> estrellas) {
		this.numeros = numeros; 
		this.estrellas = estrellas;
	}

	public Collection<Integer> getNumeros() {
		return numeros;
	}

	public Collection<Integer> getEstrellas() {
		return estrellas;
	}
	/*
	public Collection<Integer> generarBomboNumeros() {
		Set<Integer> numeros = new HashSet<>(); 
		for(int i=0; i<TOTAL_NUMEROS; i++) {
			numeros.add(new Random().nextInt(1, 50));
		}
		return numeros;
	}
	
	public Collection<Integer> generarBomboEstrellas() {
		Set<Integer> estrellas = new HashSet<>(); 
		for(int i=0; i<TOTAL_ESTRELLAS; i++) {
			estrellas.add(new Random().nextInt(1, 12));
		}
		return estrellas;
	}
	*/
	public int comprobarCombinacion(Combinacion c) {
		int contNumeros = 0;
		int contEstrellas = 0;
		for (Integer n : this.numeros) {
			if (c.getNumeros().contains(n) ) {
				contNumeros++;
			}
		}
		for (Integer e : this.estrellas) {
			if (c.getEstrellas().contains(e)) {
				contEstrellas++;
			}
		}
		return contNumeros+contEstrellas;
	}
	
	public boolean equals(Object obj) {
		boolean sonIguales = this == obj;
		if (!sonIguales && obj!=null && obj instanceof Combinacion) {
			Combinacion casteado = (Combinacion) obj;
			sonIguales = this.getNumeros().equals(casteado.getNumeros()) && this.getEstrellas().equals(casteado.getEstrellas());
		}
		return sonIguales;
	}
	@Override
	public String toString() {
		return "Combinacion " + numeros + estrellas;
	}
	
	
}
