package main.java.model;

public class Address {
	
	private int id; 
	private String address;
	private String city;
	
	public Address(int id, String address, String city) {
		super();
		this.id = id;
		this.address = address;
		this.city = city;
	}

	@Override
	public String toString() {
		return id + address;
	}
	
	

}
