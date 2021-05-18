package arrays_aufgaben;

import java.util.Arrays;

//public
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

		/*
		 * Jeder Spieler hat einen Namen und eine Nummer
		 */
		String[] namen = {
			"Kahn",
			"Klose",
			"Matthäus"
		};
		
		
		int[] nummer = {
			1,
			7,
			10
		};
		
		/*
		 * - Erzeugen Sie 3 Spieler-Objekte. 
		 *   Nehmen Sie dafür die Spieler-Daten aus den Arrays 'namen' und 'nummer'
		 *   
		 * - Speichern Sie die Spieler in einem Array.
		 * 
		 * - Geben Sie die Elemente des Arrays untereinander aus.
		 */
		int anzahlSpieler = 3;
		
		Spieler[] arrSpieler = new Spieler[anzahlSpieler];
		
		for(int i=0; i<anzahlSpieler; i++) {
			
			String name = namen[i];
			int spielerNummer = nummer[i];
			
			arrSpieler[i] = new Spieler(name, spielerNummer);
		}

		System.out.println("* mit toString der Klasse Spieler: ");
		for(Spieler spieler : arrSpieler) {
			System.out.println(spieler);
		}
		System.out.println();

		System.out.println("* mit toString der Klasse Spieler[]: ");
		System.out.println(arrSpieler);
		System.out.println();
		
		System.out.println("* mit der statischen toString der Klasse Arrays: ");
		String arrayAsText = Arrays.toString(arrSpieler);
		System.out.println(arrayAsText);
		
	} // end of main

}
