package tests;

import java.util.Properties;

public class properties {

	public static void main(String[] args) {
		
		Properties props = System.getProperties();
		String javaVersion = props.getProperty("java.specification.version");
		System.out.println(javaVersion);
		
		if (javaVersion.compareTo("1.8") < 0) {
			System.out.println("Mindestens Java 1.8");
		} else {
			System.out.println("Java 1.8 oder hoeher");
		}

	}

}
