package javaApi_strings;

public class StringBuilderTest extends Object{

	public static void main(String[] args) {
//		StringBuilder ab Java 5
//		Die Klasse StringBuffer (seit Java 1) hat dieselben Methoden wie der StringBuilder, ist aber threadsicher.
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" world!");
		System.out.println(sb.toString());
		sb = new StringBuilder("ABC");
		sb.append("DEF").insert(4, "GHI").delete(2,4).reverse();
		System.out.println(sb);
		System.out.println(sb.charAt(1));
		System.out.println(sb.length());
		StringBuilder sb1 = new StringBuilder("Betty");
		StringBuilder sb2 = new StringBuilder("Betty");
		System.out.println("sb1 == sb2: " + (sb1 == sb2)); // false
		System.out.println("sb1.equals(sb2): " + sb1.equals(sb2)); //false, StringBuilder �berschreibt equals NICHT!
		System.out.println("sb1.toString().equals(sb2.toString()): " + sb1.toString().equals(sb2.toString())); // true
	}

}
