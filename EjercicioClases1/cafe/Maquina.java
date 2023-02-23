package com.edu.cafe;


public class Maquina {
	public static final double PRECIO_CAFE = 1;
	public static final double PRECIO_LECHE = 0.80;
	public static final double PRECIO_CAFE_LECHE = 1.50;
	
	private double monedero;
	private int depositoCafe;
	private int depositoLeche;
	private int depositoVasos;
	
	public Maquina(double monedero, int depositoCafe, int depositoLeche, int depositoVasos) {
		super();
		this.monedero = monedero;
		this.depositoCafe = depositoCafe;
		this.depositoLeche = depositoLeche;
		this.depositoVasos = depositoVasos;
	}
	
	
	// Getters and setters 
	
	public double getMonedero() {
		return monedero;
	}
	
	public void setMonedero(int monedero) {
		this.monedero = monedero;
	}
	
	public int getDepositoCafe() {
		return depositoCafe;
	}
	
	public void setDepositoCafe(int depositoCafe) {
		this.depositoCafe = depositoCafe;
	}
	
	public int getDepositoLeche() {
		return depositoLeche;
	}
	
	public void setDepositoLeche(int depositoLeche) {
		this.depositoLeche = depositoLeche;
	}
	
	
	public int getDepositoVasos() {
		return depositoVasos;
	}


	public void setDepositoVasos(int depositoVasos) {
		this.depositoVasos = depositoVasos;
	}


	public String servirCafe(double saldo) {
		String mensaje = "";
		if (saldo<PRECIO_CAFE) {
			mensaje = "Ha introducido una cantidad inferior";
		}
		else if(this.monedero<saldo) {
			mensaje = "La máquina no tiene cambio";
		}
		else if(this.depositoCafe<=0) {
			mensaje = "No hay existencias";
		}
		else {
			this.depositoCafe--;
			this.depositoVasos--;
			this.monedero = this.monedero + PRECIO_CAFE;
			mensaje = "Producto servido";
			if (saldo>PRECIO_CAFE) {
				double cambio = saldo - PRECIO_CAFE;
				mensaje = "Recoge tu cambio de "+cambio+" euros";
			}
		}
		return mensaje;
		
		
	}
	
	public String servirLeche(double saldo) {
		String mensaje = "";
		if (saldo<PRECIO_LECHE) {
			mensaje = "Ha introducido una cantidad inferior";
		}
		else if(this.monedero<saldo) {
			mensaje = "La máquina no tiene cambio";
		}
		else if(this.depositoLeche<=0) {
			mensaje = "No hay existencias";
		}
		else {
			this.depositoLeche--;
			this.depositoVasos--;
			this.monedero = this.monedero + PRECIO_LECHE;	
			mensaje = "Producto servido.";
			if (saldo>PRECIO_LECHE) {
				double cambio = saldo - PRECIO_LECHE;
				mensaje = "Recoge tu cambio de "+cambio+" euros";
			}
		}
		return mensaje;
	}
	
	public String servirCafeConLeche(double saldo) {
		String mensaje = "";
		if (saldo<PRECIO_CAFE_LECHE) {
			mensaje = "Ha introducido una cantidad inferior";
		}
		else if(this.monedero<saldo) {
			mensaje = "La máquina no tiene cambio";
		}
		else if(this.depositoCafe<=0 && this.depositoLeche<=0) {
			mensaje = "No hay existencias";
		}
		else {
			this.depositoCafe--;
			this.depositoLeche--;
			this.depositoVasos--;
			this.monedero = this.monedero + PRECIO_CAFE_LECHE;
			mensaje = "Producto servido.";
			if (saldo>PRECIO_CAFE_LECHE) {
				double cambio = saldo - PRECIO_CAFE_LECHE;
				mensaje = "Recoge tu cambio de "+cambio+" euros";
			}
		}
		return mensaje;
	}

	@Override
	public String toString() {
		return "La maquina tiene " + depositoCafe + " dosis de café, " + depositoLeche + " dosis de leche, "
				+ depositoVasos + " vasos y " + monedero + " €";
	}
	
	
	
	
	
			
}
