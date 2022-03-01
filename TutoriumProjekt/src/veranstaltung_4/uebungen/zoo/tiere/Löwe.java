package veranstaltung_4.uebungen.zoo.tiere;

import veranstaltung_4.uebungen.zoo.Fleischfresser;
import veranstaltung_4.uebungen.zoo.Fleischnahrung;
import veranstaltung_4.uebungen.zoo.Tier;

public class Löwe extends Tier implements Fleischfresser{

	public Löwe(double gewicht, double groeße, int alterInMonaten) {
		super(gewicht, groeße, alterInMonaten);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void trinken() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void wachsen() {
		setGewicht(getGewicht()*1.2);
		setGroeße(getGroeße()*1.3);
		setAlterInMonaten(getAlterInMonaten()+1);
	}

	@Override
	public void fressen(Fleischnahrung nahrung) {
		// TODO Auto-generated method stub
		
	}

}
