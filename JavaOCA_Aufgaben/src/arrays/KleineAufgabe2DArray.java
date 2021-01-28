package arrays;

public class KleineAufgabe2DArray {
	
	/*
	 * Erzeugen Sie bitte ein 2D-Array mit folgenden Werten:
	 * 
	 * 1 2 3 4 5
	 * 6 7 8 9 19
	 * 11 12 13 14 15
	 * 
	 * Geben Sie danach die Inhalte aus
	 */

	public static void main(String[] args) {
		
		//Erzeugen des 2D Arrays
		int[][] a1 = new int [3][5];
		
		
		//Befüllen des 2D Arrays
		int value = 1;
		for(int i=0; i<a1.length; i++) {
			for(int j=0; j<a1[i].length; j++) {
				a1[i][j] = value++;
			}
			}
		
		/* Meine Lösung
		
		for (int i = 0, j = 1; j<=5; i++, j++) {
			a1[0][i] = j;
		}
		
		for (int i = 0, j = 6; j<=10; j++, i++) {
			a1[1][i] = j;
		}
		for (int i = 0, j = 11; j<=15;i++, j++) {
			a1[2][i] = j;
		}
		*/
		
		//Ausgabe
		System.out.println("*** Ausgabe: ");
		for(int i=0; i<a1.length; i++) {
			for(int j=0; j<a1[i].length; j++) {
				System.out.print(a1[i][j] + " " );
			}
			System.out.println();
		
		

	}

}
}
