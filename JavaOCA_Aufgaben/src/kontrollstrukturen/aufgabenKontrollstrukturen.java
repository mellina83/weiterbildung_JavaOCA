package kontrollstrukturen;

public class aufgabenKontrollstrukturen {

	public static void main(String[] args) {

		//A1. Berechnen Sie die Summe aller folgenden Werte: 1, 2, 3 ... 10. Geben Sie die Summe aus.
		System.out.println("Aufgabe1:");
		int i = 0;
		int summe = 0;
		while (i < 10) {
			i++;
			summe = summe + i;
		}
		System.out.println("Summe: " + summe);


		//A2. Gegeben ist: x = 3, y = 4. Berechnen Sie bitte x hoch y und geben Sie das Ergebnis aus.
  		// Benutzen Sie für die Lösung die for-Schleife.
		System.out.println("\n\nAufgabe2:");	
		
		for (int x = 3, y = 0; y<3; x = x * x ) {
			++y;
			System.out.println("3 hoch 4 ist: " + x);
		}


		//A3. Gegeben ist: x = 3, y = 4. Berechnen Sie bitte x hoch y und geben Sie das Ergebnis aus.
		// Benutzen Sie für die Lösung die while-Schleife.
		System.out.println("\n\nAufgabe3:");			
		
		
		//A4. Gegeben ist: x = 3, y = 4. Berechnen Sie bitte x hoch y und geben Sie das Ergebnis aus.
		// Benutzen Sie für die Lösung die Methode ``java.lang.Math.pow``.
		System.out.println("\n\nAufgabe4:");	
		
		int x = 3;
		int y = 4;
		int ergebnis = (int) Math.pow(x, y);
		System.out.println("3 hoch 4 ist: " + ergebnis);
		
		
		
		//A5. Zeichnen Sie ein gefülltes Rechteck auf der Konsole:
		System.out.println("\n\nAufgabe5:");	
		
		//      *****
		//      *****
		//      *****
		//      *****
		
		for (int m = 0; m<4; m++) {
			System.out.println("****");
		}
		
		
		//A6. Zeichnen Sie ein leeres Rechteck auf der Konsole:
		System.out.println("\n\nAufgabe6:");	
		    
		//        *****
		//        *   *
		//        *   *
		//        *****
		
		//A7. Zeichnen Sie folgendes Spielfeld auf der Konsole:
		System.out.println("\n\nAufgabe7:");	
		
		//         12345
		//        A.....
		//        B.....
		//        C.....
		//        D.....
		//        E.....
		
		System.out.print(" ");
		for (int m = 1; m<=5; m++) {
			System.out.print(m);
		}
		
		
		//A8. Als Grundlage ist folgende Schleife zu nehmen:
		
			//	for(int monat = 1; monat<=12; monat++) {
			//	    //mehr Code hier
			//	}
		
		//Programmieren Sie bitte den Körper der Schleife so, dass mit der Schleife folgende Ausgaben erzeugt werden:
		
		//	    Monat 1: 1 2 3 ... 30 31
		//	    Monat 2: 1 2 3 ... 28 (29)
		//	    Monat 3: 1 2 3 ... 30 31
		//	    Monat 4: 1 2 3 ... 30
		//	    Monat 5: 1 2 3 ... 30 31
		//	    ...
		//	    Monat 12: 1 2 3 ... 30 31
		
	
		
		
	} // End Main

}
