package programmierungI.veranstaltung_4.uebungen.zoo.tiere;

import programmierungI.veranstaltung_4.uebungen.zoo.Fleischfresser;
import programmierungI.veranstaltung_4.uebungen.zoo.Fleischnahrung;
import programmierungI.veranstaltung_4.uebungen.zoo.Tier;

public class Loewe extends Tier implements Fleischfresser{

	public Loewe(double gewicht, double groesse, int alter) {
		super(gewicht, groesse, alter);
	}

	@Override
	public void fressen(Fleischnahrung nahrung) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void trinken() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void wachsen() {
		setGewicht(getGewicht()*1.2);
		setGroesse(getGroesse()*1.3);
	}

}
