package vererbung04;

import java.io.FileNotFoundException;
import java.io.IOException;

class A {
	public void doit() throws IOException {
	}

	public void doit2() {
	}
}

class B extends A {
	/**
	 * Beim Override d�rfen die Checked Exceptions nicht verallgemeinert werden.
	 */
//	@Override
//	public void doit() throws Exception {	}

	/**
	 * Beim Override k�nnen wir die Exception der Basisklasse verwenden oder
	 * eine davon abgeleitete Exception
	 */
	@Override
	public void doit() throws FileNotFoundException {
	}

	/**
	 * Dies ist ein Overload/�berladen und kein Override/�berschreiben
	 */
	public void doit(int zahl) throws Exception {
	}

	/**
	 * Beim Override d�rfen wir keine neuen Checked Exceptions hinzuf�gen
	 */
//	@Override
//	public void doit2() throws Exception {	}

	/**
	 * Anders als die Checked Exceptions unterliegen die
	 * RuntimeExceptions(Unchecked) diesen regeln nicht
	 */
	@Override
	public void doit2() throws ArrayIndexOutOfBoundsException {}
}

/**
 * 
 * Regeln f�r das Override der throws Klausel.
 *
 */
public class Demo01Vererbung {

}
