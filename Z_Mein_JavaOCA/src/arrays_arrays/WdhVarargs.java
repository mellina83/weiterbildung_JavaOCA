package arrays_arrays;

public class WdhVarargs {

	public static void main(String[] args) {
//		m1(1, 2, 3);
		m2(1, 2, 3);
		
		int[][] var = {};
		
		m1(var); // normaler Aufruf
		m3(var);
		
		int[] a1 = {};
		int[] a2 = {};
		
		m1(a1, a2); // Bequemer Aufruf der Varargs-Methode
		// m3(a1, a2); // Compilerfehler 
	}

	static void m1(int[]... array) {
		for(int[] x : array) { 
			//...
		}
	}
	
	static void m2(int... array) {
		for(int x : array) {
			//...
		}
	}
	
	static void m3(int[][] array) {
		for(int[] x : array) {
			//...
		}
	}
	
//	static void m4(int...[] array) { // Compilerfehler
//		for(int[] x : array) {
//			//...
//		}
//	}
	
}
