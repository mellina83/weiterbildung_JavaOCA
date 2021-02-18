package exceptions;

public class BadFoodException extends Exception {
	public BadFoodException(String message) {
		super(message); //String Konstruktor, dem eine Fehlermeldung uebergeben werden kann, gibts bereits in Exception, daher super()
	}
	
	public BadFoodException() {
		
	}

}
