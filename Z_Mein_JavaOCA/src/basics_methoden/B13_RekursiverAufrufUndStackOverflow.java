package basics_methoden;

/*
 * Rekursiver Aufruf entsteht, wenn eine Methode sich selbst aufruft.
 * 
 * Wenn es kein Abbruch bei den rekursiven Aufrufen gibt ist es ein logischer Fehler des Programmierers.
 * Der Fehle soll korrigiert werden: neue Lösung muss entstehen. 
 */
public class B13_RekursiverAufrufUndStackOverflow {

	public static void main(String[] args) {

		m1(12); // StackOverflowError
		/*
		 * m1(x = 12) {
		 * 		m1(x = 11) {
		 * 			m1(x = 10) {
		 * 				m1(x = 9) {
		 * 					...
		 * 				}
		 * 			}
		 * 		} 
		 * }
		 */
		
		// exam(3); // StackOverflowError
		
	} // end of main

	static void m1(int x) {
		m1(x - 1);
	}
	
	
	/*
	 * Aufruf:
	 * 
	 * 		exam(3);
	 * 
	 * Was ist das Ergebnis?
	 * 
	 * 		A. 	3 2 1
	 * 		B. 	3 2 1 0
	 * 		C. 	2 1 0
	 * 		D. 	StackOverflowError
	 * 
	 *    exam(x1 = 3) {
	 *    		
	 *    		exam(x2 = 3) {
	 *    		
	 *    			exam(x3 = 3) {
	 *    				
	 *    				// ...
	 *    			}	
	 *    		}
	 *    }
	 */
	
	static void exam(int x) {
		if(x<0) {
			System.out.println();
			return;
		}
		System.out.print(x + " ");
		exam(x--);		// int param = x--;
		/*
		 * hier (nur hier) kann man den Aufruf exam(x--) so interpretieren:
		 * 
		 * int tmp = x;
		 * exam(tmp);
		 * x = x - 1;
		 */
		
		/*
		 * Besser:
		 */
//		exam(x - 1);	// int param = x - 1;
//		exam(--x);		// int param = --x;
	}
	
}
