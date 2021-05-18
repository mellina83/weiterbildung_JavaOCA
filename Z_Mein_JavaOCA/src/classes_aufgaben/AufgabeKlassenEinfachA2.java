package classes_aufgaben;

class Planet {
	
	String name;
	int entfernungZurSonneInMioKm;
	
} // end of Planet

public class AufgabeKlassenEinfachA2 {

	/*
		- Simulieren Sie Objekte vom Typ `Planet`. 
		- Jeder Planet hat einen Namen und die Entfernung zur Sonne.
		- Erzeugen Sie den Planeten 'Erde' mit der Entfernung zur Sonne 147 Mio. Km.
		- Erzeugen Sie den Planeten 'Neptun' mit der Entfernung zur Sonne 4500 Mio. Km.
		- Entwickeln Sie eine Methode `print`, die Planeteninfos auf der Konsole präsentiert.
		- Entwickeln Sie eine Methode `bewegen`, die für einen Planeten die Entfernung
           zur Sonne ändert. Die gewünschte Änderung (in Mio Km) wird an die neue Methode 
           als Argument übergeben. Testen Sie die Methode.
	 */
	public static void main(String[] args) {

		Planet erde = new Planet();
		erde.name = "Erde";
		erde.entfernungZurSonneInMioKm = 147;
		
		print(erde);
		bewegen(erde, 4);
		print(erde);
		
		Planet neptun = new Planet();
		neptun.name = "Neptun";
		neptun.entfernungZurSonneInMioKm = 4500;
		
		print(neptun);
		bewegen(neptun, -22);
		print(neptun);
	} // end of main

	static void print(Planet planet) {
		System.out.println("Planet: " + planet.name + ", Entfernung zur Sonne: " 
					+ planet.entfernungZurSonneInMioKm + " Mio. Km.");
	}
	
	static void bewegen(Planet planet, int deltaMioKm) {
		planet.entfernungZurSonneInMioKm += deltaMioKm;
	}
	
}
