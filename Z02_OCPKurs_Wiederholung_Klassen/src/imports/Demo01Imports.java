package imports;

import static java.lang.System.*;

public class Demo01Imports {

	public static void main(String[] args) {
		
		out.println("Hello World");

		staticDoStuff();
		
		Demo01Imports ref = new Demo01Imports();
		
		ref.instanceDoStuff();
	}

	public static void staticDoStuff() {
		System.out.println("Ich bin eine Statische Methode.");
	}
	
	public void instanceDoStuff() {
		System.out.println("Ich bin eine Instanz Methode.");
	}
}
