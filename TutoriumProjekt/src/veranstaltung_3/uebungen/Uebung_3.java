package veranstaltung_3.uebungen;

public class Uebung_3 {
	
	public static void main(String[] args) {
		
		Kuh k = new Kuh();
		
		double milch = k.melken();
		System.out.println(milch);
		
		k.fressen(16);
		
		Kuh.info();
	}

}
