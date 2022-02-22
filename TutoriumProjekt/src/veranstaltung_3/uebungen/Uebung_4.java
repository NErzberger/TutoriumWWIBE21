package veranstaltung_3.uebungen;

public class Uebung_4 {

	public static void main(String[] args) {
		ForSchleifenUebung forschleifenuebung = new ForSchleifenUebung(0, 20, 2);
		
		ForSchleifenUebung forschleifenuebung1 = new ForSchleifenUebung(0, 30, 5);
		
		ForSchleifenUebung forschleifenuebung2 = new ForSchleifenUebung(0, 10, 1);
	
		Sportwagen sp = new Sportwagen("Blau", 50000.0, "S3");
		System.out.println(sp.getFarbe() + " " +sp.getPreis());
		
	}
}
