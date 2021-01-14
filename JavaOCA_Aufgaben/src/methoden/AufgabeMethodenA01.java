package methoden;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

/* A1
 * Definieren Sie eine statische Methode "printFromTo" mit zwei int-Parameter "from" und "to".
 * Die Methode gibt alle int-Werte von "from" bis "to" auf der Konsole in einer Zeile aus. Testen Sie Ihre Lösung.
 */

/**
 * 
 * @author CC-Student
 * @param from kleinste Zahl, ab der aufgezählt wird
 * €param to größte Zahl bis zu der aufgezählt wird, inklusive
 */

public class AufgabeMethodenA01 {
	
	static void printFromTo(int from, int to) {

		if (from > to) {
			for (int i = from; i >= to; i--) {
				System.out.print(i + " ");
			}
		} else {
			for (int i = from; i <= to; i++) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		printFromTo(1,5);
		printFromTo(11,2);
	}
}
