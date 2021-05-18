package assertions;

public class Demo02AssertionReallySimple {

	public static void main(String[] args) {
//		doStuff();
		
		doStuff02("Hallo");
		
		System.out.println("Beendet");
	}

	/**
	 * Unangemessenes nutzen von Assertions
	 */
	public static void doStuff02(String text) {
		assert (text.equals("Schnittstelle"));
		
		System.out.println(text);
	}

	private static void doStuff() {
		int x = 10;
		int y = 12;
		
		/**
		 * Wenn die Bedingung der Assert Anweisung zu false aufgelöst wird,
		 * dann wird ein AssertionError an die JVM geleitet.
		 */
		assert (x>y);
		
	}

}
