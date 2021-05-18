package singleton;

public class SimpleSingletonLazy {

	private static SimpleSingletonLazy instance = null;
	
	public static SimpleSingletonLazy getInstance() {
		if(instance == null) {
			instance = new SimpleSingletonLazy();
		}
		return instance;
	}
	
	private SimpleSingletonLazy() {
		
	}
	
}
