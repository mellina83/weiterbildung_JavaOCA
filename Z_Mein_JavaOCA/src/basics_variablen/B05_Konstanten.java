package basics_variablen;

/*
 * 		final
 * 
 *  Konstanten gestalten den Code sicherer (weniger Fehler sind möglich)
 */
public class B05_Konstanten {

	public static void main(String[] args) {

		final double pi = 3.14; // final garantiert, dass die Variable den Wert 3.14 immer haben wird 
		System.out.println("pi = " + pi);
		
		/*
		 * Ich stelle mit vor dass die main-Methode sehr lang wird
		 * 
		 * ...
		 */
		
		// pi = 4; // Compilerfehler (Konstante)
		
		
		/*
		 * ...
		 */
		System.out.println("pi = " + pi); // garantiert 3.14
		
	}

}
