package methoden;


/* A2
 * Definieren Sie eine statische Methode "sum", die zwei int-Parameter erhält, die Summe berechnet und das Ergebnis zurück liefert.
 * Testen Sie Ihre Lösung. Wenn die Aufgabe gelöst ist, überlegen Sie ob Ihre Methode immer die korrekten Ergebnisse liefert.
 */

public class AufgabeMethodenA02 {
	
	static int sum(int a, int b) {
		int summe = a + b;
		return summe ;
	}
	
	public static void main(String[] args) {
		
		int summe = sum(4, 7);
		System.out.println(summe);
		summe = sum(5, 20);
		System.out.println(summe);
		
		
		
	} // Ende Main Methode

}
