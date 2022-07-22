package programmierungI.veranstaltung_2.uebungen;

public class Uebung1 {

	public static void main(String[] args) {
		
		//a)
		int a = 1;
		int b = 3;
		int c = 5;
		
		if(a > b && a > c) {
			if(b > c) {
				System.out.println(a + " " + b + " " + c);
			} else {
				System.out.println(a + " " + c + " " + b);
			}
		} else if(b > a && b > c) {
			if(a > c) {
				System.out.println(b + " " + a + " " + c);
			} else {
				System.out.println(b + " " + c + " " + a);
			}
		} else if(c > a && c > b) {
			if(a > b) {
				System.out.println(c + " " + a + " " + b);
			} else {
				System.out.println(c + " " + b + " " + a);
			}
		}
		
		//b)
		String farbe = "schwarz";
		boolean elektro = false;
		
		if(farbe == "wei�" && elektro == true) {
			System.out.println("Wei�es Elektroauto");
		} else if(farbe == "wei�" && elektro == false) {
			System.out.println("Wei�er Verbrenner");
		} else if(farbe == "schwarz" && elektro == true) {
			System.out.println("Schwarzes Elektroauto");
		} else if(farbe == "schwarz" && elektro == false) {
			System.out.println("Schwarzer Verbrenner");
		} else {
			System.out.println("Auto beim Hersteller nicht verf�gbar");
		}

	}

}
