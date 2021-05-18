package basics_operatoren;

public class B05_ZuweisungUndCasting {

	public static void main(String[] args) {

		/*
		 * Regel 0.
		 * 
		 * Der Compiler kennt nicht den Wert einer Variable, sondern nur ihren Typ
		 * 
		 */
		
		/*
		 * Zuweisung kompiliert, wenn auf der linken Seite die Variable den passenden Typ hat.
		 * 
		 * Bei Zahlen-Typen: es darf keinen potentiellen Daten-/Genauigkeitsverlust geben
		 * Bei boolean: nur mit boolean kompatibel 
		 */
		
		short x1 = 12; // Ausnahme aus der Zuweisungsregel bei int-Literalen 
		short x2 = x1; // OK: short <= short
		// byte x3 = x1; // Compilerfehler: byte <= short
		
		double x4 = 1.1;
		// float x5 = x4; // Compilerfehler: float <= double
		
		float x6 = x1 + x2; // float <= int (int ist das Ergebnis der Addition)
		
		// short x7 = x1 + x2; // Compilerfehler: short <= int (int ist das Ergebnis der Addition)
		
		/*
		 * Casting (Cast)
		 */
		int x8 = 12;
		// byte x9 = x8 + 3; // byte <= int (Erg. der Addition)
		
		// byte x9 = (byte) x8 + 3; // byte <= int (Erg. der Addition)
		
		byte x10 = (byte)(x8 + 3); // byte <= byte
		System.out.println("x10 = " + x10); // 15
		
		byte x11 = (byte)1200;
		System.out.println("x11 = " + x11); // eine sinnlose Zahl
		
		
		/*
		 * Nochmal Zuweisung zusammegefasst:
		 */
		byte b1 = 1;
		byte b2 = 2;
		
		byte b3 = 1 + 2; // Keine Variablen rechts (nur int-Literale): Ausnahme aus der Typ-Regel.
						// Hier generiert der Compiler ausnahmsweise das Casting implizit. 
		
		// byte b4 = b1 + 2; // Kein implizites Casting mehr!!!
		
		byte b5 = (byte)(b1 + 2); // explizites Casting nötig
		System.out.println("b5 = " + b5);
		
	}

}
