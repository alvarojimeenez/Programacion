package main.java.xml.reader;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import main.java.model.Caseta;
import main.java.model.Clase;

public class CasetaXML {
	
	public Set<Caseta> cargarDatos(String ruta) {
		Set<Caseta> caseta = new HashSet<>();
		File fichero = new File(ruta);
		try {
			DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document documento = builder.parse(fichero);
			
			//System.out.println(documento.getDocumentElement().getNodeName());
			
			NodeList hijos = documento.getElementsByTagName("DatosLeidos");
			
			for (int i = 0; i<hijos.getLength(); i++) {
				Element hijo = (Element) hijos.item(i);	
				
				String titulo = hijo.getElementsByTagName("TITULO").item(0)==null? "Vacío" :hijo.getElementsByTagName("TITULO").item(0).getTextContent();
				String calle = hijo.getElementsByTagName("CALLE").item(0)==null?"Vacío":hijo.getElementsByTagName("CALLE").item(0).getTextContent();
				int numero = hijo.getElementsByTagName("NUMERO").item(0)==null? 0 : Integer.valueOf(hijo.getElementsByTagName("NUMERO").item(0).getTextContent());
				int modulo = hijo.getElementsByTagName("MODULOS").item(0)==null? 0 : Integer.valueOf(hijo.getElementsByTagName("MODULOS").item(0).getTextContent());
				Clase clase = hijo.getElementsByTagName("CLASE").item(0)==null?Clase.valueOf("Vacio"):Clase.valueOf(hijo.getElementsByTagName("CLASE").item(0).getTextContent());				
				int id = hijo.getElementsByTagName("ID").item(0)==null? 0 : Integer.valueOf(hijo.getElementsByTagName("ID").item(0).getTextContent());
				int idCalle = hijo.getElementsByTagName("ID_CALLE").item(0)==null? 0 : Integer.valueOf(hijo.getElementsByTagName("ID_CALLE").item(0).getTextContent());
				
				caseta.add(new Caseta(titulo, calle, numero, modulo, clase, id, idCalle));
			}
			
		} catch (ParserConfigurationException | SAXException | IOException e) {

			
		}
		return caseta;
	}
}
