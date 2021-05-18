package classes_vererbung;

class Auto {
	static int getMinBaujahr() { return 1880; }
	
	void fahren() { System.out.println("Auto"); }
}

class VW extends Auto {
	static int getMinBaujahr() { return 1950; }

	/*
	 * Die Methode 'fahren' wird überschrieben.
	 * 
	 * Dadurch ersetzt die neue (überschreibende) Methode
	 * die alte (überschreibene) Methode für alle VW-Objekte.
	 */
	void fahren() { System.out.println("VW"); }
}

class Opel extends Auto {
	
}

public class B08_Polymorphismus {

	public static void main(String[] args) {

		/*
		 * Kein Polymorphismus mit statischen Methoden.
		 * 
		 * Zu Compilerzeit wird festgelegt aus welcher Klasse die
		 * statische Methode kommt.
		 */
		System.out.println( Auto.getMinBaujahr() ); // 1880
		System.out.println( VW.getMinBaujahr() ); // 1950
		
		/*
		 * Polymorphismus mit Instanzmethoden.
		 * 
		 * Erst zur Laufzeit wird festgelegt aus welcher Klasse
		 * die Instanzmethode kommt.
		 */
		Auto a2 = new VW(); // Auto <= IS-A <= VW
		
		a2.fahren(); // VW <- Polymorphischer Aufruf
		
		a2 = new Auto();
		
		a2.fahren(); // Auto <- Polymorphischer Aufruf
		
		// Teste die universelle Komponente, die auf den Basistyp programmiert wurde
		// und von einem polymorphischen Aufruf profitiert.
		autoStarten(new Auto());
		autoStarten(new VW());
		autoStarten(new Opel());
	}
	
	// Universelle Komponente
	static void autoStarten(Auto auto) {
		System.out.println("******");
		System.out.println("Starte die Fahrt...");
		System.out.print("Jetzt fährt ein ");
		auto.fahren(); // <- Polymorphischer Aufruf
	}

}
