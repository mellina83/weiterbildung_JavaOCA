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
		char ch ='*';
		if (fuellen == true) {
			for (int i = 0; i < zeilen; i++) {
				for (int j = 0; j < spalten; j++) {
					System.out.print(ch);
				}
				System.out.println();
			}
			
		} else {
			for(int z = 0; z < zeilen; z++) {
				for (int s = 0; s < spalten; s++) {
					
					if(z==0 || z==zeilen-1 || s==0 || s==spalten-1) {
						System.out.print('*');
					} else {
						System.out.print(' ');
					}
				}
				System.out.println();
			}
		}	
	}
	
	//Methode von Dozent (Idee v. Arno) kompakter definiert:
	
	static void zeichneRechteck2 (int zeilen, int spalten, boolean fuellen) {
		
	}
	
	//Aufruf von meiner Methode
	public static void main(String[] args) {
		zeichneRechteck(5, 6, true);
		System.out.println();
		zeichneRechteck(6, 7, false);
	}
}
