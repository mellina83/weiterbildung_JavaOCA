package classes_aufgaben;

public class KleineAufgabeKlassen {

	/*
	 * Aufgabe: Tiere simulieren
	 * 
	 * 		- Jedes Tier soll einen Namen haben
	 * 		- Jedes Tier hat sein Alter
	 * 
	 * Erzeugen Sie bitte zwei Tiere in der main-Methode.
	 * 
	 * Geben Sie mit einer Methode 'printTier' beide Tiere aus.
	 * Die Methode soll den Namen und das Alter ausgeben.
	 */
	public static void main(String[] args) {
		
		Tier katze = new Tier();
		katze.name = "Susi";
		katze.alter = 5;
		
		printTier(katze.name, katze.alter);
		
		printTier(katze);
		
		Tier katze2 = new Tier();
		katze2.name = "Susi-2";
		katze2.alter = 6;

		printTier(katze2);
		printTier(katze);
	}

	static void printTier(Tier tier) {
		System.out.println("Tier: " + tier.name + ". Alter: " + tier.alter);
	}
	
	static void printTier(String tierName, int alter) {
		System.out.println("Tier: " + tierName + ". Alter: " + alter);
	}
	
}
