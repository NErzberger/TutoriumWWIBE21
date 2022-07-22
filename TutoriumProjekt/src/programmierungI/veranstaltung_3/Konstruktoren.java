package programmierungI.veranstaltung_3;

public class Konstruktoren {

	// Beispiel f�r den Standardkonstuktor
	public Konstruktoren() {
		
	}
	
	// Beispiel f�r einen Konstruktor mit �bergabeparameter
	public Konstruktoren(String automodell, String farbe, int ps) {
		System.out.println("Jetzt wird ein Auto mit dem mit dem Modell " + automodell 
				+ " mit der Farbe " + farbe + " mit " + ps + " PS erstellt");
	}
}
