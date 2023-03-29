package blocNotas;

import java.time.LocalDateTime;

public class Nota implements Comparable<Nota>{
	
	private static int codigoSiguiente;
	private int codigo;
	private String texto;
	private LocalDateTime fechaCreacion;
	private LocalDateTime fechaUltimaModificacion;
	
	public Nota(String texto) throws NotaAlarmaException {
		setTexto(texto);
		this.codigo = codigoSiguiente++;
		this.fechaCreacion= LocalDateTime.now();
		if (this.texto.isEmpty()) {
			throw new NotaAlarmaException("Texto vacio");
		}
 	}
	
	public String getTexto() {
		return this.texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
		this.fechaUltimaModificacion = LocalDateTime.now();
	}

	public int getCodigo() {
		return codigo;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public LocalDateTime getFechaUltimaModificacion() {
		return fechaUltimaModificacion;
	}
	
	public boolean isModificado() {
		return this.fechaUltimaModificacion.equals(fechaCreacion) ? false : true;
	}
	
	public boolean isEmpty() {
		return this.texto!=null && this.texto.length()==0;
	}
	
	public boolean isCreadoAnterior(Nota n) {
		return this.fechaCreacion.isBefore(n.fechaCreacion);
	}
	
	public boolean isModificadoAnterior(Nota n) {
		boolean res = false; 
		if ((this.fechaUltimaModificacion==null && n.fechaUltimaModificacion!=null) || 
				(this.fechaUltimaModificacion==null && n.fechaUltimaModificacion==null) || 
				(this.fechaUltimaModificacion!=null && this.fechaUltimaModificacion==null)) {
			res = false; 
		}else {
			res = this.fechaUltimaModificacion.isBefore(n.fechaUltimaModificacion);;
		}
		return res;
	}
	
	public boolean equals(Object obj) {
		boolean sonIguales = this == obj;
		if (!sonIguales && obj!=null && obj instanceof Nota) {
			Nota casteado = (Nota) obj;
			sonIguales = this.texto.equals(casteado.texto) && this.fechaCreacion.equals(casteado.fechaCreacion);
		}
		return sonIguales;
	}

	@Override
	public int compareTo(Nota o) {
		return (int) this.fechaCreacion.compareTo(o.fechaCreacion);
	}

	@Override
	public String toString() {
		return "Nota"
			  +"\nCodigo " + codigo 
			  +"\nTexto: " + texto 
			  +"\nSu fecha de creacion es: " + fechaCreacion
			  +"\nUltima fecha de modificación: " + fechaUltimaModificacion;
	}
	
	
	
	
	
}
