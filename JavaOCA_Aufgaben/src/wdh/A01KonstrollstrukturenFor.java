package wdh;

public class A01KonstrollstrukturenFor {

	public static void main(String[] args) {
		
		// 0 bis 9
		System.out.println("0 bis 9 mit For und While:");
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
			
		}
		System.out.println();
		int i=-1;
		while (++i < 10) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 0 2, 3, 4 bis 9
		System.out.println("\n0, 2 bis 9 mit For und Do While:");
		for (int j = 0; j < 10; j++) {
			if (j == 1) {
				j++;
			}
			System.out.print(j + " ");
		}
		System.out.println();
		int j = -1;
		do {
			j++;
			if (j == 1) {
				j++;
			}
			System.out.print(j + " ");}
		while (j < 9);
		
		// a bis z
		System.out.println("\na bis z:");
		for (char k = 'a'; k <= 'z'; k++) {
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println("Z bis A:");
		char k = 'Z';
		while (k >= 'A') {
			System.out.print(k-- + " ");
		}
		
		System.out.println(" Aus 1 bis 100 ausgeben, was durch 5 ohne Rest teilbar ist:");
		for (int m=0; m <=100; m++) {
			if (m%5==0) {
				System.out.print(m++ + " ");
			}
		}
		System.out.println();
		for (int n = 3; n > 0; n--) {
			System.out.print(n);
			for (int p = 1; p <=n; p++) {
				System.out.print(p);
			}
		}
		

		
		
		

	} // Ende Main

}
