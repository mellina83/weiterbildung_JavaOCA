package kontrollstrukturen;

public class aufgabenKontrollstrukturen {

	public static void main(String[] args) {

		//A1. Berechnen Sie die Summe aller folgenden Werte: 1, 2, 3 ... 10. Geben Sie die Summe aus.
		System.out.println("Aufgabe1:");
		int i = 0, summe = 0;
		while (i < 10) {
			i++;
			summe = summe + i;
		}
		System.out.println("Summe: " + summe);
		
		//Vom Dozenten mit FOR Schleife
		int summezahl = 0;
		for (int zahl = 1; zahl <=10;zahl++) {
			summezahl+= zahl;
		}
		System.out.println("Summe: " + summezahl);


		//A2. Gegeben ist: x = 3, y = 4. Berechnen Sie bitte x hoch y und geben Sie das Ergebnis aus.
  		// Benutzen Sie für die Lösung die for-Schleife.
		System.out.println("\n\nAufgabe2:");	
		
		final int xpo = 3;
		final int ypo = 4;
		int result = 1;
		for (int ipo = 0; ipo < ypo; ipo++ ) {
			result *= xpo;
		}
		System.out.println("3 hoch 4 ist: " + result);

		//A3. Gegeben ist: x = 3, y = 4. Berechnen Sie bitte x hoch y und geben Sie das Ergebnis aus.
		// Benutzen Sie für die Lösung die while-Schleife.
		System.out.println("\n\nAufgabe3:");
		
		int ipo = 1;
		result = xpo;
		while (ipo < ypo) {
			result *= xpo;
			ipo++;
		}
		System.out.println(xpo + " hoch " + ypo + " ist gleich " + result);
		
		
		
		//A4. Gegeben ist: x = 3, y = 4. Berechnen Sie bitte x hoch y und geben Sie das Ergebnis aus.
		// Benutzen Sie für die Lösung die Methode ``java.lang.Math.pow``.
		
		System.out.println("\n\nAufgabe4");	
		
		int x = 3, y = 4;
		double ergebnis = Math.pow(x, y);
		System.out.println("3 hoch 4 ist: " + ergebnis);
		

		
		//A5. Zeichnen Sie ein gefülltes Rechteck auf der Konsole:
		System.out.println("\n\nAufgabe5:");	
		
		//      *****
		//      *****
		//      *****
		//      *****
		
		int zeilen = 4;
		int spalten = 5;
		char buch = '*';
		
		for (int zlokal=0; zlokal < zeilen; zlokal++) {
			for (int s = 0; s<spalten; s++) {
				System.out.print(buch);
				
			}
			System.out.println();
		}
		
		/* Meine Lösung geht auch
		for (int m = 0; m<4; m++) {
			System.out.println("****");
		}
		*/
		
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
