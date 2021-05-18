package basics_methoden;

public class B03_Parameter {

//	static void multiplyAndPrint() {
//		int a = 2;
//		int b = 3;
//		
//		int result = a * b;
//		System.out.println("2 * 3 = " + result);
//	}
	

	/*
	 * - 		a und b sind die Parameter der Methode
	 * - 		(int a, int b) ist die Liste der Parameter
	 * 
	 * -		multiplyAndPrint(int, int) ist Signatur
	 * 
	 */
	static void multiplyAndPrint(int a, int b) {
		int result = a * b;
		System.out.println(a + " * " + b + " = " + result);
	}
	
	
	public static void main(String[] args) {

		/*
		 * Beim Aufruf der Methode sollen die Argumente übergeben werden,
		 * die zum Initialisieren der Parameter verwendet werden.
		 * 
		 * 4 und 5 sind die Argumente bei diesem Methodenaufruf.
		 */
		multiplyAndPrint(4, 5);

		multiplyAndPrint(3, -1);
		
	} 

}
