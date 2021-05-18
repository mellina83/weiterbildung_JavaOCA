package zz_basicsVonHensel;

public class Day01_02Variablen_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte alter;
		//byte ist sehr kleine Ganzzahl von -128 bis 127
		//Initialisierung (Wertzuweisung)
		alter = 42;
		//Ausgabe der Variablen
		System.out.println(alter);
		//Deklaration und Initialisierung in einer Anweisung
		//short ist eine kleine Ganzzahl zwischen -32.768 und 32.767
		//aber in Praxis wird direkt int f�r Ganzzahlen genommen -2.4 Mia und 2.4
		short gewicht = 130;
		System.out.println(gewicht);
		gewicht = 77;
		System.out.println(gewicht);
		int postleitzahl = 47058;
		System.out.println(postleitzahl);
		// long ist der gr��te ganzzahlige Datentyp
		// das Literal (fester Wert) 8123456789 ist zu gro� f�r einen Int; L�sung: Umwandlung in einen long
		// also falsch: long bevoelkerungDerErde = 8123456789; korrekt folgt:
		long bevoelkerungDerErde = 8123456789L;
		System.out.println(bevoelkerungDerErde);
		
		//(Flie�-) Kommazahlen
		//float 4 Byte, Genauigkeit von 7 Nachkommastellen (auch "Single" genannt)
		float piAsFloat = 3.14f;
		//double 8 Byte, Genauigkeit von 15 Nachkommastellen = "Doppelte Genauigkeit"
		//In der Praxis verwendet man mittlerweile nur double
		double piAsDouble = 3.14;
		double verbrauch100 = 6.4;
		System.out.println(piAsFloat);
		System.out.println(verbrauch100);
		
		//Wahrheitswerte
		boolean istPremiumKunde = false;
		System.out.println(istPremiumKunde);
		istPremiumKunde = true;
		System.out.println(istPremiumKunde);
		
		//Variable mit einem Zeichen (Ziffer, Buchstabe), 0 bis 65.535, 2 Byte gro�
		//char-Literale mit EINEM Anf�hrungszeichen
		char antwort = 'j';
		char exit = 'X';
		System.out.println(exit);
		
		//Nachtrag vom 23.12.20
		// Konstante: Variable speichern, die nicht ver�ndert werden soll, mit "final"
		final int MWST = 16;
		//--> MWST = 17; Neuinitialisierung /- Wertzuberweisung nicht erlaubt
		
		
		
	}

}
