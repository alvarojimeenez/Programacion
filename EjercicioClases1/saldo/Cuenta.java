package com.edu.saldo;

public class Cuenta {
	/*	
	Realizar un programa que permita gestionar el saldo de una cuenta corriente. Una
	vez introducido el saldo inicial, se mostrará un menú que permitirá efectuar las
	siguientes operaciones:
	1. Hacer un reintegro, se pedirá la cantidad a retirar.
	2. Hacer un ingreso, se pedirá la cantidad a ingresar.
	3. Consultar el saldo y el número de reintegros e ingresos realizados.
	4. Finalizar las operaciones. Debe confirmar si realmente desea salir e
	informar del saldo al final de todas las operaciones.
	Debe realizarse una clase Cuenta y la clase Principal.
	*/
	
	private double saldo; 
	private int num_reintegros;
	private int num_ingresos;
	
	public Cuenta(double saldo, int num_reintegros, int num_ingresos) {
		super();
		this.saldo = saldo;
		this.num_reintegros = num_reintegros;
		this.num_ingresos = num_ingresos;
		
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getNum_reintegros() {
		return num_reintegros;
	}

	public void setNum_reintegros(int num_reintegros) {
		this.num_reintegros = num_reintegros;
	}

	public int getNum_ingresos() {
		return num_ingresos;
	}

	public void setNum_ingresos(int num_ingresos) {
		this.num_ingresos = num_ingresos;
	}

	public void realizarReintegro(double reintegro) {
		this.num_reintegros++;
		this.saldo = this.saldo - reintegro;
	}
	
	public void realizarIngreso(double ingreso) {
		this.num_ingresos++;
		this.saldo = this.saldo + ingreso;
	}

	@Override
	public String toString() {
		return "La cuenta tiene un saldo de " + saldo + "€, ha realizado " + num_reintegros + " reintegros y " + num_ingresos + " ingresos.";
	}
	
	

	
	
	
	
	
}
