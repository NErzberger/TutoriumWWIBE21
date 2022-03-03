package veranstaltung_4.uebungen.zoo.tiere;

import veranstaltung_4.uebungen.zoo.Fleischfresser;
import veranstaltung_4.uebungen.zoo.Fleischnahrung;
import veranstaltung_4.uebungen.zoo.Tier;

public class Krokodil extends Tier implements Fleischfresser{

	public Krokodil(double gewicht, double groesse, int alter) {
		super(gewicht, groesse, alter);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void trinken() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void wachsen() {
		setGewicht(getGewicht()*1.5);
		setGroesse(getGroesse()*1.2);
		
	}

	@Override
	public void fressen(Fleischnahrung nahrung) {
		
		
	}

}
