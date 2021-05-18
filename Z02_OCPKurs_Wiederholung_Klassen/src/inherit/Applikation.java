package inherit;

public class Applikation {

	public static void main(String[] args) {
		Persian peter = new Persian();
		Cat carlo = new Persian();
		Animal jerry = new Persian();
		Object tom = new Persian();
		
		peter.sleep();
		peter.meow();
		peter.eat();
		
		carlo.meow();
		carlo.eat();
//		carlo.sleep();// in Cat ist sleep nicht definiert.
		
		jerry.eat();
//		jerry.meow();// in Animal nicht definiert
//		jerry.sleep();// in Animal nicht definiert
		
//		tom.eat();
//		tom.meow();
//		tom.sleep();
	}

}
