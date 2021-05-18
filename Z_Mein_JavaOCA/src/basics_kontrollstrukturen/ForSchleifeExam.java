package basics_kontrollstrukturen;

/*
 * Die Beispiele hier haben keinen Sinn in der Praxis. 
 * Hier wird nur überprüft, was kompiliert.
 */
public class ForSchleifeExam {

	public static void main(String[] args) {

		/*
		 *
		 * Endlose Schleife:
		 * 
		 */
		
//		for(; ;) {
//			System.out.println("laufe...");
//		}
		
		
		/*
		 * Jeder Steuerungsbereich der for-Schleife darf leer bleiben
		 */
		boolean laufen = false;
		
		for(int i; laufen; ) {
			//...
		}
		
		for(;laufen; laufen=false) {
			// ...
		}
		
		/*
		 * Mehrere Schleifenvariablen vom SELBEN Typ sind möglich 
		 */
		for(int i, j=1, k, m=-3, n; laufen;) {
			
		}
		
		
		/*
		 * In der Schleife darf man natürlich die gültigen Variablen verwenden
		 * 
		 *  Ausgaben: 0 1 2
		 */
		int x=3, y, z=0; 
		
		for(y=7; z<3 ; x--) {
			System.out.print(z++ + " ");
		}
		System.out.println();
		
		
		/*
		 * Im Inkrementierungsbereich dürfen mehrere Ausdrücke stehen
		 * 
		 * Ausgaben:
		 * 
		 * 1 3
		 * 2 2
		 * 3 1
		 */
		System.out.println("---------");
		
		for(int i=1, j=3 ; i<4 ; i++, j-- ) {
			System.out.println(i + " " + j);
		}
		
		
	} // end of main

}
