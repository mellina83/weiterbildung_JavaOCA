package classes_aufgaben_polymorphie_geo;

public class Rechteck extends Figur {
	private int breite, hoehe;
	
	public Rechteck(int breite, int hoehe) {
		this.breite = breite;
		this.hoehe = hoehe;
	}
	
	public double getFlaeche() {
		return breite * hoehe;
	}
	
	public String toString() {
		return "Rechteck " + breite + " X " + hoehe
				+ ". " + super.toString();
	}
}
