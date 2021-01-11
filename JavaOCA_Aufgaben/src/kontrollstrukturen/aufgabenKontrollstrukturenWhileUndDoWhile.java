package kontrollstrukturen;

public class aufgabenKontrollstrukturenWhileUndDoWhile {

	public static void main(String[] args) {
		
		//Aufgabe 0
		//Gegeben ist x = 100. Dekrementieren Sie x um einen Zufälligen Wert aus dem Bereich [1 .. 5] solange x größer 0 ist. Geben Sie bei jeder Dekrementierung den neuen Wert der x aus.
		//**Tipp:** zum Generieren einer Zufallszahl kann man die Methode `random` der Klasse `java.lang.Math` ODER die Methode `nextInt(int)` der Klasse `java.util.Random` einsetzen:
			//java.util.Random generator = new java.util.Random();
			//int randomValue = generator.nextInt(10); // Zufallswert [ 0..10 )
		System.out.println("\n\nAufgabe 0:");
		

		
		
		
		
		
		//Aufgabe 1: Folgende Zahlenreihe mit der while und do while -Schleife in einer Zeile ausgeben: 0 1 2 3 4 5 6 7 8 9
		System.out.println("\n\nAufgabe 1:");	
		
		int k = 0;
		while (k<=8) {
			k++;
			System.out.print(k + " ");
		}
		System.out.println();
		
		k = 0;
		do {
			k++;
			System.out.print(k + " ");
		} while (k<9);
			
		//Aufgabe 2: Folgende Zahlenreihe mit der while und do while -Schleife in einer Zeile ausgeben: 0 2 3 4 5 6 7 8 9
		System.out.println("\n\nAufgabe 2:");
		
		k = -1;
		while (k <= 8) {
				k++;
			if (k!=1) {
				System.out.print(k + " ");
			}
		}
		System.out.println();
		
		k = -1;
		do {
			k++;
			if (k != 1) {
				System.out.print(k + " ");
			}
		} while (k<9);



		//Aufgabe 3: Folgende Zahlenreihe mit der while und do while -Schleife in einer Zeile ausgeben: -4 -2 0 2 4 ... 50
		System.out.println("\n\nAufgabe 3:");		

		k = -6;
		while (k <50 && k%2==0) {
			k+=2;
			System.out.print(k + " ");
		}
		System.out.println();
		
		k = -6;
		do {
			k+=2;
			System.out.print(k + " ");
		} while (k<50 && k%2==0);
		
		
		
		//Aufgabe 4: Bitte die englischen Kleinbuchstaben von a bis z in einer Zeile ausgeben: a b c ... z
		System.out.println("\n\nAufgabe 4:");			

		char buch = 'a' - 1;
		while (buch <'z') {
			++buch;
			System.out.print(buch + " ");
			}
		
		System.out.println();
		buch = 'a'-1;
		
		do {
			++buch;
			System.out.print(buch + " ");
		} while (buch <'z');
				
				
				
		
		//Aufgabe 5: Bitte die englischen Grossbuchstaben rueckwaerts in einer Zeile ausgeben: Z Y X ... A 90-65
		System.out.println("\n\nAufgabe 5:");			
		buch = 'Z' + 1;
		while (buch >'A') {
			--buch;
			System.out.print(buch + " ");
			}
		
		System.out.println();
		buch = 'Z' + 1;
		
		do {
			--buch;
			System.out.print(buch + " ");
		} while (buch >'A');		
		
		
		//Aufgabe 6: Bitte die Zahlen aus dem Bereich [1 ... 100] ausgeben, die durch 5 ohne Rest dividierbar sind
		System.out.println("\n\nAufgabe 6:");

		k = 0;
		while (k<100) {
			k++;
			if (k%5==0) {
				System.out.print(k + " ");			
			}

		}
		
		System.out.println();
		k = 0;
		do {
			k++;
			if (k%5==0) {
				System.out.print(k + " ");
			}
			
		} while (k<100);
			
			
		//Optional: Folgende Zahlenreihe bitte in einer Zeile ausgeben: 3 1 2 3 2 1 2 1 1
		System.out.println("\n\nZusatzaufgabe:");

		
		//
		//
		

	}

}
