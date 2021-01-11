package kontrollstrukturen;

public class kleineAufgabenOperatoren {

	public static void main(String[] args) {
		
		int anzahlFlaschen = 13;
		int anzahlFlaschenProKiste = 6;
		
		/*
		 * Es gibt eine virtuelle Kiste.
		 * 
		 * A1.
		 * 	Packen Sie Flaschen in die Kiste (virtuell).
		 * 	- Geben Sie bitte aus, dass die Kiste gefüllt wurde.
		 * 	- Bitte die Anzahl der übrigen Flaschen ausgeben.
		 * 
		 * A2.
		 * 	Mit einer Schleife alle Kisten füllen
		 */
		
		//A1
		boolean kisteVoll = anzahlFlaschen == 13;	
		
		if (kisteVoll == true) {
			System.out.println("Die Kiste ist gefüllt.");
			}
		else {
			System.out.println("Die Kiste ist nicht gefüllt.");
		}
		
		anzahlFlaschen -= anzahlFlaschenProKiste;
		System.out.println("Restanzahl: " + anzahlFlaschen);
		
		
		//A2
		System.out.println("Aufgabe 2 - Die Kisten füllen:");
		anzahlFlaschen = 13; //Zurücksetzen
		int anzahlKisten = 2;
		int gefuellteKisten = anzahlFlaschen / anzahlFlaschenProKiste;
		
		// OFFEN!!!!!

		
	} // Ende Main Methode

}
