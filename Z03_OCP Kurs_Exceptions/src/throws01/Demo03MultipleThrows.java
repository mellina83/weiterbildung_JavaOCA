package throws01;

import java.io.FileNotFoundException;

public class Demo03MultipleThrows {

	public static void main(String[] args) {


	}

	private static void erzeugeMultipleExceptions() throws FileNotFoundException, ReflectiveOperationException {
		for (int i = 0; i < 10; i++) {
			switch (i) {
				case 1: {
					throw new IndexOutOfBoundsException();
				}
				case 2: {
					throw new NullPointerException();
				}
				case 3: {
					throw new ReflectiveOperationException();
				}
				default: {
					throw new FileNotFoundException();
				}
			}
		}
	}
}
