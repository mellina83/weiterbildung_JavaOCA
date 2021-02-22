package wdh;

public class WhileDoWhile {

	public static void main(String[] args) {
		
		int i =0;
		while (i <= 9 ) {
			System.out.print(i++);
		}
		System.out.println();
		
		i = 0;
		while (i <=9) {
			while (i == 1) {
				i++;
			}
			System.out.print(i++);
		}
		System.out.println();
		
		i = -4;
		
		while (i <=50) {
			while (i%2!=0) {
				++i;
			}
				System.out.print(i++ + " ");
			
		}

		System.out.println();
	} // Ende Main

}
