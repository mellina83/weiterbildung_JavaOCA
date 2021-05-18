package basics_aufgaben;

public class KleineAufgabeWhileSchleife {

	public static void main(String[] args) {

		/*
		 * A1.
		 * 
		 * gegeben ist die for-Schleife.
		 * 
		 * Bitte mit while-Schleife ersetzen (soll dieselben Ausgaben erzeugen)
		 */
		
		System.out.println("*** mit for: ");
		
		for (int i = 0; i < 4; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("*** mit while: ");
		
		int i = 0;
		while(i<4) {
			System.out.print(i++ + " ");
		}
		System.out.println();
		
		System.out.println("*** nochmal mit while: ");
		
		i = -1;
		while(i++<3) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("*** nochmal mit while: ");
		
		i = -1;
		while(++i<4) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
	} // end of main

}
