package blocNotas;

import java.util.Arrays;

public class Bloc {
	
	private static final int NUMERO_NOTAS_MAXIMA = 3;
	private int numNotas;
	private String nombre; 
	
	private Nota [] notas;
	
	public Bloc(String nombre) {
		this.nombre = nombre;
		this.numNotas = numNotas;
		notas = new Nota[NUMERO_NOTAS_MAXIMA];
	}
	
	public void addNotas(Nota nota) {
		boolean repetido = false; 
		for (Nota n: notas) {
			if (n!=null && n.getCodigo()== nota.getCodigo()) {
				repetido = true;
			}
		}
		if (!repetido && numNotas<NUMERO_NOTAS_MAXIMA) {
			notas[this.numNotas] = nota;
			this.numNotas++;
		}
	}
	
	public String getNota(int codigo) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i<notas.length; i++) {
			if (notas[i].getCodigo()==codigo) {
				sb.append(notas[i]);
			}
		}
		return sb.toString();
	}
	
	public void updateNota(int codigo, String textoNuevo) {
		boolean esta = false; 
		for (int i = 0; i<notas.length; i++) {
			if (notas[i].getCodigo()==codigo) {
				notas[i].setTexto(textoNuevo);
				esta = true;
			}
		}
	}
	
	public void activa(int codigo) {
		
	}
	
	public void desactiva(int codigo) {
		
	}
	
	public static int getNumeroNotasMaxima() {
		return NUMERO_NOTAS_MAXIMA;
	}

	public String getNombre() {
		return nombre;
	}

	public boolean equals(Object obj) {
		boolean sonIguales = this == obj;
		if (!sonIguales && obj!=null && obj instanceof Bloc) {
			Bloc casteado = (Bloc) obj;
			sonIguales = this.nombre.equals(casteado.nombre);
		}
		return sonIguales;
	}
	
	public String ordenaBloc() {
		Arrays.sort(notas);
		return Arrays.toString(notas);
	}

	@Override
	public String toString() {
		return "Bloc [numNotas=" + numNotas + ", nombre=" + nombre + ", notas=" + Arrays.toString(notas) + "]";
	}
	
	
}
