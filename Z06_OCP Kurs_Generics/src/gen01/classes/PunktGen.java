package gen01.classes;

/*
 * Generisch bedeutet, dass Klassen, Schnittstellen und Methoden
 * Parameter verwenden, welche einen Typ darstellen.
 *
 * Eine Klasse mit formalem Typ-Parameter stellt eine generische 
 * Klasse dar. 
 * 
 * Der formale Typ-Parameter ist ein symbolischer Name,
 * der wie ein normaler Bezeichner in Java aufgebaut ist und 
 * eingeschlossen in spitzen Klammern nach dem Klassennamen 
 * angegeben werden muss.
 * 
 * Der formale Typ-Parameter ist ein 'Platzhalter' - Stellvertreter
 * der zur Laufzeit ausgetauscht wird
 * 
 * Die Klasse PunktGen<T> bzw. <N> stellt eine generische Klasse mit dem 
 * formalen Typ-Parameter T bzw. N dar. Die Entscheidung über den konkreten
 * zu verwendenden Typ – hier Integer und Double – findet erst bei
 * der Nutzung der generischen Klasse statt.
 * 
 * Der formale Typ-Parameter T in der Klassendeklaration wird auch
 * zur Definition der Datenfelder der generischen Klasse verwendet.
 * Genauso tritt er als Typ für formale Parameter und Rückgabewerte
 * von Methoden auf. Damit können Klassen unabhängig von einem 
 * speziellen Typ generisch definiert werden. Der formale Typ-Parameter
 * wird bei der Verwendung der Klasse dann durch den gewünschten 
 * konkreten Datentyp ersetzt
 * 
 * Der Compiler erzeugt bei der Übersetzung einer generischen Klasse
 * nur eine einzige Bytecode-Datei, unabhängig davon, wie viele aktuell
 * parametrisierte Klassen der generischen Klasse verwendet werden.
 * Für die generische Klasse PunktGen<T> erzeugt der Compiler die Datei
 * PunktGen.class.
 * 
 * Durch das Type Erasure werden beim Übersetzen einer generischen
 * Klasse alle Vorkommen des formalen Typ-Parameters T im Rumpf der
 * Klasse durch den Typ Object ersetzt. So wird für die Klasse
 * 
 * class GenKlasse<T>
 * {
 * 		T ref;
 * }
 * folgender Bytecode erzeugt:
 * 
 * class GenKlasse
 * {
 * 		Object ref;
 * }
 */

//PunktGen p01 = new PunktGen(); RAW-Type = T -> Object

//public class PunktGen {
//
//	private Object x;
//	private Object y;
//}

//PunktGen<String> p01 = new PunktGen<>(); Generic = T -> String

//public class PunktGen {
//
//	private String x;
//	private String y;
//}

//PunktGen<Integer> p01 = new PunktGen<>(); Generic = T -> Integer

//public class PunktGen {
//
//	private Integer x;
//	private Integer y;
//}

public class PunktGen<T> {

	private T x;
	private T y;

	public PunktGen(T x, T y) {
		this.x = x;
		this.y = y;
	}

	public T getX() {
		return this.x;
	}

	public void setX(T x) {
		this.x = x;
	}

	public T getY() {
		return y;
	}

	public void setY(T y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Punkt [x=" + x + ", y=" + y + "]";
	}
}
