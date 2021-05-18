package basics_variablen;

/*
 * Identifier: Namen für Variablen, Methoden, Klassen
 */
public class B03_BezeichnerOderIdentifier {

	public static void main(String[] args) {

		/*
		 * 
		 * Erlaubte Zeichen für Identifier
		 * 
		 */
		
		/*
		 * Buchstaben
		 */
		int x, y, abcDEFб;
		int äö; // OK, aber nicht empfohlen
		
		// int class; // Compilerfehler: Key-Word
		
		/*
		 * Ziffern (aber nicht vorne!)
		 */
		
		//int 12x;		Compilerfehler
		int x12;
		
		/*
		 * Währungssymbole 
		 */
		int $;		// geht, aber nicht empfohlen
		int $$$;
		int €;
		int ¥;
		
		/*
		 * Unterstrich
		 */
		int _ = 12;		// In Java 8 OK, in Java 11 gibt es einen Compilerfehler 
		int a_b;		// Ok für alle Java-Versionen
		int _a_b_;		// Ok für alle Java-Versionen
		
		/*
		 * so könnte es in der Prüfung aussehen:
		 * 
		 * int $_a_12; 
		 * int §_a_12; 
		 * int a_#_12; 
		 */
		
	} 

}
