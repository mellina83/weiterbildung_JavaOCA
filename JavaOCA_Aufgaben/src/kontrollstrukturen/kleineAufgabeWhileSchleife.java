package kontrollstrukturen;

public class kleineAufgabeWhileSchleife {

	public static void main(String[] args) {
		
		/* A1.
		 * 
		 * gegeben ist die for-Schleife
		 * 
		 * Ersetzen Sie sie durch eine while-Schleife
		 */
		for (int i = 0; i < 4; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//Antwort
		int i = 0;
		while (i < 4) {
			System.out.print(i+ " ");
			i++;
			}
		System.out.println();
		
		//oder Inkrement bereits in der Bedingung:
		i = -1;
		while (++i < 4) 
			System.out.print(i + " ");
			
		

	} //Ende Main-Methode

}
