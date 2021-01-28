package arrays;

public class KleineAufgabeVarargsMethoden {

	public static void main(String[] args) {
		
		/*
		 * Definieren Sie bitte die Methode 'getMin', die den kleinsten Wert aus den
		 * übergebenen Argumenten findet und zurückliefert:
		 */
		
		System.out.println( getMin()  ); // 0 (heute ausnahmsweise)
		System.out.println( getMin (6)); // 6
		System.out.println( getMin (6, -3)); // -3
		System.out.println( getMin (6, -3, 7, -3)); // -3
		System.out.println( getMin(6, -3, 7, -3, -22)); // -22
		
		int[] numbers = {9, -33, 55, -1000 };
		System.out.println(getMin(numbers));
		

	} // Ende Main
	
	static int getMin(int...values) {
		//if(keine Argumente) {throw Exception } -> Kennen wir noch nicht
		
		if(values == null || values.length == 0) { // Mit nur einem | würde Nullpointer Exception rechts stören
			return 0; //Sondervereinbarung
		}
		
		
		int minvalue = Integer.MAX_VALUE;
		
		for (int x : values ) {
			if ( x < minvalue) {
				minvalue = x;
			}
		}
		
		return minvalue;
	}

}
