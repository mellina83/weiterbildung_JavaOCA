package basics_kontrollstrukturen;

/*
 * break in Schleifen: beendet die umschliessende Schleife
 */
public class SchleifenMitBreak {

	public static void main(String[] args) {

		for(int i=0; i<5; i++) {
			System.out.println("a." + i);
			
			if(i==2) {
				break; // Schleife beenden, Steuerung an die Stelle 
					   // nach der Schleife übergeben
			}
			
			//...
		}
		
		// Hier geht es nach dem break weiter
		System.out.println("end of main");
		
	}

}
