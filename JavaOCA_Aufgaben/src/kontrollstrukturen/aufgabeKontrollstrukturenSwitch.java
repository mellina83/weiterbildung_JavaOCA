package kontrollstrukturen;

public class aufgabeKontrollstrukturenSwitch {

	public static void main(String[] args) {

		/*
		# Aufgabe 'switch'

		Vorausgesetzt ist eine Variable `ch`, die den Wert eines __kleinen englischen Buchstaben__ hat.
		 
		## A1. 
		Bitte untersuchen Sie die Variable mit einer switch-Anweisung.
		Wenn die Variable einen Konsonanten ergibt, geben Sie bitte "das ist ein Konsonat" aus.
		Wenn die Variable einen Vokal ergibt, geben Sie bitte "das ist ein Vokal" aus.
		__Setzen Sie für die Lösung voraus, dass keine anderen Werte (z.B. Umlaute) für die Variable möglich sind__.

		## A2. 
		Testen Sie bitte Ihre switch-Anweisung mit unterschiedlichen Werten für die Variable `ch`.

		## A3. Optional. 
		Gestalten Sie die Lösung so, dass die Analyse mit der switch-Anweisung bedingt durchgeführt wird:
		falls 'ch' kein englischer Kleinbuchstabe ist, soll eine entsprechende Ausgabe "kein englischer Kleinbuchstabe" erzeugt werden und die switch-Anweisung übersprungen werden.

		## A4. Optional.
		Erzeugen Sie eine Lösung, die die deutschen Buchstaben (Klein- und Großbuchstaben inklusive Umlaute und ß) erkennt.
		Setzen Sie die Kontrollstrukturen nach Ihrer Wahl ein.
		 */
		
		//Aufgabe 1 und 2
		System.out.println("Aufgabe 1 und 2");
		char ch = 'A';
		
		if (ch >= 'a' && ch < 'z') {
		
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println(ch + " ist ein Vokal");
				break;	
		
			default:
				System.out.println(ch + " ist ein Konsonant");
				break;
			}
		} else {
			System.out.println(ch + " ist eine ungültige Eingabe");
		}
		
		//for (char ch = 'A'; ch <='z'; ch++) voranschalten, um für alle Buchstaben die Beschreibung anzeigen zu lassen
		//aber: schlecht lesbar.
		//Besser mit Methode:
		//for (char ch = 'A'; ch <='z'; ch++) {
		//	checkIsCharVokalOrKonsonantAndPrintResult(ch);
		
		//Aufgabe 3
		System.out.println("\n\nAufgabe 3");
		
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println("Kein englischer Kleinbuchstabe");
		} else if (ch >= 'a' && ch < 'z') {
		
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println(ch + " ist ein Vokal");
				break;	
		
			default:
				System.out.println(ch + " ist ein Konsonant");
				break;
			}
		} else {
			System.out.println(ch + " ist eine ungültige Eingabe");
		}
		
		//Aufgabe 4
		System.out.println("\n\nAufgabe 4");
		
		if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <='Z' || ch == 'ö' || ch == 'Ö' || ch== 'ä' || ch== 'Ä' || ch== 'ü' || ch== 'Ü') {
			
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println(ch + " ist ein Vokal");
				break;
			case 'ö':
			case 'Ö':
			case 'ü':
			case 'Ü':
			case 'ä':
			case 'Ä':
			case 'ß':
				System.out.println(ch + " ist ein Umlaut oder ß");
		
			default:
				System.out.println(ch + " ist ein Konsonant");
				break;
			}
		} else {
			System.out.println(ch + " ist kein Buchstabe");
		}
		
		
		
	} // Ende Main

}
