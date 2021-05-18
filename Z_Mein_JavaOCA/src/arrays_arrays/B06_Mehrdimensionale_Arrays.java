package arrays_arrays;

public class B06_Mehrdimensionale_Arrays {

	public static void main(String[] args) {
		
		/*
		 * einfaches Array (1-Dim)
		 * 
		 * Typ der Element: int
		 */
		int[] a1 = new int[3]; 

		/*
		 * 2-Dim Array 2 x 3
		 * 
		 * Typ der Elemente: int[]
		 * 
		 */
		int[][] a2 = new int[2][3];
		
		int[] subarray = a2[1];
		
		subarray[1] = 77;
		
		System.out.println( "a2[1][1] = " + a2[1][1] ); // 77
		
		System.out.println("*** Alles aus a2 ausgeben: ");
		
		// alle Arrays von Typ int[] aus dem Array von Typ int[][]:
		for(int[] subArray : a2) {
//			System.out.println(subArray);
			
			// Alle Werte aus einem int[]:
			for( int x : subArray ) {
				System.out.print(x + " ");
			}
			System.out.println(); 
		}
		
		System.out.println("*** 2. Nochmal alles aus a2 ausgeben: ");
		
		// alle Arrays von Typ int[] aus dem Array von Typ int[][]:
		for(int i=0; i<a2.length; i++) {
			int[] subArray = a2[i];
//			System.out.println(subArray);
			
			// Alle Werte aus einem int[]:
			for(int j=0; j<subArray.length; j++) {
				System.out.print(subArray[j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("*** 3. Nochmal alles aus a2 ausgeben: ");
		for(int i=0; i<a2.length; i++) {
			for(int j=0; j<a2[i].length; j++) {
				System.out.print(a2[i][j] + " " );
			}
			System.out.println();
		}
		
	}

}
