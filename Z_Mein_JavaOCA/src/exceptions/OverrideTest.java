package exceptions;

import java.io.IOException;

public class OverrideTest {

	public static void main(String[] args) {
		Base b = new Sub();
		Sub s = new Sub();
			
		try {
			b.doIt(); // sp�te Bindung (late binding)
			s.doIt();
			((Base) s).doIt();
		} catch (MySubException e) {
			e.printStackTrace();
		} 
	}

}

class Base {
	public void doIt() throws MySubException{
		System.out.println("Base");
	}
}

class Sub extends Base{
//	Beim �berschreiben von Methoden darf keine "breitere" checked Exception (Supertyp) deklariert werden wie in der Methode der Superklasse!
//	Beim �berschreiben von Methoden darf keine neue checked Exception deklariert werden wie in der Methode der Superklasse!
	@Override
//	public void doIt() throws IOException{ // Compiler-Fehler: neue checked Exception
//	public void doIt() throws MyException{ // Compiler-Fehler: keine "breitere" Exception, MyException ist Superklasse von MySubException
//	public void doIt() throws Exception{ // Compiler-Fehler: keine "breitere" Exception, Exception ist Superklasse von MySubException
//	public void doIt() { // erlaubt, Exceptions m�ssen nicht deklariert
	public void doIt() throws RuntimeException{ // erlaubt, RuntimeException ist nicht checked		
		System.out.println("Sub");
	}
}

class MyException extends Exception {
	
}

class MySubException extends MyException {
	
}