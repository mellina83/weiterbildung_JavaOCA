package basics_operatoren;

public class B03_Vergleichsoperatoren {

	public static void main(String[] args) {

		/*
		 * 		!=		'ist ungleich'
		 * 		==		'ist gleich'
		 * 
		 * 	- Diese Operatoren können Zahlen-Typen unter sich vergleichen.
		 * 	- Diese Operatoren können boolean unter sich vergleichen.
		 * 
		 * 		boolean mit Zahlentypen aber nicht!
		 * 
		 */
		
		int x1 = 22;
		double x2 = 22.0;
		
		boolean result = x1 == x2;
		System.out.println("22 == 22.0: " + result); // true
		
		boolean b1 = x1 != x2; // false
		System.out.println("b1 == result: " + (b1==result)); // false 
		
		// System.out.println(b1 == x1); // Compilerfehler!!!  'boolean' mit 'int' vergliechen 
		
		char x3 = 'a';
		System.out.println("22 == 'a': " + (x1 == x3)); // false
		System.out.println("97 == 'a': " + (97 == x3)); // true
		
		/*
		 * 	<
		 * 	<=
		 * 	>
		 * 	>=
		 * 
		 * - Diese Operatoren gibt es nur für Zahlentypen
		 * 
		 */
	
		System.out.println( "97 <= 'a': " + (97 <= 'a') ); // true
	
//		System.out.println(b1 >= true); // Compilerfehler
		
		
		
		/*
		 * In der Praxis: bei der Arbeit mit Nachkommazahlen aufpassen:
		 */
		
		System.out.println("1: " + (.1+.1 == .2)); // true
		System.out.println("2: " + (.1+.1+.1 == .3)); // false (nicht in der Prüfung)
		
		double d = .1+.1+.1;
		System.out.println("d = " + d); // 0.30000000000000004
		// s. z.B. https://www.h-schmidt.net/FloatConverter/IEEE754de.html

		
		/*
		 * Später fürs Untersuchen der Objekte:
		 * 
		 * 		instanceof-Operator
		 * 
		 */
		Object obj = "hallo";
		System.out.println( obj instanceof String ); // true
		
	}

}
