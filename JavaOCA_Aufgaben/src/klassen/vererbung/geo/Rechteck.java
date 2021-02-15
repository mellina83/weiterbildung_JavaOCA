package klassen.vererbung.geo;

public class Rechteck extends Figur {

	private int breite, hoehe;
	
	
	Rechteck (int breite, int hoehe) {
		this.breite = breite;
		this.hoehe = hoehe;
	}
	
	
	//geerbt: getter und setter Methoden
	//geerbt: getFlaeche()
	
	//geerbt: bewegen (x,y)
	
	//"überschrieben:", aber abstrakt
	public double getFlaeche() {
		return breite * hoehe;
	}
	
	//überschrieben
	public String toString() {
		return "Rechteck " + breite + " x " + hoehe + ". Fläche " + getFlaeche() + " . " + super.toString(); 
	}
	
}
