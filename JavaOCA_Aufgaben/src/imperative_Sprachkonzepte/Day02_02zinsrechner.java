package imperative_Sprachkonzepte;


import java.util.Scanner;

public class Day02_02zinsrechner {

	public static void main(String[] args) {
		//Programmieren Sie einen Zinsrechner, der zu einem Startkapital ein Zinssatz und einer Laufzeit das Endkapital berechnet.
		//Beispieldaten: Startkapital: 1000 Euro, Zinssatz: 5%, Laufzeit: 5 Jahre
		//--> Endkapital: 1276,28 Euro muss herauskommen
		
		Scanner sc = new Scanner(System.in);
		
		//Eingabe, Deklaration und Zuweisung
		System.out.println("Bitte geben Sie Ihr Startkapital ein:");
		int startkapital = sc.nextInt();
		System.out.println("Bitte geben Sie den Zinssatz Ihrer Bank ein:");
		double zinssatz = sc.nextInt();
		System.out.println("Bitte geben Sie die Laufzeit ein:");
		int laufzeit = sc.nextInt();
		
		//Deklaration und Berechnung
		double endkapital = startkapital * Math.pow(1 + zinssatz / 100, laufzeit);
		
		//Ausgabe mit format() Formatierung
		//%d f�r Dezimal, %f f�r Flie�komma
		System.out.printf("Ihr Endkapital betr�gt %,.2f Euro%n", endkapital);
		//bei %d Startkapital, %d Jahren Laufzeit und einem Zinssatz von %d betr�gt %,.2f", startkapital, laufzeit, zinssatz,
		System.out.println("Ihre angegebenen Daten:");
		System.out.printf("Startkapital: %d Euro%n", startkapital);
		System.out.printf("Zinssatz %.1f und Laufzeit von %d Jahren", zinssatz, laufzeit);
		
		
		
		sc.close();

	}

}
