package veranstaltung_4.uebungen.zoo.tiere;

import veranstaltung_4.uebungen.zoo.Fleischfresser;
import veranstaltung_4.uebungen.zoo.Fleischnahrung;
import veranstaltung_4.uebungen.zoo.Tier;

public class L�we extends Tier implements Fleischfresser{

	public L�we(double gewicht, double groe�e, int alterInMonaten) {
		super(gewicht, groe�e, alterInMonaten);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void trinken() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void wachsen() {
		setGewicht(getGewicht()*1.2);
		setGroe�e(getGroe�e()*1.3);
		setAlterInMonaten(getAlterInMonaten()+1);
	}

	@Override
	public void fressen(Fleischnahrung nahrung) {
		// TODO Auto-generated method stub
		
	}

}
