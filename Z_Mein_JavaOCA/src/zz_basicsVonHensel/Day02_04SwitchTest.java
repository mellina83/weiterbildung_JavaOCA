package zz_basicsVonHensel;

import java.util.Scanner;

public class Day02_04SwitchTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte spielen Sie eine Karte auf.");
		String karte = sc.next();
		
		switch (karte) {
			case "B":
				System.out.println("Farbe w�nschen");
				break;
			case "8":
				System.out.println("aussetzen");
				break;
			case "7":
				System.out.println("zwei Karten ziehen");
				break;
			default:
				System.out.println("normal weiter");
		}
		
		int augenzahl = 2;
		
		switch(augenzahl) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("normal weiter");
			break;
		case 6:
			System.out.println("nochmal w�rfeln");
			break;
		default:
			System.out.println("gezinkter W�rfel!");	
			sc.close();
		}

	}

}
