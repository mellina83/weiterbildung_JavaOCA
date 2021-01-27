package arrays;



/*
 * Jeder Kreis hat einen Radius (int).
 * 
 * Speichern Sie 100 Kreise in einem Array.
 * Alle Kreise aus dem Array sollen unterschiedliche Radius-Werte haben.
 * 
 * Danach alle Kreise durchnummeriert untereinander ausgeben.
 * 
 * 1. Kreis, R = 1
 * 2. Kreis, R = 3
 */

class Kreis {
	private int radius;
	
	//Konstruktor
	public Kreis(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	
	@Override //
	public String toString() {
		return "Kreis R(" + radius + ")";
	}
} //Ende class Kreis


public class kleineAufgabeKreise {

	public static void main(String[] args) {
		
		
		int anzahlKreise = 100;
		
		//Array für die Kreise erstellen
		Kreis[] arrayKreise = new Kreis[anzahlKreise];
		
		//Kreise erstellen
		for (int i = 0, radius = 1; i<arrayKreise.length;i++ , radius+=2) {
			arrayKreise[i] = new Kreis(radius);
		}
		
		//Ausgabe für die Kreise
		for (int i = 0; i<arrayKreise.length;i++) {
			System.out.println(i+1 + ". Kreis R= " + arrayKreise[i].getRadius());
		}

	} // Ende von Main

}
