package basics_methoden;

public class WdhUeberladen {
	
	static void m1() {}
	// static int m1() { return 1; }		// Geht nicht mehr wegen der anderen m1

	
	static void m2(int a) {}
//	static void m2(int var) {}		// Geht nicht mehr wegen der anderen m2
	
	
	static void m3(int a) {}
	static void m3(byte a) {}
	static void m3(int a, int b) {}
	// ...
	
	public static void main(String[] args) {

	}

}
