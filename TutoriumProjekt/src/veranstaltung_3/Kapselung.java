package veranstaltung_3;

public class Kapselung {

	private String automodell;
	private String farbe;
	private int ps;
	
	public String getAutomodell() {
		return automodell;
	}
	public void setAutomodell(String automodell) {
		this.automodell = automodell;
	}
	public String getFarbe() {
		return farbe;
	}
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	public int getPs() {
		return ps;
	}
	public void setPs(int ps) {
		this.ps = ps;
	}
	
	public Kapselung(String automodell, String farbe, int ps) {
		super();
		this.automodell = automodell;
		this.farbe = farbe;
		this.ps = ps;
	}
	
	
	
	
}
