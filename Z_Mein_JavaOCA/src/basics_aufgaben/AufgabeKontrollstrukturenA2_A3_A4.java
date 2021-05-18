package basics_aufgaben;

public class AufgabeKontrollstrukturenA2_A3_A4 {

	/*
	 * Gegeben ist: x = 3, y = 4. Berechnen Sie bitte x hoch y 
	 * 	und geben Sie das Ergebnis aus.
  	 * 
	 */
	public static void main(String[] args) {

		// A2. Benutzen Sie für die Lösung die for-Schleife. 
		final int x = 3;
		final int y = 4;
		
		int result = 1;
		
		for (int i = 0; i < y; i++) {
			result *= x;
		}

		System.out.println( x + " ^ " + y + " = " + result); // 81
		
		// A3. Benutzen Sie für die Lösung die while-Schleife.

		int i = 1;
		
		result = x;
		
		while(i < y) {
			result *= x;
			i++;
		}
		
		System.out.println( x + " ^ " + y + " = " + result); // 81
		
		// A4. Benutzen Sie für die Lösung die Methode ``java.lang.Math.pow``.
		
		double result2 = Math.pow(x, y);
		
		System.out.println( x + " ^ " + y + " = " + result2); // 81.0
		
	} // end of main

}
