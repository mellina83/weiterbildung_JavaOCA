package basics_aufgaben;

public class AufgabeKontrollstrukturenSwitch {

	public static void main(String[] args) {

		/*
		 * Nachteil: schlecht lesbar (viele Verschachtelungen)
		 */
		for (char ch = 'A'; ch<='z' ; ch++  ) {
			
			if( ch >= 'a' && ch <= 'z' ) {
				
				switch(ch) {
					case 'a': 
					case 'e': 
					case 'o': 
					case 'i': 
					case 'u':
						System.out.println(ch + " ist ein Vokal");
						break;
					default:
						System.out.println(ch + " ist ein Konsonant");
				}
				
			} else {
				// kein kleiner Buchstabe
				System.out.println(ch + " ist kein kleiner englischer Buchstabe");
			}
			
		}
		
		/*
		 * Besser wäre:
		 * 
		 * for (char ch = 'A'; ch<='z' ; ch++  ) { 
		 *    checkIsCharVokalOrKonsonantAndPrintResult(ch);
		 * }
		 */
		
		
	}

}
