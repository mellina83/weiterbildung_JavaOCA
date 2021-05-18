package basics_methoden;

public class WdhScopeDerLokalenVariablen {

	public static void main(String[] args) {

		/*
		 * Kompakt
		 */
		for (int i = 0; i < 2; i++) {
			int z = 0;
			System.out.println(i);
		}
		// System.out.println(i); // i ist nicht mehr gültig
		
		
		/*
		 * Nachbilden der for-Schleife
		 */
		{
			int j = 0;
			
			if(j >= 3) {
				//Schleife beenden (noch nicht)
			} else {
				int z = 0;
				System.out.println(j);
			}
			// z++; // nicht mehr gültig 
			
			j++; // 1
			
			if(j >= 3) {
				//Schleife beenden (jetzt)
			} else {
				int z = 0;
				System.out.println(j);
			}
		}
		// System.out.println(j); // j ist nicht mehr gültig
		
	} // end of main

}
