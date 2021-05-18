package basics_kontrollstrukturen;

public class IfAbfrage {

	public static void main(String[] args) {

		int anzahlFlaschen = 13;
		
		int anzahlFlaschenProKiste = 6;
		
		int anzahlKisten = 5;
		
		/*
		 * Überprüfen, ob es genug Kisten gibt um alle Flaschen zu packen.
		 * 
		 * Wenn ja: Erfolg melden (Ausgabe: es gibt genug Kisten)
		 * Wenn nicht: Miserfolg melden (Ausgabe: es gibt NICHT genug Kisten)
		 */
		
		if( anzahlKisten*anzahlFlaschenProKiste >= anzahlFlaschen ) {
			System.out.println("1. Toll, es gibt genug Kisten!");
		}
		
		if(anzahlKisten*anzahlFlaschenProKiste < anzahlFlaschen) {
			System.out.println("2. Leider gibt es nicht genug Kisten");
		}
		
		
		/*
		 * Alternative Lösung.
		 * 
		 * Falls es genug Kisten gibt um alle Flaschen zu packen:
		 * dann Erfolg melden (Ausgabe: es gibt genug Kisten)
		 * sonst Miserfolg melden (Ausgabe: es gibt NICHT genug Kisten)
		 */
		
		if( anzahlKisten*anzahlFlaschenProKiste >= anzahlFlaschen ) {
			System.out.println("3.a Es gibt genug Kisten");
		} else {
			System.out.println("3.b Leider gibt es nicht genug Kisten");
		}
		
		
		System.out.println("end of main");
		
	} // end of main

}
