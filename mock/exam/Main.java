package com.edu.mock.exam;

public class Main {

	public static void main(String[] args) {
		Plato patatas = new Plato("Patatas fritas", 3);
		Vino vino = new Vino("Rioja", 6);
		Vino vino2 = new Vino("Rioja", 6);
		Vino vino3 = new Vino("Marqués de Cáceres", 8);
		System.out.println(vino.equals(vino2));
		System.out.println(vino3.equals(vino2));
		System.out.println(patatas);

	}

}
