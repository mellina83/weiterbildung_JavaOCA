package exceptions;

public class StackTraceTest {

	public static void main(String[] args) throws InterruptedException {
		method1();
		System.out.println("Servus");
	}
	
	public static void method1() throws InterruptedException {
		method2();	
	}

	public static void method2() throws InterruptedException {
		method3();		
	}

	public static void method3() throws InterruptedException {
		System.out.println(7/0);	
		Thread.sleep(1000);
	}

}
