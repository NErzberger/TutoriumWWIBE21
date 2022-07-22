package programmierungI.veranstaltung_4.uebungen;

public class Uebung_3 {
	
	public static void main(String[] args) {
		
		// a)
		Brot brot = new Brot();
		brot.essen();
		
		Essbar essbar = brot;
		essbar.essen();
		
		Giftpilz pilz = new Giftpilz();
		//Geht nicht:
		//Essbar essbar2 = pilz;
	
	}

}
