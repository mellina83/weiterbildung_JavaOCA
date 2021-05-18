package trywithresources03;

import java.io.Closeable;

public class Demo02TryWithResources {

	public static void main(String[] args) {
//		demo01();
		demo02();
	}

	private static void demo02() {
		try (MyAutoCloseableArrayList<Integer> list = new MyAutoCloseableArrayList<Integer>()) {

			list.add(42);
			list.add(23);
			list.add(64);
			list.add(43);

			System.out.println(list);
			System.out.println("Letzte Zeile im Try");
		} catch (Exception e) {

		}

	}

	private static void demo01() {
		MyAutoCloseableArrayList<Integer> list = new MyAutoCloseableArrayList<Integer>();

		list.add(42);
		list.add(23);
		list.add(64);
		list.add(43);

		System.out.println(list instanceof Closeable);
		System.out.println(list instanceof AutoCloseable);// TODO Auto-generated
															// method stub

	}

}
