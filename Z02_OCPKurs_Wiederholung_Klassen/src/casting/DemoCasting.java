package casting;

public class DemoCasting {

	public static void main(String[] args) {
		A obj01 = new B();
		
		B obj02 = new B();
		
		B obj03 = (B) obj01;//ClassCastException???
		
		
		System.out.println(obj02 instanceof A);
		System.out.println(obj02 instanceof B);
		System.out.println(obj02 instanceof Object);

		
		System.out.println(obj02.getClass().getSimpleName());
		System.out.println(obj03.getClass().getSimpleName());
	}

}
