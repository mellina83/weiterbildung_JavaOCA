package klassen;

/*
 * Aufgabe: Tiere simulieren
 * 
 * - Jedes Tier soll einen Namen haben
 * - Jedes Tier hat sein Alter
 * 
 * Erzeugen Sie bitte zwei Tiere in der Main Methode.
 * 
 * Geben Sie mit einer Methode 'printTier' beide Tiere aus.
 * Die Methode soll den Namen und das Alter ausgeben.
 */

class Tier {
	String name;
	int alter;
}

public class kleineAufgabeKlassen {
	
	public static void main(String[] args) {
		
		Tier papagei = new Tier();
		papagei.name = "Lori";
		papagei.alter = 87;
		
		Tier hund = new Tier();
		hund.name = "Bello";
		hund.alter = 9;
		
		printTier(papagei);
		printTier(hund);
		printTier(papagei.name, papagei.alter);
		

	} // Ende Main
	
	static void printTier(Tier x) {
		System.out.println("Name: " + x.name + ", Alter: " + x.alter);
		
	} // Ende printTier (1 Parameter)
	
	static void printTier(String tierName, int alter) {
		System.out.println("Name: " + tierName + ". Alter: " + alter);
	} // Ende printTier (2 Parameter)
	
	
}
