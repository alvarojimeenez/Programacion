package Principal;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import PlataformaOnline.jacaranda.com.Catalogo;
import PlataformaOnline.jacaranda.com.Serie;
import PlataformaOnline.jacaranda.com.SerieException;
import PlataformaOnline.jacaranda.com.Tema;
import PlataformaOnline.jacaranda.com.Temporada;

public class Main {

	
	
	public static void main(String[] args) {
		
		Catalogo series = new Catalogo();
		
		File f_series = new File("C:\\alvaro_daw\\WSs\\ws1\\Prueba19Mayo\\src\\files\\Series.csv");
		File f_temporada = new File("C:\\alvaro_daw\\WSs\\ws1\\Prueba19Mayo\\src\\files\\Temporada.csv");
		File f_capitulo = new File("C:\\alvaro_daw\\WSs\\ws1\\Prueba19Mayo\\src\\files\\Capitulos.csv");
		try {
			series.annadirSerie("This is us", 2015, Tema.DRAMA);
			series.annadirSerie("Friends", 1990, Tema.COMEDIA);
			series.annadirSerie("Dallas", 1970, Tema.INTRIGA);
			series.annadirTemporada("This is us", "Empezamos");
			series.annadirTemporada("This is us", "Seguimos");
			series.annadirTemporada("This is us", "Finalizamos");
			series.annadirCapituloTemporada("This is us", "Empezamos", "La familia");
			series.annadirCapituloTemporada("This is us", "Empezamos", "El problema");
			series.annadirCapituloTemporada("This is us", "Empezamos", "Los niños");
			series.annadirCapituloTemporada("This is us", "Empezamos", "Casi el final");
			series.annadirCapituloTemporada("This is us", "Empezamos", "El final");
			
			/*
			Fichero Series.csv
			nombreSerie,anno,tema
			*/
	
			FileWriter writer = new FileWriter(f_series);
			PrintWriter printer = new PrintWriter(writer);
			
			for (Serie s : series.mostrarTodasLasSeries()) {
				printer.println(s.toString());
			}
			
			printer.close();
			writer.close();
			
			/*
			Fichero Temporada.csv
			nombreSerie,nombreTemporada,numeroCapitulos,sumaOpiniones,numeroOpiniones
			*/
			writer = new FileWriter(f_temporada);
			printer = new PrintWriter(writer);
			for (Serie s : series.mostrarTodasLasSeries()) {
				for (Temporada t : s.getTemporadas() ) {
					printer.println(s.getNombreSerie()+ t.toString());
				}
			}
			
			printer.close();
			writer.close();
			
			/*
			Fichero Capitulos.csv
			nombreSerie,nombreTemporada,nombreCapitulo
			*/
			writer = new FileWriter(f_capitulo);
			printer = new PrintWriter(writer);
			
			for (Serie s : series.mostrarTodasLasSeries()) {
				for (Temporada t : s.getTemporadas() ) {
					for (String n : t.getCapitulos()) {
						printer.println(s.getNombreSerie()+t.getNombreTemporada()+n);
					}
				}
			}
			
			printer.close();
			writer.close();
			
			
		} catch (SerieException | IOException e) {
			e.printStackTrace();
		}
		
		

	}
	
	
}
