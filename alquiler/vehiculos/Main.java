package alquiler.vehiculos;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
	public static final String MENU = "		ENTERPRISE		"
									 + "\n1. Alta de vehiculo"
									 +"\n2. Calculo del alquiler "
									 +"\n3. Salir";
	
	public static final int MAXIMA_CAPACIDAD = 200;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Vehiculo[] empresa = new Vehiculo [MAXIMA_CAPACIDAD];
		Gama gama = null;
		Combustible combustible = null;
		
		int opcion = 1; 
		int contador = 0;
		while (opcion!=3) {
			System.out.println(MENU);
			System.out.println("Introduzca una opción: ");
			opcion = Integer.valueOf(sc.nextLine());
			switch (opcion) {
			case 1:
				System.out.println("Tipo de vehículo(Coche/Microbus/Furgoneta): ");
				String tipo = sc.nextLine().toLowerCase();
				switch (tipo) {
				case "coche":
					System.out.println("Introduzca la matrícula: ");
					String matricula = sc.nextLine();
					System.out.println("Introduzca la gama(1.Alta"
							+"\n2.Media"
							+"\n3.Baja): ");
					opcion = Integer.valueOf(sc.nextLine());
					switch (opcion) {
					case 1:
						gama = gama.ALTA;
						break;
					case 2:
						gama = gama.MEDIA;
						break;	
					case 3: 
						gama = gama.BAJA;
						break;
					default:
						System.out.println("Opcion incorrecta");
						break;
					}
					System.out.println("Introduzca el combustible:"
							+"\n1.Gasolina"
							+"\n2.Diesel");
					opcion = Integer.valueOf(sc.nextLine());
					switch (opcion) {
					case 1:
						combustible = Combustible.GASOLINA;
						break;
					case 2:
						combustible = Combustible.DIESEL;
						break;	
					default:
						System.out.println("Opcion incorrecta");
						break;
					}
					empresa[contador]= new Coche(matricula, gama, combustible);
					contador++;
					break;
				case "microbus":
					System.out.println("Introduzca la matrícula: ");
					matricula = sc.nextLine();
					System.out.println("Introduzca el numero de asientos: ");
					int numAsientos = Integer.valueOf(sc.nextLine());
					System.out.println("Introduzca la gama(1.Alta"
							+"\n2.Media"
							+"\n3.Baja): ");
					opcion = Integer.valueOf(sc.nextLine());
					switch (opcion) {
					case 1:
						gama = gama.ALTA;
						break;
					case 2:
						gama = gama.MEDIA;
						break;	
					case 3: 
						gama = gama.BAJA;
						break;
					default:
						System.out.println("Opcion incorrecta");
						break;
					}
					empresa[contador]= new Microbus(matricula, gama, numAsientos);
					contador++;
					break;
				case "furgoneta":
					System.out.println("Introduzca la matrícula: ");
					matricula = sc.nextLine();
					System.out.println("Introduzca la gama(1.Alta"
							+"\n2.Media"
							+"\n3.Baja): ");
					opcion = Integer.valueOf(sc.nextLine());
					switch (opcion) {
					case 1:
						gama = gama.ALTA;
						break;
					case 2:
						gama = gama.MEDIA;
						break;	
					case 3: 
						gama = gama.BAJA;
						break;
					default:
						System.out.println("Opcion incorrecta");
						break;
					}
					empresa[contador]= new Furgoneta(matricula, gama);
					contador++;
					break;
					
				default:
					break;
				}
				break;
			case 2: 
				System.out.println("Introduzca una matricula");
				String matricula = sc.nextLine();
				System.out.println("Numeros de días: ");
				int numDias = Integer.valueOf(sc.nextLine());
				double precio = 0;
				boolean res = false;
				for (int i=0; i<empresa.length && res == false; i++) {
					if (empresa[i].getMatricula().equals(matricula)) {
						precio = empresa[i].calcularPrecioAlquiler(matricula, numDias);
						res = true;
					}
				}
				System.out.println("Precio del vehiculo con matricula "+matricula+" por "+numDias+" días es de "+precio);
				break;
			case 3:
				System.out.println("Fin del programa");
				break;
			}
			
		}
		
		
	}

}
