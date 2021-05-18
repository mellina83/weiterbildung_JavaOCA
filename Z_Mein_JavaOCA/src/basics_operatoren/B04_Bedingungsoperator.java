package basics_operatoren;

/*
 * Bedingungsoperator = ternary conditional
 */
public class B04_Bedingungsoperator {

	public static void main(String[] args) {

		int x = 12;
		
		/*
		 *  p1 ? p2 : p3
		 *  
		 *  p1 - boolean Wert (Bedingung)
		 *  p2 - Ergebnis, wenn p1 ist gleich true 
		 *  p3 - Ergebnis, wenn p1 ist gleich false
		 */
		
		int result = x%2==0 ? 0 : 1 ; // Hier liefert der Bedingungsoperator
										// 	int zurück
		System.out.println("result = " + result); // 0
		
		int uhrzeit = 17;
		String tageszeit = uhrzeit > 12 ? "Nachmittag" : "Vormittag"; // Hier liefert der Bedingungsoperator
																	  // String zurück
		System.out.println("Tageszeit: " + tageszeit); // Nachmittag
		
		/*
		 * Achtung in der Prüfung!
		 * 
		 * Der Compiler merkt sich nur den Typ der Variable 'y'
		 */
		int y = 44;
		
//		 int erg = y==0 ? 17.3 : -2; // Compilerfehler: Hier liefert der Bedingungsoperator
										// entweder double oder int 
		double erg = y==0 ? 17.3 : -2;
		System.out.println("erg = " + erg); // -2.0
		
	}

}
