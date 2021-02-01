package klassen.geo.vererbung;

class Koerper {
	private int xKoordinate;
	private int yKoordinate;
	
	void bewegen(int xKoordinateNeu, int yKoordinateNeu) {
		xKoordinate = xKoordinateNeu;
		yKoordinate = yKoordinateNeu;
	}
	
	int getxKoordinate() {
		return xKoordinate;
	}
	
	int getyKoordinate() {
		return yKoordinate;
	}
	
	public String toString() {
		return "Koordinaten sind: " + xKoordinate + " " + yKoordinate;
	}
	
} // Ende Superclass Koerper



class Rechteck extends Koerper {
	private int breite;
	private int hoehe;
	
	public Rechteck(int breite, int hoehe) {
		super();
		this.breite = breite;
		this.hoehe = hoehe;
	}
	
} // Ende Rechteck



class Kreis extends Koerper {
	private int radius;
	
	public Kreis(int radius) {
		super();
		this.radius = radius;
	}
	
} // Ende Kreis



public class AufgabeVererbungGeometrie {

	public static void main(String[] args) {
		
		Rechteck rechteck = new Rechteck (3,4);
		System.out.println(rechteck);
		rechteck.bewegen(12,-7);
		System.out.println((rechteck));
		
		Kreis kreis = new Kreis (4);
		System.out.println(kreis);
		kreis.bewegen(33, 1);
		System.out.println(kreis);
		
		//Optional
		

		

	} // Ende Main

} 
