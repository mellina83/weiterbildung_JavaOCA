package javaApi_numbers;

public class Zufallszahlen {

	public static void main(String[] args) {

		/*
		 * Returns a double value with a positive sign, 
		 * greater than or equal to 0.0 and less than 1.0
		 */
		double d = Math.random();
		System.out.println("d = " + d);
		
		
		/*
		 * Alternativ
		 */
		java.util.Random randomGenerator = new java.util.Random();
		
		/*
		 * Returns a double value with a positive sign, 
		 * greater than or equal to 0.0 and less than 1.0
		 */
		d = randomGenerator.nextDouble();
		
		/*
		 * Returns the next pseudorandom, uniformly distributed int value 
		 */
		int x = randomGenerator.nextInt();
		System.out.println("x = " + x);
		
		/*
		 * Liefert einen Zufallswert zwischen 0 bis 33 (exklusive)
		 */
		x = randomGenerator.nextInt(33);
		System.out.println("x = " + x);
	}

}
