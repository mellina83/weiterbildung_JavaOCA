package methoden;

public class kleineAufgabeRekursion2 {

	public static void main(String[] args) {
		
		/*
		 * Geben Sie rekursiv alle Werte zwischen 10 bis 1 aus:
		 * 
		 * 10 9 8 7
		 */
		runterrechnenRekursiv(10);
		System.out.println();

		/*
		 * Angefangen mit 0 Fibonacci-Zahlen ausgeben.
		 * Nach 21 aufhören.
		 * Bitte rekursiv
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
		System.out.println("Aufgabe 2:");
		fibonacci();
	}
	
	//Methode A1
	static void runterrechnenRekursiv(int value) {

		if (value < 1) {
			return;
		} 
		
		System.out.print(value + " ");
		runterrechnenRekursiv(value-1);
	}
	
	
	//Methode A2 aber erstmal mit for-Schleife
	
	
	static void fibonacci() {

		
		int previousNumber = 0;
		int nextNumber = 1;
		int sum = 0;
		
		for (int i = 1; i == 21; ++i) {
			sum = previousNumber + nextNumber;
			System.out.print(sum);
			previousNumber = nextNumber;
			nextNumber = sum;
			
			
		}
		
	}
	
	

}

