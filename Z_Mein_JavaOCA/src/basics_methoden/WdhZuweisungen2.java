package basics_methoden;

public class WdhZuweisungen2 {

	public static void main(String[] args) {
//		add(2, 3);	// Compilerfehler: 2. Argument ist 'int', aber der 2. Parameter ist 'byte'
		
	}
	
	static int add(long a, byte b) {
		return (int)a + b;
	}

	/*
	 * Was ist das Ergebnis?
	 * 
	 * 		A. 5
	 * 		B. Compilerfehler
	 * 		C. -11
	 */
	
}
