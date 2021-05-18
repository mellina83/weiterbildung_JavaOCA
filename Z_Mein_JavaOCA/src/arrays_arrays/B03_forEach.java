package arrays_arrays;

import java.util.Arrays;

public class B03_forEach {

	public static void main(String[] args) {
		double[] array = {
			.1,	
			.2,	
			.3,	
		};

		/*
		 * 'Normale' for-Schleife:
		 */
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		/*
		 * Speziell für Arrays gibt es die erweiterte for-Schleife (foreach-Schleife).
		 * 
		 * Hier werden die Elemente des Arrays (double) 
		 * in die Schleifenvariable 'element' eins nach dem anderen kopiert.
		 */
		
		for(double element : array) {
			System.out.print(element + " ");
		}
		System.out.println();
		
		/*
		 * Vorteil der normalen Schleife: Position ist immer bekannt.
		 * Vorteil der foreach-Schleife: weniger zu tippen.
		 * 
		 */
		
		
		// Was ist, wenn ich doch den Index-Zugriff brauche:
		
		System.out.println("*** Nochmal untereinander: ");
		int i = 0;
		for(double element : array) {
			System.out.println(i++ + ". " + element);
		}
		
		// kleinerTest1();
		 kleinerTest2();
		
	} // end of main

	static void kleinerTest2() {
		System.out.println("*** Test 2");
		
		int[] array = { -3, 77, 12 };
		
//		for (int i = 0; i < array.length; i++) {
//			array[i] = 5; // <- ändert die Position i im Array
//		}
		
		for(int x : array) {
			System.out.print(x + " ");
			x = 9; // <- diese Zuweisung kann das Array nicht ändern
		}
		System.out.println();
		
		System.out.println("Nochmal das Array lesen und ausgeben");
		
		for(int x : array) {
			System.out.print(x + " ");
		}
		
		System.out.println();
	}
	
	static void kleinerTest1() {
		System.out.println("*** Test 1");
		
		int[] array = { 1, 2, 3 };
		
		for(int i : array) {
			System.out.print( array[i] + " " ); // <- sinnloser Code um die Elemente des Arrays auszugeben
			// System.out.print( i + " " ); // <- das wäre richtig um die Elemente des Arrays auszugeben
		}
		
		// Was ist das Ergebnis?
		// A. 1 2 3
		// B. 1 2 dann ArrayIndexOutOfBoundsException
		// C. 2 3 dann ArrayIndexOutOfBoundsException		<- richtige Antwort
	}
}
