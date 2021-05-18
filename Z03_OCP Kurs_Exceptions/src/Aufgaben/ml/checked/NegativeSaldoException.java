package Aufgaben.ml.checked;

public class NegativeSaldoException extends Exception {

	public NegativeSaldoException(String message) {
		super(message);
	}

	public NegativeSaldoException() {
		this("Fehler ist aufgetreten ... ");
	}

}
