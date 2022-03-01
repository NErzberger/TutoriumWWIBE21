package veranstaltung_4.uebungen.zoo;

public abstract class Tier implements Fleischnahrung {

	private double gewicht;
	private double groeﬂe;
	private int alterInMonaten;
	
	public double getGewicht() {
		return this.gewicht;
	}

	public double getGroeﬂe() {
		return groeﬂe;
	}

	public void setGroeﬂe(double groeﬂe) {
		this.groeﬂe = groeﬂe;
	}

	public int getAlterInMonaten() {
		return alterInMonaten;
	}

	public void setAlterInMonaten(int alterInMonaten) {
		this.alterInMonaten = alterInMonaten;
	}

	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}

	public Tier(double gewicht, double groeﬂe, int alterInMonaten) {
		this.gewicht = gewicht;
		this.groeﬂe = groeﬂe;
		this.alterInMonaten = alterInMonaten;
	}
	
	
}
