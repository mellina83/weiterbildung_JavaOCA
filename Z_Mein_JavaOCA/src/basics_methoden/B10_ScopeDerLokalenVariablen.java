package basics_methoden;

/*
 * Scope: Gültigkeitsbereich
 */
public class B10_ScopeDerLokalenVariablen {

	public static void main(String[] args) {

		// System.out.println(x); // x nicht bekannt
		
		/*
		 * Lokale Variable
		 */
		int x = 0; // x ist gültig ab hier bis zum Ende der main 
		
		// int x = 2; // x ist bereits eingeführt
		
		{
			// int x = 3; // x ist bereits eingeführt
			
			x = 11; // x ist gültig
		}
		
		
		{
			/*
			 * Lokale Blockvariable
			 */
			int blockX = x + 12; // blockX ist gültig ab hier bis zum Ende des Blockes
			
			System.out.println("x + 12 = " + blockX);
			
		} // Ende des Blockes
		
		// blockX = 12; // blockX ist nicht mehr gültig
		
		x = 11; // x ist gültig
		
		
	} // end of main

	
	/*
	 * Parameter: gültig im ganzen Rumpf der Methode
	 */
	static void m(int param) {
		// System.out.println(x); // x nicht bekannt
		
		param = 33;
	}
	
}
