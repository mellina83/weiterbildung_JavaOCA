package classes_aufgaben;

class CharPrinter {
	char from;
	char to;
	
	void println() {
		for(char ch = from; ch <= to; ch++) {
			System.out.print(ch + " ");
		}
		System.out.println();
	}
	
} // end of CharPrinter

public class KleineAufgabeMethoden {

	/*
	 * Definieren Sie die neue Klasse mit dem Namen 'CharPrinter'.
	 * 
	 * Die Aufgabe der Objekte der neuen Klasse:
	 * 
	 * 	Zeichen aus einem Bereich der Unicode-Tabelle in einer Zeile 
	 *  auf der Konsole auszugeben.
	 * 
	 *  Z.B.
	 *  
	 *  	a b c d e f
	 *  
	 *  	x y z
	 *  
	 *  	A B C D
	 *  
	 *  	M N O P
	 *  
	 */
	public static void main(String[] args) {

		CharPrinter p1 = new CharPrinter();
		// Einstellungen hier für p1 vornehmen...
		p1.from = 'a';
		p1.to = 'f';
		
		// Dann p1 aktivieren (Instanz-Methode aufrufen).
		// Ausgabe, die dabei mit aktuellen p1-Einstellungen erzeugt wird: a b c d e f
		p1.println();
		
		CharPrinter p2 = new CharPrinter();
		// Einstellungen hier für p2 vornehmen...
		p2.from = 'M';
		p2.to = 'P';
		
		// Dann p2 aktivieren (Instanz-Methode aufrufen):
		// Ausgabe, die dabei mit aktuellen p2-Einstellungen erzeugt wird: M N O P
		p2.println();
		
	}

}
