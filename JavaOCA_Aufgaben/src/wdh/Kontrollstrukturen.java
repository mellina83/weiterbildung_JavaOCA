package wdh;

import java.util.Iterator;

public class Kontrollstrukturen {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 9; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i = 0; i <= 9 ; i++) {
			if (i == 1) {
				i++;
			}
			System.out.print(i+ " ");
		}
		System.out.println();
		
		for (int i = -4; i <= 50; i=i+2) {
			System.out.print (i + " ");			
		}
		System.out.println();
		
		for (char i = 'a'; i <= 'z' ; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (char i = 'Z'; i >= 'A' ; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i = 0; i <= 100 ; i++) {
			if (i%5==0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		for (int i = 3; i >=1 ; i--) {
			System.out.print(i + " ");
			for (int j = 1; j<= i; j++) {
				System.out.print(j + " ");
			}
		}	


	}

}
