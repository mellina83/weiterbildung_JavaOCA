package methoden;

/* A1
 * Definieren Sie eine statische Methode "printFromTo" mit zwei int-Parameter "from" und "to".
 * Die Methode gibt alle int-Werte von "from" bis "to" auf der Konsole in einer Zeile aus. Testen Sie Ihre Lösung.
 */



public class AufgabeMethodenA01 {
	
	static void printFromTo(int a, int b) {
		for (int i = a; i <= b; i++) {
			System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args) {
		printFromTo(1,5);
		System.out.println();
		printFromTo(2,11);
	}
}
