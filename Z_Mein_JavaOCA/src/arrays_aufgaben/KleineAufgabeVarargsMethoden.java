package arrays_aufgaben;

public class KleineAufgabeVarargsMethoden {

	public static void main(String[] args) {

		/*
		 * Lösen Sie bitte die Aufgabe mit einer Varargs-Methode!
		 * 
		 * Definieren Sie bitte die Methode 'getMin', die den kleinsten Wert aus
		 * den übergebenen Argumenten findet und zurückliefert:
		 * 
		 */
		
		System.out.println( getMin() ) ; // 0 (heute ausnahmsweise)
		System.out.println( getMin(6) ) ; // 6
		System.out.println( getMin(6, -3) ) ; // -3
		System.out.println( getMin(6, -3, 7, -3) ) ; // -3
		System.out.println( getMin(6, -3, 7, -3, -22) ) ; // -22
		
		int[] numbers = { 9, -33, 55, -1000 };
		System.out.println( getMin(numbers) );
		
		numbers = null;
		System.out.println( getMin(numbers) ); // 0 (heute ausnahmsweise)
	}

	static int getMin(int... values) {
		if(values==null || values.length==0) {
			return 0; // Sondervereinbarung
		}
		
		int min = Integer.MAX_VALUE;
		
		for(int x : values) {
			if(min > x) {
				min = x;
			}
		}
		
		return min;
	}
}
