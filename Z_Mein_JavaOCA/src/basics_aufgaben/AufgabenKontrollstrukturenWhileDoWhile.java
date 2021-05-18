package basics_aufgaben;

public class AufgabenKontrollstrukturenWhileDoWhile {

	public static void main(String[] args) {

		// 0 1 2 3 4 5 6 7 8 9
		System.out.println("*** A1. mit while");
		
		int zahl = 0;
		
		while(zahl < 10) {
			System.out.print(zahl++ + " ");
		}
		System.out.println();
		
		
		// 0 2 3 4 5 6 7 8 9
		System.out.println("*** A2. mit do-while");
		
		zahl = 0;
		
		do {
			if(zahl!=1) {
				System.out.print(zahl + " ");
			}
			
		} while( ++zahl < 10 ) ;
		
		System.out.println();
		
		// -4 -2 0 2 4 ... 50
		System.out.println("*** A3. mit while");
		
		zahl = -4;
		while(zahl <= 50) {
			System.out.print(zahl + " ");
			zahl+=2;
		}
		System.out.println();
		
		
		// 	a b c ... z
		System.out.println("*** A4. do-while");
		
		char ch = 'a';
		do {
			System.out.print(ch + " ");
		} while( ++ch <= 'z' ) ;
		System.out.println();
		
		
		// Z Y X ... A
		System.out.println("*** A5. while");
		
		ch = 'Z';
		
		while(ch >= 'A') {
			System.out.print(ch-- + " ");
		}
		System.out.println();
		
		// 1 ... 100 (%5 == 0)
		System.out.println("*** A6. do-while");
		
		zahl = 1;
		do {
			if(zahl%5 == 0) {
				System.out.print(zahl + " ");
			}
			zahl++;
		} while(zahl <= 100) ;
		
		System.out.println();
		
		/*
		 * Neue Aufgabe (gerade ausgedacht)
		 * 
		 * Ausgabe erhalten: a 1 2 3 b 1 2 3 c 1 2 3
		 */
		System.out.println("*** A7. verschachteln");
		
		ch = 'a';
		while(ch <= 'c') {
			System.out.print(ch++ + " ");
			
			zahl = 1;
			do {
				System.out.print(zahl + " ");
			} while(++zahl <= 3) ;
		}
		System.out.println();
		
	} // end of main

}
