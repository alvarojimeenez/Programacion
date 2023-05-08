package main.java;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import main.java.model.Estudiante;
import main.java.model.Genero;
import main.java.xml.reader.LectorXML;
import main.java.xml.writer.EscritorXML;

public class PrincipalEstudiante {

	public static void main(String[] args) {
	/*	List<Estudiante> estudiantes = new LectorXML().cargarDatos("./files/estudiantes.xml");
		
		for (Estudiante e : estudiantes) {
			System.out.println(e);
		}*/
		
		
		
		List<Estudiante> nuevosEstudiantes = new ArrayList<>(
				Arrays.asList(new Estudiante(1, "Alvaro", "Jimenez", "1999", Genero.HOMBRE),
							  new Estudiante(2, "Antonio", "Rodriguez", "2002", Genero.HOMBRE),
							  new Estudiante(3, "Maria", "Lopez", "1998", Genero.MUJER),
							  new Estudiante(4, "Manuel", "Rios", "2004", Genero.HOMBRE),
							  new Estudiante(5, "Marta", "Moreno", "1996", Genero.MUJER)
							  ));
		new EscritorXML().escribirDatos(nuevosEstudiantes, "./files/nuevo_ficheros_estudiantes.xml");
	}

}
