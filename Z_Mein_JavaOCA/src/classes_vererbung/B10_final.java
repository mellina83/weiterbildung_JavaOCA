package classes_vererbung;

class Service {
	/*
	 * final Variablen dürfen nicht überschreiben werden
	 */
	private final int priority = 5; // Konstante
	
	public Service() {
		System.out.println( this.priority );
		// this.priority = 44; // Compilerfehler
	}
	
	/*
	 * final-Methoden dürfen nicht überschrieben werden
	 */
	public final int getPriority() {
		return priority;
	}
}

class Defrag extends Service {
//	Compilerfehler (final-Methode kann nicht überschrieben werden):
//	
//	public int getPriority() {
//		return 22;
//	}
}


/*
 * final 
 */
final class MyNumber {
	
}

// Compilerfehler (MyNumber ist final Klasse):
//
//class MyInteger extends MyNumber {
//	
//}


public class B10_final {

	public static void main(String[] args) {

	}

}
