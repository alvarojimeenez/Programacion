package com.edu.producto;

import java.util.Scanner;

public class Main {
	public static final String MENU = "1. Consulta del producto."
			+ "\n2. Modificar los atributos."
			+ "\n3. Precio del producto con iva incluido."
			+ "\n4. Salir.";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Creando producto......");
		System.out.println("Introduzca código del producto: ");
		int codigo = Integer.valueOf(sc.nextLine());
		System.out.println("Introduzca descripción del producto: ");
		String descripcion = sc.nextLine();
		System.out.println("Introduzca el precio sin iva: ");
		int precio_sin_iva = Integer.valueOf(sc.nextLine());
		Producto producto = new Producto(codigo, descripcion, precio_sin_iva);
		int opcion = 1;
		
		while (opcion!=4) {
			System.out.println(MENU);
			System.out.println("Elija una opción: ");
			opcion = Integer.valueOf(sc.nextLine());
			
			switch (opcion) {
			case 1:
				System.out.println(producto);
				break;
			case 2: 
				System.out.println("Quieres modificar los atributos?(S/N)");
				String confirmacion = sc.nextLine().toUpperCase();
				if (confirmacion.equals("S")) {
					System.out.println("Introduzca código del producto: ");
					codigo = Integer.valueOf(sc.nextLine());
					System.out.println("Introduzca descripción del producto: ");
					descripcion = sc.nextLine();
					System.out.println("Introduzca el precio sin iva: ");
					precio_sin_iva = Integer.valueOf(sc.nextLine());
					producto = new Producto(codigo, descripcion, precio_sin_iva);
					break;
				}else {
					break;
				}
			case 3: 
				System.out.println(producto.calcular_precio_con_iva());
			default:
				break;
			}
		}

	}

}
