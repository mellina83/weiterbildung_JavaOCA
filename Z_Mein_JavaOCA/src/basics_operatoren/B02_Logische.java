package basics_operatoren;

public class B02_Logische {

	/*
	 * Logische Operatoren haben nur boolean-Operanden
	 */
	public static void main(String[] args) {

		boolean heuteIstDonnerstag = true;
		boolean esIstNach17Uhr = false;
		
		/*
		 * 		&	&&		<-  AND
		 * 		|	||		<-	OR
		 * 		^			<-  XOR
		 * 		!			<-  NOT		(unär)
		 */
		
		/*
		 * Ob es heute ein anderer Tag als Donnerstag:
		 */
		System.out.println("*** Test !");
		System.out.println("heute ist Donnerstag: " + heuteIstDonnerstag); // true
		System.out.println("heute ist kein Donnerstag: " + !heuteIstDonnerstag); // false
		
		/*
		 * Logik von XOR:
		 * 
		 * false ^ false = false 
		 * false ^ true = true 
		 * true ^ false = true 
		 * true ^ true = false 
		 */
		System.out.println("*** Test ^");
//		System.out.println("false ^ true: " + esIstNach17Uhr ^ heuteIstDonnerstag); // Compilerfehler: String ^ boolean
		System.out.println("false ^ true: " + (esIstNach17Uhr ^ heuteIstDonnerstag)); // true 
		System.out.println("true ^ false: " + (heuteIstDonnerstag ^ esIstNach17Uhr)); // true 

		System.out.println("false ^ false: " + (false ^ esIstNach17Uhr)); // false 
		System.out.println("true ^ true: " + (heuteIstDonnerstag ^ true)); // false 
		
		/*
		 * 'normal' vs. 'kurzschluss' (short circuit)
		 * 
		 * Die beiden haben dieselbe boolean-Logik
		 * 
		 * Unterschied: der kurzschluss-Operator versucht sich die Arbeit zu ersparen
		 */
		System.out.println("*** Teste 'normalen' & ");
		System.out.println("true & false = " + (heuteIstDonnerstag & esIstNach17Uhr)); // false
		
		System.out.println("*** Teste den 'short circuit' && ");
		System.out.println("true && false = " + (heuteIstDonnerstag && esIstNach17Uhr)); // false
		
		int x = 0;
		
		boolean result = esIstNach17Uhr & ++x==3; // beide Seiten werden immer ausgewertet
		System.out.println("false & false: " + result); // false
		System.out.println("x = " + x); // 1
		
		int y = 0;
		result = false && ++y==3; // rechte Seite wird nicht ausgewertet, 
											// da der linke Operand (false) das 
											// Endergebnis (false) bereits festlegt
		System.out.println("false && egal: " + result); // false
		System.out.println("y = " + y); // 0
	
		result = true && ++y==3; // rechte Seite muss hier ausgewertet werden 
								 // um das Endergebnis zu ermitteln
		System.out.println("true && false: " + result); // false
		System.out.println("y = " + y); // 1
	
		System.out.println("*** Teste | und ||");
		
		int z = 0;
		result = true | ++z==3; // beide Seiten werden ausgewertet
		System.out.println("true | false = " + result); // true
		System.out.println("z = " + z); // 1
		
		z = 0; // zurücksetzen
		result = true || ++z==3; // rechte Seite wird nicht ausgewertet, da das Endergebnis von dem linken Wert festgelegt wird
		System.out.println("true || egal = " + result); // true
		System.out.println("z = " + z); // 0
		
		result = false || ++z==3; // rechte Seite muss hier ausgewertet werden 
								  // um das Endergebnis zu ermitteln
		System.out.println("false || false = " + result); // false 
		System.out.println("z = " + z); // 1
	}

}
