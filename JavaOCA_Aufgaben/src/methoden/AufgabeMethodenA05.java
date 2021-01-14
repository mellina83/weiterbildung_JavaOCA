package methoden;

/*A5
 * Definieren Sie eine statische Methode "zeichneRechteck", die zwei int-Parameter "breite" und "hoehe" und einen boolean-Parameter "fuellen" hat. 
	Die Methode zeichnet ein Rechteck auf der Konsole. Wenn der Parameter "fuellen" true ist, wird ein gefülltes Rechteck gezeichnet, sonst ein leeres.

	Z.B. für den Aufruf `zeichneRechteck(5, 4, false)` wird folgende Ausgabe erwartet:

        *****
        *   *
        *   *
        *****

	Der Aufruf `zeichneRechteck(5, 4, true)` zeichnet ein gefülltes Rechteck:

        *****
        *****
        *****
        *****
 */

public class AufgabeMethodenA05 {
	
	//Meine Methode definieren:
	static void zeichneRechteck (int zeilen, int spalten, boolean fuellen) {
		char fillChar = fuellen ? '*' : ' ';

			for (int i = 0; i < zeilen; i++) {
				for (int j = 0; j < spalten; j++) {
					if(i==0 || i==zeilen-1 || j==0 || j==spalten-1) {
						System.out.print("*");
				} else {
					System.out.print(fillChar);
				}
			}
			System.out.println();
		} 
	}

	
	//Aufruf von meiner Methode
	public static void main(String[] args) {
		zeichneRechteck(5, 6, true);
		System.out.println();
		zeichneRechteck(6, 7, false);
	}
}
