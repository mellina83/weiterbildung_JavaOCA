

public class DemoOut {

	public class A {
		public class B {
			public class C {
				public class D {

				}
			}
		}
	}
	public static void main(String[] args) {
		DemoOut do01 = new DemoOut();
		A di = do01.new A();
		A.B dii = di.new B();
		A.B.C diii;
	}
}
