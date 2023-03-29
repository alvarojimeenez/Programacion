package blocNotas;

import java.time.LocalDateTime;

public class NotaAlarma extends Nota implements Activable {
	private LocalDateTime fechaAlarma; 
	private static final int MINUTOS_REPETIR_POR_DEFECTO = 5;
	private int minutosRepetir;
	private boolean activado;
	
	public NotaAlarma(String texto, LocalDateTime fechaAlarma, boolean activado) throws NotaAlarmaException {
		super(texto);
		this.fechaAlarma = fechaAlarma;
		this.activado = activado;
		this.minutosRepetir = MINUTOS_REPETIR_POR_DEFECTO;
	}
	
	public NotaAlarma(String texto, LocalDateTime fechaAlarma, int minutosRepetir) throws NotaAlarmaException {
		super(texto);
		this.fechaAlarma = fechaAlarma;
		this.minutosRepetir = minutosRepetir;
	}

	private void setFechaAlarma(LocalDateTime fechaAlarma) {
		this.fechaAlarma = fechaAlarma;
	}

	public static int getMinutosRepetirPorDefecto() {
		return MINUTOS_REPETIR_POR_DEFECTO;
	}
	
	@Override
	public void activar() {
		this.activado = true;
	}
	
	@Override
	public void desactivar() {
		this.activado = false;
	}
	
	public boolean isActivado() {
		return this.activado;
		
	}

	@Override
	public String toString() {
		return "NotaAlarma"+ super.toString() + fechaAlarma + ", minutosRepetir=" + minutosRepetir + ", activado="
				+ activado + "]";
	}
	
	
	
}
