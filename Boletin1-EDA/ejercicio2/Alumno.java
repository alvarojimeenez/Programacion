package common.collections.ejercicio2;

public class Alumno {

	private String nombre;
	private String dni;

	public Alumno(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}
	
	

	@Override
	public String toString() {
		return "Nombre-->" + nombre + ", DNI-->" + dni;
	}
	
	public boolean equals (Object obj) {
		boolean sonIguales = this == obj;
		if (!sonIguales && obj!=null && obj instanceof Alumno) {
			Alumno casteado = (Alumno) obj;
			sonIguales = this.dni.equals(casteado.dni);
		}
		return sonIguales;
	}

}
