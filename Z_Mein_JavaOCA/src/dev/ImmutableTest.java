package dev;

public class ImmutableTest {

	public static void main(String[] args) {
		MyString test = new MyString("Fred");
		System.out.println(test);
//		test.string = "Barney";
		System.out.println(test);
		StringBuilder sb = new StringBuilder("Wilma");
		MyStringBuilder testSB = new MyStringBuilder(sb);
		System.out.println(testSB);
		testSB.getStringBuilder().append(" Betty");
		System.out.println(testSB);
		
	}

}

// Immutable class: wenn Objekt erzeugt wird, kann sein Zustand nicht mehr verändert werden (Beispiel: String, Integer und alle anderen Wrapper, 
// Datums- und Uhrzeit-Klassen)

final class MyStringBuilder {
	
	private final StringBuilder sb;
	
	MyStringBuilder(StringBuilder sb) {
		this.sb = sb;
	}
	
	public String toString() {
		return sb.toString();
	}
	
	public StringBuilder getStringBuilder() {
		return new StringBuilder(sb);
	}

}

final class MyString {
	
	private final String string;
	
	MyString(String string) {
		this.string = string;
	}
	
	public String toString() {
		return string;
	}
	
	public String getString() {
		return string;
	}
}