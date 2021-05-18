package inherit02;

abstract class TestClass{
	abstract void doStuff();
}

@FunctionalInterface
public interface MyInterface {

//	 public void doStuff02();
	 public abstract void doStuff03();
	 
	 static void doStuff04() {
		 System.out.println("Ich bin Statisch und Oeffentlich");
	 }
	 
	 public static void doStuff05() {
		 System.out.println("Ich bin Statisch und Oeffentlich");
	 }
	 
	 default void doStuff06() {
		 System.out.println("Ich bin eine Default Methode");
	 }
}
