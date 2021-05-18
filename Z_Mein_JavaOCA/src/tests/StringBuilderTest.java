package tests;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		String log = "";
		
		final int MAX = 100_000;
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < MAX; i++) {
			log += "x";
			log = log.concat("x");
		}
		long stop = System.currentTimeMillis();
	
		System.out.println("Dauer String in ms: " + (stop -start));
		
		
		start = System.currentTimeMillis();
		StringBuilder sbLog = new StringBuilder("");
		for (int i = 0; i < MAX; i++) {
			sbLog.append("X");
		}
		stop = System.currentTimeMillis();
		//System.out.println(sbLog);
		System.out.println("Dauer StringBuilder in ms: " + (stop -start));

	}

}
