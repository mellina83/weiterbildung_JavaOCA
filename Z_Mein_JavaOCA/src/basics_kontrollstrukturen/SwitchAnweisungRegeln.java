package basics_kontrollstrukturen;

public class SwitchAnweisungRegeln {

	public static void main(String[] args) {

		/*
		 * switch-Variable darf vom Typ her folgendes sein:
		 * 
		 * 	- byte, short, int 
		 *  - Byte, Short, Integer
		 *  - String
		 * 
		 *  - char
		 *  - Character
		 *  
		 *  - enum-Klassen
		 */
		
//		byte var = 1;		// OK
//		short var = 1;		// OK
//		int var = 1;		// OK
//		long var = 1;		// Compilerfehler
		
//		Integer var = 1;	// OK
		
//		String var = "abc";
		
		char var = 'a';
		
		/*
		 * die folgende switch kompiliert, ergibt natürlich keinen Sinn
		 */
		switch(var) {
		}
		

		/*
		 * So funktioniert die switch:
		 * 
		 * 	1. Den passenden Zweig finden
		 * 		(Suchen zuerst bei case-Zweigen. Wenn nicht gefunden, 
		 * 		dann nach default-Zweig suchen)
		 * 
		 *  2. Falls der passende Zweig gefunden wurde: 
		 *  	dort einsteigen und bis zum break 
		 *  	(oder bis zum Ende der switch, wenn es kein break gibt)
		 *  	alle Anweisungen ausführen 
		 */
		String result = "?";
		
		var = 'a';
		
		switch(var) {
			case 'a': 
				result = "Zeichen a";
			case 'b': 
				result = "Zeichen b";
				break;
		}
		
		System.out.println(result); // Zeichen b
	
		System.out.println("---");
		
		var = 'd';
		
		switch(var) {
			case 'a':
			case 'b':
			case 'c':
			case 'd':
				System.out.println("a, b, c oder d");
		}
		
		/*
		 * case-Konstanten dürfen sich nicht wiederholen
		 */
		int x = 0;
		switch(x) {
			case 1:
			case 2:
//			case 1: // wenn aktiviert, gibt es 2 Compilerfehler
		}
		
		/*
		 * Unwahrscheinlich in der Prüfung:
		 * 
		 * case-Zweig braucht eine 'zu Compilerzeit bekannte' Konstante
		 */
		
		final int RED = 0; // zu Compilerzeit bekannt

		final int GREEN;  // zu Compilerzeit NICHT bekannt
		
		GREEN = 2;
		
		int color = RED;
		
		switch(color) {
			case RED: 		// OK
				
			// case GREEN:  // Compilerfehler
		}
		
		
	} // end of main

}
