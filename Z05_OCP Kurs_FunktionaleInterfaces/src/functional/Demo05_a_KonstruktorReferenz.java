package functional;

/*
 * Für ein funktionales Interface mit einer Methode, die - eine Referenz von Typ
 * X zurückliefert (hier 'String create()')
 *
 * - und wenn die Realisierung aus return new X() bestehen würde ist es möglich
 * eine Referenz auf einen Konstruktor zu erstellen.
 */
@FunctionalInterface
interface StringCreator {
	String create();
}

interface StringCreatorWithParameter {
	String create(String string);
}

interface StringCreatorWithStringBuilder {
	String create(StringBuilder builder);
}

public class Demo05_a_KonstruktorReferenz {
	public static void main(String[] args) {
//		demo01();
		
		demo02();
	}

	private static void demo02() {
		StringCreatorWithParameter sc01 = text -> new String(text);
		StringCreatorWithParameter sc02 = String::new;
		
		System.out.println(sc02.create("Hallo Welt").toUpperCase());
		System.out.println(sc02.create("Hier ist Java"));
		System.out.println(sc02.create("Programmieren macht Spass"));
		
		
		StringCreatorWithStringBuilder sc_sb01 = sb -> new String(sb);
		StringCreatorWithStringBuilder sc_sb02 = String::new;
		StringBuilder sb = new StringBuilder("Hallo Lambda");
		System.out.println(sc_sb02.create(sb).toUpperCase());
	}

	private static void demo01() {
		/*
		 * Anonyme Klasse
		 */
		StringCreator sc01 = new StringCreator() {
			@Override
			public String create() {
				return new String();
			}
		};
		
		/*
		 * Lambda
		 */
		StringCreator sc02 = ()-> new String();
		
		/*
		 * Referenz auf einen Konstruktor
		 * 
		 * 
		 * public abstract String create();
		 * 
		 * Was macht der default Konstruktor von String?
		 * 
		 * Nimmt keinen Parameter entgegen und erzeugt String 
		 */
		StringCreator sc03 = String::new;
		
		System.out.println(sc01.create().getClass());
		System.out.println(sc02.create().getClass());
		System.out.println(sc03.create().getClass());
	}
}
