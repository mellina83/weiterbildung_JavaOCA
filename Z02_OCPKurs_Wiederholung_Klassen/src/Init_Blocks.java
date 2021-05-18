
class A {
	static {
		System.out.println("1. A Static Init Block");
	}
	{
		System.out.println("1. A Init Block");
	}
	
	public A() {
		System.out.println("A Konstruktor");
	}
	
	{
		System.out.println("2. A Init Block");
	}
}

class B extends A {
	{
		System.out.println("1. B Init Block");
	}
	public B() {
		System.out.println("B Konstruktor");
	}
	static {
		System.out.println("1. B Static Init Block");
	}
}

public class Init_Blocks {
	public static void main(String[] args) {
		new B();
	}
}
