package basics_methoden;

public class B06_ZuweisungenMitParameterUndReturn {

	public static void main(String[] args) {
		
		/*
		 * Nochmal: 
		 * 
		 *   Bei der Zuweisung muss der Typ links breit genug für den Typ rechts sein!
		 *   Sonst: Compilerfehler.
		 *   
		 *   Ausnahme: Zuweisung mit einem int-Literal und implizites Casting dabei  
		 */
		
		byte b1 = 2; // implizites Casting zu byte (also Ausnahme aus der Zuweisungsregel)
		
		int x1 = 2;
		// byte b2 = x1; // Compilerfehler: byte <= int  

		/*
		 * Übergeben eines Argumentes ist auch eine Zuweisung!
		 *
		 * Beim Übergeben des Argumentes werden nur Typen vergliechen und
		 * es gibt keine Ausnahme für int-Literale!
		 */
	
		byte var1 = 2;
		
		printByte(var1); // byte param = var1   <- Zuweisung, die beim Aufruf der Methode entsteht
						 // also:  byte <= byte
		
		// printByte(2); // byte param = 2
					     // also: byte <= int	<- Compilerfehler! Keine Ausnahme aus der Zuweisungsregel
		
		
	} // 
	
	static void printByte(byte param) {
		System.out.println("param = " + param);
	}

	/*
	 * Bei return bitte auch auf eine implizite Zuweisung achten
	 */
	static short getShort() {
		int var1 = 22;
		
		// return var1; // short tmp = var1
						// also: short <= int	<- deswegen Compilerfehler
		
		return 22;	// short <= (short)int	// wieder die Ausnahme aus der Zuweisungsregel (Zuweisung mit int-Literal)
	}
	
}
