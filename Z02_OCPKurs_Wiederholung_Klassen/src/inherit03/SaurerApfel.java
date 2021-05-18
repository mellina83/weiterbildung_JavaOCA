package inherit03;

public class SaurerApfel extends Apfel implements ISauer,ISuess{

	@Override
	public void wirdgegessen() {
//		super.wirdgegessen();
//		ISauer.super.wirdgegessen();
//		ISuess.super.wirdgegessen();
		System.out.println("Lecker super saftig.");
	}


}
