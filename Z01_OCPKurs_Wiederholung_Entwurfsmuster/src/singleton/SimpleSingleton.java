package singleton;

public class SimpleSingleton {

	private static SimpleSingleton instance = new SimpleSingleton();
	
	public static SimpleSingleton getInstance() {
		return instance;
	}
	
	private SimpleSingleton() {
		
	}
	
}
