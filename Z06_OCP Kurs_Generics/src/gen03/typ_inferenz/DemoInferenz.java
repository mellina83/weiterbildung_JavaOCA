package gen03.typ_inferenz;

/**
 * < Generischen Typangabe > <- angle Brackets
 *
 * <> <- Diamond Operator
 * 
 * <?> <- Wildcard Operator, nur für Variablen deklaration
 * 
 * Typ-Inferenz bezeichnet die Arbeitsweise des Diamond Operator. Der Diamond
 * Operator leitet den Generischen Datentyp von der Referenzseite ab
 * 
 * "Inferenz = in der Informatik vor allem aus einem formalen System
 * automatisiert erstellte Folgerung " (Wiktionary)
 */
public class DemoInferenz {

	public static void main(String[] args) {
//		demoUnbound();
//		inferenz();
//		casting01();
//		casting02();
		casting03();
	}
	
	/**
	 * Wenn die Referenz ungebunden ist, können wir für die Instanz den
	 * generischen Datentyp anpassen.
	 * 
	 * Es ist möglich auch Klassen die keine Basis oder Subklasse des vorherigen
	 * Generischen Datentyp sind zu verwenden.
	 * 
	 * Bei dieser Variante verlieren wir allerdings unsere Typ Sicherheit,
	 * welche Generics bieten soll. Da der Unbound Operator <?> mit der Klasse
	 * Object gleichgesetzt wird.
	 */
	public static void casting03() {
		PunktGen<?> punkt;
		
		punkt = new PunktGen<String>("Sechs", "Fuenf");
		String tmp = (String) punkt.getX();
		System.out.println(punkt.getX());
		System.out.println("-------------");
		
		//punkt = new PunktGen<Integer>(6, 6);
		
		System.out.println(((PunktGen<DemoInferenz>) punkt ).getX());
	}
	
	
	/**
	 * Wenn die Referenz mit einem Generic versehen ist, können wir beim Casting
	 * keinen anderen, auch keine Subklassen als Generischen Datentyp angeben.
	 */
	private static void casting02() {
		class A{ }
		
		class B extends A{	}
		
		//Wir legen unsere Generischen Typen fest;
		PunktGen<A> punkt_A;
		
		punkt_A = new PunktGen<A>();
		
//		Type mismatch: cannot convert from PunktGen<B> to PunktGen<A>
//		punkt_A = new PunktGen<B>();
		
		// Versuch eine Basisklasse des Generischen Typen zu verwenden.
//		Type mismatch: cannot convert from PunktGen<Object> to PunktGen<A>
//		punkt_A = new PunktGen<Object>();
	}

	/**
	 * Wenn die Referenz mit einem Generic versehen ist, können wir beim Casting
	 * keinen anderen, auch keine Subklassen als Generischen Datentyp angeben.
	 */
	private static void casting01() {
		PunktGen<String> punkt;
		
		punkt = new PunktGen<>("5", "5");
		System.out.println(punkt.getX());
		System.out.println(punkt.getY());
		System.out.println("-------------");
//		Cannot cast from PunktGen<String> to PunktGen<Integer>
//		System.out.println(((PunktGen<Integer>)punkt).getX());
		
//		Type mismatch: cannot convert from PunktGen<Integer> to PunktGen<String>
//		punkt = new PunktGen<Integer>(42,42);
	}

	private static void inferenz() {
		// Kompiliert, beide seiten gleicher Generischer Typ
		PunktGen<Number> punktNum01 = new PunktGen<Number>();

		// Kompiliert nicht, unterschiedliche Generische Typen
		// Type mismatch: cannot convert from PunktGen<Float> to
		// PunktGen<Number>
//		PunktGen<Number> punktNum02 = new PunktGen<Float>();

		// Diamond Operator, auf der Instanzseite können wir den Generischen
		// Typ weglassen, dieser wird von der Referenz abgeleitet.
		PunktGen<Number> punktNum03 = new PunktGen<>();
		
		// Kompiliert nicht, die Inferenz(Ableitung) muss auf der Instanzseite passieren.
		//PunktGen<> punktNum04 = new PunktGen<Number>();
	}

	public static void demoUnbound() {
		/**
		 * ? unbound bzw. Wildcard Deklaration der Variablen einsetzen
		 */
		PunktGen<?> punkt;

		punkt = new PunktGen<Integer>(42, 43);
		System.out.println("Punkt<Integer> mit aktuellem Parameter: " + punkt);
		System.out.println(
				"Punkt<?> getX().getClass(): " + punkt.getX().getClass());
		System.out.println("\n--------------------\n");

		punkt = new PunktGen<Double>(9.0, 7.0);
		System.out.println("Punkt<Integer> mit aktuellem Parameter: " + punkt);
		System.out.println(
				"Punkt<?> getX().getClass(): " + punkt.getX().getClass());
		System.out.println("\n--------------------\n");

		punkt = new PunktGen<Float>(9.0F, 7.0F);
		System.out.println("Punkt<Float> mit aktuellem Parameter: " + punkt);
		System.out.println(
				"Punkt<?> getX().getClass(): " + punkt.getX().getClass());
		System.out.println("\n--------------------\n");

		punkt = new PunktGen<Number>(9.0, 7.0F);
		System.out.println("Punkt<Number> mit aktuellem Parameter: " + punkt);
		System.out.println(
				"Punkt<?> getX().getClass(): " + punkt.getX().getClass());
		System.out.println(
				"Punkt<?> getY().getClass(): " + punkt.getY().getClass());
	}
}
