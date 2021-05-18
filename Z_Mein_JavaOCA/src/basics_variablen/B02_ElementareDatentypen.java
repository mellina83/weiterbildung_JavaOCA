package basics_variablen;

public class B02_ElementareDatentypen {

	public static void main(String[] args) {

		/*
		 * Zahlen-Typen
		 */
		byte 	x1; 	// 8 bit:	-128 ... 127	(<- Exam!)
		short 	x2;		// 16 bit
		//char
		int		x3;		// 32 bit
		long	x4;		// 64 bit
		
		float	x5;		// 32 bit
		double	x6;		// 64 bit
		
		System.out.println( "int max: " + Integer.MAX_VALUE ); // 2147483647 (nicht auswendig lernen)
		System.out.println( "int min: " + Integer.MIN_VALUE ); //
		
		System.out.println("long max: " + Long.MAX_VALUE);
		
		/*
		 * char (eigentlich auch wie eine nichtnegative Zahl)
		 */
		char 	x7;		// 16 bit
		
		/*
		 * boolean
		 */
		boolean x8;		// nicht spezifiziert
	}

}
