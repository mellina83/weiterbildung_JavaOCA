package javaAPI_wrapper;

public class WrapperPoolTest {

	public static void main(String[] args) {
//		Im Wrapper-Pool werden Literale zwischen -128 und 127 gespeichert (byte-Bereich)
		
		Integer i1 = 42;
		Integer i2 = 42;
		System.out.println("i1 == i2: " + (i1 == i2));
		System.out.println("i1.equals(i2): " + i1.equals(i2));
		
		Integer i3 = 1000;
		Integer i4 = 1000;
		System.out.println("i3 == i4: " + (i3 == i4));
		System.out.println("i1.equals(i2): " + i3.equals(i4));
		
		Integer i5 = new Integer(42);
		Integer i6 = new Integer(42);
		System.out.println("i5 == i6: " + (i5 == i6));
		System.out.println("i1.equals(i2): " + i5.equals(i6));
		
		Integer i7 = new Integer(1000);
		Integer i8 = new Integer(1000);
		System.out.println("i7 == i8: " + (i7 == i8));
		System.out.println("i7.equals(i8): " + i7.equals(i8));
		
	}

}
