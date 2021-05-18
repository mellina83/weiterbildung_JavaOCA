package basics_aufgaben;

public class AufgabeKontrollstrukturenA1 {

	 //Berechnen Sie die Summe aller folgenden Werte: 1, 2, 3 ... 10. 
	// Geben Sie die Summe aus.

	public static void main(String[] args) {

		int summe = 0;
		
		for(int zahl = 1; zahl<=10; zahl++) {
			summe += zahl;
		}
		
		System.out.println("summe: " + summe);
		
		
	} // end of main

}
