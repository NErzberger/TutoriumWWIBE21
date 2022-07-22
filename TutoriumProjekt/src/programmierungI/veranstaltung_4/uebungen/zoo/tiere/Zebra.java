package programmierungI.veranstaltung_4.uebungen.zoo.tiere;

import programmierungI.veranstaltung_4.uebungen.zoo.Pflanzenfresser;
import programmierungI.veranstaltung_4.uebungen.zoo.Pflanzennahrung;
import programmierungI.veranstaltung_4.uebungen.zoo.Tier;

public class Zebra extends Tier implements Pflanzenfresser{

	public Zebra(double gewicht, double groesse, int alter) {
		super(gewicht, groesse, alter);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void trinken() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void wachsen() {
		setGewicht(getGewicht()*1.05);
		setGroesse(getGroesse()*1.4);
		
	}

	@Override
	public void fressen(Pflanzennahrung nahrung) {
		
		
	}

}
