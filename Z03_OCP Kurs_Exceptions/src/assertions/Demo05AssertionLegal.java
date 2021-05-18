package assertions;

public class Demo05AssertionLegal {
	public static void main(String[] args) {
		ValidAssert va = new ValidAssert();
		System.out.println(va.toString());
		System.out.println(va);
		System.out.println(new ValidAssert());
	}
	
	private static void simple() {
		String str = "String";
		int x = 1;
		boolean b = true;
		
		assert(x==1) : x;
		assert (methodBool()) : methodBool();
		assert (str instanceof String) : methodReturn();// Wichtig Rückgabewert
		assert (x != 1) : new ValidAssert();
		assert (x != 1) : null;
	}
	
	static int methodReturn() {
		return 10;
	}

	static boolean methodBool() {
		return true;
	}
	
	
	private static void reallySimple() {
		String str = "String";
		int x = 1;
		boolean b = true;
		
		assert (x==1);
		assert (b);
		
		assert true;//Legal aber Sinnlos
		
		assert (b = x == 1);
		assert (str instanceof String);
	}
}
