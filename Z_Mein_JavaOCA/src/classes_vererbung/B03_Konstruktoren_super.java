package classes_vererbung;

/*
 * Der Compiler sorgt intelligent dafür, dass folgende Regeln erfüllt sind:
 * 
 * - Jede Klasse hat mindestens einen Konstruktor
 * - Jeder Konstruktor hat als erste Anweisung den Aufruf eines anderen Konstruktors
 *   entweder explizit mit this(?) oder super(?) oder implizit mit super() 
 * - Alle Attribute werden vorinitialisiert
 */


class C1 /* extends Object */ {
	/*
	 * default-Konstruktor, generiert vom Compiler:
	 * 
	 * C1() {
	 * 	super(); // <- Konstruktor der Klasse Objekt aufgerufen 
	 * }
	 */
}


class C2 {
	// Expliziter Noargs-Konstruktor. 
	// Der Compiler generiert KEINEN default-Konstruktor für diese Klasse
	C2() {
		super();
	}
}


class C3 {
	C3() {
		// super(); // <- generiert der Compilerf
	}
}


/*
 * Achtung! Exam!!!
 * 
 * Compilerfehler beim super()-Aufruf, wenn die Basisklasse 
 * keinen Noargs-Konstruktor hat
 */
class ExamBase {
	ExamBase(int x) {}
}

class ExamDerivedA extends ExamBase {
	// Der Compiler generiert den default-Konstruktor:
	// ExamDerivedA() {
	//   super(); // <-hier ensteht der Compilerfehler
	// }
}

class ExamDerivedB extends ExamBase {
	ExamDerivedB() {
		// super(); // <- generiert vom Compiler, hier ensteht der Compilerfehler
	}
}

class ExamDerivedC extends ExamBase {
	ExamDerivedC() {
		super(); // <-hier ensteht der Compilerfehler
	}
}

class ExamDerivedD extends ExamBase {
	ExamDerivedD() {
		super(12);
	}
}



public class B03_Konstruktoren_super {

	public static void main(String[] args) {
	}

}
