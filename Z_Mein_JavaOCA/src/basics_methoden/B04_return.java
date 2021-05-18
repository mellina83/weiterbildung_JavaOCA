package basics_methoden;

/*
 * 	- es darf mehere return-Anweisungen in einer Methode geben 
 *  - eine void-Methode kann mit return; beendet werden
 */
public class B04_return {
	
	public static void main(String[] args) {

		int x = add(2, 3);
		System.out.println("x = " + x);
		
		add(4, 7); // Sinnlos aber kompilierbar (Ergebnis wird zurückgeliefert aber nicht gespeichert)
		
		
		// int y = addAndPrint(7, 2); // Compilerfehler (void-Methode)
		
		addAndPrint(7, 2);
		
		addAndPrint(Integer.MAX_VALUE, 1);
	}

	/*
	 * int		- Rückgabetyp
	 */
	static int add(int a, int b) {
		int result = a + b;
		
		return result;
	}
	
	/*
	 * void		- Gibt an, dass die Methode nichts zurück liefert
	 */
	static void addAndPrint(int a, int b) {
		long result = (long)a + b;
		
		if( result > Integer.MAX_VALUE || result < Integer.MIN_VALUE ) {
			System.out.println("Warnung! Integer overflow: " + a + " + " + b + " passt nicht in int");
			
			return; // hier wird die Methode bei int overflow beendet  
		}
		
		System.out.println(a + " + " + b + " = " + result);
	}
}
