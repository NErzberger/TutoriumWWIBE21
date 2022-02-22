package veranstaltung_3.uebungen;

public class Auto {
	
	public String farbe;
	public double preis;
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Auto) {
			Auto a = (Auto) obj;
			return (preis == a.preis) && (farbe == a.farbe);
		}
		else {
			return false;
		}
	}

}
