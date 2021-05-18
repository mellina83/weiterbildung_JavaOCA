package Aufgaben.ml.unchecked;

public class NegativeSaldoRuntimeException extends RuntimeException {

	public NegativeSaldoRuntimeException(String message) {
		super(message);
	}

	public NegativeSaldoRuntimeException() {
		this("Fehler ist aufgetreten ... ");
	}

}
