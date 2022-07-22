package programmierungI.veranstaltung_4.uebungen.zoo.tiere;

import programmierungI.veranstaltung_4.uebungen.zoo.Fleischfresser;
import programmierungI.veranstaltung_4.uebungen.zoo.Fleischnahrung;
import programmierungI.veranstaltung_4.uebungen.zoo.Tier;

public class Tiger extends Tier implements Fleischfresser{

	public Tiger(double gewicht, double groesse, int alter) {
		super(gewicht, groesse, alter);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void trinken() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void wachsen() {
		setGewicht(getGewicht()*1.3);
		setGroesse(getGroesse()*1.15);
		
	}

	@Override
	public void fressen(Fleischnahrung nahrung) {
		
		
	}

}
