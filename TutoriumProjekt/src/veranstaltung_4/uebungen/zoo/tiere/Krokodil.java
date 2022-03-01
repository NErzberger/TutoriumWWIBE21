package veranstaltung_4.uebungen.zoo.tiere;

import veranstaltung_4.uebungen.zoo.Fleischfresser;
import veranstaltung_4.uebungen.zoo.Fleischnahrung;
import veranstaltung_4.uebungen.zoo.Tier;

public class Krokodil extends Tier implements Fleischfresser{

	public Krokodil(double gewicht, double groeﬂe, int alterInMonaten) {
		super(gewicht, groeﬂe, alterInMonaten);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void trinken() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void wachsen() {
		setGewicht(getGewicht()*1.5);
		setGroeﬂe(getGroeﬂe()*1.2);
		setAlterInMonaten(getAlterInMonaten()+1);
	}

	@Override
	public void fressen(Fleischnahrung nahrung) {
		// TODO Auto-generated method stub
		
	}

}
