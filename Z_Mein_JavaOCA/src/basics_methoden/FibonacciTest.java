package basics_methoden;

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
		long fibo1 = 0;
		long fibo2 = 1;
		System.out.println("1. Fibonacci-Zahl: " + fibo1);
		System.out.println("2. Fibonacci-Zahl: " + fibo2);
		long fibo;
		for (int i = 3; i<= 50; i++){
			fibo = fibo1 + fibo2;
			System.out.println(i + ". Fibonacci-Zahl: " + fibo);
			fibo1 = fibo2;
			fibo2 = fibo;
		}
		System.out.println("************");
		for (int i = 1; i <= 50; i++) {
			System.out.println(i + ". Fibonacci-Zahl: " + berechneFibonacchi(i));
		}
		
		
	}
	
	public static long berechneFibonacchi(int zahl) {
		if (zahl == 1) {
			return 0;
		}
		if (zahl == 2) {
			return 1;
		}
		return  berechneFibonacchi(zahl - 2) +  berechneFibonacchi(zahl - 1);
	}
	
	

}
