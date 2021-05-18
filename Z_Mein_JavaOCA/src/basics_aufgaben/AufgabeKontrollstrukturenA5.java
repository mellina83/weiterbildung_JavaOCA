package basics_aufgaben;

public class AufgabeKontrollstrukturenA5 {

	/*
		Zeichnen Sie ein gefülltes Rechteck auf der Konsole:

	 	*****
        *****
        *****
        *****

	 */
	public static void main(String[] args) {

		int zeilen = 4;
		int spalten = 5;
		char ch = '*';		
		
		for(int z = 0; z<zeilen; z++) {
			for(int s=0; s<spalten; s++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		
	}

}
