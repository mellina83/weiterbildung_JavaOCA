package basics_operatoren;

public class WdhPostUndPraeInkrement2 {

	public static void main(String[] args) {

		/*
		 * Der gelesene Wert wird notiert, um mit dem notierten Wert etwas zu machen 
		 */
		
		System.out.println("* A");
		
		int x = 0;
		System.out.println(x++); // 0 	// lesen(0), inkrementieren, ausgeben(0)
		
		System.out.println("x = " + x); // 1
		
		
		System.out.println("* B");
		
		x = 0;
		System.out.println(++x); // 1 	// inkrementieren, lesen(1), ausgeben(1)
		
		System.out.println("x = " + x); // 1
		
		
		System.out.println("* C");
		
		x = 0;
		
		int y = x++ + x++; // lesen (links, 0), inkrementieren (links, x=1), lesen (rechts, 1), inkrementieren (rechts, x=2)
		
		System.out.println("y = " + y); // 1
		System.out.println("x = " + x); // 2
		
		System.out.println("* D");
		
		x = 0;
		
		y = ++x + ++x; // inkrementieren (links, x = 1), lesen (links, 1), 
					   // inkrementieren (rechts, x=2), lesen (rechts, 2)
		
		System.out.println("y = " + y); // 3
		System.out.println("x = " + x); // 2
		
		System.out.println("* E");
		
		x = 0;
		
		x = x++; // lesen (0), inkrementieren(x = 1), zuweisen(0)
		System.out.println("x = " + x); // 0
		
		System.out.println("* F");
		
		x = 0;
		
		x = ++x; // inkrementieren (x=1), lesen (1), zuweisen(1)
		
		System.out.println("x = " + x); // 1
		
	} // end of main

}
