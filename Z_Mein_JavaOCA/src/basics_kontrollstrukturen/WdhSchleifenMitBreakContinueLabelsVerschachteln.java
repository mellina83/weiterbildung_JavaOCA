package basics_kontrollstrukturen;

public class WdhSchleifenMitBreakContinueLabelsVerschachteln {

	public static void main(String[] args) {
		
		int x = 0;
		
		tom:
		for (int i = 0; i < 5; i++) {
			
			jerry:
			for (int j = 0; j < 3; j++) {
				if(i==1 && j==1) {
					continue tom;
				}
				
				if(j==2) {
					break jerry;
				}
				
				if(i==2) {
					break tom;
				}
				
				x++;
			}
		}
		
		System.out.println("x = " + x); // 3

	}

}
