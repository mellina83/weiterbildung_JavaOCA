package wdh;

public class A02Kontrollstrukturen {

	public static void main(String[] args) {
		
		int summe = 0;
		for (int i = 1; i <=10; i ++) {
			summe+= i;
			System.out.print(i + " ");
		}
		System.out.println("= " + summe);

		final int x = 3;
		final int y = 4;
		
		int result = 1;
		
		for (int i = 0; i <y; i++) {
			result *= x;
		}
		System.out.println(result);
		
		result = 1;
		int i = 0;
		while ( i< y) {
			result *= x;
			i++;
		}
		System.out.println(result);
		
		double ergebnis = Math.pow(x, y);
		int ergebnisb = (int) ergebnis;
		System.out.println(ergebnisb);
		
		//Rechteck
		for (int j =0; j < 4; j++) {
			for (int k = 0; k < 5; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//A7
		int zeilen = 4;
		int spalten = 5;
		char ch = '*';
		
		for (int j =0; j< zeilen; j++) {
			for (int k = 0; k < spalten; k++) {
				if (j == 0 || j == zeilen-1 ||  k == 0 || k == spalten-1) {
					System.out.print(ch);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
	} // Ende Main

}
