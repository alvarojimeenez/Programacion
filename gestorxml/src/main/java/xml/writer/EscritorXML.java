package main.java.xml.writer;

import java.io.File;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import main.java.model.Estudiante;
import main.java.model.Genero;

public class EscritorXML {

	public void escribirDatos(List<Estudiante> estudiantes, String rutaFichero) {
		try {
			Document documento = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
			
				
			Element nodoRaiz = documento.createElement("estudiantes");
			documento.appendChild(nodoRaiz);
				
			for (Estudiante e : estudiantes) {
				Element nodoHijo = documento.createElement("estudiantes");
				nodoRaiz.appendChild(nodoHijo);
				
				
				Attr identificador = documento.createAttribute("identificador");
				identificador.setNodeValue(String.valueOf(e.getId()));
				nodoHijo.setAttributeNode(identificador);
				
					Element nombre = documento.createElement("nombre");
					nombre.appendChild(documento.createTextNode(e.getNombre()));
					nodoHijo.appendChild(nombre);
					
					Element apellidos = documento.createElement("apellidos");
					apellidos.appendChild(documento.createTextNode(e.getApellidos()));
					nodoHijo.appendChild(apellidos);
					
					Element fecha_nacimiento = documento.createElement("fecha_nacimiento");
					fecha_nacimiento.appendChild(documento.createTextNode(e.getFechaNacimiento()));
					nodoHijo.appendChild(fecha_nacimiento);
					
					Element genero = documento.createElement("genero");
					genero.appendChild(documento.createTextNode(String.valueOf(e.getGenero())));
					nodoHijo.appendChild(genero);
			}
					
			
			Transformer optimus = TransformerFactory.newInstance().newTransformer();
			DOMSource source = new DOMSource(documento);
			StreamResult result = new StreamResult(new File(rutaFichero));
			
			optimus.setOutputProperty(OutputKeys.INDENT, "yes");
			optimus.transform(source, result);
			
			
		} catch (ParserConfigurationException | TransformerException | TransformerFactoryConfigurationError e) {
			e.printStackTrace();
		}
	}

}
