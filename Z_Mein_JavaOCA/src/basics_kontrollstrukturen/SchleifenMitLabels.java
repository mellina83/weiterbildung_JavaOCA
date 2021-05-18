package basics_kontrollstrukturen;

/*
 * - label für eine Schleife ist der Name der Schleife
 * 
 * - label ist nur in seinem Block gültig
 * 
 * - label ist KEINE Sprungmarke!!!
 */
public class SchleifenMitLabels {

	public static void main(String[] args) {

		tom:
		for(int i=0; i<3; i++) {
			
			for(int j=0; j<3; j++) {
				if(j==1 && i==1) {
					break tom; // Schleife mit dem Label 'tom' beenden
				}
				System.out.print(j + " ");
			}
			System.out.println();
			
			System.out.println("i = " + i);
		}
		
//		while(true) {
//			break tom; // Compilerfehler: label tom ist nicht bekannt
//		}
	
		System.out.println();
		System.out.println("---- Test continue 1 ---------");
	
		int var = 0;
		
		tom:
		while(var++ < 2) {
			
			jerry:
			for(int i=0; i<2; i++) {
				if(i==1) {
					System.out.println();
					continue tom; // Mit dem aktuellen Durchlauf von 'tom' aufhören.
								  // Dafür muss 'jerry'-Schleife sofort beendet werden.
								  // Weiter geht es mit dem Ausführungskriterium der Schleife 'tom'...
				}
				System.out.print("jerry ");
			}
		
			System.out.println("tom");
		}
		
		System.out.println("---- Test continue 2 ---------");
		
		var = 0;
		
		tom:
		while(var++ < 2) {
			
			jerry:
			for(int i=0; i<2; i++) {
				if(i==1) {
					System.out.println();
					continue jerry; // Mit dem aktuellen Durchlauf von 'jerry' aufhören.
								    // Weiter geht es mit dem Inkremetierungsbereich der Schleife 'jerry'...
				}
				System.out.print("jerry ");
			}
		
			System.out.println("tom");
		}
		
		/*
		 * Unwahrscheinlich in der Prüfung:
		 * 
		 */
		tom:
		System.out.println("hallo"); // <- Block mit dem Label 'tom'
		for (int i = 0; i < 22; i++) {
//			break tom; // Compiilerfehler. Die Schleife hat kein Label
		}
		
	} // end of main

}
