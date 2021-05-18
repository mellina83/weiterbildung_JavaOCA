package basics_methoden;

public class B07_Ueberladen {

	public static void main(String[] args) {
	
		int x = getMax(22, -7); 
		System.out.println("1. x = " + x); // 22 
		
		x = getMax(-100, -7);
		System.out.println("2. x = " + x); // -7

		x = getMax(-7, -7);
		System.out.println("3. x = " + x); // -7

		
		x = getMax(2, 7, 1);
		System.out.println("4. x = " + x); // 7
		
		x = getMax(200, 7, 1);
		System.out.println("5. x = " + x); // 200
		
		x = getMax(200, 7, 1000);
		System.out.println("6. x = " + x); // 1000
	}

	/* 
	 * Entwickeln Sie bitte eine Methode 'getMax', die aus zwei int-Parameter 
	 * den größeren zurückliefert.
	 * Sind die Parameter gleich, wird einer davon zurückgeliefert.
	 *
	 */
	static int getMax(int a, int b) { 
		return a > b ? a : b; 
	}
	
	/*
	 * Überladen (overloaded) für drei Parameter
	 */
	static int getMax(int a, int b, int c) {
		int tmp = getMax(a, b);
		
		return getMax(tmp, c);
	}
	
}
