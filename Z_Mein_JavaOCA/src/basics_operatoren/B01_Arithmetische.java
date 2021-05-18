package basics_operatoren;

/*
 * Achtung! Regel 0:
 * 
 * Der Compiler merkt sich nur den Typ einer Variable aber nicht ihren Wert!
 */
public class B01_Arithmetische {

	public static void main(String[] args) {

		/*
		 * Arithmetische Operatoren:
		 * 
		 * 		+	-	* 	/	%
		 */
		
		int a = 99;
		int b = 3;
		
		System.out.println("99 / 3 = " + a/b); // 33
		System.out.println("99 % 3 = " + a%b); // 0
		
		
		
		/*
		 * Wichtig (exam)!
		 *  
		 * Das Ergebnis einer arithmetischen Operation hat den Typ des 'breitesten'
		 * Operanden, aber ist mindestens vom Typ 'int'.
		 * 
		 * Implizites Casting ist einer Ausnahme, die es nur gilt, wenn an der Operation 
		 * nur int-Literale und keine Variablen beteiligt sind.
		 */
		System.out.println("99 / 10 = " + a/10); // 9	(int)
		
		double c = 99.;
		
		System.out.println("99.0 / 10 = " + c/10); // 9.9 (double)
		
		byte x1 = 4; // implizites Casting (byte)
		
		byte x2 = 4/2; // implizites Casting (byte) nach der Compilerzeit-Rechnung mit Literalen (4/2 wird vom Compiler berechnet)
		
		// byte x3 = x1/2; // Compilerfehler: byte <= int
		
		// long x4 = x1*2e3; // Compilerfehler: long <= double
		
		float x5 = 2F - x1; // float <= float
		
		
		/*
		 * Unwahrscheinlich in der Prüfung: Infinity
		 */
		double d = 12.;
		
		System.out.println("12.0 / 0 = " + d/0); // Infinity
		
		/*
		 * Wahrscheinlich in der Prüfung: ArithmeticException
		 */
		int e = 12;
		
		System.out.println( e / 0 ); // kritischer Abbruch durch ArithmeticException
		
		System.out.println("dazu wird es nicht kommen");
	}

}
