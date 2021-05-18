package functional;

public class Person {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person() {
		this.age = 55;
		this.name = "Herbert";
	}

	public Person(int age) {
		this.age = age;
		this.name = "Herbert";
	}

	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person [getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}
}
