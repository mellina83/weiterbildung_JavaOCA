package statische_methoden;

public class DemoInstance_vs_Static {

	static String statischerText = "Hallo Welt";
	String instanzText = "Hallo Welt";
	
	public static void main(String[] args) {
		System.out.println(statischerText);
		
		DemoInstance_vs_Static dvs01 = new DemoInstance_vs_Static();
		DemoInstance_vs_Static dvs02 = new DemoInstance_vs_Static();
		DemoInstance_vs_Static dvs03 = new DemoInstance_vs_Static();
		dvs02.instanzText = "Good Morning";
		dvs03.instanzText = "Bon Jour";
		System.out.println("------");
		System.out.println(dvs01.instanzText);
		System.out.println(dvs02.instanzText);
		System.out.println(dvs03.instanzText);
		System.out.println(dvs01.instanzText);
		System.out.println(dvs02.instanzText);
		System.out.println(dvs03.instanzText);
		System.out.println("------");
		statischerText = "Wann ist Feierabend?";
		System.out.println(dvs01.statischerText);
		System.out.println(dvs02.statischerText);
		System.out.println(dvs03.statischerText);
	}

}
