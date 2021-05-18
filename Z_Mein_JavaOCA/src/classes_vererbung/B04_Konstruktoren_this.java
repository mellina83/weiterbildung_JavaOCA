package classes_vererbung;

/*
 * Der Compiler sorgt intelligent dafür, dass folgende Regeln erfüllt sind:
 * 
 * - Jede Klasse hat mindestens einen Konstruktor
 * - Jeder Konstruktor hat als erste Anweisung den Aufruf eines anderen Konstruktors
 *   entweder explizit mit this(?) oder super(?) oder implizit mit super() 
 * - Alle Attribute werden vorinitialisiert
 */


/*
 * Alternativ zu super(?) kann in einem Konstruktor mit this(?) ein anderer
 * überladener Konstruktor dieser Klasse aktiviert werden.
 * 
 * Dann wird der this(?)-Aufruf den super(?)-Aufruf ersetzen
 */

class K1 {
	K1() {
		this(12); // den Konstruktor K1(int) aufrufen
	}
	
	K1(int x) {
		// super(); // <- generiert vom Compiler
	}
}



public class B04_Konstruktoren_this {


}
