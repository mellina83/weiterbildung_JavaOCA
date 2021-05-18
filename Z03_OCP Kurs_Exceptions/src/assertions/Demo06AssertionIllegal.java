package assertions;

public class Demo06AssertionIllegal {

	public static void main(String[] args) {
		doStuff();

	}
	
	private static void doStuff() {
		int x = 1;
		boolean b = true;
		String str = null;
		
//		 Really Simple, these are illegal
//		 assert (x=1);
//		 assert (x);
//		 assert 0;
//		 assert null;
//		 assert (noReturnIllegal());
		
		// Simple
//		 assert (x == 1) : ;
//		 assert (x == 1) : noReturnIllegal();
//		 assert (x == 1) : ValidAssert va;

		
	}
	
	public static void noReturnIllegal(){
		
	}
}
