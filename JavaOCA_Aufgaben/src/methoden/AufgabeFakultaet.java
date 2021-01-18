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
		//int erg = getFakultaetRekursiv(3); // erg = 6
		
		//A2 Aufruf der Funktion
		int ergebnis = getFakultaetRekursiv(3); // erg = 6
		System.out.print("Die Fakultät lautet: " + ergebnis);
		

	} // Ende Main
	
	// Aufgabe 1 Methodendeklaration Rekursiv
	static int getFakultaetRekursiv(int n) {
		if (n <= 0) {
			return 1;
		}
	
		int fac = getFakultaetRekursiv(n-1);
		int produkt = n * fac;
		
		return produkt;
	}
	
	
	// Aufgabe 2 Methodendeklaration ohne Rekursiv

	
	

} // Ende Hauptklasse
