package basics_methoden;

public class WdhZuweisungen {

	public static void main(String[] args) {
		char tmp1 = 97;
		
		float x = 2;
//		char tmp = 97 + (int)x; // char <= int
		
		int var1 = 12;
		
		var1 = m1(var1);
		
		// 
		// 1. Ob Argument in den Parameter passt?
		// 	  float x = var1
		//	  float <= int		: OK
		// 2. Ob die Zuweisung in lokale Variable ok ist?
		//	  int var1 = char m1(float)
		//	  int <= char		: OK
	}

	static char m1(float x) {
		return 97; 				// char tmp = 97;
	}
	
//	static char m2(float x) {
//		return 97 + (int)x;		// char tmp = 97 + (int)x;
//								// Compilerfehler also
//	}
	
	static char m2(float x) {
		return (char)(97 + (int)x);
	}
	
}
