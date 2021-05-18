package singleton;

public class SingletonThreadsafe {

	private static SingletonThreadsafe instance = null;
	
	public static synchronized SingletonThreadsafe getInstance() {
		if(instance == null) {
			instance = new SingletonThreadsafe();
		}
		return instance;
	}
	
	private SingletonThreadsafe() {
		
	}
	
}
