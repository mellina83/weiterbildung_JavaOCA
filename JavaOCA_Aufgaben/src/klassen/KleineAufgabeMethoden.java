package klassen;

/*
 * Definieren Sie die neue Klasse mit dem Namen "???".
 * 
 * Die Aufgabe der Objekte der neuen Klasse:
 * 
 * -Zeichen aus einem Bereich der Unicode-Tabelle in einer Zeile auf der Konsole ausgeben.
 * 	Z. B.
 * 	a b c d e f
 * 	x y z
 * 	A B C D
 * 	M N O P
 * 	(aufsteigend, von bis)
 */

class CharPrinter {
	
	//Attribute
	char min;
	char max;
	
	//Objektmethoden
	void charPrintingVonBis() {
		for (char ch = min; ch <= max; ch++) {
			System.out.print(ch + " ");
		}
		System.out.println();
		
	} //Ende Objektmethode charPrintingVonBis()
	
} // Ende Klasse

public class KleineAufgabeMethoden {
	
	public static void main(String[] args) {
		
		CharPrinter p1 = new CharPrinter();
		//...Einstellungen hier für p1 vornehmen
		p1.min = 'a';
		p1.max = 'f';

		// Dann p1 aktivieren (Instanzmethode): a b c d e f
		p1.charPrintingVonBis();
		
		CharPrinter p2 = new CharPrinter();
		//...Einstellungen hier für p2 vornehmen
		p2.min = 'M';
		p2.max = 'P';
		
		//Dann p2 aktivieren (Instanz-Methode aufrufen): MNOP
		p2.charPrintingVonBis();

	} // Main Ende

}
