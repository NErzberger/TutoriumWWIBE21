package programmierungI.veranstaltung_3.uebungen;

public class Sportwagen {

	private String farbe;
	private double preis;
	private String modell;
	
	public String getFarbe(){
		return this.farbe;
	}
	
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	
	public double getPreis() {
		return this.preis;
	}
	
	public void setPreis(double preis) {
		this.preis = preis;
	}
	
	
	
	
	public Sportwagen(String farbe, double preis, String modell) {
		this.farbe = farbe;
		this.preis = preis;
		this.modell = modell;
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sportwagen other = (Sportwagen) obj;
		if (farbe == null) {
			if (other.farbe != null)
				return false;
		} else if (!farbe.equals(other.farbe))
			return false;
		if (modell == null) {
			if (other.modell != null)
				return false;
		} else if (!modell.equals(other.modell))
			return false;
		if (Double.doubleToLongBits(preis) != Double.doubleToLongBits(other.preis))
			return false;
		return true;
	}
	
	
	
}
