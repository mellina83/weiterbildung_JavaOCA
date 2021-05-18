package basics_aufgaben;

public class AufgabeKontrollstrukturenA6 {

	/*

		Zeichnen Sie ein leeres Rechteck auf der Konsole:
    
        *****
        *   *
        *   *
        *****

	 */
	public static void main(String[] args) {

		int zeilen = 4;
		int spalten = 5;
		
		for(int z = 0; z < zeilen; z++) {
			for (int s = 0; s < spalten; s++) {
				
				if(z==0 || z==zeilen-1 || s==0 || s==spalten-1) {
					System.out.print('*');
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
		
	}

}
