package methoden;

public class FibonacciTest {

	public static void main(String[] args) {
		// Erzeugen Sie iterativ (mit einer Schleife) die Ausgabe der ersten 50 Fibonacci-Zahlen
		// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
		// Alternative Ausgabe:
		// 1. Fibonacci-Zahl: 0
		// 2. Fibonacci-Zahl: 1
		// 3. Fibonacci-Zahl: 1
		// 4. Fibonacci-Zahl: 2
		// ...
		
		long a = 0;
		long b = 1;
		long ergebnis = 0;
		


		for (int i = 1; i <= 48; i ++) {
			
			if (a==0 && b == 1) {
				System.out.println(i + ". Fibonacci Zahl: " + a);
				System.out.println((i+1) + ". Fibonacci Zahl: " + b);
			} 
			ergebnis = a + b;
			System.out.println((i+2) + ". Fibonacci Zahl: " + ergebnis);
			a = b;
			b = ergebnis;
		}
		
		System.out.println("****** Nun rekursiv");
		fibonacci();

		
		
		
	} // Ende Main
	
	public static void fibonacci() {
		long sum = 0;
		long firstnumber = 0;
		long secondnumber = 1;
		
		if (firstnumber ==0) {
			System.out.println(firstnumber);
		} else {
			System.out.println(secondnumber);
		}
		
		sum = firstnumber + secondnumber;
		
		if (secondnumber > 50) {
			return;
		}
		fibonacci();
	}

}
