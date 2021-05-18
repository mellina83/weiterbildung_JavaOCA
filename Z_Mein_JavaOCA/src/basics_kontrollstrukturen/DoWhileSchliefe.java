package basics_kontrollstrukturen;

public class DoWhileSchliefe {

	public static void main(String[] args) {

		/*
		 * Kopfgesteuert: while
		 */
		System.out.println("*** mit while");
		int x = 0;
		while( x<3 ) {
			System.out.println("x = " + x++);
		}
		
		/*
		 * Fussgesteuert: do-while (hat mindestens einen Schleifendurchlauf)
		 */
		System.out.println("*** mit do-while");
		x = 0;
		do {
			System.out.println("x = " + x++);
		} while( x<3 ); // <- Achtung! Semikolon muss sein!
		
		
		
	} // end of main

}
