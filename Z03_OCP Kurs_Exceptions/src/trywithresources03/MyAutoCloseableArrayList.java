package trywithresources03;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;

public class MyAutoCloseableArrayList<E> extends ArrayList<E> implements AutoCloseable {

	@Override
	public void close() throws Exception {
		this.clear();
		System.out.println("Liste geleert");
	}
}
