package arrays_arrays;

import java.util.Arrays;

public class B09_Varargs_Methoden_Regeln {

	public static void main(String[] args) {
		/*
		 * Auch keine Argumente sind ok. Damit ensteht ein Array der Länge 0.
		 */
		
		printNamesInRow(); // <- printNamesInRow( new String[] {} );

		/*
		 * Ansonsten stimmt 'beliebig viele' solange wir noch Kraft haben die Argumente einzutippen :)
		 */
		printNamesInRow("mo");
		printNamesInRow("mo", "di");
		printNamesInRow("mo", "di", "mi");
		// ... 
		
		/*
		 * Teste den Varargs-Parameter, der am Ende der Parameterliste steht
		 */
		printNamesWithPrefix("IT-Abteilung:"); 
		printNamesWithPrefix("HR-Abteilung:", "Tom");
		printNamesWithPrefix("Management:", "Peter", "Paul", "Mary");
		
		String[] names = { "Rex", "Lassie" };
		printNamesWithPrefix("Hunde:", names);
	}
	
	static void printNamesInRow(String... names) {
		System.out.println("*** Übergeben: " + names.getClass().getSimpleName());
		System.out.println("*** length: " + names.length);
		
		for(int i=0; i<names.length; i++) {
			System.out.print(names[i] + " ");
		}
		
		System.out.println();
		System.out.println();
	}
	
	/*
	 * Der Varargs-Parameter muss immer der letzter Parameter in der Parameterliste sein
	 */
	static void m1(int[] x, int y) {} // OK
	// static void m2(int... x, int y) {} // Compilerfehler
	// static void m3(int... x, int... y) {} // Compilerfehler
	
	static void printNamesWithPrefix(String prefix, String... names) {
		System.out.println(prefix + " " + Arrays.toString(names));
	}
}
