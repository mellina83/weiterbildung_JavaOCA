package assertions.appropriate;

/**
 * Do Use Assertions, Even in Public Methods, 
 * to Check for Cases that You Know
 * Are Never, Ever Supposed to Happen
 *
 */
public class Demo04CheckCases {
	public static void main(String[] args) {
		doStuffA();
		System.out.println("Programm beendet");

	}

	public static void doStuffA() {
		int y = 0;
		for (int i = 1; i < 4 ; i++) {
			switch(i){
			case 1:
				y= 2; System.out.println("y: " + y);
				break;
			case 2:
				y= 4; System.out.println("y: " + y);
				break;
			case 3:
				y= 6; System.out.println("y: " + y);
				break;
			default:
				assert false: "we're not supposed to get here! " + i; 	
			}
		}

	}
}
