package basics_aufgaben;

public class KleineAufgabeOperatoren {

	public static void main(String[] args) {

		int anzahlFlaschen = 13;
		
		int anzahlFlaschenProKiste = 6; // Kapazität der Kiste
		
		/*
		 * Es gibt eine virtuelle Kiste.
		 * 
		 * A1. 
		 *   Packen Sie Flaschen in die Kiste (virtuell).
		 *   - Geben Sie bitte aus dass die Kiste gefüllt wurde.
		 *   - Bitte die Anzahl der übriggebliebenen Flaschen ausgeben.
		 *   
		 */
		
		anzahlFlaschen -= anzahlFlaschenProKiste;
		System.out.println("Kiste gefüllt");
		
		System.out.println("Übrig geblieben: " + anzahlFlaschen);
		
	}

}
