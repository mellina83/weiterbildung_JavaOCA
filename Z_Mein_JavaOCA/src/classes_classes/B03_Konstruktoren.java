package classes_classes;

/*
 * Konstruktoren sind besondere Instanzmethoden, die zum Initialisieren 
 * des neuen Objektes aufgerufen werden
 * 
 *  - Konstruktor hat KEINE Rückgabetypangabe (sonst wird daraus eine 'normale' Instanzmethode)
 *  - Konstruktor heißt wie die Klasse
 *  - Es gibt in jeder Klasse mindestens einen Konstruktor
 *  	- entweder gibt es den default-Konstruktor (wenn es keine expliziten Konstruktoren gibt)
 *  	- oder es gibt einen oder mehrere expliziten Konstruktoren
 *  
 *  
 *  
 *  s. auch Bsp. 'Konstruktoren' im Package 'vererbung'
 */

class Blume {
	/*
	 * die Klasse Blume hat den default-Konstruktor:
	 * 
	 * 		Blume() {
	 * 			super();
	 * 		}
	 */
} // end of Blume


class Baum {
	Baum() {
		System.out.println("Sinnloser expliziter Konstruktor der Klasse Baum");
	}
} // end of Baum


class Stein {
	int gewicht;
	
	Stein(int gewicht) {
		this.gewicht = gewicht; // Das Attribut mit dem gewünschten Anfangswert initialisieren
	}
} // end of Stein


public class B03_Konstruktoren {

	public static void main(String[] args) {

		new Blume();
	
		new Baum(); // Ausgabe: Sinnloser expliziter Konstruktor der Klasse Baum
		
		Stein s1 = new Stein(12); // Attribut 'gewicht' wird auf 12 gesetzt
		System.out.println("s1.gewicht: " + s1.gewicht); // 12
		
		// s1.Stein(33); // Compilerfehler: den Konstruktor darf man nur zusammen mit 'new' verwenden
	}

}
