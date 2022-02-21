package veranstaltung_3;

public class Konstruktoren {

	// Beispiel für den Standardkonstuktor
	public Konstruktoren() {
		
	}
	
	// Beispiel für einen Konstruktor mit Übergabeparameter
	public Konstruktoren(String automodell, String farbe, int ps) {
		System.out.println("Jetzt wird ein Auto mit dem mit dem Modell " + automodell 
				+ " mit der Farbe " + farbe + " mit " + ps + " PS erstellt");
	}
}
