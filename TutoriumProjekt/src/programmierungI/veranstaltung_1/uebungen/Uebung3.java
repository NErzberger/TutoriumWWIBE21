package programmierungI.veranstaltung_1.uebungen;

import java.util.Scanner;

public class Uebung3 {
	
	public static void main(String[] args) {
		System.out.println("Aufgabe a)");
		Scanner sc = new Scanner(System.in);
		int varA = 0;
		int varB = 0;
		int ergebnis = 0;
		System.out.print("Bitte geben Sie die erste Zahl ein: ");
		varA = sc.nextInt();
		System.out.print("\nBitte geben Sie die zweite Zahl ein: ");
		varB = sc.nextInt();
		ergebnis = varA+varB;
		System.out.println("Das Ergebnis lautet: " + ergebnis);
		
		sc.close();
		
		System.out.println("Aufgabe b)");
		int fakultaet = 5*4*3*2*1;
		System.out.println("Die Fakult�t von 5 ist: " + fakultaet);
		
		System.out.println("Aufgabe c)");
		double radius = 17.5/2;
		int hoehe = 8;
		double volumen = radius*radius*Math.PI*hoehe;
		System.out.println("Das Volumen betr�gt: " + volumen);

	
	}
}
