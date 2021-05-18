package functional;

class Schwein {
	public String name;

	public Schwein(String name) {
		this.name = name;
	}

	public void laufen() {
		System.out.println(this.name + " läuft jetzt");
	}

	public void fressen() {
		System.out.println(this.name + " frisst jetzt");
	}

	@Override
	public String toString() {
		System.out.println("ToString von Schwein");
		return "Schwein [name=" + name + "]";
	}
}

interface DoStuff {
	public void doStuff();
}

class Demo07MethodenReferenzenBestimmtesObject {

	public static void main(String[] args) {
		Schwein piggeldy = new Schwein("piggeldy");
		Schwein frederick = new Schwein("frederick");
		Object obj = new Object();
//		piggeldy.fressen();
//		frederick.laufen();
		
		DoStuff do01 = () -> System.out.println("Lambda works fine");
		DoStuff do02 = new Schwein("Anonyme")::laufen;
		DoStuff do03 = frederick::fressen;
		DoStuff do04 = piggeldy::hashCode;
		DoStuff do05 = obj::toString;
		

		
		demo01(do01);
		demo01(do02);
		demo01(do03);
		demo01(do04);
		demo01(do05);
	}

	private static void demo01(DoStuff param) {
		param.doStuff();
	}
}
