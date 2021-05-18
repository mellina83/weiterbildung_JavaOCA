package basics_aufgaben;

public class KleineAufgabeDoWhileSchleife {

	public static void main(String[] args) {

		int a = 1;
		int b = 3;
		
		int summe = 0;
		
		/*
		 * A1: mit while solange a und b um jeweils 1 erhöhen 
		 *     bis die Summe den Wert 100 sprengt (größer als 100 wird).
		 *     Danach a, b und summe ausgeben
		 *     
		 */
		while(summe <= 100) {
			a++;
			b++;
			
			summe = a + b;
		}
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("summe = " + summe);
		
		/*     
		 * A2: wieder a = 1 und b = 3 setzen.
		 * 	   mit do-while solange a und b um jeweils 1 erhöhen 
		 *     bis die Summe den Wert 100 sprengt (größer als 100 wird).
		 *     Danach a, b und summe ausgeben
		 */
		
		a = 1;
		b = 3;
		
		do {
			a++;
			b++;
			
			summe = a + b;
		} while(summe <= 100);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("summe = " + summe);
		
		
	} // end of main

}
