package methoden;

public class AufgabeFakultaet {
	
	/*
	 * 
	 * # Aufgabe 'Methoden - Fakultät'

		> Fakultät: https://de.wikipedia.org/wiki/Fakult%C3%A4t_%28Mathematik%29

		> Hinweis: ignorieren Sie bei der Lösung der Aufgabe den möglichen int-Bereich-Überlauf (bereits bei 13!).
		Überlegen Sie, ob es möglich ist, die Lösung so zu definieren, dass die Methoden immer korrekt sind ohne dabei die Methodendeklarationen zu ändern
		0! = 1				= 1
		1! = 1				= 1
		2! = 1 * 2			= 2
		3! = 1 * 2 * 3 		= 6
		4! = 1 * 2 * 3 * 4	= 24

		### A1.
		Definieren Sie eine statische Methode `getFakultaetRekursiv`, die die Fakultät zu einem int-Wert rekursiv berechnet. Die Methode soll folgendermaßen verwendet werden können:
    
		int erg = getFakultaetRekursiv(3); // erg = 6

		### A2.    
		Definieren Sie eine statische Methode `getFakultaet`, die die Fakultät zu einem int-Wert  (nicht rekursiv) berechnet. Die Methode soll folgendermaßen verwendet werden können:

		int erg = getFakultaet(3); // erg = 6

	 */
	
	public static void main(String[] args) {
		
		
		//A1 Aufruf der Funktion
		int ergebnis = getFakultaetRekursiv(3); // erg = 6
		System.out.print("Die Fakultät lautet: " + ergebnis);
		
		//A2 Aufruf der Funktion Ohne Rekursiv
		int erg = getFakultaet(4); // erg = 6
		System.out.println();
		System.out.print("Die Fakultät lautet: " + erg);
		

	} // Ende Main
	
	// Aufgabe 1 Methodendeklaration Rekursiv
	
	/**
	 * Berechnet Fakultät von n. n darf zwischen 0 bis 9 (inklusive) liegen.
	 * @param n
	 * @return Fakultät von oder -1 wenn keine Berechnung möglich ist (n ist ungültig)
	 */
	static int getFakultaetRekursiv(int n) {
		if (n <= 1) {
			return 1;
		}
		
		return n * getFakultaetRekursiv(n-1);
	}
	
	
	// Aufgabe 2 Methodendeklaration ohne Rekursiv
	static int getFakultaet(int n) {
		int ergebnis = 1;
		for (int i = 1; i <=n; i++) {
			ergebnis = ergebnis * i;
		}
		return ergebnis;
	}
	
	

} // Ende Hauptklasse
