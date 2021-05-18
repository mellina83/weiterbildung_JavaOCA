package classes_vererbung;

/*
 * Der Compiler sorgt intelligent dafür, dass folgende Regeln erfüllt sind:
 * 
 * - Jede Klasse hat mindestens einen Konstruktor
 * - Jeder Konstruktor hat als erste Anweisung den Aufruf eines anderen Konstruktors
 *   entweder explizit mit this(?) oder super(?) oder implizit mit super() 
 * - Alle Attribute werden vorinitialisiert
 */

class Class1 {
	int x;
	/*
	 * default-Konstruktor generiert vom Compiler:
	 * 
	 * Class1() {
	 *   super();
	 *   this.x = 0;
	 * }
	 */
}

class Class2 {
	int x = 12;
	/*
	 * default-Konstruktor generiert vom Compiler:
	 * 
	 * Class1() {
	 *   super();
	 *   this.x = 12;
	 * }
	 */
}

class Class3 {
	int x;
	
	Class3() {
		// super(); 	// generiert vom Compiler
		// this.x = 0;  // generiert vom Compiler
	}
}

class Class4 {
	int x = 12;
	
	Class4() {
		// super(); 	 // generiert vom Compiler
		// this.x = 12;  // generiert vom Compiler
	}
}

class Class5 {
	int x = 12;
	
	Class5() {
		// super(); 	 // generiert vom Compiler
		// this.x = 12;  // generiert vom Compiler
	}
	
	Class5(int x) {
		// super();  	// generiert vom Compiler
		this.x = x;
	}
	
	Class5(char ch) {	// dafür wird nichts zusätzlich vom Compiler generiert
		this(3);
	}
}

/*
 * Init-Blöcke werden intelligent in Konstruktoren nach dem this(?) 
 * oder super(?)-Aufruf integriert. Aber nicht doppelt.
 */
class Class6 {
	int x;
	
	public Class6() {
		// super();	 // generiert vom Compiler
		
		// 'kopiert' vom Compiler:
		
		// {
		// 		x = 12;
		// 		System.out.println("x = " + x);
		// }
	}
	
	Class6(int x) {
		this(); // <- init-Block gibt es dort bereits
		this.x = x;
		System.out.println("Konstr. 2. x = " + x);
	}
	
	{
		x = 12;
		System.out.println("init. x = " + x);
	}
	
}


public class B05_Konstruktoren_Attribute_init_blocks {

	public static void main(String[] args) {
		System.out.println(new Class5().x); // 12
		System.out.println(new Class5(77).x); // 77
		System.out.println(new Class5('a').x); // 3
		
		System.out.println("*** test init Blocks");
		System.out.println("* test 1");
		new Class6();
		System.out.println("* test 2");
		new Class6(33);
	}

}
