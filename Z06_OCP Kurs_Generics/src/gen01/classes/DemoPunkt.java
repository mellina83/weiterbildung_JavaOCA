package gen01.classes;

import java.math.BigInteger;

public class DemoPunkt {

	public static void main(String[] args) {
//		demoNonGen();
//		demoGen01();
//		demoGen02();
		demoGen03();
	}
	
	private static void demoGen03() {
		PunktGen<Integer> intPunkt = new PunktGen<>(1, 2);
		PunktGen<Double> doublePunkt = new PunktGen<>(1.0, 2.0);
		PunktGen<Number> numberPunkt = new PunktGen<>(new Integer(1), new Float(2.0F));
		
		// Das ist kein echtes Rawtype
		PunktGen<Object> objectPunkt = new PunktGen<>("EinsKommaNull", 2.0);
		System.out.println("PunktGen<T> mit aktuellem Parameter");
		System.out.println("Integer: " + intPunkt);
		System.out.println("Double: " + doublePunkt);
		System.out.println("Number: " + numberPunkt);
		System.out.println("Object: " + objectPunkt);
	}

	/**
	 * Es liegt die generische Klasse PunktGen vor, die mit Type angabe genutzt wird. 
	 */
	private static void demoGen02() {
		PunktGen<String> pg01 = new PunktGen<>("Hallo", "Welt");
		
		String tmp = pg01.getX();
		
		System.out.println(tmp);
		System.out.println(pg01);
	}

	/**
	 * Es liegt die generische Klasse PunktGen vor, diese wird aber als Raw-Type verwendet.
	 */
	private static void demoGen01() {
		PunktGen pg01 = new PunktGen(3, new DemoPunkt());
		
		// Risiko
		// Exception in thread "main" java.lang.ClassCastException: java.lang.Integer
		// cannot be cast to java.lang.String
//		String tmp = (String) pg01.getX();
		
		System.out.println(pg01);
	}

	private static void demoNonGen() {
		Punkt p01 = new Punkt(99, 24);
		Punkt p02 = new Punkt(100.9,25.0);
		//"Punkt [x=" + x + ", y=" + y + "]";
		System.out.println(p01);//x:99 - y:24
		System.out.println(p02);//x:100.9 - y:25.0
		
//		int x = (int)p02.getX();
//		System.out.println(x);
	}

}
