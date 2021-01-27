package arrays;

import java.util.Arrays;

/*
 * Jeder Spieler hat einen Namen und eine Nummer:
 * 		String[] namen = {"Kahn","Klose","Matthäus"};
 * 		int[] nummer = {1, 7, 10};
		
 * - Erzeugen Sie 3 Spieler-Objekte. 
 *   Nehmen Sie dafür die Spieler-Daten aus den Arrays 'namen' und 'nummer'
 *   
 * - Speichern Sie die Spieler in einem Array.
 * 
 * - Geben Sie die Elemente des Arrays untereinander aus.
 */

class Spieler {
	private String name;
	private int nummer;
	
	public Spieler(String name, int nummer) {
		this.name = name;
		this.nummer = nummer;
	}
	
	public String toString() {
		return name + " " + nummer;
 	}
	
}

public class KleineAufgabeArrayMitReferenzen {

	public static void main(String[] args) {

		String[] namen = {
			"Kahn",
			"Klose",
			"Matthäus"
		};
		
		int[] nummern = {
			1,
			7,
			10
		};
		
		int spieleranzahl = namen.length;
	
		//Liste erstellen für Referenzen der Spieler
		Spieler[] spielerliste = new Spieler[spieleranzahl];
		
		
		//3 Objekte erstellen und die Referenzen in Array einfügen
		for (int i = 0; i < spieleranzahl; i++) {
			String name = namen[i];
			int spielernummer = nummern[i];
			spielerliste[i] = new Spieler(name, spielernummer);
		
			//oder direkt alles in einem:
		//	spielerliste[i] = new Spieler(namen[i], nummern[i]);
			
			//System.out.println(namen[i] + " " + nummern[i]);
		} 
		
		//Ausgabe
		//Mit to String der Klasse Spieler:
		for (Spieler spieler : spielerliste) {
			System.out.println(spieler);
		}
		
		//Mit to String der Klasse Spieler()
		System.out.println(spielerliste);
		
		//Mit der statischen toString aus Werkzeugklasse Arrays
		System.out.println(Arrays.toString(spielerliste));
		

		
	} // end of main

}
