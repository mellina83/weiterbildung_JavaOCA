package basics_aufgaben;

import java.util.Random;

public class AufgabeMethoden {

	public static void main(String[] args) {

		System.out.println("*** A1");
		printFromTo(5, 8);
		printFromTo(22, -5);
		
		System.out.println("*** A2");
		long result = sum(2, 3);
		System.out.println("2 + 3 = " + result);
		
		result = sum(2, -33);
		System.out.println("2 - 33 = " + result);
		
		result = sum(-2, -33);
		System.out.println("-2 - 33 = " + result);
		
		result = sum(1, Integer.MAX_VALUE);
		System.out.println("1 + " + Integer.MAX_VALUE + " = " + result);
		
		System.out.println("*** A3");
		
		int sum = sumFromTo(1, 5);
		System.out.println("1 + 2 + ... + 5 = " + sum); // Sollwert: 15
		
		sum = sumFromTo(2, 4);
		System.out.println("2 + 3 + 4 = " + sum); // Sollwert: 9
		
		System.out.println("--- A4");
		
		zeichneRechteck(5, 4);

		System.out.println("--- A5");
		
		System.out.println("-- fuelen = false: ");
		zeichneRechteck(5, 4, false);

		System.out.println("-- fuelen = true: ");
		zeichneRechteck(5, 4, true);
		
		
		System.out.println("--- A6");
		
		System.out.println("-- [6 ... 10]: ");
		printRandom(5, 6, 10); // 5 int-Zufallswerte aus dem Bereich [6 ... 10]
		
		System.out.println("-- [10 ... 20]: ");
		printRandom(5, 10, 20); // 5 int-Zufallswerte aus dem Bereich [10 ... 20]

		System.out.println("-- [-5 ... 5]: ");
		printRandom(5, -5, 5); 

		// printRandom(5, 5, -5); //  Laufzeitfehler
		
	} // end of main
	
	/**
	 * Generiert und gibt Zufallswerte aus
	 * 
	 * @param numberOfValues Anzahl der Zufallswerte
	 * @param min kleinstmöglicher Wert
	 * @param max anders als üblich wird die Obergrenze inklusive betrachtet
	 */
	static void printRandom(int numberOfValues, int min, int max) {
		Random random = new Random();
		
		for (int i = 0; i < numberOfValues; i++) {
			
			// min = 6, max = 10
			// 5 erwünschte Werte: 6, 7, 8, 9, 10

			int anzahlWerte = max - min + 1;
			// random.nextInt(anzahlWerte) liefert mögliche Werte: 0, 1, 2, 3, 4
			// Bereich verschieben: 0+min, 1+min, 2+min, 3+min, 4+min
			int zahl = random.nextInt(anzahlWerte) + min;
			System.out.println(zahl);
		}
	}
	
	// Signatur: zeichneRechteck(int, int, boolean)
	static void zeichneRechteck(int breite, int hoehe, boolean fuellen) {
		
		char fillChar = fuellen ? '*' : ' ';
		
		for(int zeile=0; zeile<hoehe; zeile++) {
			for(int spalte=0; spalte<breite; spalte++) {
				if(zeile==0 || zeile==hoehe-1 || spalte==0 || spalte==breite-1)
					System.out.print('*');
				else
					System.out.print(fillChar);
			}
			System.out.println();
		} 
	}
	
	// Signatur: zeichneRechteck(int, int)
	static void zeichneRechteck(int breite, int hoehe) {
		for(int zeile=0; zeile<hoehe; zeile++) {
			for(int spalte=0; spalte<breite; spalte++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	static int sumFromTo(int from, int to) {
		int summe = 0;
		
		for(int i = from; i<=to ;i++) {
			summe += i;
		}
		
		return summe;
	}
	
	// Beispiel davon, wie bei der Entwicklung 'Korrektheit' berücksichtigt werden kann 
	static long sum(int x, int y) {
		return (long)x + y;
	}
	
	// Beispiel davon, dass man bei der Entwicklung auch Sonderfälle 
	// entdecken und berücksichtigen wird.
	/**
	 * Gibt die Zahlen von 'from' bis 'to' in einer Zeile aus.
	 * Wenn 'from' größer als 'to' ist, werden die Zahlen absteigend ausgegeben.
	 */
	static void printFromTo(int from, int to) {
		if(from>to) {
			for (int i = from; i >= to; i--) {
				System.out.print(i + " ");
			}
		} else {
			for(int i=from; i<=to ; i++) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	
}
