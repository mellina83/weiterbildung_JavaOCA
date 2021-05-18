package classes_classes;

/*
 * Nichtstatische Methoden definieren das Verhalten der Objekte 
 * der Klasse aus der die Methoden kommen
 */


class Fahrzeug {
	// Attribut: Eigenschaft eines Objektes
	String modell;
	
	void fahren(int entfernung) {
		System.out.println(modell + " fährt " + entfernung + " Km.");
	}
	
	// Instanzmethode (Objekt-Methode): das, was ein Objekt machen kann
	void fahren() {
		// Fahrzeug fahrzeug = this;
		
		System.out.println(modell + " fährt!");
	}
	
	// statische Methode zum Vergleich:
	static void fahren(Fahrzeug fahrzeug) {
		System.out.println(fahrzeug.modell + " fährt...");
	}
}


public class B02_Methoden {

	public static void main(String[] args) {
		
		Fahrzeug f1 = new Fahrzeug();
		f1.modell = "Golf";
		
		// Fahrzeug.fahren(); // Compilerfehler: Instanzmethode muss mit einem Objekt aufgerufen werden!
		
		f1.fahren(); // Instanzmethode fahren(): Golf fährt!
		f1.fahren(33); // Instanzmethode fahren(int): Golf fährt 33 Km

		Fahrzeug.fahren(f1); // statische Methode fahren(Fahrzeug): Golf fährt...
		
		Fahrzeug f2 = new Fahrzeug();
		f2.modell = "Polo";
		
		f2.fahren(); // Polo fährt!
		
	}

}
