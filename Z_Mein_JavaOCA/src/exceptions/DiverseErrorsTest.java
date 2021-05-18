package exceptions;

public class DiverseErrorsTest {
	
	private static int[] intArr = {1,2};
	
	static {
//		ExceptionInInitializerError wird ausgelöst durch die NullPointerException bzw. ArrayIndexOutOfBoundException
//		intArr[3] = 42;
	}

	public static void main(String[] args) {
		doIt(); // StackOverflowError
		// Laden eines DB-Treibers
		try {
			Class.forName("com.mysql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void doIt() {
		doIt(); 
	}

}
