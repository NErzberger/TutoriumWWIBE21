package veranstaltung_5.uebungen;

public class Uebung3 {

	public static void main(String[] args) {
		print();
	}

	
	private static int a = 10;
	private static int b = 0;
	private static int c = -1;
	private static int d = 2;
	
	private static void print() {
		if(a < 11) {
			String ausgabe = "";
			for(int i = 0; i < a; i++) {
				ausgabe = ausgabe + "  ";
			}
			ausgabe = ausgabe + "--";
			for(int i = 0; i < b; i++) {
				ausgabe = ausgabe + "  ";
			}
			ausgabe = ausgabe + "--";
			System.out.println(ausgabe);
			if(a == 0) {
				c = 1;
				d = -2;
			}
			a = a + c;
			b = b + d;
			print();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	/* Zugegeben, dass hier ist eine Hardcore-Aufgabe. Wer will kann sie gerne probieren und bei mir die Lösung anfragen.
	private static int a = 5;
	private static int b = 10;
	private static int c = 15;

	private static double calculate(double value) throws NumberFormatException, KeineAhnungWasJetzt {
		System.out.println("Eingegebener Wert: " + value);
		if (value == 0) {
			throw new NumberFormatException("Der Wert darf nie null sein!");
		} else if (value < 0) {
			throw new NumberFormatException("Der Wert darf nie kleiner als null sein!");
		}
		if (value > 1) {
			if (a > 0) {
				a -= 1;
				c *= 2;
				return calculate(value - 1);
			} else if (b == 11) {
				c += 1;
				b = (int) (a > 0 ? a == 5 : 10); 
				return calculate(Math.sqrt(value));
			} else if (c >= 480) {
				c -= 1;
				b += 1;
				return calculate((Math.sqrt(value)/value) * (c / b));
			}
			return 1;
		} else {
			throw new KeineAhnungWasJetzt("Glaub jetzt bin ich fertig.");
		}
	}*/
}
