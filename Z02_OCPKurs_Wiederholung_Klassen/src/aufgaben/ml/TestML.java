package aufgaben.ml;

import java.util.Arrays;
/**
 * Aufgabe '�berschreiben' 'Override'
 * 
 * Erzeugen Sie eine neue Klasse 'ArrayListPositive' , die von der Klasse
 * 'java.util.ArrayList' erbt.
 * 
 * Gestalten Sie die neue Klasse so, dass sie folgende Bedingungen erf�llt:
 * 
 * - Nur Integer-Referenzen k�nnen in einer ArrayListPositive gespeichert
 * werden.
 * 
 * - Keine 'null' k�nnen in einer ArrayListPositive gespeichert werden. Beim
 * Versuch wird NullArgumentException geworfen.
 * 
 * - Keine 0(Zero)-Werte k�nnen in einer ArrayListPositive gespeichert werden.
 * Beim Versuch wird NotPositiveArgumentException geworfen.
 * 
 * - Keine negativen Werte k�nnen in einer ArrayListPositive gespeichert werden.
 * Beim Versuch wird NotPositiveArgumentException geworfen.
 * 
 * Testen Sie Ihre L�sung mit den werten :
 * 
 * <code>
 * 42, 12, 23, -12, 0, Integer.MIN_VALUE, Long.MAX_VALUE;
 * </code>
 */
public class TestML {
	public static void main(String[] args) {
		ArrayListPositive ar = new ArrayListPositive();

		ar.add(42);
		ar.add(12);
		ar.add(23);
		ar.add(-12);
//		ar.add(0);
//		ar.add(Integer.MIN_VALUE);
//		ar.add(Long.MAX_VALUE);
		
		System.out.println(Arrays.toString(ar.toArray()));
		
		System.out.println(ar.toString());
	}
}
