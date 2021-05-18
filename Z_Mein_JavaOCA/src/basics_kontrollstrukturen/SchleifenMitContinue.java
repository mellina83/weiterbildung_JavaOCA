package basics_kontrollstrukturen;

/*
 * continue: 
 * 		aktuellen Schleifendurchlauf beenden und mit dem nächsten Durchlauf anfangen
 * 
 * 
 */
public class SchleifenMitContinue {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			if(i%2==0) {
				continue; // aktuellen Durchlauf beenden, zu dem Inkrementieren übergehen
			}
				
			System.out.println("a." + i);
		}
		
		System.out.println("-------------");
		
		int i = 5;
		
		while(--i > 0) {
			if(i==1) {
				continue; // aktuellen Durchlauf beenden, mit dem Auswerten des Ausführungskriterium vor dem nächsten Durchlauf weitermachen
			}
			
			System.out.println("b." + i);
		}
		
		System.out.println("-------------");
		
		/*
		 * Achtung! Steuerungsbereich der do-while kann mit 
		 * continue nicht übersprungen werden
		 */
		
		int var = 3;
		do {
			
			if(var==2) {
				continue; // den Rest des Schleifenrupfes überspringen,
						  // mit dem Auswerten des Ausführungskriteriums vor 
						  // dem nächsten Durchlauf weitermachen
			}
			
			System.out.println("c." + var);
			
		} while( --var > 0 ); // <- der Vergleich wird mit continue nicht übersprungen
		
		
	} // end of main

}
