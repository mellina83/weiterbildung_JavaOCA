package basics_kontrollstrukturen;

public class ForSchleife {

	public static void main(String[] args) {
		
//		System.out.println( "1. Kiste füllen" );
//		System.out.println( "2. Kiste füllen" );
//		System.out.println( "3. Kiste füllen" );
//		System.out.println( "4. Kiste füllen" );
//		System.out.println( "5. Kiste füllen" );

		/*
		 * 1. Initialisierungsbereich auswerten.
		 * 
		 * 2. Ausführungskriterium auswerten.
		 * 		- bei false wird die Schleife beendet.
		 * 		- beu true gibt es den 1. Schleifendurchlauf 
		 * 
		 * Wenn es den 1. Schleifendurchlauf gibt, danach:
		 * 
		 * 3. Inkrementierungsbereich auswerten
		 * 4. Ausführungskriterium auswerten.
		 * 		- bei false wird die Schleife beendet.
		 * 		- beu true gibt es den nächsten Schleifendurchlauf 
		 * 
		 */
		for (int i=1; i<=5 ; i++) {
			System.out.println( i + ". Kiste füllen" );
		}
		
//		for (int i=1; i++; i<=5) { // Compilerfehler (Ausführungskriterium muss boolean ergeben)
//			System.out.println( i + ". Kiste füllen" );
//		}
		
		System.out.println("-------------");
		
		for (int i=0; i++<5; )
			System.out.println( i + ". Kiste füllen" );
		
		
	}

}
