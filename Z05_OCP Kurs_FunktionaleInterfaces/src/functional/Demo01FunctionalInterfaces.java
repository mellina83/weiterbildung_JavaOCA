package functional;

import java.util.Iterator;

interface NonFunctional01 { } // Kein Funktionales Interfaces

interface NonFunctional02 { // Kein Funktionales Interface
	public abstract void methode01();
	void methode02();
}

interface iFunctional01{ // Dies ist ein Funktionales Interfaces
	public abstract int doStuff();
}


@FunctionalInterface
interface iFunctional02{ // Dies ist ein Funktionales Interfaces
	public abstract int doStuff01();
	
	default void doStuff02() {
		System.out.println("Ich bin ein Funktionales Interfaces");
	}
	
	public static void doStuff03() {
		System.out.println("Ich bin ein Funktionales Interfaces");
	}
}

/**
 * Die Annotation @FunctionalInterface ist nicht nötig, um ein funktionales 
 * Interface zu erstellen.
 */
@FunctionalInterface
interface iFunctional03{ // Dies ist ein Funktionales Interfaces
	public abstract int doStuff01();
	
	//Invalid '@FunctionalInterface' annotation; iFunctional03 is not a functional interface
	//public abstract int doStuff04();
	
	default void doStuff02() {
		System.out.println("Ich bin ein Funktionales Interfaces");
	}
	
	public static void doStuff03() {
		System.out.println("Ich bin ein Funktionales Interfaces");
	}
}

@FunctionalInterface
interface ExamWatch extends iFunctional03{ }

@FunctionalInterface
interface ExamWatch02 extends iFunctional03{
	public abstract boolean equals(Object obj);
	public abstract int hashCode();
}

@FunctionalInterface
interface ExamWatch03 extends iFunctional03{
	
	//Invalid '@FunctionalInterface' annotation; ExamWatch03 is not a functional interface
	//public abstract void badDoStuff();
		
	public abstract boolean equals(Object obj);
	public abstract int hashCode();
}

public class Demo01FunctionalInterfaces {

}
