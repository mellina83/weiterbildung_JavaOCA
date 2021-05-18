package basics_variablen;

/*
 * Literal:	
 * 
 * 	Zeichenkombination, die für den Compiler einen konstanten Wert ergibt,
 *  der für die Zuweisung eingesetz wird.
 * 
 *  Der Typ eines Literals ist bei der Zuweisung wichtig (s. Bsp. 'Zuweisung' im Package 'operatoren')
 */
public class B04_Literale {

	public static void main(String[] args) {

		// int x = sdlkjfölskjdfölksdj; // die Zeichenkombination ergibt keinen Sinn
		
		
		/*
		 * 
		 * 
		 *  Zahlen-Literale
		 *  
		 *  
		 */
		
		
		/*
		 * int - Literale (int !!!!!!!) 
		 * 
		 */
		int x1  = 12; // int, dezimal
		System.out.println("x1 = " + x1); // 12
		
		byte x2 = 12; // int-Literal, aber es gibt unsichtbares Casting (Ausnahme beim Zuweisen)
	
		int x3 = 012; // int, oktal 0(0..7)
		System.out.println("x3 = " + x3); // 10 (in der Prüfung ist der Wert egal)
		
		int x4 = 0xaBCd; // int, hexadezimal 0x(0..9, a(A), b(B) ... f(F))
		System.out.println("x4 = " + x4); // irgendeine ganze Zahl (Wert ist in der Prüfung egal)

		int x5 = 0b01010101; // int, binär
		System.out.println("x5 = " + x5); // irgendeine ganze Zahl (Wert ist in der Prüfung egal)
		
		/*
		 * Vorzeichen mit int-Literalen
		 */
		int x6 = +12;
		int x7 = -12;
		
		/*
		 * Unterstrich, um int-Literale lesbarer zu gestalten
		 */
		int x8 = 1000000;
		int x9 = 1_000_000; // lesbarer
		
		// int x10 = _1000; // Compilerfehler (Unterstrich vorne)
		// int x11 = 1000_; // Compilerfehler (Unterstrich hinten)
		int x12 = 1_0__0_____0; // ok, aber nicht empfohlen
		System.out.println("x12 = " + x12); // 1000
		
		
		/*
		 * long-Literale  (L oder l am Ende)
		 * 
		 */
		// int x13 = 12L; // Compilerfehler: int <= long
		
		long x14 = 12L; 
		long x15 = 12l; // nicht empfohlen: l und 1 sehen zu ähnlich aus 
		
		// long x16 = 9_000_000_000; // Compilerfehler (nicht in der Prüfung)
		long x16 = 9_000_000_000L;
		
		/*
		 * double-Literale
		 * 
		 */
		
		double d1 = 1.2;
		double d2 = +1.2;
		double d3 = -1.2;
		
		double d4 = 0.1;
		System.out.println("d4 = " + d4); // 0.1
		
		double d5 = .1;
		System.out.println("d5 = " + d5); // 0.1
		
		double d6 = 12.0;
		System.out.println("d6 = " + d6); // 12.0
		
		double d7 = 12.;
		System.out.println("d7 = " + d7); // 12.0
		
		double d8 = 2e3; // double-Literal! Wissenschfatliche Notation: 2.0 mal 10 hoch 3
		System.out.println("d8 = " + d8); // 2000.0
		
		double d9 = 2E3; // double-Literal! Wissenschfatliche Notation: 2.0 mal 10 hoch 3
		System.out.println("d9 = " + d9); // 2000.0

		System.out.println("direkt: " + 2e3); // 2000.0

		// int a = 3e2;  // Compilerfehler: int <= double
		
		double d10 = -900e-2; // -900.0 mal 10 hoch -2
		System.out.println("d10: " + d10); // -9.0
		
		double d11 = 12D; // mit d oder D am Ende ist auch double-Literal
		
		
		/*
		 * float-Literale (F oder f am Ende)
		 * 
		 */
		float f1 = 12f; // float-Literal
		System.out.println("f1 = " + f1); // 12.0
		
		// float f2 = 12.0; // Compilerfehler: float <= double

		float f3 = 12.3f; // float <= float
		System.out.println("f3 = " + f3); // 12.3
		
		
		/*
		 * char-Literale (sind auch eine Art Zahlen)
		 * 
		 */
		char ch = 97; // int-Literal (wieder die Ausnahme mit dem impliziten Casting)
		System.out.println("ch = " + ch); // a
		
		char ch2 = 'a'; // char-Literal
		System.out.println("ch2 = " + ch2); // a
		
		// char ch3 = 'ab'; // Compilerfehler
		
		char ch4 = '\uABCD'; // char-Literal mit der Zahl in der hexadezimalen Form (Wert ist in der Prüfung egal)

		// char ch5 = "a"; // Compilerfehler
		
		
		/*
		 * boolean-Literale
		 * 
		 */
		
		boolean b1 = true;
		boolean b2 = false;
		
		// boolean b3 = 0; // Compilerfehler: boolean <= int
		
	} // end of main

}
