package basics_aufgaben;

import java.util.Scanner;

public class AufgabeMethodenFakultaet {

	public static void main(String[] args) {

		int erg = getFakultaetRekursiv(3); // erg = 6
		System.out.println("3! = " + erg);
		
		erg = getFakultaet(3); 
		System.out.println("3! = " + erg); // 6
		
		erg = getFakultaetRekursiv(0); 
		System.out.println("0! = " + erg); // 1
		
		erg = getFakultaet(0); 
		System.out.println("0! = " + erg); // 1
		
		erg = getFakultaetRekursiv(12); 
		System.out.println("12! = " + erg); // 479001600
		
		erg = getFakultaet(12); 
		System.out.println("12! = " + erg); // 479001600
		
		/*
		 * So könnte ein Konsolenprogramm in dem eigenen 
		 * Code die getFakultaetRekursiv einsetzen:
		 */
		
		System.out.println("Geben Sie eine Zahl ein: ");
		int userInput = getUserInput();
		erg = getFakultaetRekursiv(userInput);
		
		if(erg==-1) {
			System.err.println("Fakultät für " + userInput +" konnte nicht berechnet werden!");
		} else {
			System.out.println("Fakultät (" +  userInput + ") =  " + erg);
		}
		
	} // end of main

	@SuppressWarnings("resource")
	static int getUserInput() {
		return new Scanner(System.in).nextInt();
	}
	
	/**
	 * Berechnet Fakultät von n. n darf zwischen 0 bis 9 (inklusive) liegen.
	 * 
	 * @param n
	 * @return  Fakultät von n oder -1 wenn keine Berechnung möglich ist (n ist ungültig)
	 */
	static int getFakultaetRekursiv(int n) {
		if(n<0 || n>12) { // bei 13 ist int overflow
			// System.out.println("Warning! Bad value: " + n);
			return -1;
		}
		
		if(n<=1) {
			return 1;
		}
		
		return n * getFakultaetRekursiv(n-1);
	}
	
	/**
	 * Berechnet Fakultät von n. n darf zwischen 0 bis 9 (inklusive) liegen.
	 * 
	 * @param n
	 * @return  Fakultät von n oder -1 wenn keine Berechnung möglich ist (n ist ungültig)
	 */
	static int getFakultaet(int n) {
		if(n<0 || n>12) { // bei 13 ist int overflow
			return -1;
		}
		
		int produkt = 1;
		
		for (int i = 1; i <= n; i++) {
			produkt *= i;
		}
		
		return produkt;
	}
	
}
