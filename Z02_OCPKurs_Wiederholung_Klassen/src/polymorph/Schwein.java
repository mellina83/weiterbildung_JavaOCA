package polymorph;

public class Schwein implements IEatable{

	public void fressen(IEatable ref) {
		ref.wirdgefressen();
		System.out.println("Hmmm, schmeckt nach " + ref.getClass().getSimpleName());
	}

	@Override
	public void wirdgefressen() {
		System.out.println(this.getClass().getSimpleName());
	}
	
}
