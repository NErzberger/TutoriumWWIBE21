package programmierungI.veranstaltung_1.uebungen;

import java.util.Scanner;

public class Uebung2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Bitte geben Sie Ihren Namen ein:");
		System.out.println("Hallo, " + sc.nextLine());
		sc.close();
	}

}
