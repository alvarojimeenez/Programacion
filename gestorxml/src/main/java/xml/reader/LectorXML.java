package main.java.xml.reader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import main.java.model.Estudiante;
import main.java.model.Genero;

public class LectorXML {
	
	public List<Estudiante> cargarDatos(String ruta) {
		List<Estudiante> estudiante = new ArrayList<>();
		File fichero = new File(ruta);
		try {
			DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document documento = builder.parse(fichero);
			
			System.out.println(documento.getDocumentElement().getNodeName());
			
			NodeList hijos = documento.getElementsByTagName("estudiante");
			
			for (int i = 0; i<hijos.getLength(); i++) {
				Element hijo = (Element) hijos.item(i);	
				int id = Integer.valueOf(hijo.getAttribute("id"));
				String nombre = hijo.getElementsByTagName("nombre").item(0).getTextContent();
				String apellido = hijo.getElementsByTagName("apellidos").item(0).getTextContent();
				String fechaNacimiento = hijo.getElementsByTagName("fechaNacimiento").item(0).getTextContent();
				Genero genero = Genero.valueOf(hijo.getElementsByTagName("genero").item(0).getTextContent());
				
				estudiante.add(new Estudiante(id, nombre, apellido, fechaNacimiento, genero));
			}
			
		} catch (ParserConfigurationException | SAXException | IOException e) {

			
		}
		return estudiante;
	}
}
