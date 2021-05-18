package dev;

import java.text.NumberFormat;
import java.util.Scanner;
import mvc.model.ZinsrechnerMatheModel;
import mvc.model.ZinsrechnerModelInterface;
import mvc.model.ZinsrechnerSchleifenModel;

public class ZinsrechnerTest {
	
	public static void main(String[] args) {
//		Erstellen Sie ein Programm, das bei gegebenem Startkapital, Zinssatz und Laufzeit (Eingabe durch den Benutzer) das Endkapital berechnet.
//		Testdaten: Startkapital: 1000, Zinssatz: 5, Laufzeit: 5 => Endkapital: 1276,28
//		Testdaten für Laufzeit: Startkapital: 1000, Zinssatz: 5, Endkapital: 2000 => Laufzeit = 14,20669...
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie das Startkapital ein.");
		int startkapital = sc.nextInt();
		System.out.println("Bitte geben Sie den Zinssatz ein.");
		double zinssatz = sc.nextDouble();
//		System.out.println("Bitte geben Sie die Laufzeit ein.");
//		int laufzeit = sc.nextInt();
		System.out.println("Bitte geben Sie das gewünschte Endkapital ein");
		int endkapital = sc.nextInt();
		
//		double endkapital = startkapital * Math.pow(1 + zinssatz / 100, laufzeit);
		ZinsrechnerModelInterface model = new ZinsrechnerMatheModel();
		model = new ZinsrechnerSchleifenModel();
//		double endkapital = model.berechneEndkapital(startkapital, zinssatz, laufzeit);
		double laufzeit = model.berechneLaufzeit(startkapital, zinssatz, endkapital);
		
//		System.out.printf("Endkapital: %,.2f € %n", endkapital);
//		System.out.println("Endkapital: " + NumberFormat.getCurrencyInstance().format(endkapital));
		System.out.println("Laufzeit: " + laufzeit);
		
	}

}
