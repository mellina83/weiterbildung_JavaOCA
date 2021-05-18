package basics_methoden;

/*
 *  Rekursiver Aufruf entsteht, wenn eine Methode sich selbst aufruft.
 *
 */
public class B12_RekursiverAufruf {

	public static void main(String[] args) {
		printDownToZero(6);
		printDownToZeroRecursive(6); 

		System.out.println("*** mit dem negativen Argument");
		
		printDownToZero(-2);
		printDownToZeroRecursive(-2);
		
		System.out.println("end of main");
	}
	
	static void printDownToZero(int bound) {
		for(int x = bound; x >= 0; x--) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
	static void printDownToZeroRecursive(int value) {
		System.out.print(value + " ");
		
		if(value > 0) {
			printDownToZeroRecursive(value - 1); // rekursiver Aufruf
		} else {
			System.out.println();
		}
	}

}
