package arrays_aufgaben;

public class AufgabeArrays2D {

	public static void main(String[] args) {

		/*
		 * A1, A2
		 */
		int[][] arr = createArray(4, 5); // 4 x 5
		
		System.out.println("*** A1: ");
		printArray(arr);
		
		/*
		 * A3.
		 */
		System.out.println("*** A3: ");
		
		arr[1][1] = 5;
		printArray(arr);
		
		/*
		 * A4.
		 */
		System.out.println("*** A4: ");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 2;
			}
		}
		printArray(arr);
		
		/*
		 * A5.
		 */
		System.out.println("*** A5: ");
		
		arr = createArray(4, 5, 2);
		
		printArray(arr);

		
	} // end of main

	static int[][] createArray(int rows, int columns, int initValue) {
		int[][] array = new int[rows][columns];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = initValue;
			}
		}
		
		return array;
	}
	
	static int[][] createArray(int rows, int columns) {
		return new int[rows][columns];
	}
	
	static void printArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			// von 0 bis zum vorletzten Element einer Zeile
			for (int j = 0; j < array[i].length - 1; j++) { 
				System.out.print(array[i][j] + ", ");
			}
			
			System.out.println(array[i][array[i].length-1]); // das letzte Element einer Zeile
		}
	}
	
}
