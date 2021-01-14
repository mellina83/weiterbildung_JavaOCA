package methoden;

/* A6
 * Definieren Sie eine statische Methode "printRandom", die die N int-Zufallszahlen aus einem Zahlenbereich [VON...BIS] generiert und auf der Konsole ausgibt.
 * Die Anzahl der Zahlen und die Unter- und Obergrenze des Zahlenbereiches sollen beim Aufruf der Methode als Argumente übergeben werden.

	Z.B.: `printRandom(5, 10, 20)` gibt 5 int-Zufallswerte aus dem Bereich [10 ... 20] aus.

**Tipp:** zum Generieren einer Zufallszahl kann man die Methode `random` der Klasse `java.lang.Math` ODER die Methode `nextInt(int)` der Klasse `java.util.Random` einsetzen
 */

public class AufgabeMethodenA06 {
	
	static void printRandom(int anzahl, int untergrenze, int obergrenze) {
		java.util.Random randomGenerator = new java.util.Random();
		for (int i = 0; i < anzahl; i++) {
			int y = randomGenerator.nextInt(obergrenze-1);
			y = y + untergrenze;
			System.out.print(y + " ");
		}
	}
	
	public static void main(String[] args) {
		printRandom(5, 2, 9);

	} // End Main

}
