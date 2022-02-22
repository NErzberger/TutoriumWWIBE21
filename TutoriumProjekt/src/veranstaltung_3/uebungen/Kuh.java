package veranstaltung_3.uebungen;

public class Kuh {
	
	public double melken() {
		System.out.println("Die Kuh wird nun gemolken");
		return Math.random() * (30 - 20) + 20;
	}
	
	public void fressen(double heu) {
		System.out.println("Mampf, mampf!");
		if(heu < 15) {
			System.out.println("MUH! (Zu wenig Futter)");
		}
	}
	
	public static void info() {
		System.out.println("Eine Kuh gibt pro Tag durchschnittlich 20 bis 30 Liter Milch und braucht ca. 15kg Heu");
	}

}
