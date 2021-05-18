package classes_vererbung;

class Person {

}

class Dozent extends Person {
	int gehalt = 12_000;
}

class Teilnehmer extends Person {
}

public class B07_Casting_und_instanceof {

	public static void main(String[] args) {

		Person p1 = new Dozent();

		/*
		 * Compilerfehler: Der Compiler merkt sich nur den Typ der Variable p1 und nicht
		 * ihren Wert (er merkt sich nicht, auf welches Objekt die p1 zeigt)
		 */
		// System.out.println( p1.gehalt );

		// Dozent d1 = p1; // Dozent <= IST-KEIN <= Person

		/*
		 * Casting zur Compilerzeit: der Compiler soll die Stelle mit Casting als eine
		 * Variable vom Typ Dozent betrachten.
		 */
		/*
		 * Casting zur Laufzeit:
		 * 
		 * if(! (p1 instanceof Dozent) ) { 
		 *    throw new ClassCastException(...); 
		 * }
		 */
		Dozent d1 = (Dozent) p1; // Dozent <= IS-A <= Dozent
		System.out.println(d1.gehalt);

		if (p1 instanceof Dozent) {
			System.out.println("1. p1 zeigt auf ein Dozent-Objekt");
		}

		p1 = new Teilnehmer();

		if (p1 instanceof Dozent) {
			System.out.println("2. p1 zeigt auf ein Dozent-Objekt");
		} else {
			System.out.println("2. p1 zeigt NICHT auf ein Dozent-Objekt");
		}
		
		Dozent d2 = (Dozent) p1; // ClassCastException 
	}

}
