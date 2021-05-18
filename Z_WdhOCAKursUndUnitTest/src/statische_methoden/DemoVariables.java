package statische_methoden;

public class DemoVariables {

	public static String text = "Hello World";
	public static int zahl;//0
	public static char zeichen;//0
	public static boolean bool;//false
	
	public static void main(String[] args) {
		String text02 = "Hello World";
		text = "Hallo Welt";
		System.out.println(text);
		doStuff();
		String text03;	
	}

	public static void doStuff() {
		System.out.println(text);
		System.out.println(zahl);
		System.out.println(bool);
	}
}
