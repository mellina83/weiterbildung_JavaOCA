package klassen;

//Optionale Aufgabe wurde mit Überschreiben der toString Methode und super.toString() gelöst

class Koerper {
	private int xKoordinate;
	private int yKoordinate;
	
	public void bewegen(int xKoordinate, int yKoordinate) {
		this.xKoordinate = xKoordinate;
		this.yKoordinate = yKoordinate;
	}
	
	public int getxKoordinate() {
		return xKoordinate;
	}
	
	public int getyKoordinate() {
		return yKoordinate;
	}
	
	public String toString() {
			
		return "Superklasse: Koordinaten sind: " + getxKoordinate() + " " + getyKoordinate();
	}
	
} // Ende Superclass Koerper



class Rechteck1 extends Koerper {
	private int breite;
	private int hoehe;
	
	public Rechteck1(int breite, int hoehe) {
		this.breite = breite;
		this.hoehe = hoehe;
	}
	
	public String toString() {
		return "Rechteck " + breite + " X " + hoehe
				+ ". " + super.toString();
	}
	
} // Ende Rechteck



class Kreis1 extends Koerper {
	private int radius;
	
	public Kreis1(int radius) {
		this.radius = radius;
	}
	
	public String toString() {
		return "Radius: " + radius + ". " + super.toString();
	}
	
} // Ende Kreis



public class AufgabeVererbungGeometrie {

	public static void main(String[] args) {
		
		Rechteck1 rechteck = new Rechteck1 (3,4);
		System.out.println(rechteck);
		rechteck.bewegen(12,-7);
		System.out.println((rechteck));
		
		Kreis1 kreis = new Kreis1 (4);
		System.out.println(kreis);
		kreis.bewegen(33, 1);
		System.out.println(kreis);
		
		
		

		

	} // Ende Main

} 
