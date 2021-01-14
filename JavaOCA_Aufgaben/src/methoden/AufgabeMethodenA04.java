package methoden;

public class AufgabeMethodenA04 {
	
	/* A04
	 * Definieren Sie eine statische Methode "zeichneRechteck", die zwei int-Parameter "breite" und "hoehe" hat. Die Methode zeichnet ein gefülltes Rechteck auf der Konsole.

		Z.B. für den Aufruf `zeichneRechteck(5, 4)` wird folgende Ausgabe erwartet:

        *****
        *****
        *****
        *****
	 */

	static void zeichneRechteck(int zeilen, int spalten) {
		char ch = '*';
		for (int i = 0; i < zeilen; i++) {
			for (int j = 0; j < spalten; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		zeichneRechteck(4, 5);

	}
}
