package statischeMethoden_und_Rekursion;

public class DemoScope {

	public static void main(String[] args) {
		
		{
			int zahl = 42;
		}
		{
			int zahl = 42;
		}
		{
			int zahl = 42;
		}
		{
			int zahl = 42;
		}
		
		//zahl cannot be resolved to a variable
		//System.out.println(zahl);
		
		doStuff01(42);
		System.out.println("Main Beendet");
	}

	public static void doStuff01(int i) {
		System.out.println("doStuff01 : " + i);//42
		
//		i++; Erst verwenden dann erh�hen
//		++i; Erst erh�hen dann verwenden
		
		//Erst i an die Methode weiterleiten, danach erh�hen.
		doStuff02(i++);
		System.out.println("doStuff01 : " + i);//43
	}
	
	public static void doStuff02(int i) {
		System.out.println("doStuff02 : " + i);//42
		doStuff03(i++);
		System.out.println("doStuff02 : " + i);//43
		i = 101;
	}
	
	public static void doStuff03(int i) {
		System.out.println("doStuff03 : " + i);//42
		doStuff04(i++);
		System.out.println("doStuff03 : " + i);//43
	}
	
	public static void doStuff04(int i) {
		System.out.println("doStuff04 : " + i);//42
	}
}
