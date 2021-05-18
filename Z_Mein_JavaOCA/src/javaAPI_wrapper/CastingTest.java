package javaAPI_wrapper;

public class CastingTest {

	public static void main(String[] args) {
		double d = 3.14;
		int i = 4;
//		d = i; // Widening (automatisch durch den Compiler)
		i = (int) d; // Narrowing (explizit durch Cast)
		System.out.println(i);
		
		Double dObj = Double.valueOf(Math.PI);
		Integer iObj = Integer.valueOf(42);
		// Wrapper-Typen k�nnen NICHT untereinander gecastet werden, weil sie Geschwisterklassen sind (Mutterklasse ist Number)
//		dObj = iObj; // Compiler-Fehler
//		dObj = (Double) iObj; // Compiler-Fehler
		dObj = iObj.doubleValue(); // Autoboxing
		dObj = Double.valueOf(iObj.doubleValue());
		Byte bObj = iObj.byteValue();  // Autoboxing
		long l = 42;
//		Long lObj = 42; // Compiler-Fehler, kein Widening plus Boxing
		Long lObj = 42L; // Autoboxing
		
//		Integer-Objekt inkrementieren pre Java 5
		Integer intObjPre5 = new Integer(42);
		int intVar = intObjPre5.intValue();
		intVar++;
		intObjPre5 = Integer.valueOf(intVar);
		System.out.println(intObjPre5);
		
//		Wrapper-Objekte sind immutable
		Integer intObj = 42;
		Integer temp = intObj;
		intObj++;
		System.out.println(intObj);
		System.out.println("intObj == temp: " + (intObj == temp));
		intObj = new Integer(77);
	}

}
