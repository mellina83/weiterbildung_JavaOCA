package arrays;


public class Test {

	public static void main(String[] args) {
		
		int[] zahlen = new int[7];
		
		zahlen = abgeben(1,4,7,12,25,37,39);
		System.out.println(zahlen);
		
		for (int i = 0; i < zahlen.length; i++)  {
			System.out.println(zahlen[i] + " ");
		}
		
		

		
		

	} // Ende von Main
	
	
	public static int[] abgeben(int...values) {
		int[] array = new int[7];
		
		for (int element : values) {
			System.out.println(element);
			for (int i = 0; i < array.length; ++i) {
				array[i] = element;
			}

		}
		return array;

	}
	
	public static void printAbgeben() {
		
	}
	

}
