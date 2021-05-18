package trywithresources03;

public class Demo04MultipleResources {

	class Lamb implements AutoCloseable {
		public void close() throws Exception {
			System.out.print("l");
		}
	}

	class Goat implements AutoCloseable {
		public void close() throws Exception {
			System.out.print("g");
		}
	}

	public void run() throws Exception {
		try (Goat g = new Goat(); Lamb l = new Lamb();) {
			System.out.print("2");
		} finally {
			System.out.print("f");
		}
	}

	public static void main(String[] args) throws Exception {
		new Demo04MultipleResources().run();
		System.out.println("e");

	}

}
