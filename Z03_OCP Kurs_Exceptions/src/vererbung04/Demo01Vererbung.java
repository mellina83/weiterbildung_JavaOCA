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
	 * Beim Override dürfen die Checked Exceptions nicht verallgemeinert werden.
	 */
//	@Override
//	public void doit() throws Exception {	}

	/**
	 * Beim Override können wir die Exception der Basisklasse verwenden oder
	 * eine davon abgeleitete Exception
	 */
	@Override
	public void doit() throws FileNotFoundException {
	}

	/**
	 * Dies ist ein Overload/Überladen und kein Override/Überschreiben
	 */
	public void doit(int zahl) throws Exception {
	}

	/**
	 * Beim Override dürfen wir keine neuen Checked Exceptions hinzufügen
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
 * Regeln für das Override der throws Klausel.
 *
 */
public class Demo01Vererbung {

}
