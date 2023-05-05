package common.collections.mock.exam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainFichero {

	public static void main(String[] args) {
		File fichero = new File("C:/alvaro/code/src/common/collections/mock/exam/Euromillones 2004 a 2023.txt");
		try {
			FileReader reader = new FileReader(fichero);
			BufferedReader buffer = new BufferedReader(reader);
			
			String linea = buffer.readLine();
			linea = buffer.readLine();
			while (linea!=null) {
				String [] datos = linea.split(",");
				String [] fecha = datos[0].split("/");
				Historial h = new Historial();
				try {
					try {
						h.addSorteo(Integer.valueOf(fecha[2]), Integer.valueOf(fecha[1]), Integer.valueOf(fecha[0]),
									new Combinacion(Integer.valueOf(datos[1]), Integer.valueOf(datos[2]), Integer.valueOf(datos[3]),
													Integer.valueOf(datos[4]), Integer.valueOf(datos[5]),
													Integer.valueOf(datos[7]), Integer.valueOf(datos[8])));
					} catch (CombinacionException e) {
						e.printStackTrace();
					} catch (Exception e) {
						e.printStackTrace();
					}
					linea = buffer.readLine();
				System.out.println(h.mostrarMapaHistorico());
				} catch (NumberFormatException e) {
					e.printStackTrace();
				} 
				
			}
		}
		catch (IOException e) {

		}


	}

}
