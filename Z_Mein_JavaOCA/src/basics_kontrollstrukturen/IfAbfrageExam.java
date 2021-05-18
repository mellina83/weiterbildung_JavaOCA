package basics_kontrollstrukturen;

public class IfAbfrageExam {

	public static void main(String[] args) {

		/*
		 * 
		 * Achtung! if-Abfrage benötigt NUR boolean!!!
		 * 
		 */
		
		int x = 77;
//		if( x ) {		// Compilerfehler!
//
//		}
		
//		if( x = 0 )  {	// Compilerfehler! Zuweisung statt des Vergleichsoperators
//			
//		}
		
		boolean var = false;
		
		// Achtung! Statt des Vergleichsoperators wird der Zuweisungsoperator verwendet!
		// Der neue Wert der Variable var nach der Zuweisung ist true. 
		// Diesen Wert erhält die if-Abfrage 
		if( var = true ) { 
			System.out.println("Zeile A");
		}
		
		/*
		 * 
		 * Achtung!
		 * Zu der if-Abfrage gehört als Rumf 
		 * entweder der darauffolgende Block in geschw. Klammern
		 * oder die nächste Anweisung bis zum Semikolon.
		 * 
		 * Schlechte Formatierung der Zeile mit 'line 2' kann denken lassen,
		 * dass auch diese Zeile zu der if-Abfrage gehört.
		 * 
		 */
		
		x = 0;
		
		if(x==22)
			System.out.println("line 1"); // <- nicht ausgeführt (gehört zu if)
			System.out.println("line 2"); // <- wird unbeding ausgeführt (gehört NICHT zu if)
		
		/*
			Eigentlich sollte der Code lieber so aussehen:
			
			if(x==22) {
				System.out.println("line 1");
			}
			System.out.println("line 2");
		*/
		
	} // end of main

}
