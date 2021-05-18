package assertions;

/**
 * Mit Assertions besteht die Möglichkeit, zur Laufzeit eines Programms
 * bestimmte Programmeigenschaften zu überprüfen.
 * 
 * Notation von Assertions:
 * 
 * 1) assert Ausdruck1; //erste Variante
 * 
 * In der ersten Variante der assert-Anweisung wird der Boolesche Ausdruck
 * Ausdruck1 ausgewertet. Ergibt Ausdruck1 den Wert true, d.h. die zu
 * überprüfende Eigenschaft ist richtig, so wird die nächste Anweisung nach der
 * Assertion ausgeführt.Ist Ausdruck1 allerdings false erhalten wir eine
 * Fehlermeldung
 * 
 * 
 * 2 ) assert Ausdruck1 : Ausdruck2; // zweite Variante
 * 
 * Bei der zweiten Variante der assert-Anweisung wird ebenfalls der Boolesche
 * Ausdruck Ausdruck1 ausgewertet. Ergibt die Auswertung true, so wird die
 * Ausführung wiederum nach der Assertion fortgesetzt. Ist Ausdruck1 allerdings
 * false, dann wird Ausdruck2 ausgegeben.
 * 
 */

public class Demo01Assertions {

	public static void main(String[] args) {
//		printNumberAssertion01(-10);
//		printNumberAssertion01(10);
		
		printNumberAssertion02(-10);
		printNumberAssertion02(10);
	}

	private static void printNumberAssertion02(int number) {
		int i = number;
		/*
		 * gültiges assert
		 */
		assert i<0: number + " ist nicht kleiner als 0";
		
		System.out.printf("printNumberAssertion02(%d) %n",i);
	}

	private static void printNumberAssertion01(int number) {
		int i = number;
		/*
		 * gültiges assert
		 */
		assert i<0;//i = 10 kleiner als Zero? false
		
		System.out.printf("printNumberAssertion01(%d) %n",i);
	}

}
