package veranstaltung_4.uebungen.zoo;

public class Tier implements Fleischnahrung, Lebewesen{

	private double gewicht;
	private double groesse;
	private int alter;
	
	@Override
	public double getGewicht() {
		return this.gewicht;
	}

	public double getGroesse() {
		return groesse;
	}

	public void setGroesse(double groesse) {
		this.groesse = groesse;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}
	
	public Tier(double gewicht, double groesse, int alter) {
		this.gewicht = gewicht;
		this.groesse = groesse;
		this.alter = alter;
	}

	@Override
	public void trinken() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void wachsen() {
		// TODO Auto-generated method stub
		
	}
}
