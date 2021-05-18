package arrays_aufgaben;

public class KleineAufgabe2DArray {

	/*
	 * Erzeugen Sie bitte ein 2D-Array mit folgenden Werten:
	 * 
	 * 
	 * 	1 2 3 4 5
	 *  6 7 8 9 10
	 *  11 12 13 14 15
	 *  
	 *  Geben Sie danach die Inhalte aus.
	 */
	public static void main(String[] args) {

		int[][] array2D = new int[3][5];
		
		int value = 1;
		
		for(int i=0; i<array2D.length; i++) {
			for(int j=0; j<array2D[i].length; j++) {
				array2D[i][j] = value++;
			}
		}
		
		for(int i=0; i<array2D.length; i++) {
			for(int j=0; j<array2D[i].length; j++) {
				System.out.print( array2D[i][j] + " " );
			}
			System.out.println();
		}
		
	}

}
