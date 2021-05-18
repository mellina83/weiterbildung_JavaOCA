package basics_kontrollstrukturen;

import java.util.LinkedList;
import java.util.Queue;

public class WhileSchleife {

	public static void main(String[] args) {

		/*
		 * Endlose Schleife:
		 */
		
//		while(true) {
//			System.out.println("laufe...");
//		}
		
		
		/*
		 * Praxis:
		 */
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(12);
		queue.add(13);
		queue.add(14);
		
		while( !queue.isEmpty() ) {
			System.out.println(queue.remove());
		}
		
		/*
		 * Zwar kann jede Schleife jede andere Schleife ersetzen, aber 
		 * die Lösung wird dann nicht so elegant aussehen:
		 */
		
		for (int i = 0; i < 4; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		// System.out.println( "i = " + i ); // Compilefehler: i ist ungültig
		
		// dasselbe mit der while-Schleife (nicht so schön):
		int i = -1;
		while(i++ < 3) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("i = " + i); // i = 4
		
		
		/*
		 * Warum wird i am Ende = 4?
		 * 
		 * Test mit x und if:
		 * 
		 * Variable x ist an dem Vergleich beteiligt: x < 3 
		 */
		int x = 2;
		
		if(x++ < 3) { // tmp = 2, x = x + 1, tmp < 3
			System.out.println("1. x = " + x); // 3
		}
		if(x++ < 3) { // tmp = 3, x = x + 1, tmp < 3
			System.out.println("2. x = " + x); // keine Ausgabe
		}
		
		System.out.println("3. x = " + x); // 4
		
		
	} // end of main

}
