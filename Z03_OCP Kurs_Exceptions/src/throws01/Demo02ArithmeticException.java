package throws01;

public class Demo02ArithmeticException {

	public static void main(String[] args) {
		int divisor = 7;
		int divident = 0;//<----
		
		double quotient = divisor / divident;// int / int = int

		System.out.println(quotient);
	}

}
