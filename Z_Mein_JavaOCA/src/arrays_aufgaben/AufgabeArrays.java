package arrays_aufgaben;

import java.util.Arrays;
import java.util.Random;

public class AufgabeArrays {

	public static void main(String[] args) {

		/*
		 * A1, A2
		 */
		System.out.println("*** A1");
		int[] arr = createArray(2, 15, 30);

		printArray(arr);
		
		/*
		 * A3
		 */
		System.out.println("*** A3");
		char[] umlaute = deutscheUmlaute();
		
		printArray(umlaute);
		
		/*
		 * A4
		 */
		System.out.println("*** A4");
		char[] buchstaben = deutscheBuchstaben();
		
		printArray(buchstaben);
		
		/*
		 * A5
		 */
		System.out.println("*** A5");
		double[] mathArray = { Math.PI, Math.E };
		
		// Array-Klassen überschreiben die toString nicht
		Class classOfMathArray = mathArray.getClass();
		System.out.println("Klassename für die Klasse von der mathArray ist: " + classOfMathArray.getName());
		System.out.println("Simple name: " + classOfMathArray.getSimpleName());
		
		System.out.println("mathArray: " + mathArray); // [D@39ed3c8d
		
		// Utility-Klasse 'java.util.Arrays' hat unter anderem die hilfreiche statische toString-Methode
		String mathArrayAsString = Arrays.toString(mathArray);
		System.out.println("mathArray: " + mathArrayAsString); // [3.141592653589793, 2.718281828459045]
		
		/*
		 * A6.
		 */
		System.out.println("*** A6, add");
		int[] a1 = { 1, 2, 3 };
		int[] a2 = { 12, 13, 14 };

		System.out.println("a1: " + Arrays.toString(a1));
		System.out.println("a2: " + Arrays.toString(a2));
		int[] a3 = add(a1, a2); // a3 bekommt folgende Werte: 13, 15, 17
		System.out.println("a3: " + Arrays.toString(a3));
		
		/*
		 * A7.
		 */
		System.out.println("*** A7, join");
		System.out.println("a1: " + Arrays.toString(a1));
		System.out.println("a2: " + Arrays.toString(a2));
		a3 = join(a1, a2); // a3 bekommt folgende Werte: 1, 2, 3, 12, 13, 14
		System.out.println("a3: " + Arrays.toString(a3));
		
	} // end of main
	
	static int[] join(int[] a1, int[] a2) {
		
		int[] result = new int[a1.length + a2.length];
		
		// i = 0, 1, 2 (bei a1.length = 3)
		for (int i = 0; i < a1.length; i++) {
			result[i] = a1[i];
		}
		
		// i = 3, 4, 5 (bei a2.length = 3)
		for(int i = a1.length; i<result.length; i++) {
			result[i] = a2[i-a2.length]; // z.B. result[3] = a2[3-3] 
		}
		
		return result;
	}
	
	static int[] add(int[] a1, int[] a2) {
		if(a1.length != a2.length) {
			throw new IllegalArgumentException("Array müssen dieselbe Länge haben");
		}
		
		int[] result = new int[a1.length];
		
		for(int i=0; i<result.length; i++) {
			result[i] = a1[i] + a2[i];
		}
		
		return result;
	}
	
	
	static char[] deutscheBuchstaben() {
		
		int len = 'z' - 'a' + 1 + 3 + 1; // englische Buchstaben + 3 umlaute + ß 
		
		char[] array = new char[len];
		
		for(char ch = 'a'; ch<='z'; ch++) {
			array[ch-'a'] = ch;
		}
		
		int nextIndex = 'z'-'a'; // die mit 'z' belegte Position
		
		array[++nextIndex] = 'ä';
		array[++nextIndex] = 'ö';
		array[++nextIndex] = 'ü';
		array[++nextIndex] = 'ß';
		
		return array;
	}
	
	static char[] deutscheUmlaute() {
		return new char[] { 'ä', 'ö', 'ü' };
	}

	static int[] createArray(int from, int to, int count) {
		
		int[] array = new int[count];

		Random random = new Random();
		
		for(int i=0; i<count; i++) {
			array[i] = random.nextInt(to - from + 1) + from;
		}
		
		return array;
	}
	
	static void printArray(int[] array) {
		for(int x : array) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
	static void printArray(char[] array) {
		for(char x : array) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
}
