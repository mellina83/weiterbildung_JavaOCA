package dev;

import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		Properties props = System.getProperties();
//		props.list(System.out);
		String javaVersion = props.getProperty("java.specification.version");
		System.out.println("javaVersion: " + javaVersion);
//		Wenn Java-Version kleiner 8, dann bitte Hinweis auf Installation
		if (javaVersion.compareTo("1.8") < 0) {
			System.out.println("Sie brauchen mindestens Java 1.8. Bitte installieren Sie!");
		} else {
			System.out.println("Ihre Version ist Java 1.8 oder höher.");
		}
		
		Runtime rt = Runtime.getRuntime(); // Erzeugt eine Instance der Klasse Runtime
		System.out.println("Anzahl der verfügbaren CPU: " + rt.availableProcessors());
		System.out.println("Gesamtspeicher: " + rt.totalMemory());
		System.out.println("Freier Speicher: " + rt.freeMemory());
		Runtime temp = Runtime.getRuntime();
		System.out.println("temp == rt: " + (temp == rt));
	}

}
