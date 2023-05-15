package main.java.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class City implements Comparable<City>{
	
	private int id;
	private List<Address> listaAddress;
	private String city;
	private int idCountry;
	
	public City(int id, String city, int idCountry) {
		super();
		this.id = id;
		this.listaAddress = new ArrayList<>();
		this.city = city;
		this.idCountry = idCountry;
	}
	
	public void addAddress(Address a) {
		this.listaAddress.add(a);
	}
	
	public int numeroDirecciones() {
		return this.listaAddress.size();
	}

	@Override
	public int compareTo(City o) {
		return this.city.compareTo(o.city);
	}

	@Override
	public String toString() {
		return id + city ;
	}
	
	private List<Address> llenarListaDirreciones() throws IOException {
		
		File address = new File("./files/address.txt");
		
		FileReader readerAddress = new FileReader(address);
		BufferedReader buffer = new BufferedReader(readerAddress);
		
		String linea = buffer.readLine();
		
		while (linea!=null) {
			String [] b = linea.split(",");
			if (Integer.valueOf(linea.split(",")[4])== this.id) {
				Address a = new Address(Integer.valueOf(b[0]), b[1].toString(), b[4]);
				this.listaAddress.add(a);
			}
			linea = buffer.readLine();
			
		}
		return this.listaAddress;
	}
	
	
	
	
}
