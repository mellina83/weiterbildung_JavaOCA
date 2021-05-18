package classes_kapselung;

import test.Base;

public class ProtectedTest {
	
	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.test();
	}

}

class Sub extends Base {
	
	public void test() {
		
		Base base = new Base();
//		System.out.println(base.privateVar); // 1
//		System.out.println(base.defaultVar); // 2
//		Compiler-Fehler: protected Zugriff f�r Unterklassen in einem 
//		anderen Package nur �ber Vererbung
//		System.out.println(base.protectedVar); // 3
		System.out.println(super.protectedVar);
		System.out.println(base.publicVar); // 4
		
//		System.out.println(this.privateVar); // 5
//		System.out.println(this.defaultVar); // 6
		System.out.println(this.protectedVar); // 7
		System.out.println(this.publicVar); // 8
	}
}
