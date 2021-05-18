package functional;

interface IDoStuff {
	public String doStuff();
}

public class Demo07_a_MethodenReferenzen {

	public static void main(String[] args) {
		Demo07_a_MethodenReferenzen ref01 = new Demo07_a_MethodenReferenzen();
		ref01.printMe();
		
	}

	public void printMe() {
		IDoStuff ref01 = this::toString;
		
		System.out.println(ref01.doStuff());
	}
}
