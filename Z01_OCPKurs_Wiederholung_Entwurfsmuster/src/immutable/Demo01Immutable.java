package immutable;

public class Demo01Immutable {
	public static void main(String[] args) {
		Integer a = new Integer(42);
		Integer b = a;
		
		Integer c = b;
		
		a = 123;
		
		System.out.println(c);//123
	}
}
