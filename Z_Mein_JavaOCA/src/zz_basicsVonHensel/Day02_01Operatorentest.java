package zz_basicsVonHensel;



public class Day02_01Operatorentest {

	public static void main(String[] args) {
		int zahl1 = 42;
		int zahl2 = 8;
		int summe = zahl1 + zahl2;
		int differenz = zahl1 - zahl2;
		int produkt = zahl1 * zahl2;
		int quotient = zahl1 / zahl2;
		int restwert = zahl1 % zahl2;
		System.out.println("Summe =" + summe);
		System.out.println("Differenz =" + differenz);
		System.out.println("Produkt =" + produkt);
		System.out.println("Quotient = " + quotient);
		System.out.println("Restwert =" + restwert);
		// Der Plus Operator kann in Java entweder zur Addition oder zur Verkettung benutzt werden. Entscheidend sind die Operanden.
		System.out.println("Summe = " + zahl1 + zahl2);
		System.out.println("Summe = " + (zahl1 + zahl2));
		
		double quotientDouble = zahl1 / (double) zahl2;
		// Ergibt trotzdem 5 anstatt 5.25: double quotientDouble = zahl1 / zahl2;
		// oder 1.0 * zahl1 + zahl2
		quotientDouble = 1.0 * zahl1 / zahl2;
		System.out.println("QuotientDouble = " + quotientDouble);
		
		byte b1 = 120;
		byte b2 = 10;
		byte summeByte = (byte) (b1 + b2);
		System.out.println("b1 + b2 = " + (b1 + b2));
		System.out.println("b1 + b2 = " + summeByte);
		
		// -> DAHER: BYTE und SHORT VERMEIDEN!!!
		
		//Inkrement-Operatoren
		int zahl3 = 42;
		zahl3 = zahl3 + 1;
		zahl3++; // Inkrement-Operator
		++zahl3;
		System.out.println("zahl3 = " + zahl3);
		int zahl4 = 42;
		
		// Folgende beiden Zeilen bringen Unterschiede
		// Post - inkrement: Erst Operation, dann inkrement
//		System.out.println("zahl4++ = " + zahl4++);
		
		// Pre-inkrement: Erst inkrement, dann Operation
		System.out.println("++zahl4 = " + ++zahl4);
		System.out.println("zahl 4 = " + zahl4);
		
		//
		//
		//
		
		// Potenzoperator gibts nicht in Java, daher a hoch b:
		int a = 2;
		int b = 32;
		int potenz = (int) Math.pow(a, b); // achtung: int ist falsch, aber zu Lehrzwecken weitergenommen
		System.out.println("potenz = " + potenz);
		// --> was falsches, warum? am Ende muss eine 2 rauskommen, daher long nehmen
		// korrekt: int potenz = (long) Math.pow(a, b);
		double potenzDouble = Math.pow(a, b);
		System.out.println("Potenzdouble = " + potenzDouble);
	}

}
