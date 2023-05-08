package main.java.model;

import java.util.Objects;

public class Caseta {
	
	private String titulo; 
	private String calle; 
	private int numero; 
	private int modulo; 
	private Clase clase; 
	private int id; 
	private int idCalle;
	public Caseta(String titulo, String calle, int numero, int modulo, Clase clase, int id, int idCalle) {
		super();
		this.titulo = titulo;
		this.calle = calle;
		this.numero = numero;
		this.modulo = modulo;
		this.clase = clase;
		this.id = id;
		this.idCalle = idCalle;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getCalle() {
		return calle;
	}
	public int getNumero() {
		return numero;
	}
	public int getModulo() {
		return modulo;
	}
	public Clase getClase() {
		return clase;
	}
	public int getId() {
		return id;
	}
	public int getIdCalle() {
		return idCalle;
	}
	@Override
	public int hashCode() {
		return Objects.hash(calle, clase, id, idCalle, modulo, numero, titulo);
	}
	@Override
	public boolean equals(Object obj) {
		return this == obj || obj!=null && obj instanceof Caseta && this.hashCode()==obj.hashCode();
	}
	
	public String toString() {
		return String.format(
				"Caseta con titulo %s en calle %s con numero %s y modulo"
				+ " %s con clase %s y con un id %s y id de calle %s \n"
				, this.titulo, this.calle, this.numero, this.modulo, this.clase, this.id, this.idCalle);
	}
	
	
	
}
