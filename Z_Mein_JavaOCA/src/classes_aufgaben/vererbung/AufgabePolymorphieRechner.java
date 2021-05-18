package classes_aufgaben.vererbung;

abstract class Operation {
	private char sign;
	
	public Operation(char sign) {
		this.sign = sign;
	}

	abstract double execute(double a, double b);
	
	public String toString() {
		return "" + sign;
	}
}

class Multi extends Operation {
	public Multi() {
		super('*');
	}
	double execute(double a, double b) {
		return a * b;
	}
}

class Subtract extends Operation {
	public Subtract() {
		super('-');
	}
	double execute(double a, double b) {
		return a - b;
	}
}

class Add extends Operation {
	public Add() {
		super('+');
	}
	double execute(double a, double b) {
		return a + b;
	}
}

public class AufgabePolymorphieRechner {

	public static void main(String[] args) {

		taschenrechnerOhnePolymorphie();
		taschenrechnerMitPolymorphie();
	}

	static void taschenrechnerMitPolymorphie() {
		double a = 4; // = getZahl();
		double b = 7; // = getZahl();

		Operation op = new Subtract(); // = getOperation();
		
		double result = op.execute(a, b); // polymorphischer Aufruf
		
		System.out.println( a + " " + op + " " + b + " = " + result);
	}
	
	static void taschenrechnerOhnePolymorphie() {
		double a = 4; // = getZahl();
		double b = 7; // = getZahl();
		
		char op = '*'; // = getOperation();
		
		double result = 0;
		
		switch (op) {
			case '+':
				result = a + b;
				break;
			case '-':
				result = a - b;
				break;
			case '*':
				result = a * b;
				break;
			case '/':
				result = a / b;
				break;
	
		}
		
		System.out.println( a + " " + op + " " + b + " = " + result);
	}
	
}
