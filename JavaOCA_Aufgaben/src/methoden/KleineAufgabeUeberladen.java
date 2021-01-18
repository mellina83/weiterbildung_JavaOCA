package methoden;

public class KleineAufgabeUeberladen {

	public static void main(String[] args) {
		
		/*
		 * Kleine Aufgabe:
		 * 
		 * A1:
		 * Entwickeln Sie bitte eine Methode 'getMax', die aus zwei int-Paramter
		 * den größeren zurückliefert.
		 * Sind die Parameter gleich, wird einer davon zurückgeliefert.
		 * 
		 * A2:
		 * Wie A1, nur mit drei int-Parametern, und dabei die Methode von A1 nutzen
		 * --> Überladung von getMax
		 */
		
		int x = getMax(22, -7); // return 22
		System.out.println(x);
		
		x = getMax(-100, -7); // return -7
		System.out.println(x);
		
		x = getMax(-7, -7); //return -7
		System.out.println(x);
		
	} // Ende Main
	
	static int getMax(int x1, int x2) {
		return x1 > x2 ? x1: x2;
		
		/* Meine Lösung:
		if (x1 >= x2) {
			return x1;
		} else {
			return x2;
		}
		*/
	}
	

}
