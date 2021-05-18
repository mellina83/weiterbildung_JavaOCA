package basics_operatoren;

public class WdhShortCircuit {

	/*
	 * Programmaufruf, Variante 1:
	 * 
	 * 		java operatoren.WdhShortCircuit Max
	 * 
	 * Programmaufruf, Variante 2:
	 * 
	 * 		java operatoren.WdhShortCircuit
	 * 
	 */
	public static void main(String[] args) {

		// Falls es mindestens ein Element im Array gibt (args.length > 0)
		// Und das allererste Element mindestens ein Zeichen hat
		
//		if(args.length > 0 & !args[0].isEmpty()) { // <- Exception, wenn args leer ist
		if(args.length > 0 && !args[0].isEmpty()) {
			String name = args[0];
			System.out.println("Hallo " + name);
		} else {
			System.out.println("Bitte beim Starten den Namen übergeben");
		}
		
	}

}
