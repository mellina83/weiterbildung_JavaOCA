package klassen;

/*
 * ##### A1
- Simulieren Sie Objekte vom Typ `Land`. 
- Jedes Land hat einen Namen und die Einwohnerzahl.
- Erzeugen Sie das Land 'Brasilien' mit 211 Mio. Einwohner
- Erzeugen Sie das Land 'Deutschland' mit 83 Mio. Einwohner
- Entwickeln Sie eine Methode `print`, die die Landinfos auf der Konsole präsentiert.
*/

class Land {
	String name;
	int einwohnerzahl;
}

/*
##### A2
- Simulieren Sie Objekte vom Typ `Planet`. 
- Jeder Planet hat einen Namen und die Entfernung zur Sonne.
- Erzeugen Sie den Planeten 'Erde' mit der Entfernung zur Sonne 147 Mio. Km.
- Erzeugen Sie den Planeten 'Neptun' mit der Entfernung zur Sonne 4500 Mio. Km.
- Entwickeln Sie eine Methode `print`, die Planeteninfos auf der Konsole präsentiert.
- Entwickeln Sie eine Methode `bewegen`, die für einen Planeten die Entfernung zur Sonne ändert. Die gewünschte Änderung (in Km) wird an die neue Metzhode als Argument übergeben.
 */

class Planet {
	String name;
	long entfernungZurSonne;
}


public class AufgabeKlassenEinfach {

	public static void main(String[] args) {
		
		//Main A1:
		System.out.println("Aufgabe1:");
		
		// Erzeugung Länder
		Land land1 = new Land();
		land1.name = "Brasilien";
		land1.einwohnerzahl = 211_000_000;
		
		Land land2 = new Land();
		land2.name = "Deutschland";
		land2.einwohnerzahl = 83_000_000;
		
		// Aufruf von Methoden
		print(land1);
		print(land2);
		
		
		//Main A2:
		System.out.println("\nAufgabe2:");
		
		// Erzeugung Planeten
		Planet planet1 = new Planet();
		planet1.name = "Erde";
		planet1.entfernungZurSonne = 147_000_000;
		
		Planet planet2 = new Planet();
		planet2.name = "Neptun";
		planet2.entfernungZurSonne = 4_500_000_000L;
		
		// Aufruf von Methoden
		print(planet1);
		print(planet2);
		bewegen(planet1, 158_000_000);
		bewegen(planet2, 3_574_789_000L);
		

	} // Ende Main

	//Methoden A1:
	static void print(Land x) {
		System.out.println("Name des Landes: " + x.name + ". Einwohnerzahl: " + x.einwohnerzahl);
	}
	
	//Methoden A2:
	static void print(Planet x) { //Überladen
		System.out.println("Name des Planeten: " + x.name + ". Entfernung zur Sonne: " + x.entfernungZurSonne + " km.");
	}
	
	static void bewegen(Planet x, long neueEntfernung) {
		x.entfernungZurSonne = neueEntfernung;
		System.out.println("Der Planet " + x.name + " hat sich bewegt. Es ist nun " + x.entfernungZurSonne + " km von der Sonne entfernt.");
		
	}

}
