package arrays;

public class Arrays2D {
	
	

	public static void main(String[] args) {

		//A1 Methode createArray() aufrufen
		int[][] arr = createArray(4, 5);
		
		//A2 Erzeugtes Array ausgeben
		System.out.println("Aufgabe 2:");
		printArray(arr);
	
		//A3 Auf der Stelle (1,1) den Wert 5 speichern und erneut auf dem Bildschirm ausgeben (Index 0 und 0?)
		System.out.println("\nAufgabe 3:");
		arr[0][0] = 5;
		printArray(arr);
		
		//A4 Alle Positionen in dem Array mit dem Wert 2 belegen. Dazu verschachtelte for-Schleifen nutzen
		System.out.println("\nAufgabe 4:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j<arr[i].length; j++) {
				arr[i][j] = 2;
			}
		}
		printArray(arr);
		
		//A5 Überladene Methode createArray aufrufen
		System.out.println("\nAufgabe 5:");
		int[][] arr2 = createArray(4, 5, 2);
		printArray(arr2);
		

		
	} // Ende Main
	
	//A1 Methode createArray() erstellen:
	//Zweidimensionales int-Array
	//Aufruf möglich mit: int[][] arr = createArray(4, 5);
	public static int[][] createArray(int x, int y) {
		return new int[x][y]; //(new int, da ich das Array noch nicht erstellt hatte
	}
	
	//A2 + A6 Methode printArray() erzeugen:
	//Array soll an diese Methode übergeben werden
	// Aussehen:
	//00000 bzw mit Kommata zwischen den Zahlen
	//00000
	//00000
	//00000
	public static void printArray(int[][]array) {
		for (int i = 0; i<array.length;i++) {
			for (int j = 0; j<array[i].length;j++) {
				System.out.print(array[i][j] + ", ");
			}
			System.out.println();
		}
	}
	//Optional für mich mit Subarray
	public static void printArrayMitSubarray(int[][]array) {
		for (int i = 0; i<array.length;i++) {
			int[]subarray = array[i];
			for (int j = 0; j < subarray.length;j++) {
				System.out.print(subarray[j] + ", ");
			}
			System.out.println();
		}
	}
	
	//A5 Bitte überladen Sie die Methode `createArray` durch eine weitere Methode,
	//die ein zweideminseonales int-Array erzeugt und mit dem gewünschten Wert belegt.
	//int[][] arr = createArray(4, 5, 2);
	public static int[][] createArray(int x, int y, int z) {
		int[][] arraylocal = new int[x][y];

		
		for (int i = 0; i < arraylocal.length; i++) {
			for (int j = 0; j<arraylocal[i].length; j++) {
				arraylocal[i][j] = z;
			}
		}
		//int a[] = [x];
		return arraylocal;
	}
	
}
