package veranstaltung_3.uebungen;

import java.util.Scanner;

public class Student {

	private String vorname;
	private String nachname;
	private int alter;
	
	public String getVorname() {
		return this.vorname;
	}
	
	public String getNachname() {
		return this.nachname;
	}
	
	public int getAlter() {
		return this.alter;
	}
	
	
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	
	public void setAlter(int alter) {
		this.alter = alter;
	}
	
	public Student() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Wie ist ihr Vorname?");
		this.vorname = sc.nextLine();
		System.out.println("Wie ist ihr Nachname?");
		this.nachname = sc.nextLine();
		System.out.println("Wie alt sind Sie?");
		this.alter = sc.nextInt();
		sc.close();
	}
}
