package inner01member;

public class Demo01OuterAndInnerClass {

	/*
	 * Instanz Inner Klasse
	 */
	private class Inner{
		
	}
	
	public static void main(String[] args) {
		
		Demo01OuterAndInnerClass do01 = new Demo01OuterAndInnerClass();
		Inner in01 = do01.new Inner();
		
		/*
		 * Oder als einzeiler
		 */
		Inner in02 = new Demo01OuterAndInnerClass().new Inner();
	}

}
