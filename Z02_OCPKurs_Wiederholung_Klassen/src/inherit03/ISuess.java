package inherit03;

public interface ISuess {
	default void wirdgegessen() {
		System.out.println(this.getClass().getSimpleName());
		System.out.println("Hmmm, lecker Suess");
	}
	
	abstract void doStuff();
}
