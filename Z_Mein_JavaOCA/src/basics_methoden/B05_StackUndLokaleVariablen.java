package basics_methoden;

/*
 * 
 */
public class B05_StackUndLokaleVariablen {

	public static void main(String[] args) {

		int x;
		// System.out.println(x); // Compilerfehler! Lokale Variable x wurde nicht initialisiert
		
		x = 12;
		
		modify1(x); // egal was in der modify1 geschieht, sie kann die 
					// lokale Variable x der main Methode nicht ändern! 
		
		System.out.println("1. x = " + x); // 12
		
		modify2(x);
		
		System.out.println("2. x = " + x); // 12
		
		x = modify2(x); // Zuweisung in der main-Methode!
		
		System.out.println("3. x = " + x); // 33
	} // end of main

	
	static void modify1(int x) {
		x = 33; // modify1 ändert nur die eigene lokale x (den Parameter)
	}
	
	static int modify2(int x) {
		x = 33; // modify2 ändert nur die eigene lokale x (den Parameter)
		return x;
	}
	
}
