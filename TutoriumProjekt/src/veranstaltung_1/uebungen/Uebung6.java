package veranstaltung_1.uebungen;

import java.util.Scanner;

public class Uebung6 {

	public static void main(String[] args) {
		String vorname = "";
		String nachname = "";
		double groeßeInMeter = 0;
		double groeßeInFeet = 0;
		int studienjahr = 0;
		String studiengang = "";
		String kurs = "";
		boolean raucher = false;
		
		// Dialog
		Scanner sc = new Scanner(System.in);
		System.out.println("Wie ist Ihr Vorname?");
		vorname = sc.nextLine();
		System.out.println("Wie ist Ihr Nachname?");
		nachname = sc.nextLine();
		System.out.println("Wie ist Ihre Körpergröße?");
		groeßeInMeter = sc.nextDouble();
		groeßeInFeet = groeßeInMeter*3.28084;
		System.out.println("In welchem Studienjahr befinden Sie sich?");
		studienjahr = sc.nextInt();
		System.out.println("Wie ist die Bezeichnung Ihres Studiengangs?");
		studiengang = sc.next();
		System.out.println("Wie ist Ihr Kursname?");
		kurs = sc.next();
		System.out.println("Rauchen Sie?");
		raucher = sc.nextBoolean();
		System.out.println("");

		// Profil ausgeben
		System.out.println("Name des Studenten: " + vorname + " " + nachname);
		System.out.println("Des Studiengangs: " + studiengang + " im Studienjahr " + studienjahr);
		System.out.println("Im Kurs: " + kurs);
		System.out.println("Der Student hat eine Körpergröße von " + groeßeInMeter + " in Meter und umgerechnet "+ groeßeInFeet);
		System.out.println("Raucher: " + raucher);
		
sc.close();

	}

}
