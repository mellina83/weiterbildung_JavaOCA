package arrays;

import java.util.Arrays;
import java.util.Random;

//Aufgaben siehe Package aufgabenVomDozent

public class AufgabeArrays {

	public static void main(String[] args) {
		
		//A1 Aufruf Methode
		int [] arr = createArray(2,15,30);
		
		//A2
		System.out.println("Aufgabe 1+2:");
		printArray(arr);
		
		//A3
		System.out.println("\nAufgabe 3:");
		char[] umlaute = deutscheUmlaute();
		printArray(umlaute);
		
		//A4
		System.out.println("\nAufgabe 4:");
		char[] buchstaben = deutscheBuchstaben();
		printArray(buchstaben);
		
		//A5
		System.out.println("\nAufgabe 5:");
		double [] mathArray = {Math.PI, Math.E};
		
		String mathArrayAsString = Arrays.toString(mathArray);
		System.out.println("mathArray: " + mathArrayAsString);
		
		//A6
		System.out.println("\nAufgabe6:");
		int[] a1 = { 1, 2, 3 };
		int[] a2 = { 12, 13, 14 };
		
		int[] a3 = add(a1, a2); // a3 bekommt folgende Werte: 13, 15, 17
		System.out.println("a1 " + Arrays.toString(a1));
		System.out.println("a2 " + Arrays.toString(a2));
		System.out.println("a3 " + Arrays.toString(a3));
		
		//A7 gegeben sind a1 und a2
		System.out.println("\nAufgabe7:");
		a3 = join(a1, a2); // a3 bekommt folgende Werte: 1, 2, 3, 12, 13, 14
		System.out.println("a1 " + Arrays.toString(a1));
		System.out.println("a2 " + Arrays.toString(a2));
		System.out.println("a3 " + Arrays.toString(a3));
		

	} // End of Main
	
	//A1 Methode createArray definieren
	static int[] createArray(int from, int to, int count) {
		int[] array = new int[count];
		
		//forEach nicht geeignet, weil wir Indexzugriff brauchen, um Werte zu ändern!!! Das geht mit element nicht.
		
		for (int i = 0; i < array.length;i++) { // oder count anstatt array.length :)
			Random randomzahl = new Random();
			array[i] = randomzahl.nextInt(to - from + 1) + from; //  (to) + from - 1 geht nicht bzw. nicht vom Dozenten genommen
			System.out.println("Index " + i + ": " + array[i]);
		}
		System.out.println();
		return array;
	}
	
	
	//A2 PrintArray definieren: (kann durch einfachere statische toString Methode in java.util.Array ersetzt werden)
	static void printArray(int[] array) {
		for (int x : array) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
	
	//A3 Das Array mit den Umlauten definieren, dann printArray für die Printausgabe
	static char[] deutscheUmlaute() {
		return new char[] {'ä', 'ö', 'ü'};
	}
	
	// kann durch einfachere statische toString Methode in java.util.Array ersetzt werden
	static void printArray(char[] array) {
		for (char x : array) { // hier direkt mit char Datentyp versehen, damit keine Unicode Zahl in der Printausgabe erscheint, sondern das Zeichen
			System.out.print(x + " ");
		}
		System.out.println();
	}

	
	// A4: Statische Methode für deutsche Buchstaben (kleinbuchstaben, umlaute, ß)
	static char[] deutscheBuchstaben() {
		int laenge = 'z' - 'a' + 1 + 3 + 1;
		char array [] = new char [laenge];
		
		//a) a bis z mit for-Schleife in Array einbauen:
		for (char ch = 'a'; ch <= 'z'; ch++) {
			array[ch-'a'] = ch;
		}
		
		//b) Für die restlichen "Plätze" im Array die Stelle, an der fortgesetzt werden kann, errechnen.
		//	 Dann an den jeweiligen Indexstellen die übrigen 4 Buchstaben eingeben
		int nextIndex = 'z' - 'a';
		array[++nextIndex] = 'ä';
		array[++nextIndex] = 'ö';
		array[++nextIndex] = 'ü';
		array[++nextIndex] = 'ß';
		
		return array;
	}
	
	// A6: Addition bei zwei Arrays, Ergebnis wird in einzelnem Array gespeichert
	static int[] add(int[] a1, int []a2) {
		if (a1.length != a2.length) {
			throw new IllegalArgumentException("Array müssen dieselbe Länge haben");
		}
		int[]result = new int [a1.length];
		
		for (int i = 0; i < a1.length; i++) {
			result[i] = a1[i] + a2[i];
		}
		return result;
	}
	
	//A7. Join
	static int[] join(int[] a1, int [] a2) {
		int[] newlist = new int[a1.length + a2.length];
		
		//Liste a1 übertragen
		for (int i = 0; i<a1.length;i++) {
			newlist[i] = a1[i];
		}
		
		//Liste a2 übertragen. Beginn bei i bei letzter Stelle von a1!!!
		for (int i = a1.length; i < newlist.length;i++) {
			newlist[i] = a2[i-a2.length];
		}
		return newlist;
		
	}
	
	
	
} // Ende Klasse
