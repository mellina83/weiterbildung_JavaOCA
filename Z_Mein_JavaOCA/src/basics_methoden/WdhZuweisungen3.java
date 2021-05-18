package basics_methoden;

/*
 * Regel: Typ links muss breit genug sein für den Typ rechts.
 * 
 * 	Bei einer Zuweisung bitte die Typen vergleichen! 
 *  Werte bitte nicht vergleichen!
 *  Ausnahme 1: explizite Zuweisung mit einem int-Literal
 *  Ausnahme 2: implizite Zuweisung mit einem int-Literal
 *  			mit return
 *  
 */
public class WdhZuweisungen3 {

	public static void main(String[] args) {

		int x = 12;
		
		
		/*
		 * Explizite Zuweisung
		 */
		// short y = x; // short <= int
		float z = x;
		
		byte b1 = 12; 		// Ausnahme 1 (implizites Casting)
		byte b2 = (byte)12; // explizites Casting
		
		/*
		 * Implizite Zuweisung beim Übergeben eines Argumentes
		 */
		double d = 1;
		// print(d); 		// byte param = d		:	int <= double
		
		print((byte)12);
		// print(12);		// byte param = 12		: 	byte <= int
		//print(12L);								:   byte <= long
		

	}
	
	static void print(byte param) { }

	/*
	 * Implizite Zuweisung beim Hochladen der return-Argumentes 
	 * in 'temporäre' Variable. Diese temporäre Variable wird den Typ haben,
	 * den die Methode als Rückgabe-Typ deklariert.  
	 * 
	 */
	static byte get() {
		// return 12.0; // byte tmp = 12.13		: int <= double
		
		return 12;		// byte tmp = (byte)12			
	}
	
	static int getInt() {
		//return 12L;	// int tmp = 12L;		: int <= long
		
		return (int)12L;
	}
	
} // end main
