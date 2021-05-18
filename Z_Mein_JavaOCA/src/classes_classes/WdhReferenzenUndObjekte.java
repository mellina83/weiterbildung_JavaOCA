package classes_classes;

// OS = Operating System
class OS {
	private String name;
	private int version;
	
	public OS(String name, int version) {
		this.name = name;
		this.version = version;
	}
	
	public void setVersion(int version) {
		this.version = version;
	}

	public String toString() {
		return name + " v." + version;
	}
}

public class WdhReferenzenUndObjekte {

	public static void main(String[] args) {

		OS os1 = new OS("Linux", 3);
		System.out.println("1. os1: " + os1); // Linux v.3
		
		testA(os1);
		System.out.println("2. os1: " + os1); // Linux v.3
		
		testB(os1);
		System.out.println("3. os1: " + os1); // Linux v.7
		
	} // end of main

	static void testA(OS os) {
		os = new OS("Windows", 95);
	}
	
	static void testB(OS os) {
		os.setVersion(7);
	}
	
}
