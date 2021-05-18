package classes_interfaces;

public class InterfaceTest implements B,C{
	
	public static void main(String[] args) {
		InterfaceTest test = new InterfaceTest();
		test.doIt();
	}
	
	// �berschreiben oder Implemtieren von Interface-Methoden IMMER NUR PUBLIC!
	public void doIt() {
		// Aufruf der Methoden doIt aus B und C
		B.super.doIt();
		C.super.doIt();
		System.out.println("InterfaceTest");
	}

	@Override
	public void print() {
		System.out.println("print");		
	}

	@Override
	public void check() {
		System.out.println("check");	
	}

	@Override
	public void test() {
		System.out.println("test");		
	}

}

interface A {
	default void doIt() {
		System.out.println("doIt A");
	}
	
	void print();
}

// Interface B erweitert Interface A
interface B extends A{
	default void doIt() {
		System.out.println("doIt B");
	}
	
	void test();
}

//Interface C erweitert Interface A
interface C extends A{
	default void doIt() {
		System.out.println("doIt C");
	}
	
	void check();
}

interface D extends B,C {
	default void doIt() {
		System.out.println("doIt D");
	}
}