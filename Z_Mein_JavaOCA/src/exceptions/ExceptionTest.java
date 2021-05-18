package exceptions;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		int zahl1 = 8;
		int zahl2 = 2;
		String eingabe = "42";
		int quotientLokal = 0;
		System.out.println("7.0/0 = " + 7.0/0);
//		Ein try-Block muss mindestens einen catch-Block haben.
//		Der optionale finally-Block enth�lt Anweisungen, die IMMER ausgef�hrt werden, egal, ob Exceptions auftreten bzw. gefangen werden
//		Ausnahme: der finally-Block wird nicht ausgef�hrt, wenn die JVM beendet wird, System.exit(0);
//		Wenn ein try-Block einen finally-Block enth�lt, muss er keinen catch-Block haben.
		try {
			int i = Integer.parseInt(eingabe); // NumberFormatException
			System.out.println("i = " + i);
			int quotientBlock = zahl1 / zahl2; // Divison durch 0 l�st einen Laufzeitfehler aus (ArithmeticException)
			quotientLokal = quotientBlock;
			System.out.println("quotientBlock = " + quotientBlock);
			if (Math.random() == 1) {
				System.exit(0); // sofortiges Beenden der JVM
			}
		} catch(ArithmeticException e) {
			e.printStackTrace(); // Ausgabe der Fehlerspur (zu Testzwecken)
		} catch(NumberFormatException e) {
			System.out.println("Zahl falsch eingegeben!");
		} catch(RuntimeException e) {
			System.out.println("Allgemeine Laufzeit-Ausnahme");
		} catch(Exception e) {
			System.out.println("Allgemeine Ausnahme");
		} finally {
			System.out.println("Tsch�ss");
		}
		
		try {
			// Datenbankverbindung �ffnen
			// Abfrage durchf�hren
			// Abfrage auswerten
		} finally {
			// Datenbankverbindung schlie�en
		}
		
		Scanner sc = null;
		
		try {
			sc = new Scanner(System.in);
			int i = sc.nextInt();
			System.out.println("i = " + i);
		} finally {
			System.out.println("Scanner wird geschlossen.");
			sc.close();
			
		}
//		sc.next(); // IllegalStatusException
		
//		System.out.println("quotientBlock = " + quotientBlock); // Compiler-Fehler: quotientBlock nur g�tlig im try-Block
		System.out.println("quotientLokal = " + quotientLokal); 
		System.out.println("Servus");
	}

}
