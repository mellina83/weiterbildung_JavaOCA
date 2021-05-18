package statische_methoden;

public class DemoRekursion {
	public static void main(String[] args) {
		doStuff(3);
	}
	
	
	public static void doStuff(int i) {	
		System.out.println("Start : " + i);
		if(i>0) {
			doStuff(--i);
		}
		System.out.println("Ende : " + i);
	}
}
