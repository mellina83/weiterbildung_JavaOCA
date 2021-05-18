package inherit;

public class Persian extends Cat{

	public void sleep() {
		System.out.println("Persian Sleep");
	}
	
	@Override
	public void eat() {
		System.out.println("Perserkatzen essen nur Frisch Futter");
	};
}
