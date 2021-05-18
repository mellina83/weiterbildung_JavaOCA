package classes_vererbung;

/*
 * - Kostruktoren werden nicht vererbt
 */

/*
 * Der Compiler sorgt intelligent dafür, dass folgende Regeln erfüllt sind:
 * 
 * - Jede Klasse hat mindestens einen Konstruktor
 * - Jeder Konstruktor hat als erste Anweisung den Aufruf eines anderen Konstruktors
 *   entweder explizit mit this(?) oder super(?) oder implizit mit super() 
 * - Alle Attribute werden vorinitialisiert
 */

class Blume {
	private String name;

	public Blume(String name) {
		super();  
		this.name = name;
		System.out.println("Blume(String)");
	}

	public Blume() {
		// super(); // <- generiert vom Compiler
		System.out.println("Blume()");
		this.name = "?";
	}
	
} // end of Blume 


class Gartenblume extends Blume {
	/*
	 * default-Konstruktor generiert vom Compiler:
	 * 
	 * Gartenblume() {
	 * 	 super();      // <- Aufruf von dem Noargs-Konstruktor aus Blume (generiert vom Compiler) 
	 * }
	 */
} // end of Gartenblume

class Waldblume extends Blume {
	public Waldblume(String name) {
		// super(); // <- Aufruf von dem Noargs-Konstruktor aus Blume (generiert vom Compiler)
	}
} // end of Waldblume

class Wiesenblume extends Blume {
	public Wiesenblume(String name) {
		super(name);  // <- Aufruf von dem Konstruktor Blume(String) 
	}
} // end of Wiesenblume


public class B02_Konstruktoren {

	public static void main(String[] args) {

		new Gartenblume(); // Ausgabe: 'Blume()' durch den super()-Aufruf im default-Konstruktor
		
		new Waldblume("Waldblume 1"); // Ausgabe: 'Blume()' durch den super()-Aufruf
		
		new Wiesenblume("Wiesenblume 1"); // Ausgabe: 'Blume(String)' durch den super(name)-Aufruf
	}

}
