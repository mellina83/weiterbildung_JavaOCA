package classes_vererbung;

/*
 * Basistypvariable kann Objekte von abgeleiteten Typen referenzieren.
 * 
 * Durch das Programmieren auf die Basistypvariable können
 * universelle Komponenten realsiert werden.
 * 
 * Zuweisung kompiliert, wenn zwischen der Typen der Operanden
 * von rechts nach links gelesen die IS-A-Beziehung existiert
 */

class Tier {
	int alter;
	
	void laufen() { System.out.println("laufen"); }
}
class Katze extends Tier {
	
}
class Hund extends Tier {
	void bellen() { System.out.println("bellen"); }
}


public class B06_Zuweisung {

	public static void main(String[] args) {

		Tier t1 = new Tier(); 	// Tier <= IS-A <= Tier   
		
		t1 = new Hund();		// Tier <= IS-A <= Hund
		t1 = new Katze();
		
//		Katze k1 = t1;			// Katze <= IST-KEINE <= Tier	: Compilerfehler
		
//		Katze k2 = new Hund();	// Katze <= IST-KEINE <= Hund	: Compilerfehler
		
		printTier(t1); // Tier tier = t1
		printTier(new Hund()); // Tier tier = new Hund()
		printTier(new Hund()); // Tier tier = new Katze()
	}
	
	/*
	 * 'Universelle' Komponente (Methode), die beliebige Tiere akzeptiert:
	 * 
	 */
	static void printTier(Tier tier) {
		System.out.println("Tier: " + tier + ", Alter: " + tier.alter);
		tier.laufen();
		// tier.bellen();
	}

}
