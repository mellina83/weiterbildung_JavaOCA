package basics_kontrollstrukturen;

public class SwitchAnweisung {

	public static void main(String[] args) {

		int day = 1;
		
		if(day==6) {
			System.out.println("1. Sa");
		} else if(day==7) {
			System.out.println("1. So");
		} else {
			System.out.println("1. ein Arbeitstag");
		}
		
		
		switch(day) {
			case 6:
				System.out.println("2. Sa");
				break;
			case 7:
				System.out.println("2. So");
				break;
			default:
				System.out.println("2. ein Arbeitstag");
		}
		
		// Durchfallen bis zum break:
		switch(day) {
			default:
				System.out.println("3. ein Arbeitstag"); 
			case 6:
				System.out.println("3. Sa"); // wird auch ausgegeben
				break;
			case 7:
				System.out.println("3. So");
				break;
		}
		
		switch(day) {
			default:
				System.out.println("4. ein Arbeitstag");
				break;
			case 6:
				System.out.println("4. Sa");
				break;
			case 7:
				System.out.println("4. So");
				break;
		}
		
	} // end of main

}
