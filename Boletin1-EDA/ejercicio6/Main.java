package common.collections.ejercicio6;

public class Main {

	public static void main(String[] args) {
		
		Palabra diccionario = new Palabra();
		diccionario.agregarPalabra("coche", "Automovil de 4 ruedas");
		diccionario.agregarPalabra("raton", "Animal");
		diccionario.agregarPalabra("cocina", "lugar para hacer de comer");
		System.out.println(diccionario);
		System.out.println(diccionario.buscarPalabra("raton"));
		System.out.println(diccionario);
		System.out.println(diccionario.listarPalabrasQueEmpiecenPorUnaCadena("co"));
		diccionario.borrarPalabra("coche");
		System.out.println(diccionario);

	}

}
