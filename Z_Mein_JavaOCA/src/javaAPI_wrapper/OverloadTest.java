package javaAPI_wrapper;

public class OverloadTest {

	public static void main(String[] args) {
		int i = 42;
//		Widening schl�gt Boxing schl�gt varargs
		doIt(i);
	}
	
//	public static void doIt(int i ) {
//		System.out.println("do It int");
//	}
	
	public static void doIt(long l) {
		System.out.println("do It long");
	}
//	
//	public static void doIt(double d ) {
//		System.out.println("do It double");
//	}
	
	public static void doIt(Integer iObj) {
		System.out.println("do It Integer");
	}
	
	public static void doIt(int... i) {
		System.out.println("do It varargs");
	}

}
