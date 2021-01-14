package methoden;

/* A3
 * Definieren Sie eine statische Methode "sumFromTo", die zwei int-Parameter "from" und "to" hat.
 * Die Methode berechnet die Summe aller int-Werte von "from" bis "to" und liefert das Ergebnis zurück.
 * Testen Sie Ihre Lösung.
 */

public class AufgabeMethodenA03 {
	
	static int sumFromTo(int from, int to) {
		int summe = 0;
		for (int i = from; i <= to; i++) {
			summe += i;
		}
		return summe;
	}
	
	
	public static void main(String[] args) {
		
		int sum = sumFromTo(2, 6);
		System.out.print(sum + " ");
	}
}
