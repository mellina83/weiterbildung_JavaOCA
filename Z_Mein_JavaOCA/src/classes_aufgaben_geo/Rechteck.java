package classes_aufgaben_geo;

public class Rechteck {
	
	public static void setDimensionen(Rechteck rechteck, int breite, int hoehe) {
		rechteck.breite = breite; 
		rechteck.hoehe = hoehe;
	}
	
	/*
	 * Objekt-Beschreibungen: 
	 */
	
	private int breite;
	private int hoehe;
	
	public Rechteck(int breite, int hoehe) {
		this.breite = breite;
		this.hoehe = hoehe;
	}
	
	public void setDimensionen(int breite, int hoehe) {
		this.breite = breite;
		this.hoehe = hoehe;
	}
	
	public void setBreite(int breite) {
		this.breite = breite;
	}
	
	public void setHoehe(int hoehe) {
		this.hoehe = hoehe;
	}
	
	public String toString() {
		return "Rechteck " + this.breite + " X " + hoehe;
	}
}
