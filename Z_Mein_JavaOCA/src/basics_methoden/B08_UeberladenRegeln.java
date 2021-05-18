package basics_methoden;

/*
 * Überladen (overloading):
 * 		in derselben Klasse mehrere Methoden mit demselben Namen definieren
 * 
 * Alle Methoden einer Klasse müssen eindeutige Signaturen haben
 * 
 * Signatur: Methodenname + Liste der Parametertypen
 * 
 */
public class B08_UeberladenRegeln {

	public static void main(String[] args) {
		
		System.out.println(22);
		System.out.println(22L);
		System.out.println(22f);
		System.out.println(22D);
		System.out.println(args);
	}
	
	/*
		Rückgabetyp ist egal: Diese beiede Methoden haben dieselbe Signatur:
		
		static int m1() { return 0; }
		static void m1() {  }
		
		Die können nicht gleichzeitig existieren
	*/
	
	/*
	 * m2 wird 4 Mal überladen (Aber bitte mit dem Überladen nicht übertreiben!)
	 * 
	 * 	m2()
	 * 	m2(float)
	 * 	m2(int, int)
	 * 	m2(int, byte)
	 */
	static void m2(int x) {}
	static void m2(float x) {}
	static void m2(int x, int y) {}
	static void m2(int x, byte y) {}

}
