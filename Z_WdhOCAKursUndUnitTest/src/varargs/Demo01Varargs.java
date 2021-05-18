package varargs;

public class Demo01Varargs {

	public static void main(String[] args) {
		
		doStuff01(new int[] {1,2,3,4,5,8});
		
		doStuff02("text",1,2,3,4,5,8);
		
		doStuff03("Morgenstund ungesund","Was auch immer");
	}
	
	public static void doStuff03(String... zitateSammlung) {
		for (String zitat : zitateSammlung) {
			System.out.println(zitat);
		}
	}
	
	public static void doStuff02(String text,int... zahlen) {
		for (int zahl : zahlen) {
			System.out.println(zahl);
		}
	}
	
	public static void doStuff01(int[] zahlen) {
		for (int zahl : zahlen) {
			System.out.println(zahl);
		}
	}
	
}
