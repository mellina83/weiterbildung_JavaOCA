package classes_aufgaben;

class Land {
	String name;
	int einwohnerzahl;
	
} // end of Land-Klasse


public class AufgabeKlassenEinfachA1 {

	/*
		- Simulieren Sie Objekte vom Typ `Land`. 
		- Jedes Land hat einen Namen und die Einwohnerzahl.
		- Erzeugen Sie das Land 'Brasilien' mit 211 Mio. Einwohner
		- Erzeugen Sie das Land 'Deutschland' mit 83 Mio. Einwohner
		- Entwickeln Sie eine Methode `print`, die die Landinfos auf der Konsole präsentiert.
	 */
	public static void main(String[] args) {

		Land brasilien = new Land();
		brasilien.name = "Brasilien";
		brasilien.einwohnerzahl = 211_000_000; 
		
		print(brasilien);
		
		Land deutschland = new Land();
		deutschland.name = "Deutschland";
		deutschland.einwohnerzahl = 83_000_000;
		
		print(deutschland);
	}
	
	static void print(Land land) {
		System.out.println("Land: " + land.name + ", Einwohner: " + land.einwohnerzahl);
	}

}
