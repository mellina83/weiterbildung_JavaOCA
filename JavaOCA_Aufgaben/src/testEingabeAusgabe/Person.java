package testEingabeAusgabe;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable {
	
	private String name;
	private int age;
	private String wohnort;
	private static final long serialVersionUID = 1L;
	
	public Person () {
		
	}
	
	public Person(String name, int age, String wohnort) {
		this.name = name;
		this.age = age;
		this.wohnort = wohnort;
	}
	
	public String toString() {
		return "Name: " + name + "\nAlter:" + age + "\nWohnort" + wohnort;
	}
	
	
	

	public static void main(String[] args) {
		
		Person p1 = new Person("John", 21, "Bonn");
		Person p2 = new Person("Lisa", 34, "Berlin");
		
		try {
			FileOutputStream f = new FileOutputStream(new File("IOTest"));
			ObjectOutputStream o = new ObjectOutputStream(f);
			
			o.writeObject(p1);
			o.writeObject(p2);
			
			o.close();
			f.close();
			
			FileInputStream fi = new FileInputStream(new File("IOTest"));
			ObjectInputStream oi = new ObjectInputStream(fi);
					
			Person pr1 = (Person) oi.readObject();
			Person pr2 = (Person) oi.readObject();
			
			System.out.println(pr1.toString());
			System.out.println(pr2.toString());
			
			oi.close();
			fi.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Datei nicht gefunden");
		} catch (IOException e) {
			System.out.println("Error initializing stream");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
