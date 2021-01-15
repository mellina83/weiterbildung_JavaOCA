package methoden;

public class AufgabeUeberladen {

	public static void main(String[] args) {
		
		/*
		 * Kleine Aufgabe:
		 * 
		 * Entwickeln Sie bitte eine Methode 'getMax', die aus zwei int-Paramter
		 * den größeren zurückliefert.
		 * Sind die Parameter gleich, wird einer davon zurückgeliefert.
		 */
		
		int x = getMax(22, -7); // return 22
		System.out.println(x);
		
		x = getMax(-100, -7); // return -7
		System.out.println(x);
		
		x = getMax(-7, -7); //return -7
		System.out.println(x);

	}
	
	static int getMax(int x1, int x2) {
		if (x1 > x2) {
			return x1;
		} else if (x1 < x2) {
			return x2;
		} else {
			return x1;
		}
		
	}
	

}
