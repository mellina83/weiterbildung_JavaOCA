package basics_aufgaben;

public class Utils {
	
	public static void printRandomNumber() {
		java.util.Random random = new java.util.Random();
		int x = random.nextInt();
		System.out.println("random int: " + x);
	}

}
