package classes_vererbung;

/*
 * Wann ist eine Abstrakte Klasse besonders sinnvoll?
 * 
 * - Gemeinsamen Code in der Basisklasse definieren
 * - Auf sinnlose Realisierungen der Methoden verzichten (abstrakte Methoden)
 * 
 * (s. Klasse Figur im package aufgaben.polymorphie.geo)
 * 
 * 
 * Regeln:
 * 
 * 	- Es dürfen keine Objekte von abstrakten Klassen mit 'new' erzeugt werden.
 *  - Eine abstrakte Klasse darf (nicht muss) abstrakte Methoden haben
 *  - Wenn eine Klasse abstrakte Methode hat, MUSS die Klasse abstrakt sein.
 * 
 *  - 'Konkrete' (nicht abstrakte) Klasse muss alle abstrakten Methoden realisieren
 */

abstract class Figur1 {
	
}

// Compilerfehler:
//
//class Figur2 {
//	abstract double getFlaeche();
//}

abstract class Figur3 {
	abstract double getFlaeche();
}


public class B11_abstract_KLassen {

	public static void main(String[] args) {

//		 new Figur1(); // Compilerfehler
		
	}

}
