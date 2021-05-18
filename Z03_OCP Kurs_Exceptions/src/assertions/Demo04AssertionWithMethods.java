package assertions;

public class Demo04AssertionWithMethods {

	private static Demo04AssertionWithMethods ds01 = new Demo04AssertionWithMethods();
	private static Demo04AssertionWithMethods ds02 = new Demo04AssertionWithMethods();
	
	public static void main(String[] args) {
		doStuff();
	}

	private static void doStuff() {
		
		/*
		 * assert (true/false) : String
		 */
		assert (ds01.equals(ds02)) : printError(ds01,ds02);
	}
	
	private static String printError(Object ds01, Object ds02) {
		return "\nds01.hashcode" + ds01.hashCode() + "\n" + "ds02.hashcode" + ds02.hashCode();
	}

	private static String printError() {
		return "Fehlermeldung";
	}
}
