package siete_y_media;

public class Carta {
	
	private int number; 
	private Palo palo;
	

	public Carta() {
		super();
		this.number = number;
		this.palo = palo;
	}
	
	public Carta(int number, Palo palo) {
		this.number = number;
		this.palo = palo;
	}
	
	public double getValor() {
		return this.number>7 ?0.5: this.number;
	}
	
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setPalo(Palo palo) {
		this.palo = palo;
	}

	public Palo getPalo() {
		return palo;
	}

	public boolean equals(Object obj) {
		boolean sonIguales = this == obj;
		if (!sonIguales && obj!=null && obj instanceof Carta) {
			Carta casteado = (Carta) obj;
			sonIguales = this.number == casteado.number && this.palo == casteado.palo;
		}
		return sonIguales;
	}

	@Override
	public String toString() {
		return getNumber() + " de " + getPalo();
	}
	
	

}
