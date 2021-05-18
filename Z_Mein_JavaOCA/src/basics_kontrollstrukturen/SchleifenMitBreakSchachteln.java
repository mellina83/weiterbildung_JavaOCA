package basics_kontrollstrukturen;

public class SchleifenMitBreakSchachteln {

	public static void main(String[] args) {

		for (int i = 0; i < 2; i++) {
			
			int j = 0;
			while( j<=i ) {
				System.out.print(j + " ");
				
				if(++j==1) {
					break;
				}
			}
			System.out.println();
			
		}
		
		/*
		 * i = 0 (i < 2 => true)
		 * 
		 * j = 0
		 * 		(j <= i => true)
		 * 			Ausgabe "0 "
		 * 		j = 1 (inkrement)
		 * 		(j==1 => true)
		 * 			break
		 * 
		 * i = 1 (i < 2 => true)
		 * 
		 * j = 0
		 * 		(j <= i => true)
		 * 			Ausgabe "0 "
		 * 		j = 1 (inkrement)
		 * 		(j==1 => true)
		 * 			break
		 * 
		 * i = 2 (i < 2 => false)
		 */
		
		
	} // end of main

}
