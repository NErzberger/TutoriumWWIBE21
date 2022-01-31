package veranstaltung_1;

import java.util.Scanner;

public class Konsoleneingabe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		System.out.print("Bitte geben Sie Ihren Namen ein: ");
		System.out.println("Hallo, " + sc.nextLine());
		sc.close();
	}

}
