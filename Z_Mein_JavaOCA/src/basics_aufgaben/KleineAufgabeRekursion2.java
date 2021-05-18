package basics_aufgaben;

public class KleineAufgabeRekursion2 {

	public static void main(String[] args) {

		/*
		 * A1
		 * 
		 * Geben Sie rekursiv alle Werte zwichen 10 bis 1 
		 * mit einer neuen Methode 'print' aus:
		 * 
		 * 10 9 8 7 6 5 4 3 2 1
		 * 
		 */
		System.out.println("*** A1");
		print(10);
		System.out.println();
		
		/*
		 * https://de.wikipedia.org/wiki/Fibonacci-Folge
		 * 
		 * A2. Angefangen mit 0 Fibonacci-Zahlen ausgeben. 
		 *     Nach 21 aufhören.
		 *     Bitte rekursiv. 
		 * 
		 * 0
		 * 1
		 * 1
		 * 2
		 * 3
		 * 5
		 * 8
		 * 13
		 * 21
		 */
		
		System.out.println("*** A2");
		fibonacci(0, 1);
		
	} // end of main
	
	static void fibonacci(int a, int b) {
		if(a==0) {
			System.out.println(a);
		}
		System.out.println(b);
		
		int c = a + b;

		if(c > 21) {
			return;
		}
		
		fibonacci(b, c);
	}
	
	static void print(int value) {
		if(value<1) {
			return;
		}
		
		System.out.print(value + " ");
		
		print(value - 1);
	}
}
