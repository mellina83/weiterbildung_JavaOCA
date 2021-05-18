package basics_operatoren;

public class B06_ZuweisungMitOperation {

	public static void main(String[] args) {

		/*
		 * +=, -= ...
		 * 
		 */
		
		int x1 = 12;
		
		x1 += 5; // x1 = x1 + 5;
		
		System.out.println("x1 = " + x1); // 17
		
		
		byte b1 = 12;
		
		b1 += 5; // b1 = (byte)(b1 + 5); 

		System.out.println("b1 = " + b1);
		
		/*
		 * &=, |=, ^=
		 */
		
		boolean valueA = true;
		boolean valueB = false;
		
		valueA &= valueB; // valueA = valueA & valueB;
		
		System.out.println("valueA = " + valueA);
		
		
		/*
		 * Inkrement, Dekrement
		 */
		
		int var = 0;
		
		// Präinkrement
		++var; // var = var + 1;
		System.out.println("1. var = " + var); // 1

		// Postinkrement
		var++; // var = var + 1;
		System.out.println("2. var = " + var); // 2
		
		/*
		 * Unterschied zw. Prä- und Post.
		 * 
		 * Wird die zu inkrementierende Variable an einer weiteren Operation beteiligt,
		 * wird beim Präinkrement die Variable VOR dem Lesen inkrementiert,
		 * und beim Postinkrement erst nach dem Lesen. 
		 */
		
		// Inkrementieren VOR dem Lesen fürs Konkatenieren
		System.out.println("3. var = " + ++var); // Ausgabe: 3
		
		// Inkrementieren NACH dem Lesen fürs Konkatenieren
		System.out.println("4. var = " + var++); // Ausgabe: 3
		
		System.out.println("5. var = " + var); // Ausgabe: 4
		
		/*
		 * Test. Operation an der die Variable beteiligt wird ist der Vergleich mit 0
		 */
		var = 0; // zurückgesetzt
		
		boolean result = var++ > 0;
		System.out.println("1. result = " + result); // false
		System.out.println("1. var = " + var); // 1
		
		var = 0; // zurückgesetzt
		
		result = ++var > 0;
		System.out.println("2. result = " + result); // true
		System.out.println("2. var = " + var); // 1
		
		/*
		 * Test mit dem Dekrement.
		 * 
		 * Operation an der die Variable beteiligt wird ist die Zuweisung in eine andere Variable
		 */
		
		var = 0; // zurückgesetzt
		
		int value = var--;
		System.out.println("1. value = " + value); // 0
		System.out.println("1. var = " + var); // -1
		
		var = 0; // zurückgesetzt
		
		value = --var;
		System.out.println("2. value = " + value); // -1 
		System.out.println("2. var = " + var); // -1
		
	}

}
