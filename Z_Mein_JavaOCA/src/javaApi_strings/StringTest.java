package javaApi_strings;


public class StringTest {

	public static void main(String[] args) {
//		String-Objekte sind unver�nderlich (immutable)
		String s = "Fred";
		s = s.concat(" Feuerstein");
		System.out.println(s);
		String t = "Fred Feuerstein";
		System.out.println(t);
		System.out.println("s == t: " + (s == t)); 
		System.out.println("s.equals(t): " + s.equals(t));
		
		String s1 = "Wilma";
		String s2 = "Wilma";
		System.out.println("s1 == s2: " + (s1 == s2)); // true (String-Pool)
		System.out.println("s1.equals(s2): " + s1.equals(s2));
		String s3 = new String("Barney");
		String s4 = new String("BARNEY");
		System.out.println("s3 == s4: " + (s3 == s4)); // false (Heap)
		System.out.println("s3.equals(s4): " + s3.equals(s4));
		System.out.println("s3.equalsIgnoreCase(s4): " + s3.equalsIgnoreCase(s4));
		
		String log = "x";
		final int MAX = 100_000;
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			log += "x";
			log = log.concat("x");
		}
		long stop = System.currentTimeMillis();
		System.out.println("Dauer String in ms: " + (stop -start));
		
		start = System.currentTimeMillis();
//		Ein StringBuilder-Objekt ist ver�nderlich (mutable)
		StringBuilder sbLog = new StringBuilder("X");
		for (int i = 0; i < MAX; i++) {
			sbLog.append("X");
		}
		stop = System.currentTimeMillis();
		System.out.println("Dauer StringBuilder in ms: " + (stop -start));

	}

}
