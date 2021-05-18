package arrays_arrays;

public class B04_IndexOperator {

	public static void main(String[] args) {

		/*
		 * - Index startet in Arrays bei 0
		 * - Beim Zugriff auf eine ungültige Position gibt es die ArrayIndexOutOfBoundException
		 * - Index-Operator kann auch die NullPointerException werfen
		 */
		
		int[] array = null;
		
		// array[0] = 22; // <- NullPointerException
		
		array = new int[3];
		
		// array[3] = 22; // <- ArrayIndexOutOfBoundsException
		
		//lesen:
		int x = array[0];
		
		//schreiben:
		array[0] = 22;
		
	} // end of main
	
	

}
