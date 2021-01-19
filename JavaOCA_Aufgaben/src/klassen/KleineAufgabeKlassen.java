package klassen;

/*
 * 	/*
	 * Aufgabe: Tiere simulieren
	 * 
	 * 		- Jedes Tier soll einen Namen haben
	 * 		- Jedes Tier hat sein Alter
	 * 
	 * Erzeugen Sie bitte zwei Tiere in der main-Methode.
	 * 
	 * Geben Sie mit einer Methode 'printTier' beide Tiere aus.
	 * Die Methode soll den Namen und das Alter ausgeben.
	 * 
	 * Edit von mir:
	 * - Einmal Methode mit übergabe von Klassentyp Tier (Datentyp Tier)
	 * - Einmal Methode mit expliziten Attributen bzw passenden Datentypen zu Klasse Tier
	 */
class Tier {
	String name;
	int alter;
}

public class KleineAufgabeKlassen {

	public static void main(String[] args) {
		
		//Erzeugen von Tieren:
		
		Tier papagei = new Tier();
		papagei.name = "Blacky";
		papagei.alter = 87;
		
		Tier hund = new Tier();
		hund.name = "Bello";
		hund.alter = 7;
		
		Tier katze = new Tier();
		katze.name = "Catwoman";
		katze.alter = 15;
		
		//Einfache direkte Ausgabe ohne Methoden:
		System.out.println("Einfache direkte Ausgabe der Daten (Name + Alter) ohne Methoden:");
		System.out.println("Das Tier mit Name " + papagei.name + " ist " + papagei.alter + " Jahre alt.");
		System.out.println("Das Tier mit Name " + hund.name + " ist " + hund.alter + " Jahre alt.");
		System.out.println("Das Tier mit Name " + katze.name + " ist " + katze.alter + " Jahre alt.");
			
		//Ausgabe mit Methode 1:
		System.out.println("\nAusgabe mit Methode - nur Klasse als Typ/Parameter");
		printTier(papagei);
		printTier(hund);
		printTier(katze);
		
		//Ausgabe mit Methode 2:
		System.out.println("\nAusgabe mit Methode - Angabe aller gewünschten Attribute als Parammeter");
		printTier(papagei.name, papagei.alter);
		printTier(hund.name, hund.alter);
		printTier(katze.name, katze.alter);
		

	} // Ende Main
	
	static void printTier(Tier parameterTier) {
		System.out.println("Das Tier mit Name " + parameterTier.name + " ist " + parameterTier.alter + " Jahre alt.");
	}
	
	static void printTier(String tiername, int tieralter) {
		System.out.println("Das Tier mit Name " + tiername + " ist " + tieralter + " Jahre alt.");
	}

}