package garbagecollection;

public class Demo02EligableForGarbageCollection {

	public static void main(String[] args) {
		int zahl = 5;
		Integer[] zahlen = new Integer[] {42,43,44};
		new StringBuilder();

		// Zeile A

		new Object();

		// Zeile B

	}// Zeile nach main

	/*
	 * Wie viele Objekte sind in Zeile A f�r die Garbage Collection
	 * erreichbar/aufr�umbar? 1
	 * 
	 * Wie viele Objekte sind bis Zeile A erzeugt worden?
	 * 
	 * 3 : String Args, Integer[] zahlen, StringBuilder
	 * 
	 * Wie viele Objekte sind f�r die Garbage Collection erreichbar/aufr�umbar wenn
	 * die Zeile nach main erreicht wird : 4 -> 7
	 */
}
