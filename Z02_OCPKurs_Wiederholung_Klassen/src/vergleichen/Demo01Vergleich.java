package vergleichen;

public class Demo01Vergleich {

	public static void main(String[] args) {
		String text01 = "Hallo Welt";
		String text02 = "Hallo" + " " + "Welt";
		String text03 = "Hallo";
		String text04 = " ";
		String text05 = "Welt";
		String text06 = text03 + text04 + text05;
		String text07 = new String("Hallo Welt");

		System.out.println("text01,text02");
		vergleichen01(text01,text02);//true true
		System.out.println("text01,text06");
		vergleichen01(text01,text06);//false true
		System.out.println("text01,text07");
		vergleichen01(text01,text06);//false , true
		System.out.println("Primitiver vergleich");
		vergleichen02();
	}

	private static void vergleichen01(String text01, String text02) {
		System.out.println("text01 == text02 " + (text01 == text02));
		System.out.println("text01.equals(text02) " + (text01.equals(text02)));
	}

	
	private static void vergleichen02() {
		int zahl01 = 42;
		int zahl02 = 84;
		System.out.println(zahl01 == zahl02);
		
		Integer zahl03 = 42;
		Integer zahl04 = 42;
		System.out.println(zahl03.equals(zahl04));
	}
}
