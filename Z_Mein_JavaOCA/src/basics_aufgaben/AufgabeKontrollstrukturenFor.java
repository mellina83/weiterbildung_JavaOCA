package basics_aufgaben;

public class AufgabeKontrollstrukturenFor {

	public static void main(String[] args) {

//		- Folgende Zahlenreihe mit der for-Schleife in einer Zeile ausgeben: 
//		    
//			0 1 2 3 4 5 6 7 8 9
		System.out.println("*** A1");
		
		for(int i=0 ; i<10 ; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
//
//	- Folgende Zahlenreihe mit der for-Schleife in einer Zeile ausgeben:
//	 
//		    0 2 3 4 5 6 7 8 9
		System.out.println("*** A2.a");
		for(int i=0; i<10; i++) {
			if(i!=1) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		System.out.println("*** A2.b");
		for(int i=0; i<10; i++) {
			if(i==1) {
				i++;
			}
			
			System.out.print(i + " ");
		}
		System.out.println();
		
//
//	- Folgende Zahlenreihe mit der for-Schleife in einer Zeile ausgeben: 
//	    
//	    	-4 -2 0 2 4 ... 50
		System.out.println("*** A3.a");
		for (int i = -4; i < 51; i++) {
			if(i%2==0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		System.out.println("*** A3.b");
		for (int i = -4; i < 51; i+=2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
//
//	 - Bitte die englischen Kleinbuchstaben von a bis z in einer Zeile ausgeben: 
//	    	
//	    	a b c ... z
//
		System.out.println("*** A4.a");
		for(char ch='a'; ch<='z'; ch++) {
			System.out.print(ch + " ");
		}
		System.out.println();
		
		System.out.println("*** A4.b");
		for (int i = 'a'; i <= 'z' ; i++) {
			System.out.print((char)i + " ");
		}
		System.out.println();
		
//	 - Bitte die englischen Grossbuchstaben rueckwaerts in einer Zeile ausgeben: 
//	    
//	    	Z Y X ... A
//
		System.out.println("*** A5");
		for(char ch='Z'; ch>='A'; ch--) {
			System.out.print(ch + " ");
		}
		System.out.println();
		
//	- Bitte die Zahlen aus dem Bereich [1 ... 100] ausgeben, die durch 5 ohne Rest dividierbar sind
//
		System.out.println("*** A6");
		for(int i=1; i<=100; i++) {
			if(i%5==0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
//
//	- Optional. Folgende Zahlenreihe bitte in einer Zeile ausgeben: 
//		
//		    3 1 2 3 2 1 2 1 1
//		    _       _     _
		System.out.println("*** A7");
		for(int i=3; i>=1; i--) {
			System.out.print(i + " ");
			
			// i = 3, j=1, 2, 3
			// i = 2, j=1, 2
			// i = 1, j=1
			for(int j=1; j<=i; j++) {
				System.out.print(j + "_");
			}
		}
		System.out.println();
		
		
	} // end of main

}
