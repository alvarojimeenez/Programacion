package main.java.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Country {
	
	private int id; 
	private String country;
	private List<City> listCity;
	
	public Country() {
		super();
	}
	
	public Country(int id, String country) {
		super();
		this.id = id;
		this.country = country;
		this.listCity = new ArrayList<>();
	}
	
	public void addCity(City c) {
		this.listCity.add(c);
	}
	
	public int numeroCiudadesEnCadaPais() {
		int cont = 0; 
		for (City c : this.listCity) {
			cont+=c.numeroDirecciones();
		}
		return cont;
	}
	
	public String ordenarCiudadesAlfabeticamente() {
		Collections.sort(this.listCity);
		return this.listCity.toString();
	}

	@Override
	public String toString() {
		return "Id: " + id + "Ciudad: " + country + listCity.size() + " países, " + numeroCiudadesEnCadaPais() + " direcciones" + ordenarCiudadesAlfabeticamente() ;
	}
	
	private List<City> llenarListaCiudades() throws IOException {
		
		File city = new File("./files/city.txt");
		
		FileReader readerCity = new FileReader(city);
		BufferedReader buffer = new BufferedReader(readerCity);
		
		String linea = buffer.readLine();
		
		while (linea!=null) {
			String [] b = linea.split(",");
			if (Integer.valueOf(linea.split(",")[2])== this.id) {
				City c = new City(Integer.valueOf(b[0]), b[1].toString(), Integer.valueOf(b[2]));
				this.listCity.add(c);
			}
			linea = buffer.readLine();
			
		}
		return this.listCity;
	}
	
	public List<Country> llenarListaPaises() throws IOException{
		List<Country> listaPaises = new ArrayList<>();
		File country = new File("./files/country.txt");
		
		FileReader readerCountry = new FileReader(country);
		BufferedReader buffer = new BufferedReader(readerCountry);
		
		String linea = buffer.readLine();
		
		while (linea!=null) {
			String [] b = linea.split(",");
			Country c = new Country(Integer.valueOf((b)[0]), b[1]);
			listaPaises.add(c);
			linea = buffer.readLine();
		}
		return listaPaises;
	}
	
	
	
}
