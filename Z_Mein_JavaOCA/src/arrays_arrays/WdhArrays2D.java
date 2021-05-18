package arrays_arrays;

import java.util.Random;

public class WdhArrays2D {

	public static void main(String[] args) {
		
		String s = null;
		// s.toUpperCase();	// NullPointerException
		
		
		String[] a1 = new String[2];
		// a1[0].toUpperCase();	// NullPointerException

		/*
		 * 2D-Array mit Unterarrays 
		 */
		
		Random[][] a2 = new Random[2][3]; // Ein Objekt vom Typ Random[][] mit 2 Positionen (Elementen)
										  //	+ 
										  // Zwei Objekte vom Typ Random[] (mit je 3 Positionen, alle null)

		Random[] var1 = a2[0]; // Random[] <= Random[]
		
		System.out.println(var1 == null); // false (da zwei Objekte Random[] erzeugt wurden)
	
		
		/*
		 * 2D-Array ohne Unterarrays 
		 */
		
		Random[][] a3 = new Random[2][]; // Ein Objekt vom Typ Random[][] mit 2 Positionen (alle null)

		Random[] var2 = a3[0];
		
		System.out.println(var2 == null); // true (da keine Random[]-Objekte erzeugt wurden)
		
		a3[0] = new Random[7];
		a3[1] = new Random[2];
		
	}

}
