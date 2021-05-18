package classes_classes;

/*
 * Diese Klasse ist eine Schablone (Bauplan) für Autos
 * 
 * Mit einer Klasse beschreibt man also simulierte Objekte mit Eigenschaften (Attributen).
 * Beim Erstellen eines neuen Objektes mit new entsteht die Gruppe der Attribute, 
 * die zusammengehören.
 * 
 *  Eine Referenz ist der Java-Name für eine Java-Objekt
 */
class Auto {

	String farbe; // Attribut oder Feld oder Instanzvariable
	int x;
	int y;
}

public class B01_AutosMitKlassen {

	/*
	 * Aufgabe: Autos simulieren.
	 * 
	 * 	- Jedes Auto hat eine Farbe
	 *  - Jedes Auto hat Koordinaten x und y
	 *  - Jedes Auto lässt seine Koordinaten ändern
	 *  
	 *  - Jedes Auto kann auf der Console präsentiert werden
	 *  
	 */
	public static void main(String[] args) {

		/*
		 * 1. Auto entsteht
		 * 
		 * a1 ist eine Referenz.
		 */
		Auto a1 = new Auto();
		a1.farbe = "blau";
		
		int x = a1.x; // Attribut x des Autos a1 lesen (und in die lokale Variable x kopieren)
		
		/*
			Geht auch, aber die überladene Methode printAuto(Auto) ist bequemer als:
			
			printAuto(a1.farbe, x, a1.y);
		*/
		
		printAuto(a1); // überladene Methode braucht nur 1 Argument
		
		/*
		 * Auto a1 bewegen
		 */
		a1.x = 5;
		a1.y = 3;
		
		printAuto(a1);
		
		/*
		 * 2. Auto entsteht
		 */
		Auto a2 = new Auto();
		a2.farbe = "rot";
		
		printAuto(a2); // x = 0, y = 0
		
		fahrenAuto(a2, 7, -3);
		
		printAuto(a2); // x = 7, y = -3
		
	} // end of main
	
	static void fahrenAuto(Auto auto, int deltaX, int deltaY) {
		auto.x += deltaX;
		auto.y += deltaY;
	}
	
	static void printAuto(Auto auto) {
		System.out.println("Auto. Farbe: " + auto.farbe + ". Koordinaten: " + 
					auto.x + ", " + auto.y);
	}
	
	static void printAuto(String farbe, int x, int y) {
		System.out.println("Auto. Farbe: " + farbe + ". Koordinaten: " + x + ", " + y);
	}
	
}
