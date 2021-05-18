package inherit03;

public interface ISauer {
	default void wirdgegessen() {
		System.out.println(this.getClass().getSimpleName());
		System.out.println("Brrrrr, herrlich Sauer.");
	}
	
	abstract void doStuff();
}
