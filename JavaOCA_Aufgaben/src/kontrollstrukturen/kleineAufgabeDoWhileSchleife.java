package kontrollstrukturen;

public class kleineAufgabeDoWhileSchleife {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 3;
		
		int summe = 0;
		
		/*
		 * A1
		 * Mit While solange a und b um jeweils 1 erhöhen, bis die Summe den Wert 100 sprengt ( größer als 100 wird)
		 * Danach a, b und summe ausgeben
		 * 
		 * A2
		 * wieder a = 1 und b = 3 setzen.
		 * mit do While solange a und b um jeweils 1 erhöhen, bis die Summe den Wert 100 sprengt (größer als 100 wird)
		 * Danach a, b und summe ausgeben.
		 */
		
		System.out.println("Aufgabe 1");
		
		while (summe <= 100) {
			a++;
			b++;
			
			summe = a + b;
		}
		summe = a + b;
		System.out.println("a ist: " + a + ", b ist: " + b + ", Summe ist: " + summe);
		
		
		System.out.println();
		System.out.println("Aufgabe 2");
		int c = 1;
		int d = 3;
		int summe2 = 0;
		
		do {
			c++;
			d++;
			summe2 = c + d;
		} while (c+d <= 100);
		
		System.out.println("a ist: " + c + ", b ist: " + d + ", Summe ist: " + summe2);
		

	} // Ende Main Methode

}
