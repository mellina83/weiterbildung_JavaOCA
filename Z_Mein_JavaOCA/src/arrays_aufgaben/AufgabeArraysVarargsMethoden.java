package arrays_aufgaben;

public class AufgabeArraysVarargsMethoden {

	public static void main(String[] args) {

		System.out.println("*** A1.");
		System.out.println( "Ohne Argumente: " + produkt() );
		System.out.println( "Produkt(3): " + produkt(3) );
		System.out.println( "3 * 5 = " + produkt(3, 5) );

		System.out.println("*** A2.");
		System.out.println("Ohne Argumente: " + concat());
		System.out.println("mit mo: " + concat("mo"));
		System.out.println("mit 5 Args: " + concat("mo", "|", "di", "|", "mi"));
		
		System.out.println("*** A3."); // Ohne weiteres nicht lösbar 
										// (Dozenten-Lösung 'concat2' ist nur eine Lösung, die aufs Überladen verzichtet) 
		
		System.out.println( "Ohne Values: " + concat2(", ") );
		
		String s = concat2(", ", "mo", "di", "mi");
		System.out.println("Mit Values: " + s);
		
	} // end of main

	static String concat2(String delimiter, String... values) {
		
		String result = "";

		if(values==null || values.length==0) {
			return result; 
		}
		
		for (int i = 0; i < values.length-1; i++) {
			result += values[i] + delimiter;
		}
		
		return result + values[values.length-1];
	}
	
	static String concat(String... values) {
		String result = "";
		
		for(String s : values) {
			result += s;
		}
		
		return result;
	}
	
	static int produkt(int... values) {
		int result = 1;
		
		for (int x : values) {
			result *= x;
		}
		
		return result;
	}
	
}
