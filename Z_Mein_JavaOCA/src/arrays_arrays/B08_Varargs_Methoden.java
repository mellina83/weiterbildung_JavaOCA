package arrays_arrays;

/*
 * Varargs-Methode hat nur ein Vorteil gengenüber der Methode
 * mit einem Array-Parameter: Varargs-Methode kann bequemer aufgerufen werden
 */
public class B08_Varargs_Methoden {

	/*
	 * Aufgabe: eine Mehode schreiben, die beliebig viele int-Werte addiert
	 * 			(int overflow darf ignoriert werden)
	 */
	public static void main(String[] args) {

		int[] values = { 1, 2 };
		
		int result;
		
		result = sum(1, 2); // <- bequmer Aufruf der Varargs-Methode. Compiler ersetzt 1, 2 durch new int[] { 1, 2 }
		System.out.println("1 + 2 = " + result);
		result = sum(values); // <- normaler Aufruf
		System.out.println("1 + 2 = " + result);

//		values = new int[]{ 1, 2, 3 };
		
		result = sum(1, 2, 3); // <- bequmer Aufruf der Varargs-Methode
		System.out.println("1 + 2 = " + result);
		result = sum(values); // <- normaler Aufruf
		System.out.println("1 + 2 + 3 = " + result);
		
		result = sum(1, 2, 3, 4); // <- bequmer Aufruf der Varargs-Methode
		System.out.println("1 + 2 = " + result);
		result = sum(new int[]{ 1, 2, 3, 4}); // <- normaler Aufruf
		System.out.println("1 + 2 + 3 + 4 = " + result);

	} // end of main
	
	static int sum(int... values) {
		int result = 0;
		
		for(int x : values) {
			result += x;
		}
		
		return result;
	}
	
	
	/*
		Lösung 2: Array als Parameter
		
		OK.
		Nachteil: unbequem zu benutzen
	 */
//	static int sum(int[] values) {
//		int result = 0;
//		
//		for(int x : values) {
//			result += x;
//		}
//		
//		return result;
//	}
	

	/*
		Lösung 1: Überladen. 
		
		Geht nicht für beliebig viele int-Werte zum Bilden der Summe
		
	
		static int sum(int a, int b) {
			return a + b;
		}
		
		static int sum(int a, int b, int c) {
			return a + b + c;
		}
		
		static int sum(int a, int b, int c, int d) {
			return a + b + c + d;
		}
	*/
	
}
