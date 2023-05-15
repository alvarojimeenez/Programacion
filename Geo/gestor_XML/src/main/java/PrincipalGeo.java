package main.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import main.java.model.Address;
import main.java.model.City;
import main.java.model.Country;

public class PrincipalGeo {

	public static void main(String[] args) {
		Country country = new Country();
		File f = new File("./files/paises.txt");

		FileWriter writer;
		try {
			writer = new FileWriter(f);
			PrintWriter printer = new PrintWriter(writer);
			
			for (Country c : country.llenarListaPaises()) {
				printer.print(c);
			}
			
			printer.close();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
