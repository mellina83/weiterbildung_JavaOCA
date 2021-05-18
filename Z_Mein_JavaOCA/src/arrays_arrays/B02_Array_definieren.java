package arrays_arrays;

public class B02_Array_definieren {

	public static void main(String[] args) {

		/*
		 * V.1
		 * 
		 * - Bequem sehr große Arrays erzeugen.
		 * - Nicht so bequem um die Anfangswerte zu setzen. 
		 *   Alle Elemente bekommen den für den Typ passenden Null-Wert.
		 */
		
		int[] a1 = new int[3];
		
		System.out.println("a1[2] = " + a1[2]); // 0
	
		/*
		 * V.2
		 * 
		 * - Passt nicht um große Arrays zu erzeugen.
		 * - Sehr bequem ist um die Anfangswerte zu setzen. 
		 * 
		 * - Nur beim expliziten sofortigen Initiallisieren einer Referenz erlaubt.
		 */
		int x = 33;
		int[] a2 = { -12, x, -7 };
		
		System.out.println("a2[2] = " + a2[2]); // -7
		
		// a2 = { 1, 2, 3 }; // Compilerfehler
		
		/*
		 * V.3
		 * 
		 * - Syntaktisch ist sie die Kombination der V.1 und V.2.
		 * - Passt nicht um große Arrays zu erzeugen.
		 * - Relativ bequem ist um die Anfangswerte zu setzen.
		 * - Wird nur in besonderen Situationen interessant: 
		 * 		- Array als Argument ohne Zwischenvariable
		 * 		- Argument für return ohne Zwischenvariable
		 */
		
		int[] a3 = new int[] { -12, 33, -7 }; // length = 3
		
		a3 = new int[] { 6, 8, 10 };
		// a3 = new int[3] { 6, 8, 10 };	// Compilerfehler
		
		// Wann ist V.3 nötig? Wenn ich keine Zwischenvariable habe.
		
		printMax(a2); // normal: Referenz (Zweischenvariable a2) übergeben
		
		//printMax( { 3, 2, 1 } ); // V.2 leider nicht möglich
		
		printMax( new int[] { 3, 2, 1 } ); // V.3 (damit geht es)
		
		// Wann ist V.3 noch nötig? s. in der createSimpleArray nach
		int[] a4 = createSimpleArray();
		
		
		/*
		 * Ein Array-Objekt kann auch die Länge 0 haben
		 */
		int[] a5 = {}; // <- int[]-Objekt mit 0 Elementen. Attribut length = 0
		
		
	} // end of main

	static void printMax(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("max = " + max);
	}
	
	static int[] createSimpleArray() {
//		wäre OK mit einer Zwischenvariable array:
//		
//		int[] array = { 1, 2, 3 };
//		return array;
		
//		Ohne zwischenvariable mit V.2: Compilerfehler
//		return { 1, 2, 3 }; // geht leider nicht
		
		return new int [] { 1, 2, 3 }; // V.3
	}
	
}
