package arrays_arrays;

public class B07_Mehrdimensionale_Arrays_erweitert {

	public static void main(String[] args) {
		
		/*
		 * Nicht alle Dimensionen müssen gesetzt werden
		 */
		int[][] a1 = new int[2][3]; // ein int[][] (length=2) und zwei int[] (je length=3)

		int[][] a2 = new int[2][]; //  ein int[][] (length=2), seine Elemente haben den Wert null

		int[][][][] a3 = new int[2][3][][]; //  ein int[][][][] (length=2),
											// und
											// zwei int[][][] (je length=3).
											// Die Elemente in den beiden int[][][]-Arrays haben den Wert null 

		/*
		 * Unterarrays müssen nicht dieselbe Länge haben
		 */
		boolean[][] a4 = new boolean[2][]; // ein boolean[][]-Objekt mit 2 Elementen (beide = null)
		
		System.out.println("a4[0] = " + a4[0]);
		
		a4[0] = new boolean[3]; 
		a4[1] = new boolean[2]; 
		// false false false	<- Elemente aus a4[0]
		// false false 			<- Elemente aus a4[1]
		for (int i = 0; i < a4.length; i++) {
			for (int j = 0; j < a4[i].length; j++) {
				System.out.print(a4[i][j] + " ");
			}
			System.out.println();
		}
		
		
		/*
		 * Manuell Anfangswerte setzen
		 */
		int[][] a5 = {}; // int[][], length = 0
		
		System.out.println("a5.length = " + a5.length); // 0
		
		int[][] a6 = {
			{1, 2, 3, 4, 5},	
			{6, 7, 8},	
			{9, 10, 11, 12},	
		};
		
		for(int[] subArray : a6) {
			for(int x: subArray) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		
		/*
		 * Aus den technischen Grunden sind Deklarationen
		 * 
		 * 	int[] x;
		 * und
		 * 	int x[];  
		 * 
		 * identisch
		 */
		
		int [] a7;
		int a8 [] = new int[2];
		
		a7 = a8; // int[] <= int[]
		
		
		double[][] a9;
		double[] a10 []; // <- nicht empfohlen 
		double a11 [][];
		
		a9 = new double[2][];
		a10 = new double[2][];
		a11 = new double[2][];
		
		// a10 = new double[2]; // Compilerfehler: double[][] <= double[]
		
		
		
	} // end of main

}
