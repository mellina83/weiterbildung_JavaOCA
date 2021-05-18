package basics_aufgaben;

public class AufgabeKontrollstrukturenA7 {

	/*

		Zeichnen Sie folgendes Spielfeld auf der Konsole:

         12345
        A.....
        B.....
        C.....
        D.....
        E.....

	 */
	public static void main(String[] args) {

		int zeilen = 5;
		int spalten = 5;
		
		System.out.print(' ');
		for (int s = 0; s < spalten; s++) {
			System.out.print(s+1);
		}
		System.out.println();
		
		for (char z = 'A'; z < 'A' + zeilen; z++) {
			System.out.print(z);
			
			for (int s = 0; s < spalten; s++) {
				System.out.print('.');
			}
			System.out.println();
		}
		
	} // end of main

}
