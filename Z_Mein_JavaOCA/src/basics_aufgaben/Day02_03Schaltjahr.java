package basics_aufgaben;

import java.util.Scanner;

public class Day02_03Schaltjahr {

	public static void main(String[] args) {
		// Schreiben Sie ein Programm, das eine Jahreszahl durch den Benutzer einliest und ausgibt, ob es ein Schaltjahr ist oder nicht.
		// Einfache Variante: ein Jahr ist ein Schaltjahr, wenn es durch 4 teilbar ist
		// Schwierige Variante: ein Jahr ist ein Schaltjahr, wenn es durch 4 teilbar ist. Ausnahme: eine Jahrhundertwende ist nur dann ein Schaltjahr,
		// wenn sie auch durch 400 teilbar ist
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Geben Sie eine Jahreszahl ein, zwecks �berpr�fung, ob es sich um ein Schaltjahr handelt: ");
		int jahreszahl = sc.nextInt();
		
		//a) Ohne Vernestelung mit logischen Operatoren
		if (jahreszahl % 4 == 0 && jahreszahl % 100 != 0 || jahreszahl % 400 == 0) {
			// Seltener Fall auf der rechten Seite
			System.out.println("Das eingegebene Jahr " + jahreszahl + " ist ein Schaltjahr.");
		} else {
			System.out.println("Das eingegebene Jahr " + jahreszahl + " ist kein Schaltjahr.");
		}
		
		System.out.println("Mit Nested if:");
		//b) Mit Nested if
		if (jahreszahl % 4 == 0) {
			if (jahreszahl % 100 == 0) {
				if (jahreszahl % 400 == 0 ) {
					System.out.printf("Das eingegebene Jahr %d ist ein Schaltjahr.%n", jahreszahl);
				} else {
					System.out.printf("Das eingegebene Jahr %d ist kein Schaltjahr.%n", jahreszahl);
				}
			} else {
				System.out.printf("Das eingegebene Jahr %d ist ein Schaltjahr.%n", jahreszahl);
			}
		} else {
			System.out.printf("Das eingebene Jahr %d ist kein Schaltjahr.%n", jahreszahl);
		}		
		
		sc.close();
		
		
	}

}
