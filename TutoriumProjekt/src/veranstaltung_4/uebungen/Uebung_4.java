package veranstaltung_4.uebungen;

import veranstaltung_4.uebungen.zoo.Tier;
import veranstaltung_4.uebungen.zoo.tiere.Giraffe;
import veranstaltung_4.uebungen.zoo.tiere.Krokodil;
import veranstaltung_4.uebungen.zoo.tiere.Loewe;
import veranstaltung_4.uebungen.zoo.tiere.Tiger;
import veranstaltung_4.uebungen.zoo.tiere.Zebra;

public class Uebung_4 {

	public static void main(String[] args) {
		Tier[] tiereImZoo = new Tier[5];
		tiereImZoo[0] = new Loewe(80.0, 50.0, 2);
		tiereImZoo[1] = new Tiger(80.0, 50.0, 2);
		tiereImZoo[2] = new Krokodil(80.0, 50.0, 2);
		tiereImZoo[3] = new Giraffe(80.0, 50.0, 2);
		tiereImZoo[4] = new Zebra(80.0, 50.0, 2);
		
		for (int j = 0; j < 50; j++) {
			for (int i = 0; i < tiereImZoo.length; i++) {
				tiereImZoo[i].wachsen();
			}
		}
		
		for (int i = 0; i < tiereImZoo.length; i++) {
			System.out.println( tiereImZoo[i].getGewicht());
		}
		
	}
}
