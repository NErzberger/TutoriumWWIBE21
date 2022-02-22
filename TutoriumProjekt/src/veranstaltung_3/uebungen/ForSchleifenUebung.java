package veranstaltung_3.uebungen;

public class ForSchleifenUebung {

	public ForSchleifenUebung(int startwert, int zielwert, int schrittweite) {
		for(int i = startwert; i <= zielwert; i = i + schrittweite) {
			System.out.println(i);
		}
	}
}
