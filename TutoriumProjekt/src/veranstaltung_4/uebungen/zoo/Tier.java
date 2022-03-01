package veranstaltung_4.uebungen.zoo;

public abstract class Tier implements Fleischnahrung {

	private double gewicht;
	private double groe�e;
	private int alterInMonaten;
	
	public double getGewicht() {
		return this.gewicht;
	}

	public double getGroe�e() {
		return groe�e;
	}

	public void setGroe�e(double groe�e) {
		this.groe�e = groe�e;
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

	public Tier(double gewicht, double groe�e, int alterInMonaten) {
		this.gewicht = gewicht;
		this.groe�e = groe�e;
		this.alterInMonaten = alterInMonaten;
	}
	
	
}
