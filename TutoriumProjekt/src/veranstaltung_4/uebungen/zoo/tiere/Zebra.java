package veranstaltung_4.uebungen.zoo.tiere;

import veranstaltung_4.uebungen.zoo.Pflanzenfresser;
import veranstaltung_4.uebungen.zoo.Pflanzennahrung;
import veranstaltung_4.uebungen.zoo.Tier;

public class Zebra  extends Tier implements Pflanzenfresser{


	public Zebra(double gewicht, double groe�e, int alterInMonaten) {
		super(gewicht, groe�e, alterInMonaten);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void trinken() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void wachsen() {
		setGewicht(getGewicht()*1.05);
		setGroe�e(getGroe�e()*1.4);
		setAlterInMonaten(getAlterInMonaten()+1);
	}

	@Override
	public void fressen(Pflanzennahrung nahrung) {
		// TODO Auto-generated method stub
		
	}

}
