package kontrollstrukturen;

public class aufgabenKontrollstrukturenFor {

	public static void main(String[] args) {
		
		//Aufgabe 1: Folgende Zahlenreihe mit der for-Schleife in einer Zeile ausgeben: 0 1 2 3 4 5 6 7 8 9
		System.out.println("Aufgabe 1:");	
		for (int i = 0; i<10; i++) {
			System.out.print(i+" ");
		}
			
		//Aufgabe 2: Folgende Zahlenreihe mit der for-Schleife in einer Zeile ausgeben: 0 2 3 4 5 6 7 8 9
		System.out.println("\n\nAufgabe 2:");		
		for (int i = 0; i<10; i++) {
			if (i == 1) {
				i++;
			}
			System.out.print(i+" ");
		}
		// Alternativ
		System.out.println("\n\nAufgabe 2b:");		
		for (int i = 0; i<10; i++) {
			if (i != 1) {
			System.out.print(i+" ");
			}
		}

		//Aufgabe 3: Folgende Zahlenreihe mit der for-Schleife in einer Zeile ausgeben: -4 -2 0 2 4 ... 50
		System.out.println("\n\nAufgabe 3:");		
		for (int i = -4; i < 51; i +=2) {
			System.out.print(i+" ");
		}
		
		//Aufgabe 3b ABERNICHTMEINE
		System.out.println("\n\nAufgabe 3b:");		
		for (int i = -4; i < 51; i ++) {
			if (i%2==0) {
				System.out.print(i+" ");
			}
		}
		
		//Aufgabe 4: Bitte die englischen Kleinbuchstaben von a bis z in einer Zeile ausgeben: a b c ... z
		System.out.println("\n\nAufgabe 4: Meine Lösung, etwas zu umständlich");			
		for (int i = 97; i < 123; i++) {
			char j = (char) i;
			System.out.print(j + " ");
		}
		
		//Aufgabe 4b
		System.out.println("\n\nAufgabe 4b:");			
		for (char ch = 'a' ; ch <= 'z'; ch++) {
			System.out.print(ch + " ");
		}
		
		//Aufgabe 4b
		System.out.println("\n\nAufgabe 4c:");			
		for (int i = 'a'; i <= 'z'; i++) {
			System.out.print((char)i + " ");
		}
		
		//Aufgabe 5: Bitte die englischen Grossbuchstaben rueckwaerts in einer Zeile ausgeben: Z Y X ... A 90-65
		System.out.println("\n\nAufgabe 5: Lösung des Dozenten");			
		for(char ch='Z'; ch>='A'; ch--) {
			System.out.print(ch + " ");
		}
		
		//Aufgabe 6: Bitte die Zahlen aus dem Bereich [1 ... 100] ausgeben, die durch 5 ohne Rest dividierbar sind
		System.out.println("\n\nAufgabe 6:");
		for (int i = 1; i < 101; i++) {
			//for (int j = 1; j%5 = 0; i++)
			if (i % 5 == 0) {
				System.out.print(i + " ");
			}
			
		}
		
		//Optional: Folgende Zahlenreihe bitte in einer Zeile ausgeben: 3 1 2 3 2 1 2 1 1
		System.out.println("\n\nZusatzaufgabe:");
		for(int i=3; i>=1;i--) {
			System.out.print(i + " ");
			
			//i=3, j=1, 2, 3
			//i=2, j=1, 2
			//i=1, j=1
			for (int j=1; j<=i;j++) {
				System.out.print(j+ "_");
			}
		}
		
	}

}
