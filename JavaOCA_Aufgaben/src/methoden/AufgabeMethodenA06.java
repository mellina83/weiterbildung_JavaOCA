package methoden;

import java.util.Random;

/* A6
 * Definieren Sie eine statische Methode "printRandom", die die N int-Zufallszahlen aus einem Zahlenbereich [VON...BIS] generiert und auf der Konsole ausgibt.
 * Die Anzahl der Zahlen und die Unter- und Obergrenze des Zahlenbereiches sollen beim Aufruf der Methode als Argumente übergeben werden.

	Z.B.: `printRandom(5, 10, 20)` gibt 5 int-Zufallswerte aus dem Bereich [10 ... 20] aus.

**Tipp:** zum Generieren einer Zufallszahl kann man die Methode `random` der Klasse `java.lang.Math` ODER die Methode `nextInt(int)` der Klasse `java.util.Random` einsetzen
 */

public class AufgabeMethodenA06 {
	
	/**
	 * Generiert und gibt Zufallswerte aus
	 * 
	 * @param anzahl Anzahl der Zufallswerte
	 * @param untergrenze kleinstmöglicher Wert
	 * @param obergrenze anders als üblich wird die Obergrenze inklusive betrachtet
	 */
	
	static void printRandom(int anzahl, int untergrenze, int obergrenze) {
		Random random = new Random();
		
		for (int i = 0; i < anzahl; i++) {
			int anzahlWerte = obergrenze - untergrenze + 1;
			int zufallszahl = random.nextInt(anzahlWerte) + untergrenze;
			System.out.print(zufallszahl + " ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		printRandom(5, 2, 9);
		printRandom(7, -4, 9);

	} // End Main

}
