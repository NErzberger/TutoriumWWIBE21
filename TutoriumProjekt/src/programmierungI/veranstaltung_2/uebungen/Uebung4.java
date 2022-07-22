package programmierungI.veranstaltung_2.uebungen;

public class Uebung4 {

	public static void main(String[] args) {
		
		//a)
		int regalbreite = 49;
		int buchBreite = 2;
		int belegterPlatz = 0;
		int buecher = 0;
		
		while(regalbreite > (belegterPlatz + buchBreite)) {
			buecher++;
			belegterPlatz += buchBreite;
		}
		System.out.println(buecher);
		System.out.println(belegterPlatz);
		
		//b)
		double maxHoehe = 500;
		double buchBreite1 = 2.1;
		double aktHoehe = 0;
		boolean nichtUmgefallen = true;
		int buecher1 = 0;
		
		do {
			buecher1++;
			aktHoehe += buchBreite1;
			if(aktHoehe > maxHoehe) {
				nichtUmgefallen = false;
			}
		} while(nichtUmgefallen);
		System.out.println(buecher1);
		System.out.println(aktHoehe);

	}

}
